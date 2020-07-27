using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueDocument : RescueHistoryObject
{
  public RescueDocument(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueDocument(RescueModel model)
  {
	  nativeNdx = Create_RescueDocument1(model.nativeNdx);
  }
																		  // Is added to the model automatically, but you must
                                      // subsequently archive the model.

  public bool ImportDocument(string pathName)
	{
	  return ImportDocument2(nativeNdx, pathName);
	}

  public void SetDocumentName(string documentName)
	{
	  SetDocumentName3(nativeNdx, documentName);
	}

  public void ClearMetaKeywords()
	{
	  ClearMetaKeywords4(nativeNdx);
	}

  public void AddMetaKeyword(string keywordToAdd)
	{
	  AddMetaKeyword5(nativeNdx, keywordToAdd);
	}

  public string DocumentName()
	{
	  return DocumentName6(nativeNdx);
	}

  public string[] MetaKeywords()
	{
	  return MetaKeywords7(nativeNdx);
	}

  public bool ContainsMetaKey(string keyToFind)
	{
	  return ContainsMetaKey8(nativeNdx, keyToFind);
	}

  public long DocumentLength64()
	{
	  return DocumentLength9(nativeNdx);
	}

  public int DocumentLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(DocumentLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public bool ExportAs(string pathName)
	{
	  return ExportAs10(nativeNdx, pathName);
	}

}

}