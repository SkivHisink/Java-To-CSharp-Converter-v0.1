package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueWellboreCell.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueWellboreCell extends RescueObject
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
						boolean throwIfTooBig)
  {
    CellIndex3i(nativeNdx
              ,(geometry == null) ? 0 : geometry.nativeNdx
              ,returnArray
              ,returnArraySize
			  ,throwIfTooBig);
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType4(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public void dispose()
  {
    Delete_RescueWellboreCell(nativeNdx);
  }

  private native long Wellbore0(long refNdx);
  private native long Geometry1(long refNdx);
  private native void CellIndex3(long refNdx
                                ,long geometry
                                ,long[] returnArray
                                ,long returnArraySize);
  private native void CellIndex3i(long refNdx
                                ,long geometry
                                ,int[] returnArray
                                ,int returnArraySize
								,boolean throwIfTooBig);
  private native boolean IsOfType4(long refNdx
                                  ,int thisType);
  private native void Delete_RescueWellboreCell(long ndx);
}
