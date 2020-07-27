using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueWellboreCell : RescueObject
{


  protected RescueWellboreCell(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueWellbore Wellbore()
  {
    long returnNdx = Wellbore0(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWellbore myReturn = new RescueWellbore(returnNdx);
      return myReturn;
    }
  }

  public RescueGeometry Geometry()
  {
    long returnNdx = Geometry1(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeometry myReturn = new RescueGeometry(returnNdx);
      return myReturn;
    }
  }

  public void CellIndex(RescueGeometry geometry,
                        long[] returnArray,
                        long returnArraySize)
  {
    CellIndex3(nativeNdx
              ,(geometry == null) ? 0 : geometry.nativeNdx
              ,returnArray
              ,returnArraySize);
  }

  public void CellIndex(RescueGeometry geometry,
                        int[] returnArray,
                        int returnArraySize,
						bool throwIfTooBig)
  {
    CellIndex3i(nativeNdx
              ,(geometry == null) ? 0 : geometry.nativeNdx
              ,returnArray
              ,returnArraySize
			  ,throwIfTooBig);
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType4(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public void dispose()
  {
    Delete_RescueWellboreCell(nativeNdx);
  }

}

}