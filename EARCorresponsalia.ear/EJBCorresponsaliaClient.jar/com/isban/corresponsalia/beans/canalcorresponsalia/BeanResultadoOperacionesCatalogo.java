package com.isban.corresponsalia.beans.canalcorresponsalia;

import java.io.Serializable;
import java.util.ArrayList;

import com.isban.corresponsalia.beans.comunes.BeanOperacionCatalogo;
import com.isban.ebe.commons.interfaces.BeanResultBO;


// TODO: Auto-generated Javadoc
/**
 * The Class BeanResultadoOperacionesCatalogo.
 */
public class BeanResultadoOperacionesCatalogo implements  BeanResultBO, Serializable{

	/** Operaciones Corresponsalia. */
	private static final long serialVersionUID = -6099227249270463833L;
	
	/** The Constant CODE_EXITO_CONSULTA. */
	public static final String CODE_EXITO_CONSULTA         = "CCONT000";
	
	/** The Constant CODE_ERROR_CONSULTA. */
	public static final String CODE_ERROR_CONSULTA         = "CCONT999";

	
	/** The Registros. */
	private ArrayList<BeanOperacionCatalogo> Registros        = new ArrayList<BeanOperacionCatalogo>();
	
	/** The Cod error. */
	private String                          CodError         = "";
	
	/** The Msg error. */
	private String                          MsgError         = "";
	
	/**
	 * Sets the registros.
	 *
	 * @param pValue the new registros
	 */
	public void setRegistros(ArrayList<BeanOperacionCatalogo> pValue){
		Registros = pValue;
	}

	/**
	 * Gets the registros.
	 *
	 * @return the registros
	 */
	public ArrayList<BeanOperacionCatalogo> getRegistros(){
		return Registros;
	}

	/**
	 * Gets the numero registros.
	 *
	 * @return the numero registros
	 */
	public int getNumeroRegistros(){
		return Registros.size();
	}


	/* (sin Javadoc)
	 * @see com.isban.ebe.commons.interfaces.BeanResultBO#getCodError()
	 */
	@Override
	public String getCodError() {
		return CodError;
	}

	/* (sin Javadoc)
	 * @see com.isban.ebe.commons.interfaces.BeanResultBO#getMsgError()
	 */
	@Override
	public String getMsgError() {
		return MsgError;
	}

	/* (sin Javadoc)
	 * @see com.isban.ebe.commons.interfaces.BeanResultBO#setCodError(java.lang.String)
	 */
	@Override
	public void setCodError(String codOper) {
		CodError = codOper;
		
	}

	/* (sin Javadoc)
	 * @see com.isban.ebe.commons.interfaces.BeanResultBO#setMsgError(java.lang.String)
	 */
	@Override
	public void setMsgError(String msgOper) {
		MsgError = msgOper;
		
	}

}
