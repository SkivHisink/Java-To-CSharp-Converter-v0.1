package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cNameValuePair.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cNameValuePair extends RjniBaseClass
{


  public cNameValuePair(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public java.lang.String NthName(long ordinal)
  {
    java.lang.String myReturn = NthName0(nativeNdx
                              ,ordinal);
    return myReturn;
  }

  public java.lang.String NthName(int ordinal)
  {
    return NthName((long) ordinal);
  }

  public java.lang.String NthValue(long ordinal)
  {
    java.lang.String myReturn = NthValue1(nativeNdx
                               ,ordinal);
    return myReturn;
  }

  public java.lang.String NthValue(int ordinal)
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

  public int Count(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

  public boolean Contains(java.lang.String name)
  {
    boolean myReturn = Contains3(nativeNdx
                                   ,name);
    return myReturn;
  }

  public void SetNameValuePair(java.lang.String name,
                               java.lang.String value)
  {
    SetNameValuePair4(nativeNdx
                     ,name
                     ,value);
  }

  public java.lang.String GetNameValuePair(java.lang.String name)
  {
    java.lang.String myReturn = GetNameValuePair5(nativeNdx
                                       ,name);
    return myReturn;
  }

  private native java.lang.String NthName0(long refNdx
                                          ,long ordinal);
  private native java.lang.String NthValue1(long refNdx
                                           ,long ordinal);
  private native long Count2(long refNdx);
  private native boolean Contains3(long refNdx
                                  ,java.lang.String name);
  private native void SetNameValuePair4(long refNdx
                                       ,java.lang.String name
                                       ,java.lang.String value);
  private native java.lang.String GetNameValuePair5(long refNdx
                                                   ,java.lang.String name);
}
