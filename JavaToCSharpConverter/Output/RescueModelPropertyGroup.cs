using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueModelPropertyGroup : RescueHistoryObject
{


  protected RescueModelPropertyGroup(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueModelPropertyGroup(string groupNameIn,
                                  RescueModel modelIn)
  {
    nativeNdx = Create_RescueModelPropertyGroup0(groupNameIn,
                                                 (modelIn == null) ? 0 : modelIn.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueModelPropertyGroup(nativeNdx);
  }

  public string GroupName()
  {
    string myReturn = GroupName2(nativeNdx);
    return myReturn;
  }

  public void SetGroupName(string newGroupName)
  {
    SetGroupName3(nativeNdx
                 ,newGroupName);
  }

  public bool IsNamed(string possibleName)
  {
    bool myReturn = IsNamed4(nativeNdx
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

  public int GroupCount(bool throwIfTooBig) //thro RuntimeException
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

  public bool RemoveGroup(RescuePropertyGroup groupToDrop)
  {
    bool myReturn = RemoveGroup8(nativeNdx
                                      ,(groupToDrop == null) ? 0 : groupToDrop.nativeNdx);
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