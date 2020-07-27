package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueBlock.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueBlock extends RescueHistoryObject
{


  protected RescueBlock(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueBlock(java.lang.String newBlockName,
                     RescueModel newBlockParent)
  {
    nativeNdx = Create_RescueBlock0(newBlockName,
                                    (newBlockParent == null) ? 0 : newBlockParent.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueBlock(nativeNdx);
  }

  public java.lang.String BlockName()
  {
    java.lang.String myReturn = BlockName2(nativeNdx);
    return myReturn;
  }

  public void SetBlockName(java.lang.String newBlockName)
  {
    SetBlockName3(nativeNdx
                 ,newBlockName);
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

  public long BlockUnitCount64()
  {
    long myReturn = BlockUnitCount5(nativeNdx);
    return myReturn;
  }

  public int BlockUnitCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(BlockUnitCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int BlockUnitCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(BlockUnitCount64(), throwIfTooBig);
  }

  public RescueBlockUnit NthRescueBlockUnit(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueBlockUnit6(nativeNdx
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

  public RescueBlockUnit NthRescueBlockUnit(int zeroBasedOrdinal)
  {
    return NthRescueBlockUnit((long) zeroBasedOrdinal);
  }

  public RescueBlockUnit BlockUnitIdentifiedBy(long identifier)
  {
    long returnNdx = BlockUnitIdentifiedBy7(nativeNdx
                                            ,identifier);
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

  public RescueBlockUnit BlockUnitIdentifiedBy(int identifier)
  {
    return BlockUnitIdentifiedBy((long) identifier);
  }

  public RescueBlockUnit BlockUnitForUnit(RescueUnit unitToFind)
  {
    long returnNdx = BlockUnitForUnit8(nativeNdx
                                       ,(unitToFind == null) ? 0 : unitToFind.nativeNdx);
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

  public boolean DropBlockUnit(RescueBlockUnit blockUnitToDrop)
  {
    boolean myReturn = DropBlockUnit9(nativeNdx
                                        ,(blockUnitToDrop == null) ? 0 : blockUnitToDrop.nativeNdx);
    return myReturn;
  }

  public RescueProperty PropertyIdentifiedBy(long id)
  {
    long returnNdx = PropertyIdentifiedBy10(nativeNdx
                                           ,id);
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

  public RescueProperty PropertyIdentifiedBy(int id)
  {
    return PropertyIdentifiedBy((long) id);
  }

  public RescueMacroVolume MacroVolumeIdentifiedBy(long id)
  {
    long returnNdx = MacroVolumeIdentifiedBy11(nativeNdx
                                              ,id);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueMacroVolume myReturn = new RescueMacroVolume(returnNdx);
      return myReturn;
    }
  }

  public RescueMacroVolume MacroVolumeIdentifiedBy(int id)
  {
    return MacroVolumeIdentifiedBy((long) id);
  }

  public RescueBlockUnitSide BlockUnitSideIdentifiedBy(long id)
  {
    long returnNdx = BlockUnitSideIdentifiedBy12(nativeNdx
                                                ,id);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueBlockUnitSide myReturn = new RescueBlockUnitSide(returnNdx);
      return myReturn;
    }
  }

  public RescueBlockUnitSide BlockUnitSideIdentifiedBy(int id)
  {
    return BlockUnitSideIdentifiedBy((long) id);
  }

  public boolean AnyFileTruncated()
  {
    boolean myReturn = AnyFileTruncated13(nativeNdx);
    return myReturn;
  }

  public RescueGeometry GeometryIdentifiedBy(long identifier)
  {
    long returnNdx = GeometryIdentifiedBy14(nativeNdx
                                           ,identifier);
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

  public RescueGeometry GeometryIdentifiedBy(int identifier)
  {
    return GeometryIdentifiedBy((long) identifier);
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType15(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescueBlock0(java.lang.String newBlockName,
                                         long newBlockParent);
  private native void Delete_RescueBlock(long ndx);
  private native java.lang.String BlockName2(long refNdx);
  private native void SetBlockName3(long refNdx
                                   ,java.lang.String newBlockName);
  private native long ParentModel4(long refNdx);
  private native long BlockUnitCount5(long refNdx);
  private native long NthRescueBlockUnit6(long refNdx
                                          ,long zeroBasedOrdinal);
  private native long BlockUnitIdentifiedBy7(long refNdx
                                             ,long identifier);
  private native long BlockUnitForUnit8(long refNdx
                                        ,long unitToFind);
  private native boolean DropBlockUnit9(long refNdx
                                       ,long blockUnitToDrop);
  private native long PropertyIdentifiedBy10(long refNdx
                                             ,long id);
  private native long MacroVolumeIdentifiedBy11(long refNdx
                                                ,long id);
  private native long BlockUnitSideIdentifiedBy12(long refNdx
                                                  ,long id);
  private native boolean AnyFileTruncated13(long refNdx);
  private native long GeometryIdentifiedBy14(long refNdx
                                             ,long identifier);
  private native boolean IsOfType15(long refNdx
                                   ,int thisType);
}
