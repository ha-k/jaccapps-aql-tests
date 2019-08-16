// FILE. . . . . c:/cygwin/home/hak/hlt/src/hlt/language/jaccapps/aql/test/SetTest.java
// EDIT BY . . . Hassan Ait-Kaci
// ON MACHINE. . Hp-Dv7
// STARTED ON. . Sat Oct 20 02:41:00 2012

// Last modified on Sat Oct 20 02:41:11 2012 by hak

import java.util.Iterator;
import hlt.language.util.IntIterator;
import hlt.language.util.DoubleIterator;
import hlt.language.design.backend.IntSet;
import hlt.language.design.backend.RealSet;
import hlt.language.design.backend.ObjectSet;
import hlt.language.design.backend.IntRange;

public class SetTest
{

  public static void main (String[] args)
    {
      ObjectSet oset = new ObjectSet();
      oset.add("a").add("b").add("c").add("d").add("e").add("f").add("g");

      System.out.println(oset);

      for (Iterator i = oset.backwardIterator(); i.hasNext();)
        System.out.print(i.next()+" ");
      System.out.println();

      System.out.println();

      IntSet iset = new IntSet();
      iset.add(1).add(2).add(3).add(4).add(5).add(6).add(7).add(8);

      System.out.println(iset);

      for (IntIterator i = iset.backwardIntIterator(); i.hasNext();)
        System.out.print(i.next()+" ");
      System.out.println();

      for (DoubleIterator i = iset.backwardRealIterator(); i.hasNext();)
        System.out.print(i.next()+" ");
      System.out.println();

      for (Iterator i = iset.backwardIterator(); i.hasNext();)
        System.out.print(i.next()+" ");
      System.out.println();

      System.out.println();

      RealSet rset = new RealSet();
      rset.add(3).add(2).add(6).add(9).add(11).add(1).add(8);

      System.out.println(rset);

      for (IntIterator i = rset.backwardIntIterator(); i.hasNext();)
        System.out.print(i.next()+" ");
      System.out.println();

      for (DoubleIterator i = rset.backwardRealIterator(); i.hasNext();)
        System.out.print(i.next()+" ");
      System.out.println();

      for (Iterator i = rset.backwardIterator(); i.hasNext();)
        System.out.print(i.next()+" ");
      System.out.println();

      System.out.println();

      IntRange range = new IntRange(5,12);

      System.out.println(range);

      for (IntIterator i = range.backwardIntIterator(); i.hasNext();)
        System.out.print(i.next()+" ");
      System.out.println();

      for (DoubleIterator i = range.backwardRealIterator(); i.hasNext();)
        System.out.print(i.next()+" ");
      System.out.println();

      for (Iterator i = range.backwardIterator(); i.hasNext();)
        System.out.print(i.next()+" ");
      System.out.println();

    }
}
