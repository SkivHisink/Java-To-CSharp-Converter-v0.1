package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueWellboreSampling.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueWellboreSampling extends RescueObject
{


  protected RescueWellboreSampling(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueWellboreSampling(nativeNdx);
  }

  public RescueWellboreSampling(RescueWellbore parentWellbore,
                                long count,
                                float origin,
                                float step)
  {
    nativeNdx = Create_RescueWellboreSampling1((parentWellbore == null) ? 0 : parentWellbore.nativeNdx,
                                               count,
                                               origin,
                                               step);
  }

  public RescueWellboreSampling(RescueWellbore parentWellbore,
                                long count,
                                float[] values)
  {
    nativeNdx = Create_RescueWellboreSampling2((parentWellbore == null) ? 0 : parentWellbore.nativeNdx,
                                               count,
                                               values);
  }

  public RescueWellbore ParentWellbore()
  {
    long returnNdx = ParentWellbore3(nativeNdx);
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

  public java.lang.String TimeStamp()
  {
    java.lang.String myReturn = TimeStamp4(nativeNdx);
    return myReturn;
  }

  public RescueGrid SampleGrid()
  {
    long returnNdx = SampleGrid5(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGrid myReturn = new RescueGrid(returnNdx);
      return myReturn;
    }
  }

  public long Count64()
  {
    long myReturn = Count6(nativeNdx);
    return myReturn;
  }

  public int Count()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(Count64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int Count(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

  public long WellborePropertyCount64()
  {
    long myReturn = WellborePropertyCount7(nativeNdx);
    return myReturn;
  }

  public int WellborePropertyCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(WellborePropertyCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int WellborePropertyCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(WellborePropertyCount64(), throwIfTooBig);
  }

  public RescueWellboreProperty NthRescueWellboreProperty(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueWellboreProperty8(nativeNdx
                                                ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWellboreProperty myReturn = new RescueWellboreProperty(returnNdx);
      return myReturn;
    }
  }

  public RescueWellboreProperty PropertyDescribedBy(java.lang.String name
                                                   ,java.lang.String type
												   ,java.lang.String uom)
  {
    long returnNdx = PropertyDescribedBy14(nativeNdx, name, type, uom);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWellboreProperty myReturn = new RescueWellboreProperty(returnNdx);
      return myReturn;
    }
  }

  public boolean DropRescueWellboreProperty(RescueWellboreProperty unitToDrop)
  {
    boolean myReturn = DropRescueWellboreProperty9(nativeNdx
                                                     ,(unitToDrop == null) ? 0 : unitToDrop.nativeNdx);
    return myReturn;
  }

  public float MeasuredDepthAt(long ndx)
  {
    float myReturn = MeasuredDepthAt10(nativeNdx
                                     ,ndx);
    return myReturn;
  }

  public boolean AnyFileTruncated()
  {
    boolean myReturn = AnyFileTruncated11(nativeNdx);
    return myReturn;
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType12(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public void SetValues(float[] valueArray)
  {
    SetValues13(nativeNdx
               ,valueArray);
  }


  private native void Delete_RescueWellboreSampling(long ndx);
  private native long Create_RescueWellboreSampling1(long parentWellbore,
                                                    long count,
                                                    float origin,
                                                    float step);
  private native long Create_RescueWellboreSampling2(long parentWellbore,
                                                    long count,
                                                    float[] values);
  private native long ParentWellbore3(long refNdx);
  private native java.lang.String TimeStamp4(long refNdx);
  private native long SampleGrid5(long refNdx);
  private native long Count6(long refNdx);
  private native long WellborePropertyCount7(long refNdx);
  private native long NthRescueWellboreProperty8(long refNdx
                                                 ,long zeroBasedOrdinal);
  private native boolean DropRescueWellboreProperty9(long refNdx
                                                    ,long unitToDrop);
  private native float MeasuredDepthAt10(long refNdx
                                        ,long ndx);
  private native boolean AnyFileTruncated11(long refNdx);
  private native boolean IsOfType12(long refNdx
                                   ,int thisType);
  private native void SetValues13(long refNdx, float[] values);
  private native long PropertyDescribedBy14(long refNdx
                                         ,java.lang.String name
										 ,java.lang.String type
										 ,java.lang.String uom);
}
