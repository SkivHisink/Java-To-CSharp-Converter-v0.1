using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cSetRescueDataContainer : RjniBaseClass
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

  public bool RemoveFrom(RescueDataContainer existingObject)
  {
    bool myReturn = RemoveFrom4(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public bool RemoveFrom(long ndx)
  {
    bool myReturn = RemoveFrom5(nativeNdx
                                     ,ndx);
    return myReturn;
  }

  public bool RemoveFrom(int ndx)
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

  public int Count(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

  public void Relink(RescueObject parent)
  {
    Relink12(nativeNdx
           ,(parent == null) ? 0 : parent.nativeNdx);
  }

  public bool AnyFileTruncated()
  {
    bool myReturn = AnyFileTruncated13(nativeNdx);
    return myReturn;
  }

  public bool FileTruncated()
  {
    bool myReturn = FileTruncated14(nativeNdx);
    return myReturn;
  }

  public int FileVersion()
  {
    int myReturn = FileVersion15(nativeNdx);
    return myReturn;
  }

}

}