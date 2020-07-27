package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescuePropertyGroup.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescuePropertyGroup extends RescueHistoryObject
{


  protected RescuePropertyGroup(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public static RescuePropertyGroup MakeRescuePropertyGroup(java.lang.String groupNameIn,
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

  public static RescuePropertyGroup MakeRescuePropertyGroup(java.lang.String groupNameIn,
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

  public static RescuePropertyGroup MakeRescuePropertyGroup(java.lang.String groupNameIn,
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

  public static RescuePropertyGroup MakeRescuePropertyGroup(java.lang.String groupNameIn,
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

  public static RescuePropertyGroup MakeRescuePropertyGroup(java.lang.String groupNameIn,
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

  public java.lang.String GroupName()
  {
    java.lang.String myReturn = GroupName5(nativeNdx);
    return myReturn;
  }

  public void SetGroupName(java.lang.String newGroupName)
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

  public int TimeStepCount(boolean throwIfTooBig) throws RuntimeException
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

  public boolean DropRescueTimeStepGroup(RescueTimeStepGroup timeStep)
  {
    boolean myReturn = DropRescueTimeStepGroup14(nativeNdx
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

  public int RescuePropertyCount(boolean throwIfTooBig) throws RuntimeException
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

  public boolean RemoveRescueProperty(RescueProperty unitToDrop)
  {
    boolean myReturn = RemoveRescueProperty17(nativeNdx
                                               ,(unitToDrop == null) ? 0 : unitToDrop.nativeNdx);
    return myReturn;
  }

  public void AddProperty(RescueProperty toAdd)
  {
    AddProperty18(nativeNdx
                ,(toAdd == null) ? 0 : toAdd.nativeNdx);
  }

  public boolean TestLock()
  {
    boolean myReturn = TestLock19(nativeNdx);
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

  public RescueTimeStepManager GetTimeStepManager(boolean refresh)
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

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType23(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private static native long MakeRescuePropertyGroup0(java.lang.String groupNameIn,
                                               long blockUnitIn);
  private static native long MakeRescuePropertyGroup1(java.lang.String groupNameIn,
                                               long partIn);
  private static native long MakeRescuePropertyGroup2(java.lang.String groupNameIn,
                                               long surfaceIn);
  private static native long MakeRescuePropertyGroup3(java.lang.String groupNameIn,
                                               long modelIn);
  private static native long MakeRescuePropertyGroup4(java.lang.String groupNameIn,
                                               long modelIn,
                                               long containerIn);
  private native void Delete_RescuePropertyGroup(long ndx);
  private native java.lang.String GroupName5(long refNdx);
  private native void SetGroupName6(long refNdx
                                   ,java.lang.String newGroupName);
  private native long ParentUnit7(long refNdx);
  private native long ParentBlockUnit8(long refNdx);
  private native long ParentBody9(long refNdx);
  private native long ParentGeobodyPart10(long refNdx);
  private native long ParentSurface11(long refNdx);
  private native long TimeStepCount12(long refNdx);
  private native long Container13(long refNdx);
  private native long NthTimeStepGroup13(long refNdx
                                         ,long zeroBasedOrdinal);
  private native long GetStaticGroup13a(long refNdx);
  private native boolean DropRescueTimeStepGroup14(long refNdx
                                                  ,long timeStep);
  private native long RescuePropertyCount15(long refNdx);
  private native long NthRescueProperty16(long refNdx
                                          ,long zeroBasedOrdinal);
  private native boolean RemoveRescueProperty17(long refNdx
                                               ,long unitToDrop);
  private native void AddProperty18(long refNdx
                                   ,long toAdd);
  private native boolean TestLock19(long refNdx);
  private native void SetLock20(long refNdx);
  private native void ResetLock21(long refNdx);
  private native long Context22(long refNdx);
  private native boolean IsOfType23(long refNdx
                                   ,int thisType);
  private native long GetTimeStepManager24(long refNdx, boolean refresh);
}
