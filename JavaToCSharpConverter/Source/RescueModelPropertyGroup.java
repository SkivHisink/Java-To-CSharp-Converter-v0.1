package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueModelPropertyGroup.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueModelPropertyGroup extends RescueHistoryObject
{


  protected RescueModelPropertyGroup(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueModelPropertyGroup(java.lang.String groupNameIn,
                                  RescueModel modelIn)
  {
    nativeNdx = Create_RescueModelPropertyGroup0(groupNameIn,
                                                 (modelIn == null) ? 0 : modelIn.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueModelPropertyGroup(nativeNdx);
  }

  public java.lang.String GroupName()
  {
    java.lang.String myReturn = GroupName2(nativeNdx);
    return myReturn;
  }

  public void SetGroupName(java.lang.String newGroupName)
  {
    SetGroupName3(nativeNdx
                 ,newGroupName);
  }

  public boolean IsNamed(java.lang.String possibleName)
  {
    boolean myReturn = IsNamed4(nativeNdx
                                  ,possibleName);
    return myReturn;
  }

  public long GroupCount64()
  {
    long myReturn = GroupCount5(nativeNdx);
    return myReturn;
  }

  public int GroupCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(GroupCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int GroupCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(GroupCount64(), throwIfTooBig);
  }

  public void AddGroup(RescuePropertyGroup toAdd)
  {
    AddGroup6(nativeNdx
             ,(toAdd == null) ? 0 : toAdd.nativeNdx);
  }

  public RescuePropertyGroup NthGroup(long zeroBasedOrdinal)
  {
    long returnNdx = NthGroup7(nativeNdx
                               ,zeroBasedOrdinal);
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

  public boolean RemoveGroup(RescuePropertyGroup groupToDrop)
  {
    boolean myReturn = RemoveGroup8(nativeNdx
                                      ,(groupToDrop == null) ? 0 : groupToDrop.nativeNdx);
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

  private native long Create_RescueModelPropertyGroup0(java.lang.String groupNameIn,
                                                      long modelIn);
  private native void Delete_RescueModelPropertyGroup(long ndx);
  private native java.lang.String GroupName2(long refNdx);
  private native void SetGroupName3(long refNdx
                                   ,java.lang.String newGroupName);
  private native boolean IsNamed4(long refNdx
                                 ,java.lang.String possibleName);
  private native long GroupCount5(long refNdx);
  private native void AddGroup6(long refNdx
                               ,long toAdd);
  private native long NthGroup7(long refNdx
                                ,long zeroBasedOrdinal);
  private native boolean RemoveGroup8(long refNdx
                                     ,long groupToDrop);
  private native boolean TestLock9(long refNdx);
  private native void SetLock10(long refNdx);
  private native void ResetLock11(long refNdx);
  private native boolean IsOfType12(long refNdx
                                   ,int thisType);
}
