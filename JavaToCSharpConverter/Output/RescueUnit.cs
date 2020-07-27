using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueUnit : RescueLogicalOrderEntry
{


  protected RescueUnit(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueUnit(string newUnitName,
                    RescueModel newParentModel)
  {
    nativeNdx = Create_RescueUnit0(newUnitName,
                                   (newParentModel == null) ? 0 : newParentModel.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueUnit(nativeNdx);
  }

  public string UnitName()
  {
    string myReturn = UnitName2(nativeNdx);
    return myReturn;
  }

  public void SetUnitName(string newUnitName)
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

  public int PropertyGroupCount(bool throwIfTooBig) //thro RuntimeException
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

  public bool DropRescuePropertyGroup(RescuePropertyGroup unitToDrop)
  {
    bool myReturn = DropRescuePropertyGroup8(nativeNdx
                                                  ,(unitToDrop == null) ? 0 : unitToDrop.nativeNdx);
    return myReturn;
  }

  public void AddBlockUnit(RescueBlockUnit existingBlockUnit)
  {
    AddBlockUnit9(nativeNdx
                 ,(existingBlockUnit == null) ? 0 : existingBlockUnit.nativeNdx);
  }

  public bool DeleteBlockUnit(RescueBlockUnit existingBlockUnit)
  {
    bool myReturn = DeleteBlockUnit10(nativeNdx
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

  public bool IsNamed(string possibleName)
  {
    bool myReturn = IsNamed12(nativeNdx
                                  ,possibleName);
    return myReturn;
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType13(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}