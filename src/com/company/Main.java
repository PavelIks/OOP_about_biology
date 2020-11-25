// http://biolicey2vrn.ru/Klassifikaciay/Pokritosemennie.gif
package com.company;

interface I
{
    void print();
}

class Otdel implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел»");
    }
}

class Klassy extends Otdel implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы»");
    }
}

class Dvudolnyye extends Klassy implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Двудольные»");
    }
}

class Odnodolnyye extends Klassy implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Однодольные»");
    }
}

class Semeystva1 extends Odnodolnyye implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Однодольные» -→ «Семейства(←)»");
    }
}

class Semeystva2 extends Dvudolnyye implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Двудольные» -→ «Семейства(→)»");
    }
}

class Zlakovyye extends Semeystva1 implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Двудольные» -→ «Семейства(←)» -→ «Злаковые»");
    }
}

class Lileynyye extends Semeystva1 implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Двудольные» -→ «Семейства(←)» -→ «Лилейные»");
    }
}

class Rody1 extends Zlakovyye implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Двудольные» -→ «Семейства(←)» -→ «Злаковые» -→ «Роды(←)»: пшеница");
    }
}

class Vidy1 extends Rody1 implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Двудольные» -→ «Семейства(←)» -→ «Злаковые» -→ «Роды(←)»: пшеница -→ «Виды(←)»");
    }
}

class Vidy2 extends Rody1 implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Двудольные» -→ «Семейства(←)» -→ «Злаковые» -→ «Роды(←)»: пшеница -→ «Виды(→)»");
    }
}

class Krestotsvetnyye extends Semeystva2 implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Двудольные» -→ «Семейства(→)» -→ «Крестоцветные»");
    }
}

class Paslenovyye extends Semeystva2 implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Двудольные» -→ «Семейства(→)» -→ «Пасленовые»");
    }
}

class Rozotsvetnyye extends Semeystva2 implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Двудольные» -→ «Семейства(→)» -→ «Розоцветные»");
    }
}

class Slozhnotsvetnyye extends Semeystva2 implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Двудольные» -→ «Семейства(→)» -→ «Сложноцветные»");
    }
}

class Bobovyye extends Semeystva2 implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Двудольные» -→ «Семейства(→)» -→ «Бобовые»");
    }
}

class Rody2 extends Bobovyye implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Двудольные» -→ «Семейства(→)» -→ «Бобовые» -→ «Роды(→)»");
    }
}

class Vidy3 extends Rody2 implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Двудольные» -→ «Семейства(→)» -→ «Бобовые» -→ «Роды(→)» -→ «Виды»");
    }
}

class Vidy4 extends Rody2 implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Двудольные» -→ «Семейства(→)» -→ «Бобовые» -→ «Роды(→)» -→ «Виды»");
    }
}

class Vidy5 extends Rody2 implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Двудольные» -→ «Семейства(→)» -→ «Бобовые» -→ «Роды(→)» -→ «Виды»");
    }
}

class Vidy6 extends Rody2 implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Двудольные» -→ «Семейства(→)» -→ «Бобовые» -→ «Роды(→)» -→ «Виды»");
    }
}

class Vidy7 extends Rody2 implements I
{
    @Override
    public void print()
    {
        System.out.println("«Отдел» -→ «Классы» -→ «Двудольные» -→ «Семейства(→)» -→ «Бобовые» -→ «Роды(→)» -→ «Виды»");
    }
}


public class Main
{
    public static void main(String[] args)
    {
        Otdel a1 = new Otdel();
        a1.print();

        Klassy a2 = new Klassy();
        a2.print();

        Dvudolnyye a3 = new Dvudolnyye();
        a3.print();

        Odnodolnyye a4 = new Odnodolnyye();
        a4.print();

        Semeystva1 a5 = new Semeystva1();
        a5.print();

        Semeystva2 a6 = new Semeystva2();
        a6.print();

        Zlakovyye a7 = new Zlakovyye();
        a7.print();

        Lileynyye a8 = new Lileynyye();
        a8.print();

        Rody1 a9 = new Rody1();
        a9.print();

        Vidy1 a10 = new Vidy1();
        a10.print();

        Vidy2 a11 = new Vidy2();
        a11.print();

        Krestotsvetnyye a12 = new Krestotsvetnyye();
        a12.print();

        Paslenovyye a13 = new Paslenovyye();
        a13.print();

        Rozotsvetnyye a14 = new Rozotsvetnyye();
        a14.print();

        Slozhnotsvetnyye a15 = new Slozhnotsvetnyye();
        a15.print();

        Bobovyye a16 = new Bobovyye();
        a16.print();

        Vidy3 a17 = new Vidy3();
        a17.print();

        Vidy4 a18 = new Vidy4();
        a18.print();

        Vidy5 a19 = new Vidy5();
        a19.print();

        Vidy6 a20 = new Vidy6();
        a20.print();

        Vidy7 a21 = new Vidy7();
        a21.print();
    }
}