using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueArray : RescueObject
{


  protected RescueArray(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueArray()
  {
  }

  public void dispose()
  {
    Delete_RescueArray(nativeNdx);
  }

  public string PropertyName()
  {
    string myReturn = PropertyName2(nativeNdx);
    return myReturn;
  }

  public void SetPropertyName(string newPropertyName)
  {
    SetPropertyName3(nativeNdx
                    ,newPropertyName);
  }

  public string PropertyType()
  {
    string myReturn = PropertyType4(nativeNdx);
    return myReturn;
  }

  public void SetPropertyType(string newPropertyType)
  {
    SetPropertyType5(nativeNdx
                    ,newPropertyType);
  }

  public string UnitOfMeasure()
  {
    string myReturn = UnitOfMeasure6(nativeNdx);
    return myReturn;
  }

  public void SetUnitOfMeasure(string newUnitOfMeasure)
  {
    SetUnitOfMeasure7(nativeNdx
                     ,newUnitOfMeasure);
  }

  public RescueGrid Grid()
  {
    long returnNdx = Grid8(nativeNdx);
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

  public bool CellCentered()
  {
    bool myReturn = CellCentered9(nativeNdx);
    return myReturn;
  }

  public RescueModel ParentModel()
  {
    long returnNdx = ParentModel10(nativeNdx);
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

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType11(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public bool IsLoaded()
  {
    bool myReturn = IsLoaded12(nativeNdx);
    return myReturn;
  }

  public bool FileTruncated()
  {
    bool myReturn = FileTruncated13(nativeNdx);
    return myReturn;
  }

  public bool Load()
  {
    bool myReturn = Load14(nativeNdx);
    return myReturn;
  }

  public bool Unload()
  {
    bool myReturn = Unload15(nativeNdx);
    return myReturn;
  }

  public bool HasChanged()
  {
    bool myReturn = HasChanged16(nativeNdx);
    return myReturn;
  }

  public bool MinMaxDirty()
  {
    bool myReturn = MinMaxDirty17(nativeNdx);
    return myReturn;
  }

  public void CalculateMinMax()
  {
    CalculateMinMax18(nativeNdx);
  }

  public void MarkChanged()
  {
    MarkChanged19(nativeNdx);
  }

  public int Version(bool reload)
  {
    int myReturn = Version20(nativeNdx
                           ,reload);
    return myReturn;
  }

  public bool HasFragments()
  {
    bool myReturn = HasFragments25(nativeNdx);
    return myReturn;
  }

  public cSetRescueArrayFragment Fragments()
  {
    long returnNdx = Fragments26(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      cSetRescueArrayFragment myReturn = new cSetRescueArrayFragment(returnNdx);
      return myReturn;
    }
  }

}

}