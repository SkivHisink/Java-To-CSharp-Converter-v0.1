package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cSetRescueBlock.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cSetRescueBlock extends RjniBaseClass
{


  protected cSetRescueBlock(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetRescueBlock()
  {
    nativeNdx = Create_cSetRescueBlock0();
  }

  public void dispose()
  {
    Delete_cSetRescueBlock(nativeNdx);
  }

  public void AddTo(RescueBlock newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public boolean RemoveFrom(RescueBlock existingObject)
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

  public RescueBlock NthObject(long ordinal)
  {
    long returnNdx = NthObject5(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueBlock myReturn = new RescueBlock(returnNdx);
      return myReturn;
    }
  }

  public RescueBlock NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public RescueBlock ObjectNamed(java.lang.String nameIn)
  {
    long returnNdx = ObjectNamed6(nativeNdx
                                  ,nameIn);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueBlock myReturn = new RescueBlock(returnNdx);
      return myReturn;
    }
  }

  public RescueBlock ObjectIdentifiedBy(long identifier)
  {
    long returnNdx = ObjectIdentifiedBy7(nativeNdx
                                         ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueBlock myReturn = new RescueBlock(returnNdx);
      return myReturn;
    }
  }

  public RescueBlock ObjectIdentifiedBy(int identifier)
  {
    return ObjectIdentifiedBy((long) identifier);
  }

  public RescueGeometry GeometryIdentifiedBy(long identifier)
  {
    long returnNdx = GeometryIdentifiedBy8(nativeNdx
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

  public long Count64()
  {
    long myReturn = Count9(nativeNdx);
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
    EmptySelf10(nativeNdx);
  }

  public void Relink(RescueObject parent)
  {
    Relink13(nativeNdx
           ,(parent == null) ? 0 : parent.nativeNdx);
  }

  public boolean AnyFileTruncated()
  {
    boolean myReturn = AnyFileTruncated14(nativeNdx);
    return myReturn;
  }

  private native long Create_cSetRescueBlock0();
  private native void Delete_cSetRescueBlock(long ndx);
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
  private native long GeometryIdentifiedBy8(long refNdx
                                            ,long identifier);
  private native long Count9(long refNdx);
  private native void EmptySelf10(long refNdx);
  private native void Relink13(long refNdx
                              ,long parent);
  private native boolean AnyFileTruncated14(long refNdx);
}
