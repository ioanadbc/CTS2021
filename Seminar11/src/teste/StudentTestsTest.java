package teste;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



import clase.Student;

public class StudentTestsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructorRightName() {
		String nume= "Ion";
		Student student=new Student(nume);
	    assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testListAddNote() {
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testListSize() {
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testCalculeazaMedieOSinguraNota() {
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(), 0.01);
		
	}
	
	@Test
	public void testCalculeazaMedieMaiMulteNote() {
		Student student=new Student();
		int nota1=8;
		int nota2=9;
		int nota3=4;
		
		float medie=(nota1+nota2+nota3)/3.0f;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		assertEquals(medie, student.calculeazaMedie(), 0.01);
		
				
	}
	
	@Test
	public void testCalculeazaMediaFaraNoteAdaugate() {
		Student student=new Student();
		assertEquals(0,student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testVerificaRestanta() {
		Student student=new Student();
		int nota1=3;
		int nota2=9;
		int nota3=4;
		
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		
		assertTrue(student.areRestante());
		
	}
	

}
