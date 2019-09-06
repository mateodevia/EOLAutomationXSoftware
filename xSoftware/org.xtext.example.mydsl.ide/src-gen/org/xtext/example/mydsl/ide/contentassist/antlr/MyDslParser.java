/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEntidadAccess().getAlternatives(), "rule__Entidad__Alternatives");
					put(grammarAccess.getPrimitiveTypeAccess().getAlternatives(), "rule__PrimitiveType__Alternatives");
					put(grammarAccess.getAtributoAccess().getAlternatives(), "rule__Atributo__Alternatives");
					put(grammarAccess.getAtributoMockaAccess().getAlternatives_2_1(), "rule__AtributoMocka__Alternatives_2_1");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
					put(grammarAccess.getTipoAtributoAccess().getAlternatives(), "rule__TipoAtributo__Alternatives");
					put(grammarAccess.getMockarooAccess().getAlternatives(), "rule__Mockaroo__Alternatives");
					put(grammarAccess.getTipoMetodoRestAccess().getAlternatives(), "rule__TipoMetodoRest__Alternatives");
					put(grammarAccess.getTipoParametroAccess().getAlternatives(), "rule__TipoParametro__Alternatives");
					put(grammarAccess.getApiAccess().getGroup(), "rule__Api__Group__0");
					put(grammarAccess.getAtributoMockaAccess().getGroup(), "rule__AtributoMocka__Group__0");
					put(grammarAccess.getAtributoMockaAccess().getGroup_2(), "rule__AtributoMocka__Group_2__0");
					put(grammarAccess.getAtributoMockaAccess().getGroup_2_1_0(), "rule__AtributoMocka__Group_2_1_0__0");
					put(grammarAccess.getAtributoMockaAccess().getGroup_2_1_1(), "rule__AtributoMocka__Group_2_1_1__0");
					put(grammarAccess.getAtributoArregloAccess().getGroup(), "rule__AtributoArreglo__Group__0");
					put(grammarAccess.getAtributoSimpleAccess().getGroup(), "rule__AtributoSimple__Group__0");
					put(grammarAccess.getMockarooEntityAccess().getGroup(), "rule__MockarooEntity__Group__0");
					put(grammarAccess.getServicioRestAccess().getGroup(), "rule__ServicioRest__Group__0");
					put(grammarAccess.getServicioRestAccess().getGroup_2(), "rule__ServicioRest__Group_2__0");
					put(grammarAccess.getServicioRestAccess().getGroup_3(), "rule__ServicioRest__Group_3__0");
					put(grammarAccess.getServicioRestAccess().getGroup_7(), "rule__ServicioRest__Group_7__0");
					put(grammarAccess.getTestAccess().getGroup(), "rule__Test__Group__0");
					put(grammarAccess.getTestAccess().getGroup_2(), "rule__Test__Group_2__0");
					put(grammarAccess.getTestAccess().getGroup_5(), "rule__Test__Group_5__0");
					put(grammarAccess.getTestAccess().getGroup_5_3(), "rule__Test__Group_5_3__0");
					put(grammarAccess.getTestAccess().getGroup_6(), "rule__Test__Group_6__0");
					put(grammarAccess.getTestAccess().getGroup_6_3(), "rule__Test__Group_6_3__0");
					put(grammarAccess.getSimpleEntityAccess().getGroup(), "rule__SimpleEntity__Group__0");
					put(grammarAccess.getMyNumericAccess().getGroup(), "rule__MyNumeric__Group__0");
					put(grammarAccess.getMyNumericAccess().getGroup_3(), "rule__MyNumeric__Group_3__0");
					put(grammarAccess.getMyStringAccess().getGroup(), "rule__MyString__Group__0");
					put(grammarAccess.getMyStringAccess().getGroup_3(), "rule__MyString__Group_3__0");
					put(grammarAccess.getMyBooleanAccess().getGroup(), "rule__MyBoolean__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
					put(grammarAccess.getResponseAccess().getGroup(), "rule__Response__Group__0");
					put(grammarAccess.getResponseAccess().getGroup_5(), "rule__Response__Group_5__0");
					put(grammarAccess.getMappingAccess().getGroup(), "rule__Mapping__Group__0");
					put(grammarAccess.getAsercionAccess().getGroup(), "rule__Asercion__Group__0");
					put(grammarAccess.getParametroAccess().getGroup(), "rule__Parametro__Group__0");
					put(grammarAccess.getParametroAccess().getGroup_3(), "rule__Parametro__Group_3__0");
					put(grammarAccess.getParametroAccess().getGroup_4(), "rule__Parametro__Group_4__0");
					put(grammarAccess.getApiAccess().getUrlAssignment_3(), "rule__Api__UrlAssignment_3");
					put(grammarAccess.getApiAccess().getEntidadesAssignment_5(), "rule__Api__EntidadesAssignment_5");
					put(grammarAccess.getAtributoMockaAccess().getTipoAssignment_0(), "rule__AtributoMocka__TipoAssignment_0");
					put(grammarAccess.getAtributoMockaAccess().getNombreAssignment_1(), "rule__AtributoMocka__NombreAssignment_1");
					put(grammarAccess.getAtributoMockaAccess().getPrimaryKeyAssignment_2_1_0_0(), "rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0");
					put(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_0_2(), "rule__AtributoMocka__MockTypeAssignment_2_1_0_2");
					put(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_1_2(), "rule__AtributoMocka__MockTypeAssignment_2_1_1_2");
					put(grammarAccess.getAtributoArregloAccess().getTipoAssignment_0(), "rule__AtributoArreglo__TipoAssignment_0");
					put(grammarAccess.getAtributoArregloAccess().getNombreAssignment_3(), "rule__AtributoArreglo__NombreAssignment_3");
					put(grammarAccess.getAtributoSimpleAccess().getTipoAssignment_0(), "rule__AtributoSimple__TipoAssignment_0");
					put(grammarAccess.getAtributoSimpleAccess().getNombreAssignment_1(), "rule__AtributoSimple__NombreAssignment_1");
					put(grammarAccess.getMockarooEntityAccess().getNombreAssignment_1(), "rule__MockarooEntity__NombreAssignment_1");
					put(grammarAccess.getMockarooEntityAccess().getAtributosAssignment_3(), "rule__MockarooEntity__AtributosAssignment_3");
					put(grammarAccess.getServicioRestAccess().getMetodoAssignment_2_1(), "rule__ServicioRest__MetodoAssignment_2_1");
					put(grammarAccess.getServicioRestAccess().getNombreAssignment_3_1(), "rule__ServicioRest__NombreAssignment_3_1");
					put(grammarAccess.getServicioRestAccess().getEntidadesAssignment_6(), "rule__ServicioRest__EntidadesAssignment_6");
					put(grammarAccess.getServicioRestAccess().getEntidadesAssignment_7_1(), "rule__ServicioRest__EntidadesAssignment_7_1");
					put(grammarAccess.getServicioRestAccess().getResponseAssignment_10(), "rule__ServicioRest__ResponseAssignment_10");
					put(grammarAccess.getTestAccess().getDescripcionAssignment_2_1(), "rule__Test__DescripcionAssignment_2_1");
					put(grammarAccess.getTestAccess().getServiceAssignment_4(), "rule__Test__ServiceAssignment_4");
					put(grammarAccess.getTestAccess().getMappingsAssignment_5_2(), "rule__Test__MappingsAssignment_5_2");
					put(grammarAccess.getTestAccess().getMappingsAssignment_5_3_1(), "rule__Test__MappingsAssignment_5_3_1");
					put(grammarAccess.getTestAccess().getAsertionsAssignment_6_2(), "rule__Test__AsertionsAssignment_6_2");
					put(grammarAccess.getTestAccess().getAsertionsAssignment_6_3_1(), "rule__Test__AsertionsAssignment_6_3_1");
					put(grammarAccess.getSimpleEntityAccess().getNombreAssignment_1(), "rule__SimpleEntity__NombreAssignment_1");
					put(grammarAccess.getSimpleEntityAccess().getAtributosAssignment_3(), "rule__SimpleEntity__AtributosAssignment_3");
					put(grammarAccess.getMyNumericAccess().getValorAssignment_3_1(), "rule__MyNumeric__ValorAssignment_3_1");
					put(grammarAccess.getMyStringAccess().getValorAssignment_3_1(), "rule__MyString__ValorAssignment_3_1");
					put(grammarAccess.getMyBooleanAccess().getValorAssignment_1(), "rule__MyBoolean__ValorAssignment_1");
					put(grammarAccess.getResponseAccess().getAtributosAssignment_4(), "rule__Response__AtributosAssignment_4");
					put(grammarAccess.getResponseAccess().getAtributosAssignment_5_1(), "rule__Response__AtributosAssignment_5_1");
					put(grammarAccess.getMappingAccess().getValueAssignment_3(), "rule__Mapping__ValueAssignment_3");
					put(grammarAccess.getMappingAccess().getParametroAssignment_5(), "rule__Mapping__ParametroAssignment_5");
					put(grammarAccess.getAsercionAccess().getElemento1Assignment_3(), "rule__Asercion__Elemento1Assignment_3");
					put(grammarAccess.getAsercionAccess().getElemento2Assignment_5(), "rule__Asercion__Elemento2Assignment_5");
					put(grammarAccess.getParametroAccess().getNombreAssignment_3_1(), "rule__Parametro__NombreAssignment_3_1");
					put(grammarAccess.getParametroAccess().getTipoAssignment_4_1(), "rule__Parametro__TipoAssignment_4_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
