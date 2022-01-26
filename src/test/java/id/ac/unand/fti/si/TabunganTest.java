package id.ac.unand.fti.si;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TabunganTest {

	@Test
	void testStructurIsOk() {
		try {
			Class<?> Tabungan = Class.forName("id.ac.unand.fti.si.Tabungan");
			
			Tabungan.getField("nama");
			Tabungan.getField("no_rek");
			Tabungan.getField("saldo");
			
			Class<?>[] params03 = {Integer.class};
			Class<?>[] params04 = {Integer.class};
			Class<?>[] params05 = {};
			Class<?>[] params06 = {Integer.class};
			Class<?>[] params07 = {};
			Class<?>[] params08 = {};
			
			Tabungan.getMethod("tabung", params03);
			Tabungan.getMethod("tarik", params04);
			Tabungan.getMethod("getStatus", params05);
			Tabungan.getMethod("setStatus", params06);
			Tabungan.getMethod("hitung", params07);
			Tabungan.getMethod("toString", params08);
			
		}catch(NoSuchMethodException e) {
			assertTrue(false, "Method yang diminta dalam tidak ditemukan");
		}catch(ClassNotFoundException e) {
			assertTrue(false, "Class Bilangan tidak ditemukan");
		} catch (NoSuchFieldException e) {
			assertTrue(false, "Field yang diminta dalam tidak ditemukan");
		} 
	}
	
	@Test
	void testMethodIsOk() {
		
		Tabungan t = new Tabungan("Husnil", "13141241");
		t.saldo = 500000;
		
		t.tarik(125000);
		assertEquals(375000, t.saldo);
		
		t.tabung(225000);
		assertEquals(600000, t.saldo);
		
		double bunga = t.hitung();
		assertEquals(15000, bunga);
	}
	
	@Test 
	void testStatus() {
		Tabungan t = new Tabungan("Husnil", "13141241", 500000);
		t.setStatus(0);
		assertEquals(0, t.getStatus());
		
		t.setStatus(-1);
		assertEquals(0, t.getStatus());
		
		t.setStatus(4);
		assertEquals(0, t.getStatus());
	}

}
