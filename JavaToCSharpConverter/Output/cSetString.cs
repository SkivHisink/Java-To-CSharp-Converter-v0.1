using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cSetString : RjniBaseClass
{


  public cSetString(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetString()
  {
    nativeNdx = Create_cSetString0();
  }

  public void dispose()
  {
    Delete_cSetString(nativeNdx);
  }

  public void AddTo(string newObject)
  {
    AddTo2(nativeNdx
               ,newObject);
  }

  public bool RemoveFrom(string existingObject)
  {
    bool myReturn = RemoveFrom3(nativeNdx
                                     ,existingObject);
    return myReturn;
  }

  public string NthObject(long ordinal)
  {
    string myReturn = NthObject4(nativeNdx
                                     ,ordinal);
    return myReturn;
  }

  public string NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public long Count64()
  {
    long myReturn = Count5(nativeNdx);
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

  public bool Contains(string example)
  {
    bool myReturn = Contains6(nativeNdx
                                   ,example);
    return myReturn;
  }

  public void EmptySelf()
  {
    EmptySelf7(nativeNdx);
  }

}

}