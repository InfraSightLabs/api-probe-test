package com.infrasight.tests.apiprobe;

/**
 * Represents an office (plats) for Arbetsformedligen
 */
class Office {
	/** Office Code (platskod) **/
	String officeCode;
	
	/** Office name (platsnamn) **/
	String officeName;
	
	/** Contact e-mail **/
	String email;

	public String toString() {
		return officeName + " (" + officeCode + "): " + email;
	}
}
