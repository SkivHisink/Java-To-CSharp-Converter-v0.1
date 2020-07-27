using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cNameValuePair : RjniBaseClass
{


  public cNameValuePair(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public string NthName(long ordinal)
  {
    string myReturn = NthName0(nativeNdx
                              ,ordinal);
    return myReturn;
  }

  public string NthName(int ordinal)
  {
    return NthName((long) ordinal);
  }

  public string NthValue(long ordinal)
  {
    string myReturn = NthValue1(nativeNdx
                               ,ordinal);
    return myReturn;
  }

  public string NthValue(int ordinal)
  {
    return NthValue((long) ordinal);
  }

  public long Count64()
  {
    long myReturn = Count2(nativeNdx);
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

  public bool Contains(string name)
  {
    bool myReturn = Contains3(nativeNdx
                                   ,name);
    return myReturn;
  }

  public void SetNameValuePair(string name,
                               string value)
  {
    SetNameValuePair4(nativeNdx
                     ,name
                     ,value);
  }

  public string GetNameValuePair(string name)
  {
    string myReturn = GetNameValuePair5(nativeNdx
                                       ,name);
    return myReturn;
  }

}

}