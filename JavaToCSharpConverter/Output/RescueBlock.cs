using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueBlock : RescueHistoryObject
{


  protected RescueBlock(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueBlock(string newBlockName,
                     RescueModel newBlockParent)
  {
    nativeNdx = Create_RescueBlock0(newBlockName,
                                    (newBlockParent == null) ? 0 : newBlockParent.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueBlock(nativeNdx);
  }

  public string BlockName()
  {
    string myReturn = BlockName2(nativeNdx);
    return myReturn;
  }

  public void SetBlockName(string newBlockName)
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

  public int BlockUnitCount(bool throwIfTooBig) //thro RuntimeException
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

  public bool DropBlockUnit(RescueBlockUnit blockUnitToDrop)
  {
    bool myReturn = DropBlockUnit9(nativeNdx
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

  public bool AnyFileTruncated()
  {
    bool myReturn = AnyFileTruncated13(nativeNdx);
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

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType15(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}