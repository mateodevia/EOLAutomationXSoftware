/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import xSoftware.Api;
import xSoftware.Asercion;
import xSoftware.AtributoArreglo;
import xSoftware.AtributoMocka;
import xSoftware.AtributoSimple;
import xSoftware.ElementoAsersion;
import xSoftware.Mapping;
import xSoftware.MockarooEntity;
import xSoftware.MyBoolean;
import xSoftware.MyNumeric;
import xSoftware.MyString;
import xSoftware.PathParam;
import xSoftware.PrimitiveType;
import xSoftware.QueryParam;
import xSoftware.Request;
import xSoftware.Response;
import xSoftware.ServicioRest;
import xSoftware.SimpleEntity;
import xSoftware.StringType;
import xSoftware.Test;
import xSoftware.Url;
import xSoftware.XSoftwarePackage;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == XSoftwarePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XSoftwarePackage.API:
				sequence_Api(context, (Api) semanticObject); 
				return; 
			case XSoftwarePackage.ASERCION:
				sequence_Asercion(context, (Asercion) semanticObject); 
				return; 
			case XSoftwarePackage.ATRIBUTO_ARREGLO:
				sequence_AtributoArreglo(context, (AtributoArreglo) semanticObject); 
				return; 
			case XSoftwarePackage.ATRIBUTO_MOCKA:
				sequence_AtributoMocka(context, (AtributoMocka) semanticObject); 
				return; 
			case XSoftwarePackage.ATRIBUTO_SIMPLE:
				sequence_AtributoSimple(context, (AtributoSimple) semanticObject); 
				return; 
			case XSoftwarePackage.ELEMENTO_ASERSION:
				if (rule == grammarAccess.getElementoAtributoRule()) {
					sequence_ElementoAtributo(context, (ElementoAsersion) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getElementoParametroRule()) {
					sequence_ElementoParametro(context, (ElementoAsersion) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getElementoPrimitivoRule()) {
					sequence_ElementoPrimitivo(context, (ElementoAsersion) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getElementoResponseRule()) {
					sequence_ElementoResponse(context, (ElementoAsersion) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getElementoStatusRule()) {
					sequence_ElementoStatus(context, (ElementoAsersion) semanticObject); 
					return; 
				}
				else break;
			case XSoftwarePackage.MAPPING:
				sequence_Mapping(context, (Mapping) semanticObject); 
				return; 
			case XSoftwarePackage.MOCKAROO_ENTITY:
				sequence_MockarooEntity(context, (MockarooEntity) semanticObject); 
				return; 
			case XSoftwarePackage.MY_BOOLEAN:
				sequence_MyBoolean(context, (MyBoolean) semanticObject); 
				return; 
			case XSoftwarePackage.MY_NUMERIC:
				sequence_MyNumeric(context, (MyNumeric) semanticObject); 
				return; 
			case XSoftwarePackage.MY_STRING:
				sequence_MyString(context, (MyString) semanticObject); 
				return; 
			case XSoftwarePackage.PATH_PARAM:
				sequence_PathParam(context, (PathParam) semanticObject); 
				return; 
			case XSoftwarePackage.PRIMITIVE_TYPE:
				sequence_PrimitiveType(context, (PrimitiveType) semanticObject); 
				return; 
			case XSoftwarePackage.QUERY_PARAM:
				sequence_QueryParam(context, (QueryParam) semanticObject); 
				return; 
			case XSoftwarePackage.REQUEST:
				sequence_Request(context, (Request) semanticObject); 
				return; 
			case XSoftwarePackage.RESPONSE:
				sequence_Response(context, (Response) semanticObject); 
				return; 
			case XSoftwarePackage.SERVICIO_REST:
				sequence_ServicioRest(context, (ServicioRest) semanticObject); 
				return; 
			case XSoftwarePackage.SIMPLE_ENTITY:
				sequence_SimpleEntity(context, (SimpleEntity) semanticObject); 
				return; 
			case XSoftwarePackage.STRING_TYPE:
				sequence_StringType(context, (StringType) semanticObject); 
				return; 
			case XSoftwarePackage.TEST:
				sequence_Test(context, (Test) semanticObject); 
				return; 
			case XSoftwarePackage.URL:
				sequence_Url(context, (Url) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Api returns Api
	 *
	 * Constraint:
	 *     (url=EString entidades+=Entidad* primitivetypes+=PrimitiveType* serviciosRest+=ServicioRest* tests+=Test*)
	 */
	protected void sequence_Api(ISerializationContext context, Api semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Asercion returns Asercion
	 *
	 * Constraint:
	 *     (
	 *         (elemento1=ElementoStatus | elemento1=ElementoResponse | elemento1=ElementoAtributo) 
	 *         operador=Operador 
	 *         (elemento2=ElementoPrimitivo | elemento2=ElementoParametro)
	 *     )
	 */
	protected void sequence_Asercion(ISerializationContext context, Asercion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Atributo returns AtributoArreglo
	 *     AtributoArreglo returns AtributoArreglo
	 *
	 * Constraint:
	 *     (tipo=TipoAtributo name=ID)
	 */
	protected void sequence_AtributoArreglo(ISerializationContext context, AtributoArreglo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XSoftwarePackage.Literals.ATRIBUTO__TIPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XSoftwarePackage.Literals.ATRIBUTO__TIPO));
			if (transientValues.isValueTransient(semanticObject, XSoftwarePackage.Literals.ATRIBUTO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XSoftwarePackage.Literals.ATRIBUTO__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtributoArregloAccess().getTipoTipoAtributoEnumRuleCall_0_0(), semanticObject.getTipo());
		feeder.accept(grammarAccess.getAtributoArregloAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Atributo returns AtributoMocka
	 *     AtributoMocka returns AtributoMocka
	 *
	 * Constraint:
	 *     (tipo=TipoAtributo name=ID ((primaryKey?='PK,mockType' mockType=Mockaroo) | mockType=Mockaroo))
	 */
	protected void sequence_AtributoMocka(ISerializationContext context, AtributoMocka semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Atributo returns AtributoSimple
	 *     AtributoSimple returns AtributoSimple
	 *
	 * Constraint:
	 *     (tipo=TipoAtributo name=ID)
	 */
	protected void sequence_AtributoSimple(ISerializationContext context, AtributoSimple semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XSoftwarePackage.Literals.ATRIBUTO__TIPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XSoftwarePackage.Literals.ATRIBUTO__TIPO));
			if (transientValues.isValueTransient(semanticObject, XSoftwarePackage.Literals.ATRIBUTO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XSoftwarePackage.Literals.ATRIBUTO__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtributoSimpleAccess().getTipoTipoAtributoEnumRuleCall_0_0(), semanticObject.getTipo());
		feeder.accept(grammarAccess.getAtributoSimpleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ElementoAtributo returns ElementoAsersion
	 *
	 * Constraint:
	 *     atributo=[Atributo|QualifiedName]
	 */
	protected void sequence_ElementoAtributo(ISerializationContext context, ElementoAsersion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XSoftwarePackage.Literals.ELEMENTO_ASERSION__ATRIBUTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XSoftwarePackage.Literals.ELEMENTO_ASERSION__ATRIBUTO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElementoAtributoAccess().getAtributoAtributoQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(XSoftwarePackage.Literals.ELEMENTO_ASERSION__ATRIBUTO, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ElementoParametro returns ElementoAsersion
	 *
	 * Constraint:
	 *     parametro=[Parametro|QualifiedName]
	 */
	protected void sequence_ElementoParametro(ISerializationContext context, ElementoAsersion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XSoftwarePackage.Literals.ELEMENTO_ASERSION__PARAMETRO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XSoftwarePackage.Literals.ELEMENTO_ASERSION__PARAMETRO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElementoParametroAccess().getParametroParametroQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(XSoftwarePackage.Literals.ELEMENTO_ASERSION__PARAMETRO, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ElementoPrimitivo returns ElementoAsersion
	 *
	 * Constraint:
	 *     elementoPrimitivo=DatoPrimitivo
	 */
	protected void sequence_ElementoPrimitivo(ISerializationContext context, ElementoAsersion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XSoftwarePackage.Literals.ELEMENTO_ASERSION__ELEMENTO_PRIMITIVO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XSoftwarePackage.Literals.ELEMENTO_ASERSION__ELEMENTO_PRIMITIVO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElementoPrimitivoAccess().getElementoPrimitivoDatoPrimitivoParserRuleCall_0(), semanticObject.getElementoPrimitivo());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ElementoResponse returns ElementoAsersion
	 *
	 * Constraint:
	 *     tipo='response'
	 */
	protected void sequence_ElementoResponse(ISerializationContext context, ElementoAsersion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XSoftwarePackage.Literals.ELEMENTO_ASERSION__TIPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XSoftwarePackage.Literals.ELEMENTO_ASERSION__TIPO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElementoResponseAccess().getTipoResponseKeyword_0(), semanticObject.getTipo());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ElementoStatus returns ElementoAsersion
	 *
	 * Constraint:
	 *     tipo='response.status'
	 */
	protected void sequence_ElementoStatus(ISerializationContext context, ElementoAsersion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XSoftwarePackage.Literals.ELEMENTO_ASERSION__TIPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XSoftwarePackage.Literals.ELEMENTO_ASERSION__TIPO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElementoStatusAccess().getTipoResponseStatusKeyword_0(), semanticObject.getTipo());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Mapping returns Mapping
	 *
	 * Constraint:
	 *     (parametro=[Parametro|QualifiedName] (atributo=[Atributo|QualifiedName] | datoprimitivo=DatoPrimitivo))
	 */
	protected void sequence_Mapping(ISerializationContext context, Mapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entidad returns MockarooEntity
	 *     MockarooEntity returns MockarooEntity
	 *     TipoEntidad returns MockarooEntity
	 *
	 * Constraint:
	 *     (name=ID atributos+=Atributo*)
	 */
	protected void sequence_MockarooEntity(ISerializationContext context, MockarooEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MyBoolean returns MyBoolean
	 *     DatoPrimitivo returns MyBoolean
	 *
	 * Constraint:
	 *     name=EBoolean
	 */
	protected void sequence_MyBoolean(ISerializationContext context, MyBoolean semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XSoftwarePackage.Literals.MY_BOOLEAN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XSoftwarePackage.Literals.MY_BOOLEAN__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMyBooleanAccess().getNameEBooleanParserRuleCall_0(), semanticObject.isName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MyNumeric returns MyNumeric
	 *     DatoPrimitivo returns MyNumeric
	 *
	 * Constraint:
	 *     name=EInt
	 */
	protected void sequence_MyNumeric(ISerializationContext context, MyNumeric semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XSoftwarePackage.Literals.MY_NUMERIC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XSoftwarePackage.Literals.MY_NUMERIC__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMyNumericAccess().getNameEIntParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MyString returns MyString
	 *     DatoPrimitivo returns MyString
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_MyString(ISerializationContext context, MyString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XSoftwarePackage.Literals.MY_STRING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XSoftwarePackage.Literals.MY_STRING__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMyStringAccess().getNameEStringParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UrlExpresion returns PathParam
	 *     Parametro returns PathParam
	 *     PathParam returns PathParam
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_PathParam(ISerializationContext context, PathParam semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XSoftwarePackage.Literals.PARAMETRO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XSoftwarePackage.Literals.PARAMETRO__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPathParamAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PrimitiveType returns PrimitiveType
	 *
	 * Constraint:
	 *     name=TipoAtributo
	 */
	protected void sequence_PrimitiveType(ISerializationContext context, PrimitiveType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XSoftwarePackage.Literals.PRIMITIVE_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XSoftwarePackage.Literals.PRIMITIVE_TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimitiveTypeAccess().getNameTipoAtributoEnumRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UrlExpresion returns QueryParam
	 *     Parametro returns QueryParam
	 *     QueryParam returns QueryParam
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_QueryParam(ISerializationContext context, QueryParam semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XSoftwarePackage.Literals.PARAMETRO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XSoftwarePackage.Literals.PARAMETRO__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getQueryParamAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Request returns Request
	 *
	 * Constraint:
	 *     (tipoEntidad=[Entidad|ID] | tipoPrimitivo=TipoAtributo)
	 */
	protected void sequence_Request(ISerializationContext context, Request semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Response returns Response
	 *
	 * Constraint:
	 *     (tipoEntidad=[Entidad|ID] | tipoPrimitivo=TipoAtributo)
	 */
	protected void sequence_Response(ISerializationContext context, Response semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ServicioRest returns ServicioRest
	 *
	 * Constraint:
	 *     (metodo=TipoMetodoRest name=EString url=Url request=Request? response=Response)
	 */
	protected void sequence_ServicioRest(ISerializationContext context, ServicioRest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entidad returns SimpleEntity
	 *     SimpleEntity returns SimpleEntity
	 *     TipoEntidad returns SimpleEntity
	 *
	 * Constraint:
	 *     (name=ID atributos+=AtributoSimple*)
	 */
	protected void sequence_SimpleEntity(ISerializationContext context, SimpleEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UrlExpresion returns StringType
	 *     StringType returns StringType
	 *
	 * Constraint:
	 *     text=EString
	 */
	protected void sequence_StringType(ISerializationContext context, StringType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XSoftwarePackage.Literals.STRING_TYPE__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XSoftwarePackage.Literals.STRING_TYPE__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringTypeAccess().getTextEStringParserRuleCall_2_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Test returns Test
	 *
	 * Constraint:
	 *     (service=[ServicioRest|ID] descripcion=EString mappings+=Mapping* asertions+=Asercion*)
	 */
	protected void sequence_Test(ISerializationContext context, Test semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Url returns Url
	 *
	 * Constraint:
	 *     urlexpresions+=UrlExpresion+
	 */
	protected void sequence_Url(ISerializationContext context, Url semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
