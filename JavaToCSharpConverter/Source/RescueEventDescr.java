package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueEventDescr.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueEventDescr extends RescueLogicalOrderEntry
{

  public static final int UNCONFORMITY = 0;
  public static final int DIAPIR = 1;

  protected RescueEventDescr(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public int Type()
  {
    int myReturn = Type0(nativeNdx);
    return myReturn;
  }

  public java.lang.String EventDescrName()
  {
    java.lang.String myReturn = EventDescrName1(nativeNdx);
    return myReturn;
  }

  public void SetEventDescrName(java.lang.String newEventDescrName)
  {
    SetEventDescrName2(nativeNdx
                      ,newEventDescrName);
  }

  public void dispose()
  {
    Delete_RescueEventDescr(nativeNdx);
  }

  public void AddSection(RescueSection existingSection)
  {
    AddSection4(nativeNdx
               ,(existingSection == null) ? 0 : existingSection.nativeNdx);
  }

  public void DropSection(RescueSection existingSection)
  {
    DropSection5(nativeNdx
                ,(existingSection == null) ? 0 : existingSection.nativeNdx);
  }

  public long SectionCount64()
  {
    long myReturn = SectionCount6(nativeNdx);
    return myReturn;
  }

  public int SectionCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(SectionCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int SectionCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(SectionCount64(), throwIfTooBig);
  }

  public RescueSection NthSection(long zeroBasedOrdinal)
  {
    long returnNdx = NthSection7(nativeNdx
                                 ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSection myReturn = new RescueSection(returnNdx);
      return myReturn;
    }
  }

  public RescueSection NthSection(int zeroBasedOrdinal)
  {
    long returnNdx = NthSection7(nativeNdx
                                 ,(long) zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSection myReturn = new RescueSection(returnNdx);
      return myReturn;
    }
  }

  public boolean FullEvents(RescueModel model)
  {
    boolean myReturn = FullEvents8(nativeNdx
                                     ,(model == null) ? 0 : model.nativeNdx);
    return myReturn;
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType9(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native int Type0(long refNdx);
  private native java.lang.String EventDescrName1(long refNdx);
  private native void SetEventDescrName2(long refNdx
                                        ,java.lang.String newEventDescrName);
  private native void Delete_RescueEventDescr(long ndx);
  private native void AddSection4(long refNdx
                                 ,long existingSection);
  private native void DropSection5(long refNdx
                                  ,long existingSection);
  private native long SectionCount6(long refNdx);
  private native long NthSection7(long refNdx
                                  ,long zeroBasedOrdinal);
  private native boolean FullEvents8(long refNdx
                                    ,long model);
  private native boolean IsOfType9(long refNdx
                                  ,int thisType);
}
