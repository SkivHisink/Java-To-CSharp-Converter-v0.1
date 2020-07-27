using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueEventDescr : RescueLogicalOrderEntry
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

  public string EventDescrName()
  {
    string myReturn = EventDescrName1(nativeNdx);
    return myReturn;
  }

  public void SetEventDescrName(string newEventDescrName)
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

  public int SectionCount(bool throwIfTooBig) //thro RuntimeException
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

  public bool FullEvents(RescueModel model)
  {
    bool myReturn = FullEvents8(nativeNdx
                                     ,(model == null) ? 0 : model.nativeNdx);
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