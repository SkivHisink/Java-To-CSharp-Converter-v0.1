package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueBlockAndUnitNumbersNOrMoreRule.java

    Rod Hanks   Aug 25 2005

******************************************************************/
public class RescueBlockAndUnitNumbersNOrMoreRule extends RescueBlockAndUnitNumbersRule
{


  protected RescueBlockAndUnitNumbersNOrMoreRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueBlockAndUnitNumbersNOrMoreRule(int nBlocks)
  {
    nativeNdx = Create_RescueBlockAndUnitNumbersNOrMoreRule0(nBlocks);
  }

  private native long Create_RescueBlockAndUnitNumbersNOrMoreRule0(int nBlocks);
}
