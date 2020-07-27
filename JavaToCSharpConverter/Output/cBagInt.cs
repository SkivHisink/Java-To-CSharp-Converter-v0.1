using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cBagInt : RjniBaseClass
{


  protected cBagInt(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cBagInt()
  {
    nativeNdx = Create_cBagInt0();
  }

  public void dispose()
  {
    Delete_cBagInt(nativeNdx);
  }

  public void AddTo(int newObject)
  {
    AddTo2(nativeNdx
               ,newObject);
  }

  public bool RemoveFrom(long existingObject)
  {
    bool myReturn = RemoveFrom3(nativeNdx
                                     ,existingObject);
    return myReturn;
  }

  public long NthObject(long ordinal)
  {
    long myReturn = NthObject4(nativeNdx
                             ,ordinal);
    return myReturn;
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

  public int Count(bool throwIfTooBig) //thro Exception
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

  public bool Contains(long example)
  {
    bool myReturn = Contains6(nativeNdx
                                   ,example);
    return myReturn;
  }

}

}