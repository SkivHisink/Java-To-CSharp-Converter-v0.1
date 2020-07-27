using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueBlockAndUnitNumbersNOrMoreRule : RescueBlockAndUnitNumbersRule
{


  protected RescueBlockAndUnitNumbersNOrMoreRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueBlockAndUnitNumbersNOrMoreRule(int nBlocks)
  {
    nativeNdx = Create_RescueBlockAndUnitNumbersNOrMoreRule0(nBlocks);
  }

}

}