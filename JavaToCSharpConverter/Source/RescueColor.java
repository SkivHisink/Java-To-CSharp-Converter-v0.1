package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueColor.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueColor extends RescueObject
{


  public RescueColor(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueColor(RescueColor otherColor)
  {
    nativeNdx = Create_RescueColor0((otherColor == null) ? 0 : otherColor.nativeNdx);
  }

  public RescueColor(RescueContext context,
                     int red,
                     int green,
                     int blue,
                     java.lang.String name)
  {
    nativeNdx = Create_RescueColor1((context == null) ? 0 : context.nativeNdx,
                                    red,
                                    green,
                                    blue,
                                    name);
  }

  public RescueColor(RescueContext context,
                     float red,
                     float green,
                     float blue,
                     java.lang.String name)
  {
    nativeNdx = Create_RescueColor2((context == null) ? 0 : context.nativeNdx,
                                    red,
                                    green,
                                    blue,
                                    name);
  }

  public void dispose()
  {
    Delete_RescueColor(nativeNdx);
  }

  public void SetColor(int red,
                       int green,
                       int blue,
                       java.lang.String name)
  {
    SetColor4(nativeNdx
             ,red
             ,green
             ,blue
             ,name);
  }

  public void SetColor(float red,
                       float green,
                       float blue,
                       java.lang.String name)
  {
    SetColor5(nativeNdx
             ,red
             ,green
             ,blue
             ,name);
  }

  public java.lang.String ColorName()
  {
    java.lang.String myReturn = ColorName8(nativeNdx);
    return myReturn;
  }

  public int[] GetColorInts()
  {
	int[] myReturn = GetColorR1(nativeNdx);
	return myReturn;
  }

  public float[] GetColorFloats()
  {
    float[] myReturn = GetColorR2(nativeNdx);
	return myReturn;
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType9(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescueColor0(long otherColor);
  private native long Create_RescueColor1(long context,
                                         int red,
                                         int green,
                                         int blue,
                                         java.lang.String name);
  private native long Create_RescueColor2(long context,
                                         float red,
                                         float green,
                                         float blue,
                                         java.lang.String name);
  private native void Delete_RescueColor(long ndx);
  private native void SetColor4(long refNdx
                               ,int red
                               ,int green
                               ,int blue
                               ,java.lang.String name);
  private native void SetColor5(long refNdx
                               ,float red
                               ,float green
                               ,float blue
                               ,java.lang.String name);
  private native java.lang.String ColorName8(long refNdx);
  private native boolean IsOfType9(long refNdx
                                  ,int thisType);
  private native int[] GetColorR1(long refNdx);
  private native float[] GetColorR2(long refNdx);
}
