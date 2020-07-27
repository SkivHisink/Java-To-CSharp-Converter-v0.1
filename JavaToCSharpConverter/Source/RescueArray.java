package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueArray.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueArray extends RescueObject
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

  public java.lang.String PropertyName()
  {
    java.lang.String myReturn = PropertyName2(nativeNdx);
    return myReturn;
  }

  public void SetPropertyName(java.lang.String newPropertyName)
  {
    SetPropertyName3(nativeNdx
                    ,newPropertyName);
  }

  public java.lang.String PropertyType()
  {
    java.lang.String myReturn = PropertyType4(nativeNdx);
    return myReturn;
  }

  public void SetPropertyType(java.lang.String newPropertyType)
  {
    SetPropertyType5(nativeNdx
                    ,newPropertyType);
  }

  public java.lang.String UnitOfMeasure()
  {
    java.lang.String myReturn = UnitOfMeasure6(nativeNdx);
    return myReturn;
  }

  public void SetUnitOfMeasure(java.lang.String newUnitOfMeasure)
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

  public boolean CellCentered()
  {
    boolean myReturn = CellCentered9(nativeNdx);
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

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType11(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public boolean IsLoaded()
  {
    boolean myReturn = IsLoaded12(nativeNdx);
    return myReturn;
  }

  public boolean FileTruncated()
  {
    boolean myReturn = FileTruncated13(nativeNdx);
    return myReturn;
  }

  public boolean Load()
  {
    boolean myReturn = Load14(nativeNdx);
    return myReturn;
  }

  public boolean Unload()
  {
    boolean myReturn = Unload15(nativeNdx);
    return myReturn;
  }

  public boolean HasChanged()
  {
    boolean myReturn = HasChanged16(nativeNdx);
    return myReturn;
  }

  public boolean MinMaxDirty()
  {
    boolean myReturn = MinMaxDirty17(nativeNdx);
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

  public int Version(boolean reload)
  {
    int myReturn = Version20(nativeNdx
                           ,reload);
    return myReturn;
  }

  public boolean HasFragments()
  {
    boolean myReturn = HasFragments25(nativeNdx);
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

  private native void Delete_RescueArray(long ndx);
  private native java.lang.String PropertyName2(long refNdx);
  private native void SetPropertyName3(long refNdx
                                      ,java.lang.String newPropertyName);
  private native java.lang.String PropertyType4(long refNdx);
  private native void SetPropertyType5(long refNdx
                                      ,java.lang.String newPropertyType);
  private native java.lang.String UnitOfMeasure6(long refNdx);
  private native void SetUnitOfMeasure7(long refNdx
                                       ,java.lang.String newUnitOfMeasure);
  private native long Grid8(long refNdx);
  private native boolean CellCentered9(long refNdx);
  private native long ParentModel10(long refNdx);
  private native boolean IsOfType11(long refNdx
                                   ,int thisType);
  private native boolean IsLoaded12(long refNdx);
  private native boolean FileTruncated13(long refNdx);
  private native boolean Load14(long refNdx);
  private native boolean Unload15(long refNdx);
  private native boolean HasChanged16(long refNdx);
  private native boolean MinMaxDirty17(long refNdx);
  private native void CalculateMinMax18(long refNdx);
  private native void MarkChanged19(long refNdx);
  private native int Version20(long refNdx
                              ,boolean reload);
  private native boolean HasFragments25(long refNdx);
  private native long Fragments26(long refNdx);
}
