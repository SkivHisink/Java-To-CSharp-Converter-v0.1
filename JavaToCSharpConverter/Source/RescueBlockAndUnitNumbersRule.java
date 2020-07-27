package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueBlockAndUnitNumbersRule.java

    Rod Hanks   Aug 25 2005

******************************************************************/
public class RescueBlockAndUnitNumbersRule extends RescueRule
{


  protected RescueBlockAndUnitNumbersRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueBlockAndUnitNumbersRule()
  {
  }

  public RescueBlockAndUnitNumbersRule(int nBlocks)
  {
    nativeNdx = Create_RescueBlockAndUnitNumbersRule0(nBlocks);
  }

  private native long Create_RescueBlockAndUnitNumbersRule0(int nBlocks);
}
