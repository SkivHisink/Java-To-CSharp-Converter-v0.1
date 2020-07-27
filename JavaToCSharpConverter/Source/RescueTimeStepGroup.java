package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueTimeStepGroup.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueTimeStepGroup extends RescueHistoryObject
{


  protected RescueTimeStepGroup(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueTimeStepGroup(java.lang.String timeStepNameIn,
                             RescuePropertyGroup groupIn)
  {
    nativeNdx = Create_RescueTimeStepGroup0(timeStepNameIn,
                                            (groupIn == null) ? 0 : groupIn.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueTimeStepGroup(nativeNdx);
  }

  public java.lang.String TimeStepName()
  {
    java.lang.String myReturn = TimeStepName2(nativeNdx);
    return myReturn;
  }

  public void SetTimeStepName(java.lang.String newTimeStepName)
  {
    SetTimeStepName3(nativeNdx
                    ,newTimeStepName);
  }

  public RescuePropertyGroup ParentGroup()
  {
    long returnNdx = ParentGroup4(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePropertyGroup myReturn = new RescuePropertyGroup(returnNdx);
      return myReturn;
    }
  }

  public long RescueGeometryCount64()
  {
	long myReturn = RescueGeometryCount14(nativeNdx);
	return myReturn;
  }

  public int RescueGeometryCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(RescueGeometryCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int RescueGeometryCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(RescueGeometryCount64(), throwIfTooBig);
  }

  public void AddGeometry(RescueGeometry toAdd)
  {
    AddGeometry15(nativeNdx, (toAdd == null) ? 0 : toAdd.nativeNdx);
  }

  public RescueGeometry NthRescueGeometry(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueGeometry16(nativeNdx
                                        ,zeroBasedOrdinal);
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

  public boolean RemoveRescueGeometry(RescueGeometry unitToDrop)
  {
    boolean myReturn = RemoveRescueGeometry17(nativeNdx
                                               ,(unitToDrop == null) ? 0 : unitToDrop.nativeNdx);
    return myReturn;
  }

  public long RescuePropertyCount64()
  {
    long myReturn = RescuePropertyCount5(nativeNdx);
    return myReturn;
  }

  public int RescuePropertyCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(RescuePropertyCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int RescuePropertyCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(RescuePropertyCount64(), throwIfTooBig);
  }

  public void AddProperty(RescueProperty toAdd)
  {
    AddProperty6(nativeNdx, (toAdd == null) ? 0 : toAdd.nativeNdx);
  }

  public RescueProperty NthRescueProperty(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueProperty7(nativeNdx
                                        ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueProperty myReturn = new RescueProperty(returnNdx);
      return myReturn;
    }
  }

  public RescueProperty GetProperty(RescueGeometry geometry, java.lang.String name)
  {
    long returnNdx = GetProperty13a(nativeNdx, geometry.nativeNdx, name);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueProperty myReturn = new RescueProperty(returnNdx);
      return myReturn;
    }
  }

  public RescueProperty PropertyNamed(java.lang.String name)
  {
    long returnNdx = PropertyNamed13(nativeNdx
                                    ,name);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueProperty myReturn = new RescueProperty(returnNdx);
      return myReturn;
    }
  }

  public boolean RemoveRescueProperty(RescueProperty unitToDrop)
  {
    boolean myReturn = RemoveRescueProperty8(nativeNdx
                                               ,(unitToDrop == null) ? 0 : unitToDrop.nativeNdx);
    return myReturn;
  }

  public boolean TestLock()
  {
    boolean myReturn = TestLock9(nativeNdx);
    return myReturn;
  }

  public void SetLock()
  {
    SetLock10(nativeNdx);
  }

  public void ResetLock()
  {
    ResetLock11(nativeNdx);
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType12(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescueTimeStepGroup0(java.lang.String timeStepNameIn,
                                                 long groupIn);
  private native void Delete_RescueTimeStepGroup(long ndx);
  private native java.lang.String TimeStepName2(long refNdx);
  private native void SetTimeStepName3(long refNdx
                                      ,java.lang.String newTimeStepName);
  private native long ParentGroup4(long refNdx);
  private native long RescuePropertyCount5(long refNdx);
  private native void AddProperty6(long refNdx
                                  ,long toAdd);
  private native long NthRescueProperty7(long refNdx
                                         ,long zeroBasedOrdinal);
  private native boolean RemoveRescueProperty8(long refNdx
                                              ,long unitToDrop);
  private native boolean TestLock9(long refNdx);
  private native void SetLock10(long refNdx);
  private native void ResetLock11(long refNdx);
  private native boolean IsOfType12(long refNdx
                                   ,int thisType);
  private native long PropertyNamed13(long refNdx
                                      ,java.lang.String name);
  private native long GetProperty13a(long refNdx
                                      ,long geometryNdx
                                      ,java.lang.String name);
  private native long RescueGeometryCount14(long refNdx);
  private native void AddGeometry15(long refNdx
                                   ,long toAdd);
  private native long NthRescueGeometry16(long refNdx
                                         ,long zeroBasedOrdinal);
  private native boolean RemoveRescueGeometry17(long refNdx
                                               ,long unitToDrop);
}
