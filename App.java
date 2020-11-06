/*
class Person {
    Person(String value) {}
}

class Employee extends Person {}
 */

import java.io.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


interface Runnable {
    public void run();
}

class A {
    protected int y = 15;
}

class B extends A {
    int y = 10;
    public void print() {
        A a = new A();
        System.out.println(a.y + y);
    }
}

interface Pasare {

}

interface Bird {
    void metoda();
    Pasare altaMetoda();
    java.util.List<String> StringList();
}

abstract class Ball {
    protected final int size;

    public Ball(int size) {
        this.size = size;
    }

    /* public void setBall(int size) {
        this.size = size;
    } */
}

class Mamifer {
    public void urla() {
        System.out.println("Mamifer urla");
    }
}

interface Fiinta {
    void scoateSunet();
}

abstract class Animal extends Mamifer implements Fiinta  {
    protected final int inaltime = 9;
    int lungime = 0;

    public Animal() {
        lungime = 1;
    }

    public Animal (int lungime) {
        this.lungime = lungime;
    }

    /*abstract public void scoateSunet(); /*{
     System.out.println("Animal scoate sunet");
    }*/

    public void urla() {
        System.out.println("Animal urla");
    }

    public static void metodaStatica() {
        System.out.println("Metoda Statica Animal");
    }

    public int metodaNullPointer () throws NullPointerException{
        return 4;
    }

    public int metodaFileNotFound () throws /* FileNotFoundException */
            IOException{
        return 4;
    }
}

class Caine extends Animal {
    private int inaltime;

    public int metodaNullPointer () throws RuntimeException{
        return 4;
    }

    public int metodaFileNotFound () throws /* IOException */
            FileNotFoundException
    {
        return 4;
    }

    public void scoateSunet() {
        System.out.println("Augh");
        //super.scoateSunet();
    };

    public static void metodaStatica() {
        System.out.println("Metoda Statica Caine");
    }
}

interface Horn {
    public abstract Integer play();
}

abstract class AbstractBook {
    public AbstractBook() { }
}

abstract class Reptile {
    public void layEggs() {System.out.println("Reptile"); }
}

class Lizard extends Reptile {
    public void layEggs() { System.out.println("Lizard"); }
}

class Car {
    //static int var;
    static int var;
    static {
        var = 1;
        System.out.println("1");
    }

    protected String drive() {
        return "Driving car";
    }

    public Car (int var) { }
}

class ElectricCar extends Car {
    static int var;
    static {
        var = 2;
        System.out.println("2");
    }

    public String drive() {
        return "Driving Electric car";
    }

    public ElectricCar(int var) {
        super(var);
    }

    //public ElectricCar() {}
}

class Printer {
    public void print() {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException enfe) {
            System.out.print("X");
        } catch (IOException exception) {
            System.out.print("Z");
        } finally {
            System.out.print("Y");
        }
    }
}

public class App {

    public int choose (short choice) {
        return 2;
    }

    long metodaLong() {
        return 10;
    }
    /* Long metodaLong() {
        return 10;
    } */

    /* public final int finalVar;

    public void setApp(int finalVar) {
        this.finalVar = finalVar;
    } */

    //public int atrFinal2;

    //App(int atrFinal2) { this.atrFinal2 = atrFinal2; }

    public void metoda() {
        super.toString();
    }

    public static final int atrFinal3 = 1000;

    /* public static final int atrFinal3;

    App(int atrFinal3) { this.atrFinal3 = atrFinal3; } */

    //public final int atrFinal2;

    //App(int atrFinal2) { this.atrFinal2 = atrFinal2; }

    /* public int final atrFinal2;

    public int atrFinal;

    /* public final int atrFinal; */

    /* public void setAtrFinal(int valoare) {
        this.atrFinal = valoare;
    } */

    public final void modifyArray(int []array) {
        array[0] = 5; array[1] = 6;
        array[2] = 7; array[3] = 8;
    }

    public void nested() { nested(2, true); }

    public int nested(int level, boolean height) { return nested(level); }

    public int nested(int level) { return level + 1; }

    static int staticVarInt;

    private double beakLength;

    public App youngestChild;

    public static void /* String */ voidMethod(App a, int b) {
        String someString;
        //return someString;

        a.beakLength=b;
    }

    public static void metodaVarArgs(String str1, int a, String ...args) { }

    /* public static Long metodaLong (Long longVal) {
        long locLong = longVal.longValue();
        locLong = 1;
        return longVal;
    } */

    public void metodaLong (Long longVal) {
        /* Long auxVal = 4L;

        longVal = auxVal; */

        longVal =  2 * longVal;
    }

    public static void metoda1(String ...str1) { System.out.println("Metoda 1 Var Args"); }

    public static void metoda1() { System.out.println("Metoda 1 Simpla"); }

    public static int metodaAruncaFileNotFound () throws FileNotFoundException {
        return 4;
    }

    public static void metodaRuntimeExcep () throws NullPointerException {
        throw new RuntimeException();
    }

    public static void metodaAruncaException() throws Exception
            /* FileNotFoundException */ {
        try {
            System.out.println("Orice");
        } finally {
            throw new Exception();
            //throw new FileNotFoundException();
            //System.out.println("Numic");
        }
    }

    public static void snore() {
                try {
                    String sheep[] = new String [3];
                    System.out.println(sheep[3]);
                } catch (RuntimeException e) {
                    System.out.println("Catch runtime");
                } finally {
                    System.out.println("Finally");
                }
    }

    public static void secret(/* StringBuilder */ String mystery) {
                //mystery.reverse();
                mystery.replace("1", "8");
                mystery.startsWith("paper");
                String s = mystery.toString();
    }

    public static void metodaExceptie() throws IOException {

    }

    //public void metodaString(String... argument) {}
    //public void metodaString(String[] argument) {}

    //public static void main(String args[]) {}

    static int x = 2;
    int y = 2;

    public static App work() { return new App(); }

    //public static void main(String... args)
    static public void main(String...args)
            /* throws IOException */
            throws Exception
            /* throws FileNotFoundException */
            /* throws ArrayIndexOutOfBoundsException */ {
        /**/ Reptile reptile = new Lizard();
             reptile.layEggs();

        /**/ boolean [] vectorbool = {true, true};

        for(boolean bool1 : vectorbool)
            System.out.println(bool1);

        /**/ LocalDate localDate = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);

       System.out.println(localDate);
       System.out.println(localDate.getDayOfMonth() +  localDate.getMonthValue() + localDate.getYear());

       //DateTimeFormatter format = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

       /**/ ArrayList listaEgala1 = new ArrayList();
            listaEgala1.add(1); listaEgala1.add(2);
            listaEgala1.add(3)
            ;
            ArrayList listaEgala2 = new ArrayList();
            listaEgala2.add(1); listaEgala2.add(2)                    ;
            listaEgala2.add(3);

            System.out.println("Egalitate: " + listaEgala1.equals(listaEgala2));

            //Integer arrayInt = ((ArrayList<Integer>) listaEgala1).toArray(new Integer[4]);


       /**/ java.lang.String s1 = "Propozitie";
            StringBuilder sb = new StringBuilder("Propozitie");
            System.out.println(s1.equals(sb));
            //System.out.println(s1 == sb);
            //java.lang.String s2 = s1.substring(6,5);

            sb.append(" intrebatoare").delete(3, sb.length() - 5);

            System.out.println(sb);

       /**/ byte byte1 = 1;
            short short1 = 2;
            int int1 = 3;
            long long1 = 4;

            int int2 = int1 + short1;
            //int int3 = long1 + int1;
            //byte byte2 = byte1 + short1;

            float f1 = 1;       float f3 = f1;
            float f2 = 2 * f1;  float f4 = f3 + f1;
            double d1 = 1;

            //float f5 = d1 + f1;

            /*int orice = 1;

            orice += int1;

            System.out.println(orice);*/

       /**/ //int x = 1;
            System.out.println("X si App.x: " + x +", " + App.x);

            App aplicatie = new App();
            int vector1[] = new int [x];
            int vector2[] = new int [aplicatie.y];
            vector1[0] = 1;
            vector2[0] = 1;

            //int i = 0;
            for(int i : vector1)
                System.out.print(i + " ");
            System.out.println();

       /**/ List numbers1 = new ArrayList();
            //List<> numbers2 = new ArrayList();
            List numbers3 = new ArrayList<>();
            //List<> numbers4 = new ArrayList<>();

            numbers1.add(1); numbers1.add(2); numbers1.add(3);

            Predicate<Integer> pred = e -> e > 2;

            numbers1.removeIf(pred);

            System.out.println(numbers1);

       /**/ LocalDate date = LocalDate.ofYearDay(2015,2);
            LocalDate date2 = LocalDate.ofEpochDay(100);
            System.out.println("Date: " + date + ", Of Epoch Day: " + date2);

       /**/
            int numarint = 1;
            //byte numarbyte = numarint;
            long numarlong = numarint;

       /**/
            int numar = 1;
            int numar2 = numar > 10 ? 3 : numar < 10 ? 4 : 5;
            System.out.println("numar2: " + numar2);

       /**/
            Double number1 = Double.valueOf("128.");
            Double number2 = Double.valueOf("128D");
            Double number3 = Double.valueOf("128.D");
            Double number4 = Double.valueOf("128.0000D");
            System.out.println(number1 + number2 + number3 + number4);

       /**/ int icontor;

            //for(icontor = 0; icontor < 10; icontor++)
            //    int a = 2;

            for(icontor = 0; icontor < 10; icontor++) {
                int a = 2;
            }

            System.out.println("icontor: " + icontor);

       /**/ try {
                throw new IOException();
                //BufferedReader br = new BufferedReader(new FileReader("Inexistent"));
                //System.out.println("unreachable statement");
            } catch (IOException e) {
                System.out.println("Catch");
            }

       /**/ try {
                int vara = 0;
            } catch (RuntimeException e){
                //System.out.println(vara);
            }
            int vara = 0;

       /**/     Runnable run = () -> System.out.println("Orice");
                //Runnable run = () -> { System.out.println("Orice"); };

       /**/ List<Integer> lista = new ArrayList<>();
            lista.add(1);  lista.add(11);
            lista.add(30); lista.add(9);

            int [] lista2 = new int [10];

            for(int contor : lista)
                System.out.print(contor);
            System.out.println();

            for(Integer contor : lista2)
                System.out.print(contor);
            System.out.println();

            lista.removeIf((Integer e) -> e%2 == 0);
            //lista.removeIf((int e) -> e%2 == 0);

            System.out.println(lista);

       /**/  int primitiv = Integer.parseInt("1");
             Integer obiect = Integer.valueOf("2");
             float primitiv2 = Float.parseFloat("3");
             Float obiect2 = Float.valueOf("4");

       /**/ //Integer [] array1 = new Integer[-3];

            Integer [] array2 = new Integer[0];
            Integer [] array3 = new Integer[3];

       //System.out.println(array2[0]);
       System.out.println(array3[0]);

       /**/Integer arr[] = {1,2,3,4};

        arr[1] = null;

        for(Integer a : arr)
            System.out.print(a);
        System.out.println();

        /**/    System.out.println(Instant.now());

        List <Caine> caini = new ArrayList<>();
        List <Animal> animale = new ArrayList<>();

        for(Animal animal : caini) { }

        //for(Caine caine : animale) { }

        boolean var = 1 < 10 && 14 < 10 ? true : false;

        System.out.println(var);

        //LocalDate time = LocalDate.of(1, 11);

        metodaExceptie();

        Fiinta fiintacaine = new Caine();

        fiintacaine.scoateSunet();
        //((Caine) fiintacaine).scoateSunet();

        final Animal animalcaine = new Caine();

        animalcaine.scoateSunet();

        short switchvar1 = 10;
        final int switchvar2 = 10;

        switch(switchvar1) {
            case switchvar2:
                System.out.println("Case 10");
                break;
            case 234:
            default:
        }

        LocalTime localtime = LocalTime.of(1, 11);

        System.out.println("Localtime: " + localtime);

        LocalDate localdate = LocalDate.now();
        localdate = LocalDate.of(1000,06,27);

        System.out.println("LocalDate: " + localdate);

        LocalDateTime localdatetime = LocalDateTime.of(1000, 06, 27, 1, 11);

        System.out.println("LocalDateTime: " + localdatetime);

        ArrayList arrlist1 = new ArrayList();

        if(1 + 3 * 1 > 3) {
            System.out.println("Da, se poate");
        }

        // if("2" > 0)
        //    System.out.println("Adev");

        List<Integer> pennies = new ArrayList<>();
        pennies.add(3);
        pennies.add(2);
        pennies.add(1);
        pennies.remove(2);
        System.out.println(pennies);

        //List <> arrlist1 = new ArrayList<>();
        //List <> arrlist2 = new ArrayList<String>();
        List <String> arrlist3 = new ArrayList<>();
        List <String> arrlist4 = new ArrayList<String>();
        ArrayList <String> arrlist5 = new ArrayList<String>();

        String[] array = {"Natural", "Science"};
        List<String> museums = Arrays.asList(array);
        //museums.add("Rahat");
        //museums.remove("Natural");
        museums.set(0, "Rahat");
        System.out.println(museums);

        snore();

        try {
            metodaAruncaException();
        } catch (Exception e){
            System.out.println("Exceptie");
        }
        /* Animal anim = new Caine();
        Caine anim2 = new Caine();
        anim.metodaFileNotFound();
        anim2.metodaFileNotFound(); */

        try {
            System.out.println(metodaAruncaFileNotFound());
            //System.out.print("1");
            //int a = 2;
        } catch (FileNotFoundException e){
            System.out.print("2");
            //throw new FileNotFoundException();
        }

        new Printer().print();

        /* try {
            System.out.print('A');
            throw new RuntimeException("Out of bounds!");
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.print('B');
            //throw t;
        } finally {
            System.out.print('C');
            throw new RuntimeException();
            System.out.print('D');
        } */

        /* return;
        int a = 2; */

        /* try {
            System.out.print('A');
            throw new RuntimeException("Out of bounds!");
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.print('B');
            //throw t;
        } finally {
            System.out.print('C');
            return;
            System.out.print('D');
        } */

        /* try {
            System.out.print('A');
            throw new RuntimeException("Out of bounds!");
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.print('B');
            //throw t;
        } finally {
            System.out.print('C');
        } */

        int score = 0;

        try {
            score = 1;
            System.out.println(score++);
        } catch (ArrayIndexOutOfBoundsException t) {
            System.out.println(score++);
        } finally {
            System.out.println(score++);
        }

        System.out.println(score++);
        System.out.println("-=--------");

        /*int a[] = new int [4];
        try {
            a[5] = 2;
        } catch (ArrayIndexOutOfBoundsException e){
            throw e;
        } finally {
            a[4] = 1;
        }*/

        //Car electricCar = new ElectricCar();
        //ElectricCar electricCar2 = new ElectricCar();

        //System.out.println("Static car " + Car.var);
        //System.out.println("Static electric car " + ElectricCar.var);

        Animal animal = (Animal) new Caine();

        animal.scoateSunet();

        /* Animal animal = (Animal) new Mamifer();

        animal.urla(); */

        Animal caineStatic = new Caine();

        System.out.println("Aici este:");

        caineStatic.metodaStatica();
        new Caine().metodaStatica();

        Caine caineSimplu = new Caine();

        ((Animal) caineSimplu).scoateSunet();

        /*  Animal animal = new Animal(); */

        Animal caine = new Caine();

        caine.scoateSunet();

        metoda1();

        final Long finalLong = 1L;

        new App().metodaLong(finalLong);

        System.out.println("finalLong: " + finalLong);

       /*final Long finalLong = 0L;

       System.out.println("MetodaLong: " + metodaLong(finalLong.longValue())); */

        metodaVarArgs("String1", 2, "String1", "String1", "String2");

        /* System.out.println(new Short(4)); */

        final App myFinalApp = new App();

        myFinalApp.beakLength = 0;
        myFinalApp.beakLength = 1;

        System.out.println("myFinalApp.beakLength: " + myFinalApp.beakLength);

        /* myFinalApp = new App(); */

        App simpleApp = new App();
        simpleApp = new App();

        int newArray[] = new int [2];

        System.out.println("newArray: " + Arrays.toString(newArray));

        final int arrayToBeModified[] = {1, 2, 3, 4};

        new App().modifyArray(arrayToBeModified);

        System.out.println("ArrayToBeModified: " + Arrays.toString(arrayToBeModified));

        /* System.out.println("ArrayToBeModified " + arrayToBeModified); */

        /* modifyArray(arrayToBeModified); */

        /* System.out.print(new App().nested()); */

        StringBuilder sb1 = new StringBuilder("abcde");
        String str1 = "abcdefgh";

        System.out.println("StaticVarInt: " + staticVarInt);

        /* static int staticVarMet = 0; */

        /* for(char car: str1) {
            System.out.println(car);
        }*/
        /*
            if(2 > 1)
                break;
         */

        /* int for = 1; */

        int [] arrint1 = {1, 2, 3, 4};

        for(Object obj : arrint1) {
            System.out.println("Obj este: " + obj);
        }

        int i = 0;

        while(i < 5) {
            int j = 0;
            System.out.println("j este " + j);
            j++;
            i++;
        }

        //System.out.println(j);

        System.out.println(args.length); //+ "" + args[0]);

        float [] arr1 = new float [3];

        arr1[1] = 1;

        System.out.println(arr1[1]);

        int var1 = 0, var2 = 0;

        var2 = var1++;

        System.out.println("Var 1: " + var1 + ", Var 2: " + var2);

        int plan = 1;

        plan = plan++ + --plan;

        System.out.println("Plan Value: " + plan);

        App app1 = new App();

        voidMethod(app1,5);
        String nume;

        int Nume = 0;
        System.out.print(Nume);

        App elena = new App();
        App diana = new App();
        elena.youngestChild = diana;
        diana = null;
        App zoe = new App();
        elena.youngestChild = zoe;
        zoe = null;

        System.out.println(elena);
        System.out.println(diana);
        System.out.println(zoe);

        /*while(true){
        }*/
        /*int i = 0;

        while(i < 10) {
            int j = i;
            System.out.println(j);
            i++;
        }

        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
            } catch (RuntimeException e) {
            System.out.print("c");
            } finally {
            System.out.print("d");
            }
        System.out.print("e");

        int[] array = {6,9,8};
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        list.add(array[2]);
        list.set(1, array[1]);
        list.remove(0);
        System.out.println(list);

         */
        //System.out.println("Hello World");
        //Employee e = new Employee();

        /*
        int a = 10;
        long b = 10;
        short c = 10;
        byte d = 10;
        float e = 10.0f;
        double f = 10.0;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        int a2 = (int) 10.0f;
        long b2 = (int) 10.0;
        short c2 = (int) 10.0f;
        byte d2 = (int) 10.0;
        float e2 = 10;
        double f2 = 10.0f;

        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        System.out.println(d2);
        System.out.println(e2);
        System.out.println(f2);
        */

        float e3 = 10f;
        System.out.println(e3);

        float e4 = (int) 10;
        float e5 = (long) 10;
        //float e6 = 10.0;
        //float e6 = (double) 10.0;
        System.out.println(e4);
        System.out.println(e5);
    }
}
