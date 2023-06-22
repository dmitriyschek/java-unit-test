@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(1);
    boolean expected = true;
	assertEquals("Ошибка пользователю должно быть больше 18", expected, isAdult);// Напиши код здесь
}
