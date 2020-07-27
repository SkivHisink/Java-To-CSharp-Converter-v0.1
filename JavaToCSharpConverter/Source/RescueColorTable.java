package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueColorTable.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueColorTable extends RescueObject
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

  public int ColorRowCount(boolean throwIfTooBig) throws RuntimeException
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

  public void AddColorRow(boolean lowToInfinite,
                          float lowValue,
                          boolean highToInfinite,
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

  public void AddColorRow(boolean lowToInfinite,
                          float lowValue,
                          boolean highToInfinite,
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

  public boolean IsLoaded()
  {
    boolean myReturn = IsLoaded10(nativeNdx);
    return myReturn;
  }

  public boolean FileTruncated()
  {
    boolean myReturn = FileTruncated11(nativeNdx);
    return myReturn;
  }

  public boolean Load()
  {
    boolean myReturn = Load12(nativeNdx);
    return myReturn;
  }

  public boolean Unload()
  {
    boolean myReturn = Unload13(nativeNdx);
    return myReturn;
  }

  public boolean HasChanged()
  {
    boolean myReturn = HasChanged14(nativeNdx);
    return myReturn;
  }

  public void MarkChanged()
  {
    MarkChanged15(nativeNdx);
  }

  public int Version(boolean reload)
  {
    int myReturn = Version16(nativeNdx
                           ,reload);
    return myReturn;
  }

  private native long Create_RescueColorTable0(long parentModel,
                                              long probableRows,
                                              int role);
  private native long Create_RescueColorTable1(long other);
  private native void Delete_RescueColorTable(long ndx);
  private native void ResetColorTable3(long refNdx);
  private native long ColorRowCount4(long refNdx);
  private native void AddColorRow6(long refNdx
                                  ,float lowValue
                                  ,float highValue
                                  ,long color);
  private native void AddColorRow7(long refNdx
                                  ,float lowValue
                                  ,float highValue
                                  ,long lowColor
                                  ,long highColor);
  private native void AddColorRow8(long refNdx
                                  ,boolean lowToInfinite
                                  ,float lowValue
                                  ,boolean highToInfinite
                                  ,float highValue
                                  ,long color);
  private native void AddColorRow9(long refNdx
                                  ,boolean lowToInfinite
                                  ,float lowValue
                                  ,boolean highToInfinite
                                  ,float highValue
                                  ,long lowColor
                                  ,long highColor);
  private native boolean IsLoaded10(long refNdx);
  private native boolean FileTruncated11(long refNdx);
  private native boolean Load12(long refNdx);
  private native boolean Unload13(long refNdx);
  private native boolean HasChanged14(long refNdx);
  private native void MarkChanged15(long refNdx);
  private native int Version16(long refNdx
                              ,boolean reload);
}
