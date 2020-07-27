package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cSetRescueDataContainer.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cSetRescueDataContainer extends RjniBaseClass
{


  protected cSetRescueDataContainer(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public long Identifier64()
  {
    long myReturn = Identifier0(nativeNdx);
    return myReturn;
  }

  public int Identifier()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(Identifier64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public cSetRescueDataContainer(RescueModel modelIn)
  {
    nativeNdx = Create_cSetRescueDataContainer1((modelIn == null) ? 0 : modelIn.nativeNdx);
  }

  public void dispose()
  {
    Delete_cSetRescueDataContainer(nativeNdx);
  }

  public void AddTo(RescueDataContainer newObject)
  {
    AddTo3(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public boolean RemoveFrom(RescueDataContainer existingObject)
  {
    boolean myReturn = RemoveFrom4(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public boolean RemoveFrom(long ndx)
  {
    boolean myReturn = RemoveFrom5(nativeNdx
                                     ,ndx);
    return myReturn;
  }

  public boolean RemoveFrom(int ndx)
  {
    return RemoveFrom((long) ndx);
  }

  public RescueDataContainer NthObject(long ordinal)
  {
    long returnNdx = NthObject6(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueDataContainer myReturn = new RescueDataContainer(returnNdx);
      return myReturn;
    }
  }

  public RescueDataContainer NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public RescueDataContainer ObjectIdentifiedBy(long identifier)
  {
    long returnNdx = ObjectIdentifiedBy7(nativeNdx
                                         ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueDataContainer myReturn = new RescueDataContainer(returnNdx);
      return myReturn;
    }
  }

  public RescueDataContainer ObjectIdentifiedBy(int identifier)
  {
    return ObjectIdentifiedBy((long) identifier);
  }

  public long Count64()
  {
    long myReturn = Count8(nativeNdx);
    return myReturn;
  }

  public int Count()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(Count64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int Count(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

  public void Relink(RescueObject parent)
  {
    Relink12(nativeNdx
           ,(parent == null) ? 0 : parent.nativeNdx);
  }

  public boolean AnyFileTruncated()
  {
    boolean myReturn = AnyFileTruncated13(nativeNdx);
    return myReturn;
  }

  public boolean FileTruncated()
  {
    boolean myReturn = FileTruncated14(nativeNdx);
    return myReturn;
  }

  public int FileVersion()
  {
    int myReturn = FileVersion15(nativeNdx);
    return myReturn;
  }

  private native long Identifier0(long refNdx);
  private native long Create_cSetRescueDataContainer1(long modelIn);
  private native void Delete_cSetRescueDataContainer(long ndx);
  private native void AddTo3(long refNdx
                                 ,long newObject);
  private native boolean RemoveFrom4(long refNdx
                                    ,long existingObject);
  private native boolean RemoveFrom5(long refNdx
                                    ,long ndx);
  private native long NthObject6(long refNdx
                                 ,long ordinal);
  private native long ObjectIdentifiedBy7(long refNdx
                                          ,long identifier);
  private native long Count8(long refNdx);
  private native void Relink12(long refNdx
                              ,long parent);
  private native boolean AnyFileTruncated13(long refNdx);
  private native boolean FileTruncated14(long refNdx);
  private native int FileVersion15(long refNdx);
}
