using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueColor : RescueObject
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
                     string name)
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
                     string name)
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
                       string name)
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
                       string name)
  {
    SetColor5(nativeNdx
             ,red
             ,green
             ,blue
             ,name);
  }

  public string ColorName()
  {
    string myReturn = ColorName8(nativeNdx);
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

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType9(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}