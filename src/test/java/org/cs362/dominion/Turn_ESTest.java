/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 17 21:43:52 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.CardSupply;
import org.cs362.dominion.Player;
import org.cs362.dominion.Turn;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Turn_ESTest extends Turn_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Turn turn0 = null;
      try {
        turn0 = new Turn((Player) null, (CardSupply) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Turn", e);
      }
  }
}
