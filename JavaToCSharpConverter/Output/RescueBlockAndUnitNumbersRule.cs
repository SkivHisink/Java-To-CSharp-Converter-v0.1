using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueBlockAndUnitNumbersRule : RescueRule
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

}

}