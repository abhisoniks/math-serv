/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import utility.*;

public class test2 {
   int a = 5 ; int b = 9;	
   int c = -4;
   util messageUtil = new util(a,b);

   @Test
   public void testPrintMessage() {
      assertEquals(c,messageUtil.sub(a,b));
   }
}
