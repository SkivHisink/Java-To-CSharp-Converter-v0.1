using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueColorTable : RescueObject
{

  public static final int ALL = 0;
  public static final int RED = 1;
  public static final int GREEN = 2;
  public static final int BLUE = 3;

  protected RescueColorTable(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueColorTable(RescueModel parentModel,
                          long probableRows,
                          int role)
  {
    nativeNdx = Create_RescueColorTable0((parentModel == null) ? 0 : parentModel.nativeNdx,
                                         probableRows,
                                         role);
  }

  public RescueColorTable(RescueModel parentModel,
                          int probableRows,
                          int role)
  {
    nativeNdx = Create_RescueColorTable0((parentModel == null) ? 0 : parentModel.nativeNdx,
                                         (long) probableRows,
                                         role);
  }

  public RescueColorTable(RescueColorTable other)
  {
    nativeNdx = Create_RescueColorTable1((other == null) ? 0 : other.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueColorTable(nativeNdx);
  }

  public void ResetColorTable()
  {
    ResetColorTable3(nativeNdx);
  }

  public long ColorRowCount64()
  {
    long myReturn = ColorRowCount4(nativeNdx);
    return myReturn;
  }

  public int ColorRowCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(ColorRowCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int ColorRowCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(ColorRowCount64(), throwIfTooBig);
  }

  public void AddColorRow(float lowValue,
                          float highValue,
                          RescueColor color)
  {
    AddColorRow6(nativeNdx
                ,lowValue
                ,highValue
                ,(color == null) ? 0 : color.nativeNdx);
  }

  public void AddColorRow(float lowValue,
                          float highValue,
                          RescueColor lowColor,
                          RescueColor highColor)
  {
    AddColorRow7(nativeNdx
                ,lowValue
                ,highValue
                ,(lowColor == null) ? 0 : lowColor.nativeNdx
                ,(highColor == null) ? 0 : highColor.nativeNdx);
  }

  public void AddColorRow(bool lowToInfinite,
                          float lowValue,
                          bool highToInfinite,
                          float highValue,
                          RescueColor color)
  {
    AddColorRow8(nativeNdx
                ,lowToInfinite
                ,lowValue
                ,highToInfinite
                ,highValue
                ,(color == null) ? 0 : color.nativeNdx);
  }

  public void AddColorRow(bool lowToInfinite,
                          float lowValue,
                          bool highToInfinite,
                          float highValue,
                          RescueColor lowColor,
                          RescueColor highColor)
  {
    AddColorRow9(nativeNdx
                ,lowToInfinite
                ,lowValue
                ,highToInfinite
                ,highValue
                ,(lowColor == null) ? 0 : lowColor.nativeNdx
                ,(highColor == null) ? 0 : highColor.nativeNdx);
  }

  public bool IsLoaded()
  {
    bool myReturn = IsLoaded10(nativeNdx);
    return myReturn;
  }

  public bool FileTruncated()
  {
    bool myReturn = FileTruncated11(nativeNdx);
    return myReturn;
  }

  public bool Load()
  {
    bool myReturn = Load12(nativeNdx);
    return myReturn;
  }

  public bool Unload()
  {
    bool myReturn = Unload13(nativeNdx);
    return myReturn;
  }

  public bool HasChanged()
  {
    bool myReturn = HasChanged14(nativeNdx);
    return myReturn;
  }

  public void MarkChanged()
  {
    MarkChanged15(nativeNdx);
  }

  public int Version(bool reload)
  {
    int myReturn = Version16(nativeNdx
                           ,reload);
    return myReturn;
  }

}

}