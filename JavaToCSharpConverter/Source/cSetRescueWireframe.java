package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cSetRescueWireframe.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cSetRescueWireframe extends RjniBaseClass
{


  protected cSetRescueWireframe(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetRescueWireframe()
  {
    nativeNdx = Create_cSetRescueWireframe0();
  }

  public void dispose()
  {
    Delete_cSetRescueWireframe(nativeNdx);
  }

  public void AddTo(RescueWireframe newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public boolean RemoveFrom(RescueWireframe existingObject)
  {
    boolean myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public boolean RemoveFrom(long ndx)
  {
    boolean myReturn = RemoveFrom4(nativeNdx
                                     ,ndx);
    return myReturn;
  }

  public boolean RemoveFrom(int ndx)
  {
    return RemoveFrom((long) ndx);
  }

  public RescueWireframe NthObject(long ordinal)
  {
    long returnNdx = NthObject5(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWireframe myReturn = new RescueWireframe(returnNdx);
      return myReturn;
    }
  }

  public RescueWireframe NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public RescueWireframe ObjectNamed(java.lang.String nameIn)
  {
    long returnNdx = ObjectNamed6(nativeNdx
                                  ,nameIn);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWireframe myReturn = new RescueWireframe(returnNdx);
      return myReturn;
    }
  }

  public RescueWireframe ObjectIdentifiedBy(long identifier)
  {
    long returnNdx = ObjectIdentifiedBy7(nativeNdx
                                         ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWireframe myReturn = new RescueWireframe(returnNdx);
      return myReturn;
    }
  }

  public RescueWireframe ObjectIdentifiedBy(int identifier)
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

  public void EmptySelf()
  {
    EmptySelf9(nativeNdx);
  }

  public void UnloadWireframe()
  {
    UnloadWireframe12(nativeNdx);
  }

  public void CopyWireframeData(java.lang.String oldPathName)
  {
    CopyWireframeData13(nativeNdx
                      ,oldPathName);
  }

  public void DropWireframeMemory()
  {
    DropWireframeMemory14(nativeNdx);
  }

  public void UpdateWireframeData()
  {
    UpdateWireframeData15(nativeNdx);
  }

  public void Relink(RescueObject parent)
  {
    Relink16(nativeNdx
           ,(parent == null) ? 0 : parent.nativeNdx);
  }

  public boolean AnyFileTruncated()
  {
    boolean myReturn = AnyFileTruncated17(nativeNdx);
    return myReturn;
  }

  private native long Create_cSetRescueWireframe0();
  private native void Delete_cSetRescueWireframe(long ndx);
  private native void AddTo2(long refNdx
                                 ,long newObject);
  private native boolean RemoveFrom3(long refNdx
                                    ,long existingObject);
  private native boolean RemoveFrom4(long refNdx
                                    ,long ndx);
  private native long NthObject5(long refNdx
                                 ,long ordinal);
  private native long ObjectNamed6(long refNdx
                                   ,java.lang.String nameIn);
  private native long ObjectIdentifiedBy7(long refNdx
                                          ,long identifier);
  private native long Count8(long refNdx);
  private native void EmptySelf9(long refNdx);
  private native void UnloadWireframe12(long refNdx);
  private native void CopyWireframeData13(long refNdx
                                         ,java.lang.String oldPathName);
  private native void DropWireframeMemory14(long refNdx);
  private native void UpdateWireframeData15(long refNdx);
  private native void Relink16(long refNdx
                              ,long parent);
  private native boolean AnyFileTruncated17(long refNdx);
}
