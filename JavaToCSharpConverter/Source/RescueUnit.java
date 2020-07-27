package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueUnit.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueUnit extends RescueLogicalOrderEntry
{


  protected RescueUnit(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueUnit(java.lang.String newUnitName,
                    RescueModel newParentModel)
  {
    nativeNdx = Create_RescueUnit0(newUnitName,
                                   (newParentModel == null) ? 0 : newParentModel.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueUnit(nativeNdx);
  }

  public java.lang.String UnitName()
  {
    java.lang.String myReturn = UnitName2(nativeNdx);
    return myReturn;
  }

  public void SetUnitName(java.lang.String newUnitName)
  {
    SetUnitName3(nativeNdx
                ,newUnitName);
  }

  public RescueModel ParentModel()
  {
    long returnNdx = ParentModel4(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueModel myReturn = new RescueModel(returnNdx);
      return myReturn;
    }
  }

  public long PropertyGroupCount64()
  {
    long myReturn = PropertyGroupCount5(nativeNdx);
    return myReturn;
  }

  public int PropertyGroupCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(PropertyGroupCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int PropertyGroupCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(PropertyGroupCount64(), throwIfTooBig);
  }

  public RescuePropertyGroup NthRescuePropertyGroup(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescuePropertyGroup6(nativeNdx
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

  public RescuePropertyGroup PropertyGroupIdentifiedBy(long identifier)
  {
    long returnNdx = PropertyGroupIdentifiedBy7(nativeNdx
                                                ,identifier);
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

  public boolean DropRescuePropertyGroup(RescuePropertyGroup unitToDrop)
  {
    boolean myReturn = DropRescuePropertyGroup8(nativeNdx
                                                  ,(unitToDrop == null) ? 0 : unitToDrop.nativeNdx);
    return myReturn;
  }

  public void AddBlockUnit(RescueBlockUnit existingBlockUnit)
  {
    AddBlockUnit9(nativeNdx
                 ,(existingBlockUnit == null) ? 0 : existingBlockUnit.nativeNdx);
  }

  public boolean DeleteBlockUnit(RescueBlockUnit existingBlockUnit)
  {
    boolean myReturn = DeleteBlockUnit10(nativeNdx
                                          ,(existingBlockUnit == null) ? 0 : existingBlockUnit.nativeNdx);
    return myReturn;
  }

  public RescueBlockUnit NthBlockUnit(long zeroBasedOrdinal)
  {
    long returnNdx = NthBlockUnit11(nativeNdx
                                   ,zeroBasedOrdinal);
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

  public boolean IsNamed(java.lang.String possibleName)
  {
    boolean myReturn = IsNamed12(nativeNdx
                                  ,possibleName);
    return myReturn;
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType13(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescueUnit0(java.lang.String newUnitName,
                                        long newParentModel);
  private native void Delete_RescueUnit(long ndx);
  private native java.lang.String UnitName2(long refNdx);
  private native void SetUnitName3(long refNdx
                                  ,java.lang.String newUnitName);
  private native long ParentModel4(long refNdx);
  private native long PropertyGroupCount5(long refNdx);
  private native long NthRescuePropertyGroup6(long refNdx
                                              ,long zeroBasedOrdinal);
  private native long PropertyGroupIdentifiedBy7(long refNdx
                                                 ,long identifier);
  private native boolean DropRescuePropertyGroup8(long refNdx
                                                 ,long unitToDrop);
  private native void AddBlockUnit9(long refNdx
                                   ,long existingBlockUnit);
  private native boolean DeleteBlockUnit10(long refNdx
                                          ,long existingBlockUnit);
  private native long NthBlockUnit11(long refNdx
                                     ,long zeroBasedOrdinal);
  private native boolean IsNamed12(long refNdx
                                  ,java.lang.String possibleName);
  private native boolean IsOfType13(long refNdx
                                   ,int thisType);
}
