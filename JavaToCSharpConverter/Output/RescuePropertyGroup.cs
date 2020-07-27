using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescuePropertyGroup : RescueHistoryObject
{


  protected RescuePropertyGroup(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public static RescuePropertyGroup MakeRescuePropertyGroup(string groupNameIn,
															RescueBlockUnit blockUnitIn)
  {
    long returnNdx = MakeRescuePropertyGroup0(groupNameIn,
                                             (blockUnitIn == null) ? 0 : blockUnitIn.nativeNdx);
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

  public static RescuePropertyGroup MakeRescuePropertyGroup(string groupNameIn,
                             RescueGeobodyPart partIn)
  {
    long returnNdx = MakeRescuePropertyGroup1(groupNameIn,
                                            (partIn == null) ? 0 : partIn.nativeNdx);
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

  public static RescuePropertyGroup MakeRescuePropertyGroup(string groupNameIn,
                             RescueSurface surfaceIn)
  {
    long returnNdx = MakeRescuePropertyGroup2(groupNameIn,
                                            (surfaceIn == null) ? 0 : surfaceIn.nativeNdx);
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

  public static RescuePropertyGroup MakeRescuePropertyGroup(string groupNameIn,
                             RescueModel modelIn)
  {
    long returnNdx = MakeRescuePropertyGroup3(groupNameIn,
                                            (modelIn == null) ? 0 : modelIn.nativeNdx);
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

  public static RescuePropertyGroup MakeRescuePropertyGroup(string groupNameIn,
                             RescueModel modelIn,
                             RescueDataContainer containerIn)
  {
    long returnNdx = MakeRescuePropertyGroup4(groupNameIn,
                                            (modelIn == null) ? 0 : modelIn.nativeNdx,
                                            (containerIn == null) ? 0 : containerIn.nativeNdx);
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

  public void dispose()
  {
    Delete_RescuePropertyGroup(nativeNdx);
  }

  public string GroupName()
  {
    string myReturn = GroupName5(nativeNdx);
    return myReturn;
  }

  public void SetGroupName(string newGroupName)
  {
    SetGroupName6(nativeNdx
                 ,newGroupName);
  }

  public RescueUnit ParentUnit()
  {
    long returnNdx = ParentUnit7(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueUnit myReturn = new RescueUnit(returnNdx);
      return myReturn;
    }
  }

  public RescueBlockUnit ParentBlockUnit()
  {
    long returnNdx = ParentBlockUnit8(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueBlockUnit myReturn = new RescueBlockUnit(returnNdx);
      return myReturn;
    }
  }

  public RescueGeobody ParentBody()
  {
    long returnNdx = ParentBody9(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeobody myReturn = new RescueGeobody(returnNdx);
      return myReturn;
    }
  }

  public RescueGeobodyPart ParentGeobodyPart()
  {
    long returnNdx = ParentGeobodyPart10(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeobodyPart myReturn = new RescueGeobodyPart(returnNdx);
      return myReturn;
    }
  }

  public RescueSurface ParentSurface()
  {
    long returnNdx = ParentSurface11(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSurface myReturn = new RescueSurface(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueReferenceSurface:
        myReturn = new RescueReferenceSurface(returnNdx);
        break;
      case RescueObject.R_RescueSection:
        myReturn = new RescueSection(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public RescueDataContainer Container()
  {
    long returnNdx = Container13(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueDataContainer myReturn = new RescueDataContainer(returnNdx);
      return myReturn;
    }
  }

  public long TimeStepCount64()
  {
    long myReturn = TimeStepCount12(nativeNdx);
    return myReturn;
  }

  public int TimeStepCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(TimeStepCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int TimeStepCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(TimeStepCount64(), throwIfTooBig);
  }

  public RescueTimeStepGroup NthTimeStepGroup(long zeroBasedOrdinal)
  {
    long returnNdx = NthTimeStepGroup13(nativeNdx
                                       ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTimeStepGroup myReturn = new RescueTimeStepGroup(returnNdx);
      return myReturn;
    }
  }

  public RescueTimeStepGroup GetStaticGroup()
  {
    long returnNdx = GetStaticGroup13a(nativeNdx);
	if (returnNdx == 0)
	{
	  return null;
	}
	else
	{
	  RescueTimeStepGroup myReturn = new RescueTimeStepGroup(returnNdx);
	  return myReturn;
	}
  }

  public bool DropRescueTimeStepGroup(RescueTimeStepGroup timeStep)
  {
    bool myReturn = DropRescueTimeStepGroup14(nativeNdx
                                                  ,(timeStep == null) ? 0 : timeStep.nativeNdx);
    return myReturn;
  }

  public long RescuePropertyCount64()
  {
    long myReturn = RescuePropertyCount15(nativeNdx);
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

  public RescueProperty NthRescueProperty(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueProperty16(nativeNdx
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

  public bool RemoveRescueProperty(RescueProperty unitToDrop)
  {
    bool myReturn = RemoveRescueProperty17(nativeNdx
                                               ,(unitToDrop == null) ? 0 : unitToDrop.nativeNdx);
    return myReturn;
  }

  public void AddProperty(RescueProperty toAdd)
  {
    AddProperty18(nativeNdx
                ,(toAdd == null) ? 0 : toAdd.nativeNdx);
  }

  public bool TestLock()
  {
    bool myReturn = TestLock19(nativeNdx);
    return myReturn;
  }

  public void SetLock()
  {
    SetLock20(nativeNdx);
  }

  public void ResetLock()
  {
    ResetLock21(nativeNdx);
  }

  public RescueContext Context()
  {
    long returnNdx = Context22(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueContext myReturn = new RescueContext(returnNdx);
      return myReturn;
    }
  }

  public RescueTimeStepManager GetTimeStepManager(bool refresh)
  {
    long returnNdx = GetTimeStepManager24(nativeNdx, refresh);
	if (returnNdx == 0)
	{
	  return null;
	}
	else
	{
	  RescueTimeStepManager myReturn = new RescueTimeStepManager(returnNdx);
	  return myReturn;
	}
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType23(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}