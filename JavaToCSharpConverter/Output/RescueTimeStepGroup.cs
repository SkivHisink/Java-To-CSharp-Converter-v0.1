using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueTimeStepGroup : RescueHistoryObject
{


  protected RescueTimeStepGroup(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueTimeStepGroup(string timeStepNameIn,
                             RescuePropertyGroup groupIn)
  {
    nativeNdx = Create_RescueTimeStepGroup0(timeStepNameIn,
                                            (groupIn == null) ? 0 : groupIn.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueTimeStepGroup(nativeNdx);
  }

  public string TimeStepName()
  {
    string myReturn = TimeStepName2(nativeNdx);
    return myReturn;
  }

  public void SetTimeStepName(string newTimeStepName)
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

  public int RescueGeometryCount(bool throwIfTooBig) //thro RuntimeException
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

  public bool RemoveRescueGeometry(RescueGeometry unitToDrop)
  {
    bool myReturn = RemoveRescueGeometry17(nativeNdx
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

  public int RescuePropertyCount(bool throwIfTooBig) //thro RuntimeException
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

  public RescueProperty GetProperty(RescueGeometry geometry, string name)
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

  public RescueProperty PropertyNamed(string name)
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

  public bool RemoveRescueProperty(RescueProperty unitToDrop)
  {
    bool myReturn = RemoveRescueProperty8(nativeNdx
                                               ,(unitToDrop == null) ? 0 : unitToDrop.nativeNdx);
    return myReturn;
  }

  public bool TestLock()
  {
    bool myReturn = TestLock9(nativeNdx);
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

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType12(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}