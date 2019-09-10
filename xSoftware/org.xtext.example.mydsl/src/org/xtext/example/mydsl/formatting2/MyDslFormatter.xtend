/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.mydsl.services.MyDslGrammarAccess
import xSoftware.Api
import xSoftware.Atributo
import xSoftware.Entidad
import xSoftware.MockarooEntity
import xSoftware.PrimitiveType
import xSoftware.ServicioRest

class MyDslFormatter extends AbstractFormatter2 {
	
	@Inject extension MyDslGrammarAccess

	def dispatch void format(Api api, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Entidad entidad : api.getEntidades()) {
			entidad.format;
		}
		for (PrimitiveType primitiveType : api.getPrimitivetypes()) {
			primitiveType.format;
		}
		for (ServicioRest servicioRest : api.getServiciosRest()) {
			servicioRest.format;
		}
	}

	def dispatch void format(MockarooEntity mockarooEntity, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Atributo atributo : mockarooEntity.getAtributos()) {
			atributo.format;
		}
	}
	
	// TODO: implement for ServicioRest, Test, SimpleEntity, Response, Request, Mapping
}
