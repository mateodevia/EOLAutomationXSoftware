package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'string'", "'int'", "'boolean'", "'FirstNameType'", "'LastNameType'", "'FamilyNameType'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CityType'", "'CountryCodeType'", "'LatitudeType'", "'LongitudType'", "'RowNumberType'", "'BooleanType'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'Path'", "'Query'", "'Body'", "'apiURL'", "'('", "')'", "'mockType'", "'['", "']'", "'Entity'", "'{'", "'}'", "'SimpleEntity'", "'MyNumeric'", "'valor'", "'MyString'", "'MyBoolean'", "'-'", "'.'", "'Response'", "'atributos'", "','", "'Mapping'", "'value'", "'parametro'", "'Asercion'", "'elemento1'", "'elemento2'", "'Parametro'", "'nombre'", "'tipo'", "'PK,mockType'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_EQUAL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SEMICOLON=7;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleApi"
    // InternalMyDsl.g:53:1: entryRuleApi : ruleApi EOF ;
    public final void entryRuleApi() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleApi EOF )
            // InternalMyDsl.g:55:1: ruleApi EOF
            {
             before(grammarAccess.getApiRule()); 
            pushFollow(FOLLOW_1);
            ruleApi();

            state._fsp--;

             after(grammarAccess.getApiRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApi"


    // $ANTLR start "ruleApi"
    // InternalMyDsl.g:62:1: ruleApi : ( ( rule__Api__Group__0 ) ) ;
    public final void ruleApi() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Api__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Api__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Api__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Api__Group__0 )
            {
             before(grammarAccess.getApiAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Api__Group__0 )
            // InternalMyDsl.g:69:4: rule__Api__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Api__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApiAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApi"


    // $ANTLR start "entryRuleEntidad"
    // InternalMyDsl.g:78:1: entryRuleEntidad : ruleEntidad EOF ;
    public final void entryRuleEntidad() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEntidad EOF )
            // InternalMyDsl.g:80:1: ruleEntidad EOF
            {
             before(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getEntidadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalMyDsl.g:87:1: ruleEntidad : ( ( rule__Entidad__Alternatives ) ) ;
    public final void ruleEntidad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Entidad__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Entidad__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Entidad__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Entidad__Alternatives )
            {
             before(grammarAccess.getEntidadAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Entidad__Alternatives )
            // InternalMyDsl.g:94:4: rule__Entidad__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleAtributo"
    // InternalMyDsl.g:103:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleAtributo EOF )
            // InternalMyDsl.g:105:1: ruleAtributo EOF
            {
             before(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalMyDsl.g:112:1: ruleAtributo : ( ( rule__Atributo__Alternatives ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Atributo__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Atributo__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Atributo__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__Atributo__Alternatives )
            {
             before(grammarAccess.getAtributoAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__Atributo__Alternatives )
            // InternalMyDsl.g:119:4: rule__Atributo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleAtributoMocka"
    // InternalMyDsl.g:128:1: entryRuleAtributoMocka : ruleAtributoMocka EOF ;
    public final void entryRuleAtributoMocka() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleAtributoMocka EOF )
            // InternalMyDsl.g:130:1: ruleAtributoMocka EOF
            {
             before(grammarAccess.getAtributoMockaRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributoMocka();

            state._fsp--;

             after(grammarAccess.getAtributoMockaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtributoMocka"


    // $ANTLR start "ruleAtributoMocka"
    // InternalMyDsl.g:137:1: ruleAtributoMocka : ( ( rule__AtributoMocka__Group__0 ) ) ;
    public final void ruleAtributoMocka() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__AtributoMocka__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__AtributoMocka__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__AtributoMocka__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__AtributoMocka__Group__0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__AtributoMocka__Group__0 )
            // InternalMyDsl.g:144:4: rule__AtributoMocka__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributoMocka"


    // $ANTLR start "entryRuleAtributoArreglo"
    // InternalMyDsl.g:153:1: entryRuleAtributoArreglo : ruleAtributoArreglo EOF ;
    public final void entryRuleAtributoArreglo() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleAtributoArreglo EOF )
            // InternalMyDsl.g:155:1: ruleAtributoArreglo EOF
            {
             before(grammarAccess.getAtributoArregloRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributoArreglo();

            state._fsp--;

             after(grammarAccess.getAtributoArregloRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtributoArreglo"


    // $ANTLR start "ruleAtributoArreglo"
    // InternalMyDsl.g:162:1: ruleAtributoArreglo : ( ( rule__AtributoArreglo__Group__0 ) ) ;
    public final void ruleAtributoArreglo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__AtributoArreglo__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__AtributoArreglo__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__AtributoArreglo__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__AtributoArreglo__Group__0 )
            {
             before(grammarAccess.getAtributoArregloAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__AtributoArreglo__Group__0 )
            // InternalMyDsl.g:169:4: rule__AtributoArreglo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoArregloAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributoArreglo"


    // $ANTLR start "entryRuleAtributoSimple"
    // InternalMyDsl.g:178:1: entryRuleAtributoSimple : ruleAtributoSimple EOF ;
    public final void entryRuleAtributoSimple() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAtributoSimple EOF )
            // InternalMyDsl.g:180:1: ruleAtributoSimple EOF
            {
             before(grammarAccess.getAtributoSimpleRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributoSimple();

            state._fsp--;

             after(grammarAccess.getAtributoSimpleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtributoSimple"


    // $ANTLR start "ruleAtributoSimple"
    // InternalMyDsl.g:187:1: ruleAtributoSimple : ( ( rule__AtributoSimple__Group__0 ) ) ;
    public final void ruleAtributoSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__AtributoSimple__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__AtributoSimple__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__AtributoSimple__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__AtributoSimple__Group__0 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__AtributoSimple__Group__0 )
            // InternalMyDsl.g:194:4: rule__AtributoSimple__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoSimple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoSimpleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributoSimple"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleEString EOF )
            // InternalMyDsl.g:205:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:219:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleMockarooEntity"
    // InternalMyDsl.g:228:1: entryRuleMockarooEntity : ruleMockarooEntity EOF ;
    public final void entryRuleMockarooEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleMockarooEntity EOF )
            // InternalMyDsl.g:230:1: ruleMockarooEntity EOF
            {
             before(grammarAccess.getMockarooEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleMockarooEntity();

            state._fsp--;

             after(grammarAccess.getMockarooEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMockarooEntity"


    // $ANTLR start "ruleMockarooEntity"
    // InternalMyDsl.g:237:1: ruleMockarooEntity : ( ( rule__MockarooEntity__Group__0 ) ) ;
    public final void ruleMockarooEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__MockarooEntity__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__MockarooEntity__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__MockarooEntity__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__MockarooEntity__Group__0 )
            {
             before(grammarAccess.getMockarooEntityAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__MockarooEntity__Group__0 )
            // InternalMyDsl.g:244:4: rule__MockarooEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MockarooEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMockarooEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMockarooEntity"


    // $ANTLR start "entryRuleSimpleEntity"
    // InternalMyDsl.g:253:1: entryRuleSimpleEntity : ruleSimpleEntity EOF ;
    public final void entryRuleSimpleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleSimpleEntity EOF )
            // InternalMyDsl.g:255:1: ruleSimpleEntity EOF
            {
             before(grammarAccess.getSimpleEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleEntity();

            state._fsp--;

             after(grammarAccess.getSimpleEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleEntity"


    // $ANTLR start "ruleSimpleEntity"
    // InternalMyDsl.g:262:1: ruleSimpleEntity : ( ( rule__SimpleEntity__Group__0 ) ) ;
    public final void ruleSimpleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__SimpleEntity__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__SimpleEntity__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__SimpleEntity__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__SimpleEntity__Group__0 )
            {
             before(grammarAccess.getSimpleEntityAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__SimpleEntity__Group__0 )
            // InternalMyDsl.g:269:4: rule__SimpleEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleEntity"


    // $ANTLR start "entryRuleMyNumeric"
    // InternalMyDsl.g:278:1: entryRuleMyNumeric : ruleMyNumeric EOF ;
    public final void entryRuleMyNumeric() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleMyNumeric EOF )
            // InternalMyDsl.g:280:1: ruleMyNumeric EOF
            {
             before(grammarAccess.getMyNumericRule()); 
            pushFollow(FOLLOW_1);
            ruleMyNumeric();

            state._fsp--;

             after(grammarAccess.getMyNumericRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMyNumeric"


    // $ANTLR start "ruleMyNumeric"
    // InternalMyDsl.g:287:1: ruleMyNumeric : ( ( rule__MyNumeric__Group__0 ) ) ;
    public final void ruleMyNumeric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__MyNumeric__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__MyNumeric__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__MyNumeric__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__MyNumeric__Group__0 )
            {
             before(grammarAccess.getMyNumericAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__MyNumeric__Group__0 )
            // InternalMyDsl.g:294:4: rule__MyNumeric__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MyNumeric__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyNumericAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMyNumeric"


    // $ANTLR start "entryRuleMyString"
    // InternalMyDsl.g:303:1: entryRuleMyString : ruleMyString EOF ;
    public final void entryRuleMyString() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleMyString EOF )
            // InternalMyDsl.g:305:1: ruleMyString EOF
            {
             before(grammarAccess.getMyStringRule()); 
            pushFollow(FOLLOW_1);
            ruleMyString();

            state._fsp--;

             after(grammarAccess.getMyStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMyString"


    // $ANTLR start "ruleMyString"
    // InternalMyDsl.g:312:1: ruleMyString : ( ( rule__MyString__Group__0 ) ) ;
    public final void ruleMyString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__MyString__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__MyString__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__MyString__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__MyString__Group__0 )
            {
             before(grammarAccess.getMyStringAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__MyString__Group__0 )
            // InternalMyDsl.g:319:4: rule__MyString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MyString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMyString"


    // $ANTLR start "entryRuleMyBoolean"
    // InternalMyDsl.g:328:1: entryRuleMyBoolean : ruleMyBoolean EOF ;
    public final void entryRuleMyBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleMyBoolean EOF )
            // InternalMyDsl.g:330:1: ruleMyBoolean EOF
            {
             before(grammarAccess.getMyBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleMyBoolean();

            state._fsp--;

             after(grammarAccess.getMyBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMyBoolean"


    // $ANTLR start "ruleMyBoolean"
    // InternalMyDsl.g:337:1: ruleMyBoolean : ( ( rule__MyBoolean__Group__0 ) ) ;
    public final void ruleMyBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__MyBoolean__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__MyBoolean__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__MyBoolean__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__MyBoolean__Group__0 )
            {
             before(grammarAccess.getMyBooleanAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__MyBoolean__Group__0 )
            // InternalMyDsl.g:344:4: rule__MyBoolean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MyBoolean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyBooleanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMyBoolean"


    // $ANTLR start "entryRuleEDouble"
    // InternalMyDsl.g:353:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleEDouble EOF )
            // InternalMyDsl.g:355:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalMyDsl.g:362:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__EDouble__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__EDouble__Group__0 )
            // InternalMyDsl.g:369:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleResponse"
    // InternalMyDsl.g:378:1: entryRuleResponse : ruleResponse EOF ;
    public final void entryRuleResponse() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleResponse EOF )
            // InternalMyDsl.g:380:1: ruleResponse EOF
            {
             before(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_1);
            ruleResponse();

            state._fsp--;

             after(grammarAccess.getResponseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // InternalMyDsl.g:387:1: ruleResponse : ( ( rule__Response__Group__0 ) ) ;
    public final void ruleResponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Response__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Response__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Response__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Response__Group__0 )
            {
             before(grammarAccess.getResponseAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Response__Group__0 )
            // InternalMyDsl.g:394:4: rule__Response__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResponse"


    // $ANTLR start "entryRuleMapping"
    // InternalMyDsl.g:403:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleMapping EOF )
            // InternalMyDsl.g:405:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalMyDsl.g:412:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Mapping__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Mapping__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Mapping__Group__0 )
            // InternalMyDsl.g:419:4: rule__Mapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleAsercion"
    // InternalMyDsl.g:428:1: entryRuleAsercion : ruleAsercion EOF ;
    public final void entryRuleAsercion() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleAsercion EOF )
            // InternalMyDsl.g:430:1: ruleAsercion EOF
            {
             before(grammarAccess.getAsercionRule()); 
            pushFollow(FOLLOW_1);
            ruleAsercion();

            state._fsp--;

             after(grammarAccess.getAsercionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAsercion"


    // $ANTLR start "ruleAsercion"
    // InternalMyDsl.g:437:1: ruleAsercion : ( ( rule__Asercion__Group__0 ) ) ;
    public final void ruleAsercion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Asercion__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Asercion__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Asercion__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Asercion__Group__0 )
            {
             before(grammarAccess.getAsercionAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Asercion__Group__0 )
            // InternalMyDsl.g:444:4: rule__Asercion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAsercion"


    // $ANTLR start "entryRuleParametro"
    // InternalMyDsl.g:453:1: entryRuleParametro : ruleParametro EOF ;
    public final void entryRuleParametro() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleParametro EOF )
            // InternalMyDsl.g:455:1: ruleParametro EOF
            {
             before(grammarAccess.getParametroRule()); 
            pushFollow(FOLLOW_1);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getParametroRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParametro"


    // $ANTLR start "ruleParametro"
    // InternalMyDsl.g:462:1: ruleParametro : ( ( rule__Parametro__Group__0 ) ) ;
    public final void ruleParametro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Parametro__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Parametro__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Parametro__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Parametro__Group__0 )
            {
             before(grammarAccess.getParametroAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Parametro__Group__0 )
            // InternalMyDsl.g:469:4: rule__Parametro__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParametro"


    // $ANTLR start "ruleTipoAtributo"
    // InternalMyDsl.g:478:1: ruleTipoAtributo : ( ( rule__TipoAtributo__Alternatives ) ) ;
    public final void ruleTipoAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:482:1: ( ( ( rule__TipoAtributo__Alternatives ) ) )
            // InternalMyDsl.g:483:2: ( ( rule__TipoAtributo__Alternatives ) )
            {
            // InternalMyDsl.g:483:2: ( ( rule__TipoAtributo__Alternatives ) )
            // InternalMyDsl.g:484:3: ( rule__TipoAtributo__Alternatives )
            {
             before(grammarAccess.getTipoAtributoAccess().getAlternatives()); 
            // InternalMyDsl.g:485:3: ( rule__TipoAtributo__Alternatives )
            // InternalMyDsl.g:485:4: rule__TipoAtributo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoAtributo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoAtributoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoAtributo"


    // $ANTLR start "ruleMockaroo"
    // InternalMyDsl.g:494:1: ruleMockaroo : ( ( rule__Mockaroo__Alternatives ) ) ;
    public final void ruleMockaroo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:498:1: ( ( ( rule__Mockaroo__Alternatives ) ) )
            // InternalMyDsl.g:499:2: ( ( rule__Mockaroo__Alternatives ) )
            {
            // InternalMyDsl.g:499:2: ( ( rule__Mockaroo__Alternatives ) )
            // InternalMyDsl.g:500:3: ( rule__Mockaroo__Alternatives )
            {
             before(grammarAccess.getMockarooAccess().getAlternatives()); 
            // InternalMyDsl.g:501:3: ( rule__Mockaroo__Alternatives )
            // InternalMyDsl.g:501:4: rule__Mockaroo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Mockaroo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMockarooAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMockaroo"


    // $ANTLR start "ruleTipoMetodoRest"
    // InternalMyDsl.g:510:1: ruleTipoMetodoRest : ( ( rule__TipoMetodoRest__Alternatives ) ) ;
    public final void ruleTipoMetodoRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:514:1: ( ( ( rule__TipoMetodoRest__Alternatives ) ) )
            // InternalMyDsl.g:515:2: ( ( rule__TipoMetodoRest__Alternatives ) )
            {
            // InternalMyDsl.g:515:2: ( ( rule__TipoMetodoRest__Alternatives ) )
            // InternalMyDsl.g:516:3: ( rule__TipoMetodoRest__Alternatives )
            {
             before(grammarAccess.getTipoMetodoRestAccess().getAlternatives()); 
            // InternalMyDsl.g:517:3: ( rule__TipoMetodoRest__Alternatives )
            // InternalMyDsl.g:517:4: rule__TipoMetodoRest__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoMetodoRest__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoMetodoRestAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoMetodoRest"


    // $ANTLR start "ruleTipoParametro"
    // InternalMyDsl.g:526:1: ruleTipoParametro : ( ( rule__TipoParametro__Alternatives ) ) ;
    public final void ruleTipoParametro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:530:1: ( ( ( rule__TipoParametro__Alternatives ) ) )
            // InternalMyDsl.g:531:2: ( ( rule__TipoParametro__Alternatives ) )
            {
            // InternalMyDsl.g:531:2: ( ( rule__TipoParametro__Alternatives ) )
            // InternalMyDsl.g:532:3: ( rule__TipoParametro__Alternatives )
            {
             before(grammarAccess.getTipoParametroAccess().getAlternatives()); 
            // InternalMyDsl.g:533:3: ( rule__TipoParametro__Alternatives )
            // InternalMyDsl.g:533:4: rule__TipoParametro__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoParametro__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoParametroAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoParametro"


    // $ANTLR start "rule__Entidad__Alternatives"
    // InternalMyDsl.g:541:1: rule__Entidad__Alternatives : ( ( ruleSimpleEntity ) | ( ruleMockarooEntity ) );
    public final void rule__Entidad__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:545:1: ( ( ruleSimpleEntity ) | ( ruleMockarooEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==48) ) {
                alt1=1;
            }
            else if ( (LA1_0==45) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:546:2: ( ruleSimpleEntity )
                    {
                    // InternalMyDsl.g:546:2: ( ruleSimpleEntity )
                    // InternalMyDsl.g:547:3: ruleSimpleEntity
                    {
                     before(grammarAccess.getEntidadAccess().getSimpleEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleEntity();

                    state._fsp--;

                     after(grammarAccess.getEntidadAccess().getSimpleEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:552:2: ( ruleMockarooEntity )
                    {
                    // InternalMyDsl.g:552:2: ( ruleMockarooEntity )
                    // InternalMyDsl.g:553:3: ruleMockarooEntity
                    {
                     before(grammarAccess.getEntidadAccess().getMockarooEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMockarooEntity();

                    state._fsp--;

                     after(grammarAccess.getEntidadAccess().getMockarooEntityParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Alternatives"


    // $ANTLR start "rule__Atributo__Alternatives"
    // InternalMyDsl.g:562:1: rule__Atributo__Alternatives : ( ( ruleAtributoMocka ) | ( ruleAtributoArreglo ) | ( ruleAtributoSimple ) );
    public final void rule__Atributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:1: ( ( ruleAtributoMocka ) | ( ruleAtributoArreglo ) | ( ruleAtributoSimple ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==40) ) {
                        alt2=1;
                    }
                    else if ( (LA2_4==RULE_SEMICOLON) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==40) ) {
                        alt2=1;
                    }
                    else if ( (LA2_5==RULE_SEMICOLON) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 43:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 16:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==40) ) {
                        alt2=1;
                    }
                    else if ( (LA2_4==RULE_SEMICOLON) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==40) ) {
                        alt2=1;
                    }
                    else if ( (LA2_5==RULE_SEMICOLON) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 43:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }

                }
                break;
            case 17:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==40) ) {
                        alt2=1;
                    }
                    else if ( (LA2_4==RULE_SEMICOLON) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==40) ) {
                        alt2=1;
                    }
                    else if ( (LA2_5==RULE_SEMICOLON) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 43:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:567:2: ( ruleAtributoMocka )
                    {
                    // InternalMyDsl.g:567:2: ( ruleAtributoMocka )
                    // InternalMyDsl.g:568:3: ruleAtributoMocka
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoMockaParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAtributoMocka();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoMockaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:573:2: ( ruleAtributoArreglo )
                    {
                    // InternalMyDsl.g:573:2: ( ruleAtributoArreglo )
                    // InternalMyDsl.g:574:3: ruleAtributoArreglo
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoArregloParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAtributoArreglo();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoArregloParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:579:2: ( ruleAtributoSimple )
                    {
                    // InternalMyDsl.g:579:2: ( ruleAtributoSimple )
                    // InternalMyDsl.g:580:3: ruleAtributoSimple
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoSimpleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAtributoSimple();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoSimpleParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Alternatives"


    // $ANTLR start "rule__AtributoMocka__Alternatives_2_1"
    // InternalMyDsl.g:589:1: rule__AtributoMocka__Alternatives_2_1 : ( ( ( rule__AtributoMocka__Group_2_1_0__0 ) ) | ( ( rule__AtributoMocka__Group_2_1_1__0 ) ) );
    public final void rule__AtributoMocka__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:593:1: ( ( ( rule__AtributoMocka__Group_2_1_0__0 ) ) | ( ( rule__AtributoMocka__Group_2_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==67) ) {
                alt3=1;
            }
            else if ( (LA3_0==42) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:594:2: ( ( rule__AtributoMocka__Group_2_1_0__0 ) )
                    {
                    // InternalMyDsl.g:594:2: ( ( rule__AtributoMocka__Group_2_1_0__0 ) )
                    // InternalMyDsl.g:595:3: ( rule__AtributoMocka__Group_2_1_0__0 )
                    {
                     before(grammarAccess.getAtributoMockaAccess().getGroup_2_1_0()); 
                    // InternalMyDsl.g:596:3: ( rule__AtributoMocka__Group_2_1_0__0 )
                    // InternalMyDsl.g:596:4: rule__AtributoMocka__Group_2_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtributoMocka__Group_2_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtributoMockaAccess().getGroup_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:600:2: ( ( rule__AtributoMocka__Group_2_1_1__0 ) )
                    {
                    // InternalMyDsl.g:600:2: ( ( rule__AtributoMocka__Group_2_1_1__0 ) )
                    // InternalMyDsl.g:601:3: ( rule__AtributoMocka__Group_2_1_1__0 )
                    {
                     before(grammarAccess.getAtributoMockaAccess().getGroup_2_1_1()); 
                    // InternalMyDsl.g:602:3: ( rule__AtributoMocka__Group_2_1_1__0 )
                    // InternalMyDsl.g:602:4: rule__AtributoMocka__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtributoMocka__Group_2_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtributoMockaAccess().getGroup_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Alternatives_2_1"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:610:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:614:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:615:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:615:2: ( RULE_STRING )
                    // InternalMyDsl.g:616:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:621:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:621:2: ( RULE_ID )
                    // InternalMyDsl.g:622:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalMyDsl.g:631:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:635:1: ( ( 'E' ) | ( 'e' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:636:2: ( 'E' )
                    {
                    // InternalMyDsl.g:636:2: ( 'E' )
                    // InternalMyDsl.g:637:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:642:2: ( 'e' )
                    {
                    // InternalMyDsl.g:642:2: ( 'e' )
                    // InternalMyDsl.g:643:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__TipoAtributo__Alternatives"
    // InternalMyDsl.g:652:1: rule__TipoAtributo__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) );
    public final void rule__TipoAtributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:656:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:657:2: ( ( 'string' ) )
                    {
                    // InternalMyDsl.g:657:2: ( ( 'string' ) )
                    // InternalMyDsl.g:658:3: ( 'string' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:659:3: ( 'string' )
                    // InternalMyDsl.g:659:4: 'string'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:663:2: ( ( 'int' ) )
                    {
                    // InternalMyDsl.g:663:2: ( ( 'int' ) )
                    // InternalMyDsl.g:664:3: ( 'int' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:665:3: ( 'int' )
                    // InternalMyDsl.g:665:4: 'int'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:669:2: ( ( 'boolean' ) )
                    {
                    // InternalMyDsl.g:669:2: ( ( 'boolean' ) )
                    // InternalMyDsl.g:670:3: ( 'boolean' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:671:3: ( 'boolean' )
                    // InternalMyDsl.g:671:4: 'boolean'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAtributoAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoAtributo__Alternatives"


    // $ANTLR start "rule__Mockaroo__Alternatives"
    // InternalMyDsl.g:679:1: rule__Mockaroo__Alternatives : ( ( ( 'FirstNameType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CityType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'LatitudeType' ) ) | ( ( 'LongitudType' ) ) | ( ( 'RowNumberType' ) ) | ( ( 'BooleanType' ) ) );
    public final void rule__Mockaroo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:683:1: ( ( ( 'FirstNameType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CityType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'LatitudeType' ) ) | ( ( 'LongitudType' ) ) | ( ( 'RowNumberType' ) ) | ( ( 'BooleanType' ) ) )
            int alt7=14;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case 21:
                {
                alt7=4;
                }
                break;
            case 22:
                {
                alt7=5;
                }
                break;
            case 23:
                {
                alt7=6;
                }
                break;
            case 24:
                {
                alt7=7;
                }
                break;
            case 25:
                {
                alt7=8;
                }
                break;
            case 26:
                {
                alt7=9;
                }
                break;
            case 27:
                {
                alt7=10;
                }
                break;
            case 28:
                {
                alt7=11;
                }
                break;
            case 29:
                {
                alt7=12;
                }
                break;
            case 30:
                {
                alt7=13;
                }
                break;
            case 31:
                {
                alt7=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:684:2: ( ( 'FirstNameType' ) )
                    {
                    // InternalMyDsl.g:684:2: ( ( 'FirstNameType' ) )
                    // InternalMyDsl.g:685:3: ( 'FirstNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:686:3: ( 'FirstNameType' )
                    // InternalMyDsl.g:686:4: 'FirstNameType'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:690:2: ( ( 'LastNameType' ) )
                    {
                    // InternalMyDsl.g:690:2: ( ( 'LastNameType' ) )
                    // InternalMyDsl.g:691:3: ( 'LastNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:692:3: ( 'LastNameType' )
                    // InternalMyDsl.g:692:4: 'LastNameType'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:696:2: ( ( 'FamilyNameType' ) )
                    {
                    // InternalMyDsl.g:696:2: ( ( 'FamilyNameType' ) )
                    // InternalMyDsl.g:697:3: ( 'FamilyNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:698:3: ( 'FamilyNameType' )
                    // InternalMyDsl.g:698:4: 'FamilyNameType'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:702:2: ( ( 'FullNameType' ) )
                    {
                    // InternalMyDsl.g:702:2: ( ( 'FullNameType' ) )
                    // InternalMyDsl.g:703:3: ( 'FullNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:704:3: ( 'FullNameType' )
                    // InternalMyDsl.g:704:4: 'FullNameType'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:708:2: ( ( 'GenderType' ) )
                    {
                    // InternalMyDsl.g:708:2: ( ( 'GenderType' ) )
                    // InternalMyDsl.g:709:3: ( 'GenderType' )
                    {
                     before(grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:710:3: ( 'GenderType' )
                    // InternalMyDsl.g:710:4: 'GenderType'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:714:2: ( ( 'EmailAddressType' ) )
                    {
                    // InternalMyDsl.g:714:2: ( ( 'EmailAddressType' ) )
                    // InternalMyDsl.g:715:3: ( 'EmailAddressType' )
                    {
                     before(grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:716:3: ( 'EmailAddressType' )
                    // InternalMyDsl.g:716:4: 'EmailAddressType'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:720:2: ( ( 'PhoneType' ) )
                    {
                    // InternalMyDsl.g:720:2: ( ( 'PhoneType' ) )
                    // InternalMyDsl.g:721:3: ( 'PhoneType' )
                    {
                     before(grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:722:3: ( 'PhoneType' )
                    // InternalMyDsl.g:722:4: 'PhoneType'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:726:2: ( ( 'CountryType' ) )
                    {
                    // InternalMyDsl.g:726:2: ( ( 'CountryType' ) )
                    // InternalMyDsl.g:727:3: ( 'CountryType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7()); 
                    // InternalMyDsl.g:728:3: ( 'CountryType' )
                    // InternalMyDsl.g:728:4: 'CountryType'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:732:2: ( ( 'CityType' ) )
                    {
                    // InternalMyDsl.g:732:2: ( ( 'CityType' ) )
                    // InternalMyDsl.g:733:3: ( 'CityType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8()); 
                    // InternalMyDsl.g:734:3: ( 'CityType' )
                    // InternalMyDsl.g:734:4: 'CityType'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:738:2: ( ( 'CountryCodeType' ) )
                    {
                    // InternalMyDsl.g:738:2: ( ( 'CountryCodeType' ) )
                    // InternalMyDsl.g:739:3: ( 'CountryCodeType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9()); 
                    // InternalMyDsl.g:740:3: ( 'CountryCodeType' )
                    // InternalMyDsl.g:740:4: 'CountryCodeType'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:744:2: ( ( 'LatitudeType' ) )
                    {
                    // InternalMyDsl.g:744:2: ( ( 'LatitudeType' ) )
                    // InternalMyDsl.g:745:3: ( 'LatitudeType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10()); 
                    // InternalMyDsl.g:746:3: ( 'LatitudeType' )
                    // InternalMyDsl.g:746:4: 'LatitudeType'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:750:2: ( ( 'LongitudType' ) )
                    {
                    // InternalMyDsl.g:750:2: ( ( 'LongitudType' ) )
                    // InternalMyDsl.g:751:3: ( 'LongitudType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11()); 
                    // InternalMyDsl.g:752:3: ( 'LongitudType' )
                    // InternalMyDsl.g:752:4: 'LongitudType'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:756:2: ( ( 'RowNumberType' ) )
                    {
                    // InternalMyDsl.g:756:2: ( ( 'RowNumberType' ) )
                    // InternalMyDsl.g:757:3: ( 'RowNumberType' )
                    {
                     before(grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 
                    // InternalMyDsl.g:758:3: ( 'RowNumberType' )
                    // InternalMyDsl.g:758:4: 'RowNumberType'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:762:2: ( ( 'BooleanType' ) )
                    {
                    // InternalMyDsl.g:762:2: ( ( 'BooleanType' ) )
                    // InternalMyDsl.g:763:3: ( 'BooleanType' )
                    {
                     before(grammarAccess.getMockarooAccess().getBooleanTypeEnumLiteralDeclaration_13()); 
                    // InternalMyDsl.g:764:3: ( 'BooleanType' )
                    // InternalMyDsl.g:764:4: 'BooleanType'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getBooleanTypeEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mockaroo__Alternatives"


    // $ANTLR start "rule__TipoMetodoRest__Alternatives"
    // InternalMyDsl.g:772:1: rule__TipoMetodoRest__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__TipoMetodoRest__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:776:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 33:
                {
                alt8=2;
                }
                break;
            case 34:
                {
                alt8=3;
                }
                break;
            case 35:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:777:2: ( ( 'GET' ) )
                    {
                    // InternalMyDsl.g:777:2: ( ( 'GET' ) )
                    // InternalMyDsl.g:778:3: ( 'GET' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:779:3: ( 'GET' )
                    // InternalMyDsl.g:779:4: 'GET'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:783:2: ( ( 'POST' ) )
                    {
                    // InternalMyDsl.g:783:2: ( ( 'POST' ) )
                    // InternalMyDsl.g:784:3: ( 'POST' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:785:3: ( 'POST' )
                    // InternalMyDsl.g:785:4: 'POST'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:789:2: ( ( 'PUT' ) )
                    {
                    // InternalMyDsl.g:789:2: ( ( 'PUT' ) )
                    // InternalMyDsl.g:790:3: ( 'PUT' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:791:3: ( 'PUT' )
                    // InternalMyDsl.g:791:4: 'PUT'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:795:2: ( ( 'DELETE' ) )
                    {
                    // InternalMyDsl.g:795:2: ( ( 'DELETE' ) )
                    // InternalMyDsl.g:796:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:797:3: ( 'DELETE' )
                    // InternalMyDsl.g:797:4: 'DELETE'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getDELETEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoMetodoRest__Alternatives"


    // $ANTLR start "rule__TipoParametro__Alternatives"
    // InternalMyDsl.g:805:1: rule__TipoParametro__Alternatives : ( ( ( 'Path' ) ) | ( ( 'Query' ) ) | ( ( 'Body' ) ) );
    public final void rule__TipoParametro__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:809:1: ( ( ( 'Path' ) ) | ( ( 'Query' ) ) | ( ( 'Body' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt9=1;
                }
                break;
            case 37:
                {
                alt9=2;
                }
                break;
            case 38:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:810:2: ( ( 'Path' ) )
                    {
                    // InternalMyDsl.g:810:2: ( ( 'Path' ) )
                    // InternalMyDsl.g:811:3: ( 'Path' )
                    {
                     before(grammarAccess.getTipoParametroAccess().getPathEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:812:3: ( 'Path' )
                    // InternalMyDsl.g:812:4: 'Path'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoParametroAccess().getPathEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:816:2: ( ( 'Query' ) )
                    {
                    // InternalMyDsl.g:816:2: ( ( 'Query' ) )
                    // InternalMyDsl.g:817:3: ( 'Query' )
                    {
                     before(grammarAccess.getTipoParametroAccess().getQueryEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:818:3: ( 'Query' )
                    // InternalMyDsl.g:818:4: 'Query'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoParametroAccess().getQueryEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:822:2: ( ( 'Body' ) )
                    {
                    // InternalMyDsl.g:822:2: ( ( 'Body' ) )
                    // InternalMyDsl.g:823:3: ( 'Body' )
                    {
                     before(grammarAccess.getTipoParametroAccess().getBodyEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:824:3: ( 'Body' )
                    // InternalMyDsl.g:824:4: 'Body'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoParametroAccess().getBodyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoParametro__Alternatives"


    // $ANTLR start "rule__Api__Group__0"
    // InternalMyDsl.g:832:1: rule__Api__Group__0 : rule__Api__Group__0__Impl rule__Api__Group__1 ;
    public final void rule__Api__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:836:1: ( rule__Api__Group__0__Impl rule__Api__Group__1 )
            // InternalMyDsl.g:837:2: rule__Api__Group__0__Impl rule__Api__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Api__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__0"


    // $ANTLR start "rule__Api__Group__0__Impl"
    // InternalMyDsl.g:844:1: rule__Api__Group__0__Impl : ( () ) ;
    public final void rule__Api__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:848:1: ( ( () ) )
            // InternalMyDsl.g:849:1: ( () )
            {
            // InternalMyDsl.g:849:1: ( () )
            // InternalMyDsl.g:850:2: ()
            {
             before(grammarAccess.getApiAccess().getApiAction_0()); 
            // InternalMyDsl.g:851:2: ()
            // InternalMyDsl.g:851:3: 
            {
            }

             after(grammarAccess.getApiAccess().getApiAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__0__Impl"


    // $ANTLR start "rule__Api__Group__1"
    // InternalMyDsl.g:859:1: rule__Api__Group__1 : rule__Api__Group__1__Impl rule__Api__Group__2 ;
    public final void rule__Api__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:863:1: ( rule__Api__Group__1__Impl rule__Api__Group__2 )
            // InternalMyDsl.g:864:2: rule__Api__Group__1__Impl rule__Api__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Api__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__1"


    // $ANTLR start "rule__Api__Group__1__Impl"
    // InternalMyDsl.g:871:1: rule__Api__Group__1__Impl : ( 'apiURL' ) ;
    public final void rule__Api__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:875:1: ( ( 'apiURL' ) )
            // InternalMyDsl.g:876:1: ( 'apiURL' )
            {
            // InternalMyDsl.g:876:1: ( 'apiURL' )
            // InternalMyDsl.g:877:2: 'apiURL'
            {
             before(grammarAccess.getApiAccess().getApiURLKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getApiAccess().getApiURLKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__1__Impl"


    // $ANTLR start "rule__Api__Group__2"
    // InternalMyDsl.g:886:1: rule__Api__Group__2 : rule__Api__Group__2__Impl rule__Api__Group__3 ;
    public final void rule__Api__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:890:1: ( rule__Api__Group__2__Impl rule__Api__Group__3 )
            // InternalMyDsl.g:891:2: rule__Api__Group__2__Impl rule__Api__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Api__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__2"


    // $ANTLR start "rule__Api__Group__2__Impl"
    // InternalMyDsl.g:898:1: rule__Api__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__Api__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:902:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:903:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:903:1: ( RULE_EQUAL )
            // InternalMyDsl.g:904:2: RULE_EQUAL
            {
             before(grammarAccess.getApiAccess().getEQUALTerminalRuleCall_2()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getApiAccess().getEQUALTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__2__Impl"


    // $ANTLR start "rule__Api__Group__3"
    // InternalMyDsl.g:913:1: rule__Api__Group__3 : rule__Api__Group__3__Impl rule__Api__Group__4 ;
    public final void rule__Api__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:917:1: ( rule__Api__Group__3__Impl rule__Api__Group__4 )
            // InternalMyDsl.g:918:2: rule__Api__Group__3__Impl rule__Api__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Api__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__3"


    // $ANTLR start "rule__Api__Group__3__Impl"
    // InternalMyDsl.g:925:1: rule__Api__Group__3__Impl : ( ( rule__Api__UrlAssignment_3 ) ) ;
    public final void rule__Api__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:929:1: ( ( ( rule__Api__UrlAssignment_3 ) ) )
            // InternalMyDsl.g:930:1: ( ( rule__Api__UrlAssignment_3 ) )
            {
            // InternalMyDsl.g:930:1: ( ( rule__Api__UrlAssignment_3 ) )
            // InternalMyDsl.g:931:2: ( rule__Api__UrlAssignment_3 )
            {
             before(grammarAccess.getApiAccess().getUrlAssignment_3()); 
            // InternalMyDsl.g:932:2: ( rule__Api__UrlAssignment_3 )
            // InternalMyDsl.g:932:3: rule__Api__UrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Api__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getApiAccess().getUrlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__3__Impl"


    // $ANTLR start "rule__Api__Group__4"
    // InternalMyDsl.g:940:1: rule__Api__Group__4 : rule__Api__Group__4__Impl rule__Api__Group__5 ;
    public final void rule__Api__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:944:1: ( rule__Api__Group__4__Impl rule__Api__Group__5 )
            // InternalMyDsl.g:945:2: rule__Api__Group__4__Impl rule__Api__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Api__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__4"


    // $ANTLR start "rule__Api__Group__4__Impl"
    // InternalMyDsl.g:952:1: rule__Api__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Api__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:956:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:957:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:957:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:958:2: RULE_SEMICOLON
            {
             before(grammarAccess.getApiAccess().getSEMICOLONTerminalRuleCall_4()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getApiAccess().getSEMICOLONTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__4__Impl"


    // $ANTLR start "rule__Api__Group__5"
    // InternalMyDsl.g:967:1: rule__Api__Group__5 : rule__Api__Group__5__Impl ;
    public final void rule__Api__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:971:1: ( rule__Api__Group__5__Impl )
            // InternalMyDsl.g:972:2: rule__Api__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Api__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__5"


    // $ANTLR start "rule__Api__Group__5__Impl"
    // InternalMyDsl.g:978:1: rule__Api__Group__5__Impl : ( ( rule__Api__EntidadesAssignment_5 )* ) ;
    public final void rule__Api__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:982:1: ( ( ( rule__Api__EntidadesAssignment_5 )* ) )
            // InternalMyDsl.g:983:1: ( ( rule__Api__EntidadesAssignment_5 )* )
            {
            // InternalMyDsl.g:983:1: ( ( rule__Api__EntidadesAssignment_5 )* )
            // InternalMyDsl.g:984:2: ( rule__Api__EntidadesAssignment_5 )*
            {
             before(grammarAccess.getApiAccess().getEntidadesAssignment_5()); 
            // InternalMyDsl.g:985:2: ( rule__Api__EntidadesAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==45||LA10_0==48) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:985:3: rule__Api__EntidadesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Api__EntidadesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getApiAccess().getEntidadesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__5__Impl"


    // $ANTLR start "rule__AtributoMocka__Group__0"
    // InternalMyDsl.g:994:1: rule__AtributoMocka__Group__0 : rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1 ;
    public final void rule__AtributoMocka__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:998:1: ( rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1 )
            // InternalMyDsl.g:999:2: rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__AtributoMocka__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__0"


    // $ANTLR start "rule__AtributoMocka__Group__0__Impl"
    // InternalMyDsl.g:1006:1: rule__AtributoMocka__Group__0__Impl : ( ( rule__AtributoMocka__TipoAssignment_0 ) ) ;
    public final void rule__AtributoMocka__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1010:1: ( ( ( rule__AtributoMocka__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:1011:1: ( ( rule__AtributoMocka__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:1011:1: ( ( rule__AtributoMocka__TipoAssignment_0 ) )
            // InternalMyDsl.g:1012:2: ( rule__AtributoMocka__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:1013:2: ( rule__AtributoMocka__TipoAssignment_0 )
            // InternalMyDsl.g:1013:3: rule__AtributoMocka__TipoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__TipoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getTipoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__0__Impl"


    // $ANTLR start "rule__AtributoMocka__Group__1"
    // InternalMyDsl.g:1021:1: rule__AtributoMocka__Group__1 : rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2 ;
    public final void rule__AtributoMocka__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1025:1: ( rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2 )
            // InternalMyDsl.g:1026:2: rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__AtributoMocka__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__1"


    // $ANTLR start "rule__AtributoMocka__Group__1__Impl"
    // InternalMyDsl.g:1033:1: rule__AtributoMocka__Group__1__Impl : ( ( rule__AtributoMocka__NombreAssignment_1 ) ) ;
    public final void rule__AtributoMocka__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1037:1: ( ( ( rule__AtributoMocka__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:1038:1: ( ( rule__AtributoMocka__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:1038:1: ( ( rule__AtributoMocka__NombreAssignment_1 ) )
            // InternalMyDsl.g:1039:2: ( rule__AtributoMocka__NombreAssignment_1 )
            {
             before(grammarAccess.getAtributoMockaAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:1040:2: ( rule__AtributoMocka__NombreAssignment_1 )
            // InternalMyDsl.g:1040:3: rule__AtributoMocka__NombreAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getNombreAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__1__Impl"


    // $ANTLR start "rule__AtributoMocka__Group__2"
    // InternalMyDsl.g:1048:1: rule__AtributoMocka__Group__2 : rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3 ;
    public final void rule__AtributoMocka__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1052:1: ( rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3 )
            // InternalMyDsl.g:1053:2: rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AtributoMocka__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__2"


    // $ANTLR start "rule__AtributoMocka__Group__2__Impl"
    // InternalMyDsl.g:1060:1: rule__AtributoMocka__Group__2__Impl : ( ( rule__AtributoMocka__Group_2__0 ) ) ;
    public final void rule__AtributoMocka__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1064:1: ( ( ( rule__AtributoMocka__Group_2__0 ) ) )
            // InternalMyDsl.g:1065:1: ( ( rule__AtributoMocka__Group_2__0 ) )
            {
            // InternalMyDsl.g:1065:1: ( ( rule__AtributoMocka__Group_2__0 ) )
            // InternalMyDsl.g:1066:2: ( rule__AtributoMocka__Group_2__0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getGroup_2()); 
            // InternalMyDsl.g:1067:2: ( rule__AtributoMocka__Group_2__0 )
            // InternalMyDsl.g:1067:3: rule__AtributoMocka__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__2__Impl"


    // $ANTLR start "rule__AtributoMocka__Group__3"
    // InternalMyDsl.g:1075:1: rule__AtributoMocka__Group__3 : rule__AtributoMocka__Group__3__Impl ;
    public final void rule__AtributoMocka__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1079:1: ( rule__AtributoMocka__Group__3__Impl )
            // InternalMyDsl.g:1080:2: rule__AtributoMocka__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__3"


    // $ANTLR start "rule__AtributoMocka__Group__3__Impl"
    // InternalMyDsl.g:1086:1: rule__AtributoMocka__Group__3__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoMocka__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1090:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1091:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1091:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1092:2: RULE_SEMICOLON
            {
             before(grammarAccess.getAtributoMockaAccess().getSEMICOLONTerminalRuleCall_3()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getSEMICOLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__3__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2__0"
    // InternalMyDsl.g:1102:1: rule__AtributoMocka__Group_2__0 : rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1 ;
    public final void rule__AtributoMocka__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1106:1: ( rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1 )
            // InternalMyDsl.g:1107:2: rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__AtributoMocka__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2__0"


    // $ANTLR start "rule__AtributoMocka__Group_2__0__Impl"
    // InternalMyDsl.g:1114:1: rule__AtributoMocka__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtributoMocka__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1118:1: ( ( '(' ) )
            // InternalMyDsl.g:1119:1: ( '(' )
            {
            // InternalMyDsl.g:1119:1: ( '(' )
            // InternalMyDsl.g:1120:2: '('
            {
             before(grammarAccess.getAtributoMockaAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2__0__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2__1"
    // InternalMyDsl.g:1129:1: rule__AtributoMocka__Group_2__1 : rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2 ;
    public final void rule__AtributoMocka__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1133:1: ( rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2 )
            // InternalMyDsl.g:1134:2: rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__AtributoMocka__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2__1"


    // $ANTLR start "rule__AtributoMocka__Group_2__1__Impl"
    // InternalMyDsl.g:1141:1: rule__AtributoMocka__Group_2__1__Impl : ( ( rule__AtributoMocka__Alternatives_2_1 ) ) ;
    public final void rule__AtributoMocka__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1145:1: ( ( ( rule__AtributoMocka__Alternatives_2_1 ) ) )
            // InternalMyDsl.g:1146:1: ( ( rule__AtributoMocka__Alternatives_2_1 ) )
            {
            // InternalMyDsl.g:1146:1: ( ( rule__AtributoMocka__Alternatives_2_1 ) )
            // InternalMyDsl.g:1147:2: ( rule__AtributoMocka__Alternatives_2_1 )
            {
             before(grammarAccess.getAtributoMockaAccess().getAlternatives_2_1()); 
            // InternalMyDsl.g:1148:2: ( rule__AtributoMocka__Alternatives_2_1 )
            // InternalMyDsl.g:1148:3: rule__AtributoMocka__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getAlternatives_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2__1__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2__2"
    // InternalMyDsl.g:1156:1: rule__AtributoMocka__Group_2__2 : rule__AtributoMocka__Group_2__2__Impl ;
    public final void rule__AtributoMocka__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1160:1: ( rule__AtributoMocka__Group_2__2__Impl )
            // InternalMyDsl.g:1161:2: rule__AtributoMocka__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2__2"


    // $ANTLR start "rule__AtributoMocka__Group_2__2__Impl"
    // InternalMyDsl.g:1167:1: rule__AtributoMocka__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtributoMocka__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1171:1: ( ( ')' ) )
            // InternalMyDsl.g:1172:1: ( ')' )
            {
            // InternalMyDsl.g:1172:1: ( ')' )
            // InternalMyDsl.g:1173:2: ')'
            {
             before(grammarAccess.getAtributoMockaAccess().getRightParenthesisKeyword_2_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2__2__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_0__0"
    // InternalMyDsl.g:1183:1: rule__AtributoMocka__Group_2_1_0__0 : rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1 ;
    public final void rule__AtributoMocka__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1187:1: ( rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1 )
            // InternalMyDsl.g:1188:2: rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1
            {
            pushFollow(FOLLOW_4);
            rule__AtributoMocka__Group_2_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_0__0"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_0__0__Impl"
    // InternalMyDsl.g:1195:1: rule__AtributoMocka__Group_2_1_0__0__Impl : ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1199:1: ( ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) ) )
            // InternalMyDsl.g:1200:1: ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) )
            {
            // InternalMyDsl.g:1200:1: ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) )
            // InternalMyDsl.g:1201:2: ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyAssignment_2_1_0_0()); 
            // InternalMyDsl.g:1202:2: ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 )
            // InternalMyDsl.g:1202:3: rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getPrimaryKeyAssignment_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_0__0__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_0__1"
    // InternalMyDsl.g:1210:1: rule__AtributoMocka__Group_2_1_0__1 : rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2 ;
    public final void rule__AtributoMocka__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1214:1: ( rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2 )
            // InternalMyDsl.g:1215:2: rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2
            {
            pushFollow(FOLLOW_12);
            rule__AtributoMocka__Group_2_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_0__1"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_0__1__Impl"
    // InternalMyDsl.g:1222:1: rule__AtributoMocka__Group_2_1_0__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__AtributoMocka__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1226:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1227:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1227:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1228:2: RULE_EQUAL
            {
             before(grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_0__1__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_0__2"
    // InternalMyDsl.g:1237:1: rule__AtributoMocka__Group_2_1_0__2 : rule__AtributoMocka__Group_2_1_0__2__Impl ;
    public final void rule__AtributoMocka__Group_2_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1241:1: ( rule__AtributoMocka__Group_2_1_0__2__Impl )
            // InternalMyDsl.g:1242:2: rule__AtributoMocka__Group_2_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_0__2"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_0__2__Impl"
    // InternalMyDsl.g:1248:1: rule__AtributoMocka__Group_2_1_0__2__Impl : ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1252:1: ( ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) ) )
            // InternalMyDsl.g:1253:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) )
            {
            // InternalMyDsl.g:1253:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) )
            // InternalMyDsl.g:1254:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 )
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_0_2()); 
            // InternalMyDsl.g:1255:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 )
            // InternalMyDsl.g:1255:3: rule__AtributoMocka__MockTypeAssignment_2_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__MockTypeAssignment_2_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_0__2__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_1__0"
    // InternalMyDsl.g:1264:1: rule__AtributoMocka__Group_2_1_1__0 : rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1 ;
    public final void rule__AtributoMocka__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1268:1: ( rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1 )
            // InternalMyDsl.g:1269:2: rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1
            {
            pushFollow(FOLLOW_4);
            rule__AtributoMocka__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_1__0"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_1__0__Impl"
    // InternalMyDsl.g:1276:1: rule__AtributoMocka__Group_2_1_1__0__Impl : ( 'mockType' ) ;
    public final void rule__AtributoMocka__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1280:1: ( ( 'mockType' ) )
            // InternalMyDsl.g:1281:1: ( 'mockType' )
            {
            // InternalMyDsl.g:1281:1: ( 'mockType' )
            // InternalMyDsl.g:1282:2: 'mockType'
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeKeyword_2_1_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getMockTypeKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_1__1"
    // InternalMyDsl.g:1291:1: rule__AtributoMocka__Group_2_1_1__1 : rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2 ;
    public final void rule__AtributoMocka__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1295:1: ( rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2 )
            // InternalMyDsl.g:1296:2: rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2
            {
            pushFollow(FOLLOW_12);
            rule__AtributoMocka__Group_2_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_1__1"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_1__1__Impl"
    // InternalMyDsl.g:1303:1: rule__AtributoMocka__Group_2_1_1__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__AtributoMocka__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1307:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1308:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1308:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1309:2: RULE_EQUAL
            {
             before(grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_1_1()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_1__2"
    // InternalMyDsl.g:1318:1: rule__AtributoMocka__Group_2_1_1__2 : rule__AtributoMocka__Group_2_1_1__2__Impl ;
    public final void rule__AtributoMocka__Group_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1322:1: ( rule__AtributoMocka__Group_2_1_1__2__Impl )
            // InternalMyDsl.g:1323:2: rule__AtributoMocka__Group_2_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_1__2"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_1__2__Impl"
    // InternalMyDsl.g:1329:1: rule__AtributoMocka__Group_2_1_1__2__Impl : ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1333:1: ( ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) ) )
            // InternalMyDsl.g:1334:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) )
            {
            // InternalMyDsl.g:1334:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) )
            // InternalMyDsl.g:1335:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 )
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_1_2()); 
            // InternalMyDsl.g:1336:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 )
            // InternalMyDsl.g:1336:3: rule__AtributoMocka__MockTypeAssignment_2_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__MockTypeAssignment_2_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_1__2__Impl"


    // $ANTLR start "rule__AtributoArreglo__Group__0"
    // InternalMyDsl.g:1345:1: rule__AtributoArreglo__Group__0 : rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1 ;
    public final void rule__AtributoArreglo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1349:1: ( rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1 )
            // InternalMyDsl.g:1350:2: rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__AtributoArreglo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__0"


    // $ANTLR start "rule__AtributoArreglo__Group__0__Impl"
    // InternalMyDsl.g:1357:1: rule__AtributoArreglo__Group__0__Impl : ( ( rule__AtributoArreglo__TipoAssignment_0 ) ) ;
    public final void rule__AtributoArreglo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1361:1: ( ( ( rule__AtributoArreglo__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:1362:1: ( ( rule__AtributoArreglo__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:1362:1: ( ( rule__AtributoArreglo__TipoAssignment_0 ) )
            // InternalMyDsl.g:1363:2: ( rule__AtributoArreglo__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoArregloAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:1364:2: ( rule__AtributoArreglo__TipoAssignment_0 )
            // InternalMyDsl.g:1364:3: rule__AtributoArreglo__TipoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__TipoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoArregloAccess().getTipoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__0__Impl"


    // $ANTLR start "rule__AtributoArreglo__Group__1"
    // InternalMyDsl.g:1372:1: rule__AtributoArreglo__Group__1 : rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2 ;
    public final void rule__AtributoArreglo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1376:1: ( rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2 )
            // InternalMyDsl.g:1377:2: rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AtributoArreglo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__1"


    // $ANTLR start "rule__AtributoArreglo__Group__1__Impl"
    // InternalMyDsl.g:1384:1: rule__AtributoArreglo__Group__1__Impl : ( '[' ) ;
    public final void rule__AtributoArreglo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1388:1: ( ( '[' ) )
            // InternalMyDsl.g:1389:1: ( '[' )
            {
            // InternalMyDsl.g:1389:1: ( '[' )
            // InternalMyDsl.g:1390:2: '['
            {
             before(grammarAccess.getAtributoArregloAccess().getLeftSquareBracketKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAtributoArregloAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__1__Impl"


    // $ANTLR start "rule__AtributoArreglo__Group__2"
    // InternalMyDsl.g:1399:1: rule__AtributoArreglo__Group__2 : rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3 ;
    public final void rule__AtributoArreglo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1403:1: ( rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3 )
            // InternalMyDsl.g:1404:2: rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__AtributoArreglo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__2"


    // $ANTLR start "rule__AtributoArreglo__Group__2__Impl"
    // InternalMyDsl.g:1411:1: rule__AtributoArreglo__Group__2__Impl : ( ']' ) ;
    public final void rule__AtributoArreglo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1415:1: ( ( ']' ) )
            // InternalMyDsl.g:1416:1: ( ']' )
            {
            // InternalMyDsl.g:1416:1: ( ']' )
            // InternalMyDsl.g:1417:2: ']'
            {
             before(grammarAccess.getAtributoArregloAccess().getRightSquareBracketKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAtributoArregloAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__2__Impl"


    // $ANTLR start "rule__AtributoArreglo__Group__3"
    // InternalMyDsl.g:1426:1: rule__AtributoArreglo__Group__3 : rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4 ;
    public final void rule__AtributoArreglo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1430:1: ( rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4 )
            // InternalMyDsl.g:1431:2: rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__AtributoArreglo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__3"


    // $ANTLR start "rule__AtributoArreglo__Group__3__Impl"
    // InternalMyDsl.g:1438:1: rule__AtributoArreglo__Group__3__Impl : ( ( rule__AtributoArreglo__NombreAssignment_3 ) ) ;
    public final void rule__AtributoArreglo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1442:1: ( ( ( rule__AtributoArreglo__NombreAssignment_3 ) ) )
            // InternalMyDsl.g:1443:1: ( ( rule__AtributoArreglo__NombreAssignment_3 ) )
            {
            // InternalMyDsl.g:1443:1: ( ( rule__AtributoArreglo__NombreAssignment_3 ) )
            // InternalMyDsl.g:1444:2: ( rule__AtributoArreglo__NombreAssignment_3 )
            {
             before(grammarAccess.getAtributoArregloAccess().getNombreAssignment_3()); 
            // InternalMyDsl.g:1445:2: ( rule__AtributoArreglo__NombreAssignment_3 )
            // InternalMyDsl.g:1445:3: rule__AtributoArreglo__NombreAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__NombreAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAtributoArregloAccess().getNombreAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__3__Impl"


    // $ANTLR start "rule__AtributoArreglo__Group__4"
    // InternalMyDsl.g:1453:1: rule__AtributoArreglo__Group__4 : rule__AtributoArreglo__Group__4__Impl ;
    public final void rule__AtributoArreglo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1457:1: ( rule__AtributoArreglo__Group__4__Impl )
            // InternalMyDsl.g:1458:2: rule__AtributoArreglo__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__4"


    // $ANTLR start "rule__AtributoArreglo__Group__4__Impl"
    // InternalMyDsl.g:1464:1: rule__AtributoArreglo__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoArreglo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1468:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1469:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1469:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1470:2: RULE_SEMICOLON
            {
             before(grammarAccess.getAtributoArregloAccess().getSEMICOLONTerminalRuleCall_4()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getAtributoArregloAccess().getSEMICOLONTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__4__Impl"


    // $ANTLR start "rule__AtributoSimple__Group__0"
    // InternalMyDsl.g:1480:1: rule__AtributoSimple__Group__0 : rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 ;
    public final void rule__AtributoSimple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1484:1: ( rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 )
            // InternalMyDsl.g:1485:2: rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__AtributoSimple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoSimple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__Group__0"


    // $ANTLR start "rule__AtributoSimple__Group__0__Impl"
    // InternalMyDsl.g:1492:1: rule__AtributoSimple__Group__0__Impl : ( ( rule__AtributoSimple__TipoAssignment_0 ) ) ;
    public final void rule__AtributoSimple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1496:1: ( ( ( rule__AtributoSimple__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:1497:1: ( ( rule__AtributoSimple__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:1497:1: ( ( rule__AtributoSimple__TipoAssignment_0 ) )
            // InternalMyDsl.g:1498:2: ( rule__AtributoSimple__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:1499:2: ( rule__AtributoSimple__TipoAssignment_0 )
            // InternalMyDsl.g:1499:3: rule__AtributoSimple__TipoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoSimple__TipoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoSimpleAccess().getTipoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__Group__0__Impl"


    // $ANTLR start "rule__AtributoSimple__Group__1"
    // InternalMyDsl.g:1507:1: rule__AtributoSimple__Group__1 : rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 ;
    public final void rule__AtributoSimple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1511:1: ( rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 )
            // InternalMyDsl.g:1512:2: rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__AtributoSimple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoSimple__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__Group__1"


    // $ANTLR start "rule__AtributoSimple__Group__1__Impl"
    // InternalMyDsl.g:1519:1: rule__AtributoSimple__Group__1__Impl : ( ( rule__AtributoSimple__NombreAssignment_1 ) ) ;
    public final void rule__AtributoSimple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1523:1: ( ( ( rule__AtributoSimple__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:1524:1: ( ( rule__AtributoSimple__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:1524:1: ( ( rule__AtributoSimple__NombreAssignment_1 ) )
            // InternalMyDsl.g:1525:2: ( rule__AtributoSimple__NombreAssignment_1 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:1526:2: ( rule__AtributoSimple__NombreAssignment_1 )
            // InternalMyDsl.g:1526:3: rule__AtributoSimple__NombreAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AtributoSimple__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoSimpleAccess().getNombreAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__Group__1__Impl"


    // $ANTLR start "rule__AtributoSimple__Group__2"
    // InternalMyDsl.g:1534:1: rule__AtributoSimple__Group__2 : rule__AtributoSimple__Group__2__Impl ;
    public final void rule__AtributoSimple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1538:1: ( rule__AtributoSimple__Group__2__Impl )
            // InternalMyDsl.g:1539:2: rule__AtributoSimple__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtributoSimple__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__Group__2"


    // $ANTLR start "rule__AtributoSimple__Group__2__Impl"
    // InternalMyDsl.g:1545:1: rule__AtributoSimple__Group__2__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoSimple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1549:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1550:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1550:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1551:2: RULE_SEMICOLON
            {
             before(grammarAccess.getAtributoSimpleAccess().getSEMICOLONTerminalRuleCall_2()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getAtributoSimpleAccess().getSEMICOLONTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__Group__2__Impl"


    // $ANTLR start "rule__MockarooEntity__Group__0"
    // InternalMyDsl.g:1561:1: rule__MockarooEntity__Group__0 : rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1 ;
    public final void rule__MockarooEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1565:1: ( rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1 )
            // InternalMyDsl.g:1566:2: rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MockarooEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MockarooEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__0"


    // $ANTLR start "rule__MockarooEntity__Group__0__Impl"
    // InternalMyDsl.g:1573:1: rule__MockarooEntity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__MockarooEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1577:1: ( ( 'Entity' ) )
            // InternalMyDsl.g:1578:1: ( 'Entity' )
            {
            // InternalMyDsl.g:1578:1: ( 'Entity' )
            // InternalMyDsl.g:1579:2: 'Entity'
            {
             before(grammarAccess.getMockarooEntityAccess().getEntityKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMockarooEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__0__Impl"


    // $ANTLR start "rule__MockarooEntity__Group__1"
    // InternalMyDsl.g:1588:1: rule__MockarooEntity__Group__1 : rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2 ;
    public final void rule__MockarooEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1592:1: ( rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2 )
            // InternalMyDsl.g:1593:2: rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__MockarooEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MockarooEntity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__1"


    // $ANTLR start "rule__MockarooEntity__Group__1__Impl"
    // InternalMyDsl.g:1600:1: rule__MockarooEntity__Group__1__Impl : ( ( rule__MockarooEntity__NombreAssignment_1 ) ) ;
    public final void rule__MockarooEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1604:1: ( ( ( rule__MockarooEntity__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:1605:1: ( ( rule__MockarooEntity__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:1605:1: ( ( rule__MockarooEntity__NombreAssignment_1 ) )
            // InternalMyDsl.g:1606:2: ( rule__MockarooEntity__NombreAssignment_1 )
            {
             before(grammarAccess.getMockarooEntityAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:1607:2: ( rule__MockarooEntity__NombreAssignment_1 )
            // InternalMyDsl.g:1607:3: rule__MockarooEntity__NombreAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MockarooEntity__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMockarooEntityAccess().getNombreAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__1__Impl"


    // $ANTLR start "rule__MockarooEntity__Group__2"
    // InternalMyDsl.g:1615:1: rule__MockarooEntity__Group__2 : rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3 ;
    public final void rule__MockarooEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1619:1: ( rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3 )
            // InternalMyDsl.g:1620:2: rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__MockarooEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MockarooEntity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__2"


    // $ANTLR start "rule__MockarooEntity__Group__2__Impl"
    // InternalMyDsl.g:1627:1: rule__MockarooEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__MockarooEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1631:1: ( ( '{' ) )
            // InternalMyDsl.g:1632:1: ( '{' )
            {
            // InternalMyDsl.g:1632:1: ( '{' )
            // InternalMyDsl.g:1633:2: '{'
            {
             before(grammarAccess.getMockarooEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMockarooEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__2__Impl"


    // $ANTLR start "rule__MockarooEntity__Group__3"
    // InternalMyDsl.g:1642:1: rule__MockarooEntity__Group__3 : rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4 ;
    public final void rule__MockarooEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1646:1: ( rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4 )
            // InternalMyDsl.g:1647:2: rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__MockarooEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MockarooEntity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__3"


    // $ANTLR start "rule__MockarooEntity__Group__3__Impl"
    // InternalMyDsl.g:1654:1: rule__MockarooEntity__Group__3__Impl : ( ( rule__MockarooEntity__AtributosAssignment_3 )* ) ;
    public final void rule__MockarooEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1658:1: ( ( ( rule__MockarooEntity__AtributosAssignment_3 )* ) )
            // InternalMyDsl.g:1659:1: ( ( rule__MockarooEntity__AtributosAssignment_3 )* )
            {
            // InternalMyDsl.g:1659:1: ( ( rule__MockarooEntity__AtributosAssignment_3 )* )
            // InternalMyDsl.g:1660:2: ( rule__MockarooEntity__AtributosAssignment_3 )*
            {
             before(grammarAccess.getMockarooEntityAccess().getAtributosAssignment_3()); 
            // InternalMyDsl.g:1661:2: ( rule__MockarooEntity__AtributosAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=15 && LA11_0<=17)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1661:3: rule__MockarooEntity__AtributosAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__MockarooEntity__AtributosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMockarooEntityAccess().getAtributosAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__3__Impl"


    // $ANTLR start "rule__MockarooEntity__Group__4"
    // InternalMyDsl.g:1669:1: rule__MockarooEntity__Group__4 : rule__MockarooEntity__Group__4__Impl ;
    public final void rule__MockarooEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1673:1: ( rule__MockarooEntity__Group__4__Impl )
            // InternalMyDsl.g:1674:2: rule__MockarooEntity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MockarooEntity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__4"


    // $ANTLR start "rule__MockarooEntity__Group__4__Impl"
    // InternalMyDsl.g:1680:1: rule__MockarooEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__MockarooEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1684:1: ( ( '}' ) )
            // InternalMyDsl.g:1685:1: ( '}' )
            {
            // InternalMyDsl.g:1685:1: ( '}' )
            // InternalMyDsl.g:1686:2: '}'
            {
             before(grammarAccess.getMockarooEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMockarooEntityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__4__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__0"
    // InternalMyDsl.g:1696:1: rule__SimpleEntity__Group__0 : rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 ;
    public final void rule__SimpleEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1700:1: ( rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 )
            // InternalMyDsl.g:1701:2: rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SimpleEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__0"


    // $ANTLR start "rule__SimpleEntity__Group__0__Impl"
    // InternalMyDsl.g:1708:1: rule__SimpleEntity__Group__0__Impl : ( 'SimpleEntity' ) ;
    public final void rule__SimpleEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1712:1: ( ( 'SimpleEntity' ) )
            // InternalMyDsl.g:1713:1: ( 'SimpleEntity' )
            {
            // InternalMyDsl.g:1713:1: ( 'SimpleEntity' )
            // InternalMyDsl.g:1714:2: 'SimpleEntity'
            {
             before(grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__0__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__1"
    // InternalMyDsl.g:1723:1: rule__SimpleEntity__Group__1 : rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 ;
    public final void rule__SimpleEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1727:1: ( rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 )
            // InternalMyDsl.g:1728:2: rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__SimpleEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__1"


    // $ANTLR start "rule__SimpleEntity__Group__1__Impl"
    // InternalMyDsl.g:1735:1: rule__SimpleEntity__Group__1__Impl : ( ( rule__SimpleEntity__NombreAssignment_1 ) ) ;
    public final void rule__SimpleEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1739:1: ( ( ( rule__SimpleEntity__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:1740:1: ( ( rule__SimpleEntity__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:1740:1: ( ( rule__SimpleEntity__NombreAssignment_1 ) )
            // InternalMyDsl.g:1741:2: ( rule__SimpleEntity__NombreAssignment_1 )
            {
             before(grammarAccess.getSimpleEntityAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:1742:2: ( rule__SimpleEntity__NombreAssignment_1 )
            // InternalMyDsl.g:1742:3: rule__SimpleEntity__NombreAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleEntityAccess().getNombreAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__1__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__2"
    // InternalMyDsl.g:1750:1: rule__SimpleEntity__Group__2 : rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 ;
    public final void rule__SimpleEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1754:1: ( rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 )
            // InternalMyDsl.g:1755:2: rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__SimpleEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__2"


    // $ANTLR start "rule__SimpleEntity__Group__2__Impl"
    // InternalMyDsl.g:1762:1: rule__SimpleEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__SimpleEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1766:1: ( ( '{' ) )
            // InternalMyDsl.g:1767:1: ( '{' )
            {
            // InternalMyDsl.g:1767:1: ( '{' )
            // InternalMyDsl.g:1768:2: '{'
            {
             before(grammarAccess.getSimpleEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__2__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__3"
    // InternalMyDsl.g:1777:1: rule__SimpleEntity__Group__3 : rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 ;
    public final void rule__SimpleEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1781:1: ( rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 )
            // InternalMyDsl.g:1782:2: rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__SimpleEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__3"


    // $ANTLR start "rule__SimpleEntity__Group__3__Impl"
    // InternalMyDsl.g:1789:1: rule__SimpleEntity__Group__3__Impl : ( ( rule__SimpleEntity__AtributosAssignment_3 )* ) ;
    public final void rule__SimpleEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1793:1: ( ( ( rule__SimpleEntity__AtributosAssignment_3 )* ) )
            // InternalMyDsl.g:1794:1: ( ( rule__SimpleEntity__AtributosAssignment_3 )* )
            {
            // InternalMyDsl.g:1794:1: ( ( rule__SimpleEntity__AtributosAssignment_3 )* )
            // InternalMyDsl.g:1795:2: ( rule__SimpleEntity__AtributosAssignment_3 )*
            {
             before(grammarAccess.getSimpleEntityAccess().getAtributosAssignment_3()); 
            // InternalMyDsl.g:1796:2: ( rule__SimpleEntity__AtributosAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=15 && LA12_0<=17)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1796:3: rule__SimpleEntity__AtributosAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__SimpleEntity__AtributosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSimpleEntityAccess().getAtributosAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__3__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__4"
    // InternalMyDsl.g:1804:1: rule__SimpleEntity__Group__4 : rule__SimpleEntity__Group__4__Impl ;
    public final void rule__SimpleEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1808:1: ( rule__SimpleEntity__Group__4__Impl )
            // InternalMyDsl.g:1809:2: rule__SimpleEntity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__4"


    // $ANTLR start "rule__SimpleEntity__Group__4__Impl"
    // InternalMyDsl.g:1815:1: rule__SimpleEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__SimpleEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1819:1: ( ( '}' ) )
            // InternalMyDsl.g:1820:1: ( '}' )
            {
            // InternalMyDsl.g:1820:1: ( '}' )
            // InternalMyDsl.g:1821:2: '}'
            {
             before(grammarAccess.getSimpleEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__4__Impl"


    // $ANTLR start "rule__MyNumeric__Group__0"
    // InternalMyDsl.g:1831:1: rule__MyNumeric__Group__0 : rule__MyNumeric__Group__0__Impl rule__MyNumeric__Group__1 ;
    public final void rule__MyNumeric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1835:1: ( rule__MyNumeric__Group__0__Impl rule__MyNumeric__Group__1 )
            // InternalMyDsl.g:1836:2: rule__MyNumeric__Group__0__Impl rule__MyNumeric__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__MyNumeric__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyNumeric__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumeric__Group__0"


    // $ANTLR start "rule__MyNumeric__Group__0__Impl"
    // InternalMyDsl.g:1843:1: rule__MyNumeric__Group__0__Impl : ( () ) ;
    public final void rule__MyNumeric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1847:1: ( ( () ) )
            // InternalMyDsl.g:1848:1: ( () )
            {
            // InternalMyDsl.g:1848:1: ( () )
            // InternalMyDsl.g:1849:2: ()
            {
             before(grammarAccess.getMyNumericAccess().getMyNumericAction_0()); 
            // InternalMyDsl.g:1850:2: ()
            // InternalMyDsl.g:1850:3: 
            {
            }

             after(grammarAccess.getMyNumericAccess().getMyNumericAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumeric__Group__0__Impl"


    // $ANTLR start "rule__MyNumeric__Group__1"
    // InternalMyDsl.g:1858:1: rule__MyNumeric__Group__1 : rule__MyNumeric__Group__1__Impl rule__MyNumeric__Group__2 ;
    public final void rule__MyNumeric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1862:1: ( rule__MyNumeric__Group__1__Impl rule__MyNumeric__Group__2 )
            // InternalMyDsl.g:1863:2: rule__MyNumeric__Group__1__Impl rule__MyNumeric__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__MyNumeric__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyNumeric__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumeric__Group__1"


    // $ANTLR start "rule__MyNumeric__Group__1__Impl"
    // InternalMyDsl.g:1870:1: rule__MyNumeric__Group__1__Impl : ( 'MyNumeric' ) ;
    public final void rule__MyNumeric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1874:1: ( ( 'MyNumeric' ) )
            // InternalMyDsl.g:1875:1: ( 'MyNumeric' )
            {
            // InternalMyDsl.g:1875:1: ( 'MyNumeric' )
            // InternalMyDsl.g:1876:2: 'MyNumeric'
            {
             before(grammarAccess.getMyNumericAccess().getMyNumericKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMyNumericAccess().getMyNumericKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumeric__Group__1__Impl"


    // $ANTLR start "rule__MyNumeric__Group__2"
    // InternalMyDsl.g:1885:1: rule__MyNumeric__Group__2 : rule__MyNumeric__Group__2__Impl rule__MyNumeric__Group__3 ;
    public final void rule__MyNumeric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1889:1: ( rule__MyNumeric__Group__2__Impl rule__MyNumeric__Group__3 )
            // InternalMyDsl.g:1890:2: rule__MyNumeric__Group__2__Impl rule__MyNumeric__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__MyNumeric__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyNumeric__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumeric__Group__2"


    // $ANTLR start "rule__MyNumeric__Group__2__Impl"
    // InternalMyDsl.g:1897:1: rule__MyNumeric__Group__2__Impl : ( '{' ) ;
    public final void rule__MyNumeric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1901:1: ( ( '{' ) )
            // InternalMyDsl.g:1902:1: ( '{' )
            {
            // InternalMyDsl.g:1902:1: ( '{' )
            // InternalMyDsl.g:1903:2: '{'
            {
             before(grammarAccess.getMyNumericAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMyNumericAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumeric__Group__2__Impl"


    // $ANTLR start "rule__MyNumeric__Group__3"
    // InternalMyDsl.g:1912:1: rule__MyNumeric__Group__3 : rule__MyNumeric__Group__3__Impl rule__MyNumeric__Group__4 ;
    public final void rule__MyNumeric__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1916:1: ( rule__MyNumeric__Group__3__Impl rule__MyNumeric__Group__4 )
            // InternalMyDsl.g:1917:2: rule__MyNumeric__Group__3__Impl rule__MyNumeric__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__MyNumeric__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyNumeric__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumeric__Group__3"


    // $ANTLR start "rule__MyNumeric__Group__3__Impl"
    // InternalMyDsl.g:1924:1: rule__MyNumeric__Group__3__Impl : ( ( rule__MyNumeric__Group_3__0 )? ) ;
    public final void rule__MyNumeric__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1928:1: ( ( ( rule__MyNumeric__Group_3__0 )? ) )
            // InternalMyDsl.g:1929:1: ( ( rule__MyNumeric__Group_3__0 )? )
            {
            // InternalMyDsl.g:1929:1: ( ( rule__MyNumeric__Group_3__0 )? )
            // InternalMyDsl.g:1930:2: ( rule__MyNumeric__Group_3__0 )?
            {
             before(grammarAccess.getMyNumericAccess().getGroup_3()); 
            // InternalMyDsl.g:1931:2: ( rule__MyNumeric__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==50) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1931:3: rule__MyNumeric__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MyNumeric__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMyNumericAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumeric__Group__3__Impl"


    // $ANTLR start "rule__MyNumeric__Group__4"
    // InternalMyDsl.g:1939:1: rule__MyNumeric__Group__4 : rule__MyNumeric__Group__4__Impl ;
    public final void rule__MyNumeric__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1943:1: ( rule__MyNumeric__Group__4__Impl )
            // InternalMyDsl.g:1944:2: rule__MyNumeric__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MyNumeric__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumeric__Group__4"


    // $ANTLR start "rule__MyNumeric__Group__4__Impl"
    // InternalMyDsl.g:1950:1: rule__MyNumeric__Group__4__Impl : ( '}' ) ;
    public final void rule__MyNumeric__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1954:1: ( ( '}' ) )
            // InternalMyDsl.g:1955:1: ( '}' )
            {
            // InternalMyDsl.g:1955:1: ( '}' )
            // InternalMyDsl.g:1956:2: '}'
            {
             before(grammarAccess.getMyNumericAccess().getRightCurlyBracketKeyword_4()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMyNumericAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumeric__Group__4__Impl"


    // $ANTLR start "rule__MyNumeric__Group_3__0"
    // InternalMyDsl.g:1966:1: rule__MyNumeric__Group_3__0 : rule__MyNumeric__Group_3__0__Impl rule__MyNumeric__Group_3__1 ;
    public final void rule__MyNumeric__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1970:1: ( rule__MyNumeric__Group_3__0__Impl rule__MyNumeric__Group_3__1 )
            // InternalMyDsl.g:1971:2: rule__MyNumeric__Group_3__0__Impl rule__MyNumeric__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__MyNumeric__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyNumeric__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumeric__Group_3__0"


    // $ANTLR start "rule__MyNumeric__Group_3__0__Impl"
    // InternalMyDsl.g:1978:1: rule__MyNumeric__Group_3__0__Impl : ( 'valor' ) ;
    public final void rule__MyNumeric__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1982:1: ( ( 'valor' ) )
            // InternalMyDsl.g:1983:1: ( 'valor' )
            {
            // InternalMyDsl.g:1983:1: ( 'valor' )
            // InternalMyDsl.g:1984:2: 'valor'
            {
             before(grammarAccess.getMyNumericAccess().getValorKeyword_3_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMyNumericAccess().getValorKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumeric__Group_3__0__Impl"


    // $ANTLR start "rule__MyNumeric__Group_3__1"
    // InternalMyDsl.g:1993:1: rule__MyNumeric__Group_3__1 : rule__MyNumeric__Group_3__1__Impl ;
    public final void rule__MyNumeric__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1997:1: ( rule__MyNumeric__Group_3__1__Impl )
            // InternalMyDsl.g:1998:2: rule__MyNumeric__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MyNumeric__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumeric__Group_3__1"


    // $ANTLR start "rule__MyNumeric__Group_3__1__Impl"
    // InternalMyDsl.g:2004:1: rule__MyNumeric__Group_3__1__Impl : ( ( rule__MyNumeric__ValorAssignment_3_1 ) ) ;
    public final void rule__MyNumeric__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2008:1: ( ( ( rule__MyNumeric__ValorAssignment_3_1 ) ) )
            // InternalMyDsl.g:2009:1: ( ( rule__MyNumeric__ValorAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2009:1: ( ( rule__MyNumeric__ValorAssignment_3_1 ) )
            // InternalMyDsl.g:2010:2: ( rule__MyNumeric__ValorAssignment_3_1 )
            {
             before(grammarAccess.getMyNumericAccess().getValorAssignment_3_1()); 
            // InternalMyDsl.g:2011:2: ( rule__MyNumeric__ValorAssignment_3_1 )
            // InternalMyDsl.g:2011:3: rule__MyNumeric__ValorAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MyNumeric__ValorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMyNumericAccess().getValorAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumeric__Group_3__1__Impl"


    // $ANTLR start "rule__MyString__Group__0"
    // InternalMyDsl.g:2020:1: rule__MyString__Group__0 : rule__MyString__Group__0__Impl rule__MyString__Group__1 ;
    public final void rule__MyString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2024:1: ( rule__MyString__Group__0__Impl rule__MyString__Group__1 )
            // InternalMyDsl.g:2025:2: rule__MyString__Group__0__Impl rule__MyString__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__MyString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__0"


    // $ANTLR start "rule__MyString__Group__0__Impl"
    // InternalMyDsl.g:2032:1: rule__MyString__Group__0__Impl : ( () ) ;
    public final void rule__MyString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2036:1: ( ( () ) )
            // InternalMyDsl.g:2037:1: ( () )
            {
            // InternalMyDsl.g:2037:1: ( () )
            // InternalMyDsl.g:2038:2: ()
            {
             before(grammarAccess.getMyStringAccess().getMyStringAction_0()); 
            // InternalMyDsl.g:2039:2: ()
            // InternalMyDsl.g:2039:3: 
            {
            }

             after(grammarAccess.getMyStringAccess().getMyStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__0__Impl"


    // $ANTLR start "rule__MyString__Group__1"
    // InternalMyDsl.g:2047:1: rule__MyString__Group__1 : rule__MyString__Group__1__Impl rule__MyString__Group__2 ;
    public final void rule__MyString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2051:1: ( rule__MyString__Group__1__Impl rule__MyString__Group__2 )
            // InternalMyDsl.g:2052:2: rule__MyString__Group__1__Impl rule__MyString__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__MyString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyString__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__1"


    // $ANTLR start "rule__MyString__Group__1__Impl"
    // InternalMyDsl.g:2059:1: rule__MyString__Group__1__Impl : ( 'MyString' ) ;
    public final void rule__MyString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2063:1: ( ( 'MyString' ) )
            // InternalMyDsl.g:2064:1: ( 'MyString' )
            {
            // InternalMyDsl.g:2064:1: ( 'MyString' )
            // InternalMyDsl.g:2065:2: 'MyString'
            {
             before(grammarAccess.getMyStringAccess().getMyStringKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMyStringAccess().getMyStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__1__Impl"


    // $ANTLR start "rule__MyString__Group__2"
    // InternalMyDsl.g:2074:1: rule__MyString__Group__2 : rule__MyString__Group__2__Impl rule__MyString__Group__3 ;
    public final void rule__MyString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2078:1: ( rule__MyString__Group__2__Impl rule__MyString__Group__3 )
            // InternalMyDsl.g:2079:2: rule__MyString__Group__2__Impl rule__MyString__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__MyString__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyString__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__2"


    // $ANTLR start "rule__MyString__Group__2__Impl"
    // InternalMyDsl.g:2086:1: rule__MyString__Group__2__Impl : ( '{' ) ;
    public final void rule__MyString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2090:1: ( ( '{' ) )
            // InternalMyDsl.g:2091:1: ( '{' )
            {
            // InternalMyDsl.g:2091:1: ( '{' )
            // InternalMyDsl.g:2092:2: '{'
            {
             before(grammarAccess.getMyStringAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMyStringAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__2__Impl"


    // $ANTLR start "rule__MyString__Group__3"
    // InternalMyDsl.g:2101:1: rule__MyString__Group__3 : rule__MyString__Group__3__Impl rule__MyString__Group__4 ;
    public final void rule__MyString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2105:1: ( rule__MyString__Group__3__Impl rule__MyString__Group__4 )
            // InternalMyDsl.g:2106:2: rule__MyString__Group__3__Impl rule__MyString__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__MyString__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyString__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__3"


    // $ANTLR start "rule__MyString__Group__3__Impl"
    // InternalMyDsl.g:2113:1: rule__MyString__Group__3__Impl : ( ( rule__MyString__Group_3__0 )? ) ;
    public final void rule__MyString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2117:1: ( ( ( rule__MyString__Group_3__0 )? ) )
            // InternalMyDsl.g:2118:1: ( ( rule__MyString__Group_3__0 )? )
            {
            // InternalMyDsl.g:2118:1: ( ( rule__MyString__Group_3__0 )? )
            // InternalMyDsl.g:2119:2: ( rule__MyString__Group_3__0 )?
            {
             before(grammarAccess.getMyStringAccess().getGroup_3()); 
            // InternalMyDsl.g:2120:2: ( rule__MyString__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==50) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:2120:3: rule__MyString__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MyString__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMyStringAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__3__Impl"


    // $ANTLR start "rule__MyString__Group__4"
    // InternalMyDsl.g:2128:1: rule__MyString__Group__4 : rule__MyString__Group__4__Impl ;
    public final void rule__MyString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2132:1: ( rule__MyString__Group__4__Impl )
            // InternalMyDsl.g:2133:2: rule__MyString__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MyString__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__4"


    // $ANTLR start "rule__MyString__Group__4__Impl"
    // InternalMyDsl.g:2139:1: rule__MyString__Group__4__Impl : ( '}' ) ;
    public final void rule__MyString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2143:1: ( ( '}' ) )
            // InternalMyDsl.g:2144:1: ( '}' )
            {
            // InternalMyDsl.g:2144:1: ( '}' )
            // InternalMyDsl.g:2145:2: '}'
            {
             before(grammarAccess.getMyStringAccess().getRightCurlyBracketKeyword_4()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMyStringAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__4__Impl"


    // $ANTLR start "rule__MyString__Group_3__0"
    // InternalMyDsl.g:2155:1: rule__MyString__Group_3__0 : rule__MyString__Group_3__0__Impl rule__MyString__Group_3__1 ;
    public final void rule__MyString__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2159:1: ( rule__MyString__Group_3__0__Impl rule__MyString__Group_3__1 )
            // InternalMyDsl.g:2160:2: rule__MyString__Group_3__0__Impl rule__MyString__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__MyString__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyString__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group_3__0"


    // $ANTLR start "rule__MyString__Group_3__0__Impl"
    // InternalMyDsl.g:2167:1: rule__MyString__Group_3__0__Impl : ( 'valor' ) ;
    public final void rule__MyString__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2171:1: ( ( 'valor' ) )
            // InternalMyDsl.g:2172:1: ( 'valor' )
            {
            // InternalMyDsl.g:2172:1: ( 'valor' )
            // InternalMyDsl.g:2173:2: 'valor'
            {
             before(grammarAccess.getMyStringAccess().getValorKeyword_3_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMyStringAccess().getValorKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group_3__0__Impl"


    // $ANTLR start "rule__MyString__Group_3__1"
    // InternalMyDsl.g:2182:1: rule__MyString__Group_3__1 : rule__MyString__Group_3__1__Impl ;
    public final void rule__MyString__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2186:1: ( rule__MyString__Group_3__1__Impl )
            // InternalMyDsl.g:2187:2: rule__MyString__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MyString__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group_3__1"


    // $ANTLR start "rule__MyString__Group_3__1__Impl"
    // InternalMyDsl.g:2193:1: rule__MyString__Group_3__1__Impl : ( ( rule__MyString__ValorAssignment_3_1 ) ) ;
    public final void rule__MyString__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2197:1: ( ( ( rule__MyString__ValorAssignment_3_1 ) ) )
            // InternalMyDsl.g:2198:1: ( ( rule__MyString__ValorAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2198:1: ( ( rule__MyString__ValorAssignment_3_1 ) )
            // InternalMyDsl.g:2199:2: ( rule__MyString__ValorAssignment_3_1 )
            {
             before(grammarAccess.getMyStringAccess().getValorAssignment_3_1()); 
            // InternalMyDsl.g:2200:2: ( rule__MyString__ValorAssignment_3_1 )
            // InternalMyDsl.g:2200:3: rule__MyString__ValorAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MyString__ValorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMyStringAccess().getValorAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group_3__1__Impl"


    // $ANTLR start "rule__MyBoolean__Group__0"
    // InternalMyDsl.g:2209:1: rule__MyBoolean__Group__0 : rule__MyBoolean__Group__0__Impl rule__MyBoolean__Group__1 ;
    public final void rule__MyBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2213:1: ( rule__MyBoolean__Group__0__Impl rule__MyBoolean__Group__1 )
            // InternalMyDsl.g:2214:2: rule__MyBoolean__Group__0__Impl rule__MyBoolean__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__MyBoolean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyBoolean__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBoolean__Group__0"


    // $ANTLR start "rule__MyBoolean__Group__0__Impl"
    // InternalMyDsl.g:2221:1: rule__MyBoolean__Group__0__Impl : ( () ) ;
    public final void rule__MyBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2225:1: ( ( () ) )
            // InternalMyDsl.g:2226:1: ( () )
            {
            // InternalMyDsl.g:2226:1: ( () )
            // InternalMyDsl.g:2227:2: ()
            {
             before(grammarAccess.getMyBooleanAccess().getMyBooleanAction_0()); 
            // InternalMyDsl.g:2228:2: ()
            // InternalMyDsl.g:2228:3: 
            {
            }

             after(grammarAccess.getMyBooleanAccess().getMyBooleanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBoolean__Group__0__Impl"


    // $ANTLR start "rule__MyBoolean__Group__1"
    // InternalMyDsl.g:2236:1: rule__MyBoolean__Group__1 : rule__MyBoolean__Group__1__Impl rule__MyBoolean__Group__2 ;
    public final void rule__MyBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2240:1: ( rule__MyBoolean__Group__1__Impl rule__MyBoolean__Group__2 )
            // InternalMyDsl.g:2241:2: rule__MyBoolean__Group__1__Impl rule__MyBoolean__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__MyBoolean__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyBoolean__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBoolean__Group__1"


    // $ANTLR start "rule__MyBoolean__Group__1__Impl"
    // InternalMyDsl.g:2248:1: rule__MyBoolean__Group__1__Impl : ( ( rule__MyBoolean__ValorAssignment_1 )? ) ;
    public final void rule__MyBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2252:1: ( ( ( rule__MyBoolean__ValorAssignment_1 )? ) )
            // InternalMyDsl.g:2253:1: ( ( rule__MyBoolean__ValorAssignment_1 )? )
            {
            // InternalMyDsl.g:2253:1: ( ( rule__MyBoolean__ValorAssignment_1 )? )
            // InternalMyDsl.g:2254:2: ( rule__MyBoolean__ValorAssignment_1 )?
            {
             before(grammarAccess.getMyBooleanAccess().getValorAssignment_1()); 
            // InternalMyDsl.g:2255:2: ( rule__MyBoolean__ValorAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==50) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:2255:3: rule__MyBoolean__ValorAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MyBoolean__ValorAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMyBooleanAccess().getValorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBoolean__Group__1__Impl"


    // $ANTLR start "rule__MyBoolean__Group__2"
    // InternalMyDsl.g:2263:1: rule__MyBoolean__Group__2 : rule__MyBoolean__Group__2__Impl ;
    public final void rule__MyBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2267:1: ( rule__MyBoolean__Group__2__Impl )
            // InternalMyDsl.g:2268:2: rule__MyBoolean__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MyBoolean__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBoolean__Group__2"


    // $ANTLR start "rule__MyBoolean__Group__2__Impl"
    // InternalMyDsl.g:2274:1: rule__MyBoolean__Group__2__Impl : ( 'MyBoolean' ) ;
    public final void rule__MyBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2278:1: ( ( 'MyBoolean' ) )
            // InternalMyDsl.g:2279:1: ( 'MyBoolean' )
            {
            // InternalMyDsl.g:2279:1: ( 'MyBoolean' )
            // InternalMyDsl.g:2280:2: 'MyBoolean'
            {
             before(grammarAccess.getMyBooleanAccess().getMyBooleanKeyword_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getMyBooleanAccess().getMyBooleanKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBoolean__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalMyDsl.g:2290:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2294:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalMyDsl.g:2295:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalMyDsl.g:2302:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2306:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:2307:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:2307:1: ( ( '-' )? )
            // InternalMyDsl.g:2308:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:2309:2: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==53) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2309:3: '-'
                    {
                    match(input,53,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalMyDsl.g:2317:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2321:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalMyDsl.g:2322:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalMyDsl.g:2329:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2333:1: ( ( ( RULE_INT )? ) )
            // InternalMyDsl.g:2334:1: ( ( RULE_INT )? )
            {
            // InternalMyDsl.g:2334:1: ( ( RULE_INT )? )
            // InternalMyDsl.g:2335:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalMyDsl.g:2336:2: ( RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2336:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalMyDsl.g:2344:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2348:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalMyDsl.g:2349:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalMyDsl.g:2356:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2360:1: ( ( '.' ) )
            // InternalMyDsl.g:2361:1: ( '.' )
            {
            // InternalMyDsl.g:2361:1: ( '.' )
            // InternalMyDsl.g:2362:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalMyDsl.g:2371:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2375:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalMyDsl.g:2376:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalMyDsl.g:2383:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2387:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2388:1: ( RULE_INT )
            {
            // InternalMyDsl.g:2388:1: ( RULE_INT )
            // InternalMyDsl.g:2389:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalMyDsl.g:2398:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2402:1: ( rule__EDouble__Group__4__Impl )
            // InternalMyDsl.g:2403:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalMyDsl.g:2409:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2413:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalMyDsl.g:2414:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalMyDsl.g:2414:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalMyDsl.g:2415:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalMyDsl.g:2416:2: ( rule__EDouble__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=13 && LA18_0<=14)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2416:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalMyDsl.g:2425:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2429:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalMyDsl.g:2430:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_25);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalMyDsl.g:2437:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2441:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalMyDsl.g:2442:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalMyDsl.g:2442:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalMyDsl.g:2443:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalMyDsl.g:2444:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalMyDsl.g:2444:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalMyDsl.g:2452:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2456:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalMyDsl.g:2457:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_25);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalMyDsl.g:2464:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2468:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:2469:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:2469:1: ( ( '-' )? )
            // InternalMyDsl.g:2470:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalMyDsl.g:2471:2: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==53) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2471:3: '-'
                    {
                    match(input,53,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalMyDsl.g:2479:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2483:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalMyDsl.g:2484:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalMyDsl.g:2490:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2494:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2495:1: ( RULE_INT )
            {
            // InternalMyDsl.g:2495:1: ( RULE_INT )
            // InternalMyDsl.g:2496:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Response__Group__0"
    // InternalMyDsl.g:2506:1: rule__Response__Group__0 : rule__Response__Group__0__Impl rule__Response__Group__1 ;
    public final void rule__Response__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2510:1: ( rule__Response__Group__0__Impl rule__Response__Group__1 )
            // InternalMyDsl.g:2511:2: rule__Response__Group__0__Impl rule__Response__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Response__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__0"


    // $ANTLR start "rule__Response__Group__0__Impl"
    // InternalMyDsl.g:2518:1: rule__Response__Group__0__Impl : ( 'Response' ) ;
    public final void rule__Response__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2522:1: ( ( 'Response' ) )
            // InternalMyDsl.g:2523:1: ( 'Response' )
            {
            // InternalMyDsl.g:2523:1: ( 'Response' )
            // InternalMyDsl.g:2524:2: 'Response'
            {
             before(grammarAccess.getResponseAccess().getResponseKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getResponseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__0__Impl"


    // $ANTLR start "rule__Response__Group__1"
    // InternalMyDsl.g:2533:1: rule__Response__Group__1 : rule__Response__Group__1__Impl rule__Response__Group__2 ;
    public final void rule__Response__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2537:1: ( rule__Response__Group__1__Impl rule__Response__Group__2 )
            // InternalMyDsl.g:2538:2: rule__Response__Group__1__Impl rule__Response__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Response__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__1"


    // $ANTLR start "rule__Response__Group__1__Impl"
    // InternalMyDsl.g:2545:1: rule__Response__Group__1__Impl : ( '{' ) ;
    public final void rule__Response__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2549:1: ( ( '{' ) )
            // InternalMyDsl.g:2550:1: ( '{' )
            {
            // InternalMyDsl.g:2550:1: ( '{' )
            // InternalMyDsl.g:2551:2: '{'
            {
             before(grammarAccess.getResponseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__1__Impl"


    // $ANTLR start "rule__Response__Group__2"
    // InternalMyDsl.g:2560:1: rule__Response__Group__2 : rule__Response__Group__2__Impl rule__Response__Group__3 ;
    public final void rule__Response__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2564:1: ( rule__Response__Group__2__Impl rule__Response__Group__3 )
            // InternalMyDsl.g:2565:2: rule__Response__Group__2__Impl rule__Response__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Response__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__2"


    // $ANTLR start "rule__Response__Group__2__Impl"
    // InternalMyDsl.g:2572:1: rule__Response__Group__2__Impl : ( 'atributos' ) ;
    public final void rule__Response__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2576:1: ( ( 'atributos' ) )
            // InternalMyDsl.g:2577:1: ( 'atributos' )
            {
            // InternalMyDsl.g:2577:1: ( 'atributos' )
            // InternalMyDsl.g:2578:2: 'atributos'
            {
             before(grammarAccess.getResponseAccess().getAtributosKeyword_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getAtributosKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__2__Impl"


    // $ANTLR start "rule__Response__Group__3"
    // InternalMyDsl.g:2587:1: rule__Response__Group__3 : rule__Response__Group__3__Impl rule__Response__Group__4 ;
    public final void rule__Response__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2591:1: ( rule__Response__Group__3__Impl rule__Response__Group__4 )
            // InternalMyDsl.g:2592:2: rule__Response__Group__3__Impl rule__Response__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Response__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__3"


    // $ANTLR start "rule__Response__Group__3__Impl"
    // InternalMyDsl.g:2599:1: rule__Response__Group__3__Impl : ( '{' ) ;
    public final void rule__Response__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2603:1: ( ( '{' ) )
            // InternalMyDsl.g:2604:1: ( '{' )
            {
            // InternalMyDsl.g:2604:1: ( '{' )
            // InternalMyDsl.g:2605:2: '{'
            {
             before(grammarAccess.getResponseAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__3__Impl"


    // $ANTLR start "rule__Response__Group__4"
    // InternalMyDsl.g:2614:1: rule__Response__Group__4 : rule__Response__Group__4__Impl rule__Response__Group__5 ;
    public final void rule__Response__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2618:1: ( rule__Response__Group__4__Impl rule__Response__Group__5 )
            // InternalMyDsl.g:2619:2: rule__Response__Group__4__Impl rule__Response__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Response__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__4"


    // $ANTLR start "rule__Response__Group__4__Impl"
    // InternalMyDsl.g:2626:1: rule__Response__Group__4__Impl : ( ( rule__Response__AtributosAssignment_4 ) ) ;
    public final void rule__Response__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2630:1: ( ( ( rule__Response__AtributosAssignment_4 ) ) )
            // InternalMyDsl.g:2631:1: ( ( rule__Response__AtributosAssignment_4 ) )
            {
            // InternalMyDsl.g:2631:1: ( ( rule__Response__AtributosAssignment_4 ) )
            // InternalMyDsl.g:2632:2: ( rule__Response__AtributosAssignment_4 )
            {
             before(grammarAccess.getResponseAccess().getAtributosAssignment_4()); 
            // InternalMyDsl.g:2633:2: ( rule__Response__AtributosAssignment_4 )
            // InternalMyDsl.g:2633:3: rule__Response__AtributosAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Response__AtributosAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getAtributosAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__4__Impl"


    // $ANTLR start "rule__Response__Group__5"
    // InternalMyDsl.g:2641:1: rule__Response__Group__5 : rule__Response__Group__5__Impl rule__Response__Group__6 ;
    public final void rule__Response__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2645:1: ( rule__Response__Group__5__Impl rule__Response__Group__6 )
            // InternalMyDsl.g:2646:2: rule__Response__Group__5__Impl rule__Response__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Response__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__5"


    // $ANTLR start "rule__Response__Group__5__Impl"
    // InternalMyDsl.g:2653:1: rule__Response__Group__5__Impl : ( ( rule__Response__Group_5__0 )* ) ;
    public final void rule__Response__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2657:1: ( ( ( rule__Response__Group_5__0 )* ) )
            // InternalMyDsl.g:2658:1: ( ( rule__Response__Group_5__0 )* )
            {
            // InternalMyDsl.g:2658:1: ( ( rule__Response__Group_5__0 )* )
            // InternalMyDsl.g:2659:2: ( rule__Response__Group_5__0 )*
            {
             before(grammarAccess.getResponseAccess().getGroup_5()); 
            // InternalMyDsl.g:2660:2: ( rule__Response__Group_5__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==57) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2660:3: rule__Response__Group_5__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Response__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getResponseAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__5__Impl"


    // $ANTLR start "rule__Response__Group__6"
    // InternalMyDsl.g:2668:1: rule__Response__Group__6 : rule__Response__Group__6__Impl rule__Response__Group__7 ;
    public final void rule__Response__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2672:1: ( rule__Response__Group__6__Impl rule__Response__Group__7 )
            // InternalMyDsl.g:2673:2: rule__Response__Group__6__Impl rule__Response__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__Response__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__6"


    // $ANTLR start "rule__Response__Group__6__Impl"
    // InternalMyDsl.g:2680:1: rule__Response__Group__6__Impl : ( '}' ) ;
    public final void rule__Response__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2684:1: ( ( '}' ) )
            // InternalMyDsl.g:2685:1: ( '}' )
            {
            // InternalMyDsl.g:2685:1: ( '}' )
            // InternalMyDsl.g:2686:2: '}'
            {
             before(grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_6()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__6__Impl"


    // $ANTLR start "rule__Response__Group__7"
    // InternalMyDsl.g:2695:1: rule__Response__Group__7 : rule__Response__Group__7__Impl ;
    public final void rule__Response__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2699:1: ( rule__Response__Group__7__Impl )
            // InternalMyDsl.g:2700:2: rule__Response__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__7"


    // $ANTLR start "rule__Response__Group__7__Impl"
    // InternalMyDsl.g:2706:1: rule__Response__Group__7__Impl : ( '}' ) ;
    public final void rule__Response__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2710:1: ( ( '}' ) )
            // InternalMyDsl.g:2711:1: ( '}' )
            {
            // InternalMyDsl.g:2711:1: ( '}' )
            // InternalMyDsl.g:2712:2: '}'
            {
             before(grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_7()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__7__Impl"


    // $ANTLR start "rule__Response__Group_5__0"
    // InternalMyDsl.g:2722:1: rule__Response__Group_5__0 : rule__Response__Group_5__0__Impl rule__Response__Group_5__1 ;
    public final void rule__Response__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2726:1: ( rule__Response__Group_5__0__Impl rule__Response__Group_5__1 )
            // InternalMyDsl.g:2727:2: rule__Response__Group_5__0__Impl rule__Response__Group_5__1
            {
            pushFollow(FOLLOW_27);
            rule__Response__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_5__0"


    // $ANTLR start "rule__Response__Group_5__0__Impl"
    // InternalMyDsl.g:2734:1: rule__Response__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Response__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2738:1: ( ( ',' ) )
            // InternalMyDsl.g:2739:1: ( ',' )
            {
            // InternalMyDsl.g:2739:1: ( ',' )
            // InternalMyDsl.g:2740:2: ','
            {
             before(grammarAccess.getResponseAccess().getCommaKeyword_5_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_5__0__Impl"


    // $ANTLR start "rule__Response__Group_5__1"
    // InternalMyDsl.g:2749:1: rule__Response__Group_5__1 : rule__Response__Group_5__1__Impl ;
    public final void rule__Response__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2753:1: ( rule__Response__Group_5__1__Impl )
            // InternalMyDsl.g:2754:2: rule__Response__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_5__1"


    // $ANTLR start "rule__Response__Group_5__1__Impl"
    // InternalMyDsl.g:2760:1: rule__Response__Group_5__1__Impl : ( ( rule__Response__AtributosAssignment_5_1 ) ) ;
    public final void rule__Response__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2764:1: ( ( ( rule__Response__AtributosAssignment_5_1 ) ) )
            // InternalMyDsl.g:2765:1: ( ( rule__Response__AtributosAssignment_5_1 ) )
            {
            // InternalMyDsl.g:2765:1: ( ( rule__Response__AtributosAssignment_5_1 ) )
            // InternalMyDsl.g:2766:2: ( rule__Response__AtributosAssignment_5_1 )
            {
             before(grammarAccess.getResponseAccess().getAtributosAssignment_5_1()); 
            // InternalMyDsl.g:2767:2: ( rule__Response__AtributosAssignment_5_1 )
            // InternalMyDsl.g:2767:3: rule__Response__AtributosAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Response__AtributosAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getAtributosAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_5__1__Impl"


    // $ANTLR start "rule__Mapping__Group__0"
    // InternalMyDsl.g:2776:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2780:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalMyDsl.g:2781:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0"


    // $ANTLR start "rule__Mapping__Group__0__Impl"
    // InternalMyDsl.g:2788:1: rule__Mapping__Group__0__Impl : ( 'Mapping' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2792:1: ( ( 'Mapping' ) )
            // InternalMyDsl.g:2793:1: ( 'Mapping' )
            {
            // InternalMyDsl.g:2793:1: ( 'Mapping' )
            // InternalMyDsl.g:2794:2: 'Mapping'
            {
             before(grammarAccess.getMappingAccess().getMappingKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getMappingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0__Impl"


    // $ANTLR start "rule__Mapping__Group__1"
    // InternalMyDsl.g:2803:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2807:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalMyDsl.g:2808:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Mapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1"


    // $ANTLR start "rule__Mapping__Group__1__Impl"
    // InternalMyDsl.g:2815:1: rule__Mapping__Group__1__Impl : ( '{' ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2819:1: ( ( '{' ) )
            // InternalMyDsl.g:2820:1: ( '{' )
            {
            // InternalMyDsl.g:2820:1: ( '{' )
            // InternalMyDsl.g:2821:2: '{'
            {
             before(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1__Impl"


    // $ANTLR start "rule__Mapping__Group__2"
    // InternalMyDsl.g:2830:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2834:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // InternalMyDsl.g:2835:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Mapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2"


    // $ANTLR start "rule__Mapping__Group__2__Impl"
    // InternalMyDsl.g:2842:1: rule__Mapping__Group__2__Impl : ( 'value' ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2846:1: ( ( 'value' ) )
            // InternalMyDsl.g:2847:1: ( 'value' )
            {
            // InternalMyDsl.g:2847:1: ( 'value' )
            // InternalMyDsl.g:2848:2: 'value'
            {
             before(grammarAccess.getMappingAccess().getValueKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2__Impl"


    // $ANTLR start "rule__Mapping__Group__3"
    // InternalMyDsl.g:2857:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2861:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // InternalMyDsl.g:2862:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Mapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__3"


    // $ANTLR start "rule__Mapping__Group__3__Impl"
    // InternalMyDsl.g:2869:1: rule__Mapping__Group__3__Impl : ( ( rule__Mapping__ValueAssignment_3 ) ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2873:1: ( ( ( rule__Mapping__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:2874:1: ( ( rule__Mapping__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:2874:1: ( ( rule__Mapping__ValueAssignment_3 ) )
            // InternalMyDsl.g:2875:2: ( rule__Mapping__ValueAssignment_3 )
            {
             before(grammarAccess.getMappingAccess().getValueAssignment_3()); 
            // InternalMyDsl.g:2876:2: ( rule__Mapping__ValueAssignment_3 )
            // InternalMyDsl.g:2876:3: rule__Mapping__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__3__Impl"


    // $ANTLR start "rule__Mapping__Group__4"
    // InternalMyDsl.g:2884:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl rule__Mapping__Group__5 ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2888:1: ( rule__Mapping__Group__4__Impl rule__Mapping__Group__5 )
            // InternalMyDsl.g:2889:2: rule__Mapping__Group__4__Impl rule__Mapping__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__Mapping__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__4"


    // $ANTLR start "rule__Mapping__Group__4__Impl"
    // InternalMyDsl.g:2896:1: rule__Mapping__Group__4__Impl : ( 'parametro' ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2900:1: ( ( 'parametro' ) )
            // InternalMyDsl.g:2901:1: ( 'parametro' )
            {
            // InternalMyDsl.g:2901:1: ( 'parametro' )
            // InternalMyDsl.g:2902:2: 'parametro'
            {
             before(grammarAccess.getMappingAccess().getParametroKeyword_4()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getParametroKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__4__Impl"


    // $ANTLR start "rule__Mapping__Group__5"
    // InternalMyDsl.g:2911:1: rule__Mapping__Group__5 : rule__Mapping__Group__5__Impl rule__Mapping__Group__6 ;
    public final void rule__Mapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2915:1: ( rule__Mapping__Group__5__Impl rule__Mapping__Group__6 )
            // InternalMyDsl.g:2916:2: rule__Mapping__Group__5__Impl rule__Mapping__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Mapping__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__5"


    // $ANTLR start "rule__Mapping__Group__5__Impl"
    // InternalMyDsl.g:2923:1: rule__Mapping__Group__5__Impl : ( ( rule__Mapping__ParametroAssignment_5 ) ) ;
    public final void rule__Mapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2927:1: ( ( ( rule__Mapping__ParametroAssignment_5 ) ) )
            // InternalMyDsl.g:2928:1: ( ( rule__Mapping__ParametroAssignment_5 ) )
            {
            // InternalMyDsl.g:2928:1: ( ( rule__Mapping__ParametroAssignment_5 ) )
            // InternalMyDsl.g:2929:2: ( rule__Mapping__ParametroAssignment_5 )
            {
             before(grammarAccess.getMappingAccess().getParametroAssignment_5()); 
            // InternalMyDsl.g:2930:2: ( rule__Mapping__ParametroAssignment_5 )
            // InternalMyDsl.g:2930:3: rule__Mapping__ParametroAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__ParametroAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getParametroAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__5__Impl"


    // $ANTLR start "rule__Mapping__Group__6"
    // InternalMyDsl.g:2938:1: rule__Mapping__Group__6 : rule__Mapping__Group__6__Impl ;
    public final void rule__Mapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2942:1: ( rule__Mapping__Group__6__Impl )
            // InternalMyDsl.g:2943:2: rule__Mapping__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__6"


    // $ANTLR start "rule__Mapping__Group__6__Impl"
    // InternalMyDsl.g:2949:1: rule__Mapping__Group__6__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2953:1: ( ( '}' ) )
            // InternalMyDsl.g:2954:1: ( '}' )
            {
            // InternalMyDsl.g:2954:1: ( '}' )
            // InternalMyDsl.g:2955:2: '}'
            {
             before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_6()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__6__Impl"


    // $ANTLR start "rule__Asercion__Group__0"
    // InternalMyDsl.g:2965:1: rule__Asercion__Group__0 : rule__Asercion__Group__0__Impl rule__Asercion__Group__1 ;
    public final void rule__Asercion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2969:1: ( rule__Asercion__Group__0__Impl rule__Asercion__Group__1 )
            // InternalMyDsl.g:2970:2: rule__Asercion__Group__0__Impl rule__Asercion__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Asercion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asercion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__0"


    // $ANTLR start "rule__Asercion__Group__0__Impl"
    // InternalMyDsl.g:2977:1: rule__Asercion__Group__0__Impl : ( 'Asercion' ) ;
    public final void rule__Asercion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2981:1: ( ( 'Asercion' ) )
            // InternalMyDsl.g:2982:1: ( 'Asercion' )
            {
            // InternalMyDsl.g:2982:1: ( 'Asercion' )
            // InternalMyDsl.g:2983:2: 'Asercion'
            {
             before(grammarAccess.getAsercionAccess().getAsercionKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getAsercionAccess().getAsercionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__0__Impl"


    // $ANTLR start "rule__Asercion__Group__1"
    // InternalMyDsl.g:2992:1: rule__Asercion__Group__1 : rule__Asercion__Group__1__Impl rule__Asercion__Group__2 ;
    public final void rule__Asercion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2996:1: ( rule__Asercion__Group__1__Impl rule__Asercion__Group__2 )
            // InternalMyDsl.g:2997:2: rule__Asercion__Group__1__Impl rule__Asercion__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Asercion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asercion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__1"


    // $ANTLR start "rule__Asercion__Group__1__Impl"
    // InternalMyDsl.g:3004:1: rule__Asercion__Group__1__Impl : ( '{' ) ;
    public final void rule__Asercion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3008:1: ( ( '{' ) )
            // InternalMyDsl.g:3009:1: ( '{' )
            {
            // InternalMyDsl.g:3009:1: ( '{' )
            // InternalMyDsl.g:3010:2: '{'
            {
             before(grammarAccess.getAsercionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAsercionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__1__Impl"


    // $ANTLR start "rule__Asercion__Group__2"
    // InternalMyDsl.g:3019:1: rule__Asercion__Group__2 : rule__Asercion__Group__2__Impl rule__Asercion__Group__3 ;
    public final void rule__Asercion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3023:1: ( rule__Asercion__Group__2__Impl rule__Asercion__Group__3 )
            // InternalMyDsl.g:3024:2: rule__Asercion__Group__2__Impl rule__Asercion__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Asercion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asercion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__2"


    // $ANTLR start "rule__Asercion__Group__2__Impl"
    // InternalMyDsl.g:3031:1: rule__Asercion__Group__2__Impl : ( 'elemento1' ) ;
    public final void rule__Asercion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3035:1: ( ( 'elemento1' ) )
            // InternalMyDsl.g:3036:1: ( 'elemento1' )
            {
            // InternalMyDsl.g:3036:1: ( 'elemento1' )
            // InternalMyDsl.g:3037:2: 'elemento1'
            {
             before(grammarAccess.getAsercionAccess().getElemento1Keyword_2()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getAsercionAccess().getElemento1Keyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__2__Impl"


    // $ANTLR start "rule__Asercion__Group__3"
    // InternalMyDsl.g:3046:1: rule__Asercion__Group__3 : rule__Asercion__Group__3__Impl rule__Asercion__Group__4 ;
    public final void rule__Asercion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3050:1: ( rule__Asercion__Group__3__Impl rule__Asercion__Group__4 )
            // InternalMyDsl.g:3051:2: rule__Asercion__Group__3__Impl rule__Asercion__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__Asercion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asercion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__3"


    // $ANTLR start "rule__Asercion__Group__3__Impl"
    // InternalMyDsl.g:3058:1: rule__Asercion__Group__3__Impl : ( ( rule__Asercion__Elemento1Assignment_3 ) ) ;
    public final void rule__Asercion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3062:1: ( ( ( rule__Asercion__Elemento1Assignment_3 ) ) )
            // InternalMyDsl.g:3063:1: ( ( rule__Asercion__Elemento1Assignment_3 ) )
            {
            // InternalMyDsl.g:3063:1: ( ( rule__Asercion__Elemento1Assignment_3 ) )
            // InternalMyDsl.g:3064:2: ( rule__Asercion__Elemento1Assignment_3 )
            {
             before(grammarAccess.getAsercionAccess().getElemento1Assignment_3()); 
            // InternalMyDsl.g:3065:2: ( rule__Asercion__Elemento1Assignment_3 )
            // InternalMyDsl.g:3065:3: rule__Asercion__Elemento1Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Elemento1Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getElemento1Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__3__Impl"


    // $ANTLR start "rule__Asercion__Group__4"
    // InternalMyDsl.g:3073:1: rule__Asercion__Group__4 : rule__Asercion__Group__4__Impl rule__Asercion__Group__5 ;
    public final void rule__Asercion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3077:1: ( rule__Asercion__Group__4__Impl rule__Asercion__Group__5 )
            // InternalMyDsl.g:3078:2: rule__Asercion__Group__4__Impl rule__Asercion__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Asercion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asercion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__4"


    // $ANTLR start "rule__Asercion__Group__4__Impl"
    // InternalMyDsl.g:3085:1: rule__Asercion__Group__4__Impl : ( 'elemento2' ) ;
    public final void rule__Asercion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3089:1: ( ( 'elemento2' ) )
            // InternalMyDsl.g:3090:1: ( 'elemento2' )
            {
            // InternalMyDsl.g:3090:1: ( 'elemento2' )
            // InternalMyDsl.g:3091:2: 'elemento2'
            {
             before(grammarAccess.getAsercionAccess().getElemento2Keyword_4()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getAsercionAccess().getElemento2Keyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__4__Impl"


    // $ANTLR start "rule__Asercion__Group__5"
    // InternalMyDsl.g:3100:1: rule__Asercion__Group__5 : rule__Asercion__Group__5__Impl rule__Asercion__Group__6 ;
    public final void rule__Asercion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3104:1: ( rule__Asercion__Group__5__Impl rule__Asercion__Group__6 )
            // InternalMyDsl.g:3105:2: rule__Asercion__Group__5__Impl rule__Asercion__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Asercion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asercion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__5"


    // $ANTLR start "rule__Asercion__Group__5__Impl"
    // InternalMyDsl.g:3112:1: rule__Asercion__Group__5__Impl : ( ( rule__Asercion__Elemento2Assignment_5 ) ) ;
    public final void rule__Asercion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3116:1: ( ( ( rule__Asercion__Elemento2Assignment_5 ) ) )
            // InternalMyDsl.g:3117:1: ( ( rule__Asercion__Elemento2Assignment_5 ) )
            {
            // InternalMyDsl.g:3117:1: ( ( rule__Asercion__Elemento2Assignment_5 ) )
            // InternalMyDsl.g:3118:2: ( rule__Asercion__Elemento2Assignment_5 )
            {
             before(grammarAccess.getAsercionAccess().getElemento2Assignment_5()); 
            // InternalMyDsl.g:3119:2: ( rule__Asercion__Elemento2Assignment_5 )
            // InternalMyDsl.g:3119:3: rule__Asercion__Elemento2Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Elemento2Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getElemento2Assignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__5__Impl"


    // $ANTLR start "rule__Asercion__Group__6"
    // InternalMyDsl.g:3127:1: rule__Asercion__Group__6 : rule__Asercion__Group__6__Impl ;
    public final void rule__Asercion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3131:1: ( rule__Asercion__Group__6__Impl )
            // InternalMyDsl.g:3132:2: rule__Asercion__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__6"


    // $ANTLR start "rule__Asercion__Group__6__Impl"
    // InternalMyDsl.g:3138:1: rule__Asercion__Group__6__Impl : ( '}' ) ;
    public final void rule__Asercion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3142:1: ( ( '}' ) )
            // InternalMyDsl.g:3143:1: ( '}' )
            {
            // InternalMyDsl.g:3143:1: ( '}' )
            // InternalMyDsl.g:3144:2: '}'
            {
             before(grammarAccess.getAsercionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getAsercionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__6__Impl"


    // $ANTLR start "rule__Parametro__Group__0"
    // InternalMyDsl.g:3154:1: rule__Parametro__Group__0 : rule__Parametro__Group__0__Impl rule__Parametro__Group__1 ;
    public final void rule__Parametro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3158:1: ( rule__Parametro__Group__0__Impl rule__Parametro__Group__1 )
            // InternalMyDsl.g:3159:2: rule__Parametro__Group__0__Impl rule__Parametro__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Parametro__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parametro__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__0"


    // $ANTLR start "rule__Parametro__Group__0__Impl"
    // InternalMyDsl.g:3166:1: rule__Parametro__Group__0__Impl : ( () ) ;
    public final void rule__Parametro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3170:1: ( ( () ) )
            // InternalMyDsl.g:3171:1: ( () )
            {
            // InternalMyDsl.g:3171:1: ( () )
            // InternalMyDsl.g:3172:2: ()
            {
             before(grammarAccess.getParametroAccess().getParametroAction_0()); 
            // InternalMyDsl.g:3173:2: ()
            // InternalMyDsl.g:3173:3: 
            {
            }

             after(grammarAccess.getParametroAccess().getParametroAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__0__Impl"


    // $ANTLR start "rule__Parametro__Group__1"
    // InternalMyDsl.g:3181:1: rule__Parametro__Group__1 : rule__Parametro__Group__1__Impl rule__Parametro__Group__2 ;
    public final void rule__Parametro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3185:1: ( rule__Parametro__Group__1__Impl rule__Parametro__Group__2 )
            // InternalMyDsl.g:3186:2: rule__Parametro__Group__1__Impl rule__Parametro__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Parametro__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parametro__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__1"


    // $ANTLR start "rule__Parametro__Group__1__Impl"
    // InternalMyDsl.g:3193:1: rule__Parametro__Group__1__Impl : ( 'Parametro' ) ;
    public final void rule__Parametro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3197:1: ( ( 'Parametro' ) )
            // InternalMyDsl.g:3198:1: ( 'Parametro' )
            {
            // InternalMyDsl.g:3198:1: ( 'Parametro' )
            // InternalMyDsl.g:3199:2: 'Parametro'
            {
             before(grammarAccess.getParametroAccess().getParametroKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getParametroAccess().getParametroKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__1__Impl"


    // $ANTLR start "rule__Parametro__Group__2"
    // InternalMyDsl.g:3208:1: rule__Parametro__Group__2 : rule__Parametro__Group__2__Impl rule__Parametro__Group__3 ;
    public final void rule__Parametro__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3212:1: ( rule__Parametro__Group__2__Impl rule__Parametro__Group__3 )
            // InternalMyDsl.g:3213:2: rule__Parametro__Group__2__Impl rule__Parametro__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Parametro__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parametro__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__2"


    // $ANTLR start "rule__Parametro__Group__2__Impl"
    // InternalMyDsl.g:3220:1: rule__Parametro__Group__2__Impl : ( '{' ) ;
    public final void rule__Parametro__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3224:1: ( ( '{' ) )
            // InternalMyDsl.g:3225:1: ( '{' )
            {
            // InternalMyDsl.g:3225:1: ( '{' )
            // InternalMyDsl.g:3226:2: '{'
            {
             before(grammarAccess.getParametroAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getParametroAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__2__Impl"


    // $ANTLR start "rule__Parametro__Group__3"
    // InternalMyDsl.g:3235:1: rule__Parametro__Group__3 : rule__Parametro__Group__3__Impl rule__Parametro__Group__4 ;
    public final void rule__Parametro__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3239:1: ( rule__Parametro__Group__3__Impl rule__Parametro__Group__4 )
            // InternalMyDsl.g:3240:2: rule__Parametro__Group__3__Impl rule__Parametro__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__Parametro__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parametro__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__3"


    // $ANTLR start "rule__Parametro__Group__3__Impl"
    // InternalMyDsl.g:3247:1: rule__Parametro__Group__3__Impl : ( ( rule__Parametro__Group_3__0 )? ) ;
    public final void rule__Parametro__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3251:1: ( ( ( rule__Parametro__Group_3__0 )? ) )
            // InternalMyDsl.g:3252:1: ( ( rule__Parametro__Group_3__0 )? )
            {
            // InternalMyDsl.g:3252:1: ( ( rule__Parametro__Group_3__0 )? )
            // InternalMyDsl.g:3253:2: ( rule__Parametro__Group_3__0 )?
            {
             before(grammarAccess.getParametroAccess().getGroup_3()); 
            // InternalMyDsl.g:3254:2: ( rule__Parametro__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==65) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:3254:3: rule__Parametro__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parametro__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParametroAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__3__Impl"


    // $ANTLR start "rule__Parametro__Group__4"
    // InternalMyDsl.g:3262:1: rule__Parametro__Group__4 : rule__Parametro__Group__4__Impl rule__Parametro__Group__5 ;
    public final void rule__Parametro__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3266:1: ( rule__Parametro__Group__4__Impl rule__Parametro__Group__5 )
            // InternalMyDsl.g:3267:2: rule__Parametro__Group__4__Impl rule__Parametro__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__Parametro__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parametro__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__4"


    // $ANTLR start "rule__Parametro__Group__4__Impl"
    // InternalMyDsl.g:3274:1: rule__Parametro__Group__4__Impl : ( ( rule__Parametro__Group_4__0 )? ) ;
    public final void rule__Parametro__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3278:1: ( ( ( rule__Parametro__Group_4__0 )? ) )
            // InternalMyDsl.g:3279:1: ( ( rule__Parametro__Group_4__0 )? )
            {
            // InternalMyDsl.g:3279:1: ( ( rule__Parametro__Group_4__0 )? )
            // InternalMyDsl.g:3280:2: ( rule__Parametro__Group_4__0 )?
            {
             before(grammarAccess.getParametroAccess().getGroup_4()); 
            // InternalMyDsl.g:3281:2: ( rule__Parametro__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==66) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:3281:3: rule__Parametro__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parametro__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParametroAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__4__Impl"


    // $ANTLR start "rule__Parametro__Group__5"
    // InternalMyDsl.g:3289:1: rule__Parametro__Group__5 : rule__Parametro__Group__5__Impl ;
    public final void rule__Parametro__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3293:1: ( rule__Parametro__Group__5__Impl )
            // InternalMyDsl.g:3294:2: rule__Parametro__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__5"


    // $ANTLR start "rule__Parametro__Group__5__Impl"
    // InternalMyDsl.g:3300:1: rule__Parametro__Group__5__Impl : ( '}' ) ;
    public final void rule__Parametro__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3304:1: ( ( '}' ) )
            // InternalMyDsl.g:3305:1: ( '}' )
            {
            // InternalMyDsl.g:3305:1: ( '}' )
            // InternalMyDsl.g:3306:2: '}'
            {
             before(grammarAccess.getParametroAccess().getRightCurlyBracketKeyword_5()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getParametroAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__5__Impl"


    // $ANTLR start "rule__Parametro__Group_3__0"
    // InternalMyDsl.g:3316:1: rule__Parametro__Group_3__0 : rule__Parametro__Group_3__0__Impl rule__Parametro__Group_3__1 ;
    public final void rule__Parametro__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3320:1: ( rule__Parametro__Group_3__0__Impl rule__Parametro__Group_3__1 )
            // InternalMyDsl.g:3321:2: rule__Parametro__Group_3__0__Impl rule__Parametro__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Parametro__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parametro__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group_3__0"


    // $ANTLR start "rule__Parametro__Group_3__0__Impl"
    // InternalMyDsl.g:3328:1: rule__Parametro__Group_3__0__Impl : ( 'nombre' ) ;
    public final void rule__Parametro__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3332:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:3333:1: ( 'nombre' )
            {
            // InternalMyDsl.g:3333:1: ( 'nombre' )
            // InternalMyDsl.g:3334:2: 'nombre'
            {
             before(grammarAccess.getParametroAccess().getNombreKeyword_3_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getParametroAccess().getNombreKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group_3__0__Impl"


    // $ANTLR start "rule__Parametro__Group_3__1"
    // InternalMyDsl.g:3343:1: rule__Parametro__Group_3__1 : rule__Parametro__Group_3__1__Impl ;
    public final void rule__Parametro__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3347:1: ( rule__Parametro__Group_3__1__Impl )
            // InternalMyDsl.g:3348:2: rule__Parametro__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group_3__1"


    // $ANTLR start "rule__Parametro__Group_3__1__Impl"
    // InternalMyDsl.g:3354:1: rule__Parametro__Group_3__1__Impl : ( ( rule__Parametro__NombreAssignment_3_1 ) ) ;
    public final void rule__Parametro__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3358:1: ( ( ( rule__Parametro__NombreAssignment_3_1 ) ) )
            // InternalMyDsl.g:3359:1: ( ( rule__Parametro__NombreAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3359:1: ( ( rule__Parametro__NombreAssignment_3_1 ) )
            // InternalMyDsl.g:3360:2: ( rule__Parametro__NombreAssignment_3_1 )
            {
             before(grammarAccess.getParametroAccess().getNombreAssignment_3_1()); 
            // InternalMyDsl.g:3361:2: ( rule__Parametro__NombreAssignment_3_1 )
            // InternalMyDsl.g:3361:3: rule__Parametro__NombreAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__NombreAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getNombreAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group_3__1__Impl"


    // $ANTLR start "rule__Parametro__Group_4__0"
    // InternalMyDsl.g:3370:1: rule__Parametro__Group_4__0 : rule__Parametro__Group_4__0__Impl rule__Parametro__Group_4__1 ;
    public final void rule__Parametro__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3374:1: ( rule__Parametro__Group_4__0__Impl rule__Parametro__Group_4__1 )
            // InternalMyDsl.g:3375:2: rule__Parametro__Group_4__0__Impl rule__Parametro__Group_4__1
            {
            pushFollow(FOLLOW_37);
            rule__Parametro__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parametro__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group_4__0"


    // $ANTLR start "rule__Parametro__Group_4__0__Impl"
    // InternalMyDsl.g:3382:1: rule__Parametro__Group_4__0__Impl : ( 'tipo' ) ;
    public final void rule__Parametro__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3386:1: ( ( 'tipo' ) )
            // InternalMyDsl.g:3387:1: ( 'tipo' )
            {
            // InternalMyDsl.g:3387:1: ( 'tipo' )
            // InternalMyDsl.g:3388:2: 'tipo'
            {
             before(grammarAccess.getParametroAccess().getTipoKeyword_4_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getParametroAccess().getTipoKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group_4__0__Impl"


    // $ANTLR start "rule__Parametro__Group_4__1"
    // InternalMyDsl.g:3397:1: rule__Parametro__Group_4__1 : rule__Parametro__Group_4__1__Impl ;
    public final void rule__Parametro__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3401:1: ( rule__Parametro__Group_4__1__Impl )
            // InternalMyDsl.g:3402:2: rule__Parametro__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group_4__1"


    // $ANTLR start "rule__Parametro__Group_4__1__Impl"
    // InternalMyDsl.g:3408:1: rule__Parametro__Group_4__1__Impl : ( ( rule__Parametro__TipoAssignment_4_1 ) ) ;
    public final void rule__Parametro__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3412:1: ( ( ( rule__Parametro__TipoAssignment_4_1 ) ) )
            // InternalMyDsl.g:3413:1: ( ( rule__Parametro__TipoAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3413:1: ( ( rule__Parametro__TipoAssignment_4_1 ) )
            // InternalMyDsl.g:3414:2: ( rule__Parametro__TipoAssignment_4_1 )
            {
             before(grammarAccess.getParametroAccess().getTipoAssignment_4_1()); 
            // InternalMyDsl.g:3415:2: ( rule__Parametro__TipoAssignment_4_1 )
            // InternalMyDsl.g:3415:3: rule__Parametro__TipoAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__TipoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getTipoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group_4__1__Impl"


    // $ANTLR start "rule__Api__UrlAssignment_3"
    // InternalMyDsl.g:3424:1: rule__Api__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Api__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3428:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3429:2: ( ruleEString )
            {
            // InternalMyDsl.g:3429:2: ( ruleEString )
            // InternalMyDsl.g:3430:3: ruleEString
            {
             before(grammarAccess.getApiAccess().getUrlEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApiAccess().getUrlEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__UrlAssignment_3"


    // $ANTLR start "rule__Api__EntidadesAssignment_5"
    // InternalMyDsl.g:3439:1: rule__Api__EntidadesAssignment_5 : ( ruleEntidad ) ;
    public final void rule__Api__EntidadesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3443:1: ( ( ruleEntidad ) )
            // InternalMyDsl.g:3444:2: ( ruleEntidad )
            {
            // InternalMyDsl.g:3444:2: ( ruleEntidad )
            // InternalMyDsl.g:3445:3: ruleEntidad
            {
             before(grammarAccess.getApiAccess().getEntidadesEntidadParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getApiAccess().getEntidadesEntidadParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__EntidadesAssignment_5"


    // $ANTLR start "rule__AtributoMocka__TipoAssignment_0"
    // InternalMyDsl.g:3454:1: rule__AtributoMocka__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoMocka__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3458:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:3459:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:3459:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:3460:3: ruleTipoAtributo
            {
             before(grammarAccess.getAtributoMockaAccess().getTipoTipoAtributoEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoMockaAccess().getTipoTipoAtributoEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__TipoAssignment_0"


    // $ANTLR start "rule__AtributoMocka__NombreAssignment_1"
    // InternalMyDsl.g:3469:1: rule__AtributoMocka__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__AtributoMocka__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3473:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3474:2: ( ruleEString )
            {
            // InternalMyDsl.g:3474:2: ( ruleEString )
            // InternalMyDsl.g:3475:3: ruleEString
            {
             before(grammarAccess.getAtributoMockaAccess().getNombreEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtributoMockaAccess().getNombreEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__NombreAssignment_1"


    // $ANTLR start "rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0"
    // InternalMyDsl.g:3484:1: rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 : ( ( 'PK,mockType' ) ) ;
    public final void rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3488:1: ( ( ( 'PK,mockType' ) ) )
            // InternalMyDsl.g:3489:2: ( ( 'PK,mockType' ) )
            {
            // InternalMyDsl.g:3489:2: ( ( 'PK,mockType' ) )
            // InternalMyDsl.g:3490:3: ( 'PK,mockType' )
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 
            // InternalMyDsl.g:3491:3: ( 'PK,mockType' )
            // InternalMyDsl.g:3492:4: 'PK,mockType'
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 

            }

             after(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0"


    // $ANTLR start "rule__AtributoMocka__MockTypeAssignment_2_1_0_2"
    // InternalMyDsl.g:3503:1: rule__AtributoMocka__MockTypeAssignment_2_1_0_2 : ( ruleMockaroo ) ;
    public final void rule__AtributoMocka__MockTypeAssignment_2_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3507:1: ( ( ruleMockaroo ) )
            // InternalMyDsl.g:3508:2: ( ruleMockaroo )
            {
            // InternalMyDsl.g:3508:2: ( ruleMockaroo )
            // InternalMyDsl.g:3509:3: ruleMockaroo
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMockaroo();

            state._fsp--;

             after(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__MockTypeAssignment_2_1_0_2"


    // $ANTLR start "rule__AtributoMocka__MockTypeAssignment_2_1_1_2"
    // InternalMyDsl.g:3518:1: rule__AtributoMocka__MockTypeAssignment_2_1_1_2 : ( ruleMockaroo ) ;
    public final void rule__AtributoMocka__MockTypeAssignment_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3522:1: ( ( ruleMockaroo ) )
            // InternalMyDsl.g:3523:2: ( ruleMockaroo )
            {
            // InternalMyDsl.g:3523:2: ( ruleMockaroo )
            // InternalMyDsl.g:3524:3: ruleMockaroo
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMockaroo();

            state._fsp--;

             after(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__MockTypeAssignment_2_1_1_2"


    // $ANTLR start "rule__AtributoArreglo__TipoAssignment_0"
    // InternalMyDsl.g:3533:1: rule__AtributoArreglo__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoArreglo__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3537:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:3538:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:3538:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:3539:3: ruleTipoAtributo
            {
             before(grammarAccess.getAtributoArregloAccess().getTipoTipoAtributoEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoArregloAccess().getTipoTipoAtributoEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__TipoAssignment_0"


    // $ANTLR start "rule__AtributoArreglo__NombreAssignment_3"
    // InternalMyDsl.g:3548:1: rule__AtributoArreglo__NombreAssignment_3 : ( ruleEString ) ;
    public final void rule__AtributoArreglo__NombreAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3552:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3553:2: ( ruleEString )
            {
            // InternalMyDsl.g:3553:2: ( ruleEString )
            // InternalMyDsl.g:3554:3: ruleEString
            {
             before(grammarAccess.getAtributoArregloAccess().getNombreEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtributoArregloAccess().getNombreEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__NombreAssignment_3"


    // $ANTLR start "rule__AtributoSimple__TipoAssignment_0"
    // InternalMyDsl.g:3563:1: rule__AtributoSimple__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoSimple__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3567:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:3568:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:3568:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:3569:3: ruleTipoAtributo
            {
             before(grammarAccess.getAtributoSimpleAccess().getTipoTipoAtributoEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoSimpleAccess().getTipoTipoAtributoEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__TipoAssignment_0"


    // $ANTLR start "rule__AtributoSimple__NombreAssignment_1"
    // InternalMyDsl.g:3578:1: rule__AtributoSimple__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__AtributoSimple__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3582:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3583:2: ( ruleEString )
            {
            // InternalMyDsl.g:3583:2: ( ruleEString )
            // InternalMyDsl.g:3584:3: ruleEString
            {
             before(grammarAccess.getAtributoSimpleAccess().getNombreEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtributoSimpleAccess().getNombreEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__NombreAssignment_1"


    // $ANTLR start "rule__MockarooEntity__NombreAssignment_1"
    // InternalMyDsl.g:3593:1: rule__MockarooEntity__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__MockarooEntity__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3597:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3598:2: ( ruleEString )
            {
            // InternalMyDsl.g:3598:2: ( ruleEString )
            // InternalMyDsl.g:3599:3: ruleEString
            {
             before(grammarAccess.getMockarooEntityAccess().getNombreEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMockarooEntityAccess().getNombreEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__NombreAssignment_1"


    // $ANTLR start "rule__MockarooEntity__AtributosAssignment_3"
    // InternalMyDsl.g:3608:1: rule__MockarooEntity__AtributosAssignment_3 : ( ruleAtributo ) ;
    public final void rule__MockarooEntity__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3612:1: ( ( ruleAtributo ) )
            // InternalMyDsl.g:3613:2: ( ruleAtributo )
            {
            // InternalMyDsl.g:3613:2: ( ruleAtributo )
            // InternalMyDsl.g:3614:3: ruleAtributo
            {
             before(grammarAccess.getMockarooEntityAccess().getAtributosAtributoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getMockarooEntityAccess().getAtributosAtributoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__AtributosAssignment_3"


    // $ANTLR start "rule__SimpleEntity__NombreAssignment_1"
    // InternalMyDsl.g:3623:1: rule__SimpleEntity__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__SimpleEntity__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3627:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3628:2: ( ruleEString )
            {
            // InternalMyDsl.g:3628:2: ( ruleEString )
            // InternalMyDsl.g:3629:3: ruleEString
            {
             before(grammarAccess.getSimpleEntityAccess().getNombreEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimpleEntityAccess().getNombreEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__NombreAssignment_1"


    // $ANTLR start "rule__SimpleEntity__AtributosAssignment_3"
    // InternalMyDsl.g:3638:1: rule__SimpleEntity__AtributosAssignment_3 : ( ruleAtributoSimple ) ;
    public final void rule__SimpleEntity__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3642:1: ( ( ruleAtributoSimple ) )
            // InternalMyDsl.g:3643:2: ( ruleAtributoSimple )
            {
            // InternalMyDsl.g:3643:2: ( ruleAtributoSimple )
            // InternalMyDsl.g:3644:3: ruleAtributoSimple
            {
             before(grammarAccess.getSimpleEntityAccess().getAtributosAtributoSimpleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributoSimple();

            state._fsp--;

             after(grammarAccess.getSimpleEntityAccess().getAtributosAtributoSimpleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__AtributosAssignment_3"


    // $ANTLR start "rule__MyNumeric__ValorAssignment_3_1"
    // InternalMyDsl.g:3653:1: rule__MyNumeric__ValorAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__MyNumeric__ValorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3657:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:3658:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:3658:2: ( ruleEDouble )
            // InternalMyDsl.g:3659:3: ruleEDouble
            {
             before(grammarAccess.getMyNumericAccess().getValorEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getMyNumericAccess().getValorEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumeric__ValorAssignment_3_1"


    // $ANTLR start "rule__MyString__ValorAssignment_3_1"
    // InternalMyDsl.g:3668:1: rule__MyString__ValorAssignment_3_1 : ( ruleEString ) ;
    public final void rule__MyString__ValorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3672:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3673:2: ( ruleEString )
            {
            // InternalMyDsl.g:3673:2: ( ruleEString )
            // InternalMyDsl.g:3674:3: ruleEString
            {
             before(grammarAccess.getMyStringAccess().getValorEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMyStringAccess().getValorEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__ValorAssignment_3_1"


    // $ANTLR start "rule__MyBoolean__ValorAssignment_1"
    // InternalMyDsl.g:3683:1: rule__MyBoolean__ValorAssignment_1 : ( ( 'valor' ) ) ;
    public final void rule__MyBoolean__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3687:1: ( ( ( 'valor' ) ) )
            // InternalMyDsl.g:3688:2: ( ( 'valor' ) )
            {
            // InternalMyDsl.g:3688:2: ( ( 'valor' ) )
            // InternalMyDsl.g:3689:3: ( 'valor' )
            {
             before(grammarAccess.getMyBooleanAccess().getValorValorKeyword_1_0()); 
            // InternalMyDsl.g:3690:3: ( 'valor' )
            // InternalMyDsl.g:3691:4: 'valor'
            {
             before(grammarAccess.getMyBooleanAccess().getValorValorKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMyBooleanAccess().getValorValorKeyword_1_0()); 

            }

             after(grammarAccess.getMyBooleanAccess().getValorValorKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBoolean__ValorAssignment_1"


    // $ANTLR start "rule__Response__AtributosAssignment_4"
    // InternalMyDsl.g:3702:1: rule__Response__AtributosAssignment_4 : ( ruleAtributo ) ;
    public final void rule__Response__AtributosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3706:1: ( ( ruleAtributo ) )
            // InternalMyDsl.g:3707:2: ( ruleAtributo )
            {
            // InternalMyDsl.g:3707:2: ( ruleAtributo )
            // InternalMyDsl.g:3708:3: ruleAtributo
            {
             before(grammarAccess.getResponseAccess().getAtributosAtributoParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getResponseAccess().getAtributosAtributoParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__AtributosAssignment_4"


    // $ANTLR start "rule__Response__AtributosAssignment_5_1"
    // InternalMyDsl.g:3717:1: rule__Response__AtributosAssignment_5_1 : ( ruleAtributo ) ;
    public final void rule__Response__AtributosAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3721:1: ( ( ruleAtributo ) )
            // InternalMyDsl.g:3722:2: ( ruleAtributo )
            {
            // InternalMyDsl.g:3722:2: ( ruleAtributo )
            // InternalMyDsl.g:3723:3: ruleAtributo
            {
             before(grammarAccess.getResponseAccess().getAtributosAtributoParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getResponseAccess().getAtributosAtributoParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__AtributosAssignment_5_1"


    // $ANTLR start "rule__Mapping__ValueAssignment_3"
    // InternalMyDsl.g:3732:1: rule__Mapping__ValueAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Mapping__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3736:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3737:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3737:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3738:3: ( ruleEString )
            {
             before(grammarAccess.getMappingAccess().getValueElementoCrossReference_3_0()); 
            // InternalMyDsl.g:3739:3: ( ruleEString )
            // InternalMyDsl.g:3740:4: ruleEString
            {
             before(grammarAccess.getMappingAccess().getValueElementoEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getValueElementoEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getValueElementoCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__ValueAssignment_3"


    // $ANTLR start "rule__Mapping__ParametroAssignment_5"
    // InternalMyDsl.g:3751:1: rule__Mapping__ParametroAssignment_5 : ( ruleParametro ) ;
    public final void rule__Mapping__ParametroAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3755:1: ( ( ruleParametro ) )
            // InternalMyDsl.g:3756:2: ( ruleParametro )
            {
            // InternalMyDsl.g:3756:2: ( ruleParametro )
            // InternalMyDsl.g:3757:3: ruleParametro
            {
             before(grammarAccess.getMappingAccess().getParametroParametroParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getParametroParametroParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__ParametroAssignment_5"


    // $ANTLR start "rule__Asercion__Elemento1Assignment_3"
    // InternalMyDsl.g:3766:1: rule__Asercion__Elemento1Assignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Asercion__Elemento1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3770:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3771:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3771:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3772:3: ( ruleEString )
            {
             before(grammarAccess.getAsercionAccess().getElemento1ElementoCrossReference_3_0()); 
            // InternalMyDsl.g:3773:3: ( ruleEString )
            // InternalMyDsl.g:3774:4: ruleEString
            {
             before(grammarAccess.getAsercionAccess().getElemento1ElementoEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAsercionAccess().getElemento1ElementoEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAsercionAccess().getElemento1ElementoCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Elemento1Assignment_3"


    // $ANTLR start "rule__Asercion__Elemento2Assignment_5"
    // InternalMyDsl.g:3785:1: rule__Asercion__Elemento2Assignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Asercion__Elemento2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3789:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3790:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3790:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3791:3: ( ruleEString )
            {
             before(grammarAccess.getAsercionAccess().getElemento2ElementoCrossReference_5_0()); 
            // InternalMyDsl.g:3792:3: ( ruleEString )
            // InternalMyDsl.g:3793:4: ruleEString
            {
             before(grammarAccess.getAsercionAccess().getElemento2ElementoEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAsercionAccess().getElemento2ElementoEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAsercionAccess().getElemento2ElementoCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Elemento2Assignment_5"


    // $ANTLR start "rule__Parametro__NombreAssignment_3_1"
    // InternalMyDsl.g:3804:1: rule__Parametro__NombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Parametro__NombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3808:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3809:2: ( ruleEString )
            {
            // InternalMyDsl.g:3809:2: ( ruleEString )
            // InternalMyDsl.g:3810:3: ruleEString
            {
             before(grammarAccess.getParametroAccess().getNombreEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParametroAccess().getNombreEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__NombreAssignment_3_1"


    // $ANTLR start "rule__Parametro__TipoAssignment_4_1"
    // InternalMyDsl.g:3819:1: rule__Parametro__TipoAssignment_4_1 : ( ruleTipoParametro ) ;
    public final void rule__Parametro__TipoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3823:1: ( ( ruleTipoParametro ) )
            // InternalMyDsl.g:3824:2: ( ruleTipoParametro )
            {
            // InternalMyDsl.g:3824:2: ( ruleTipoParametro )
            // InternalMyDsl.g:3825:3: ruleTipoParametro
            {
             before(grammarAccess.getParametroAccess().getTipoTipoParametroEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoParametro();

            state._fsp--;

             after(grammarAccess.getParametroAccess().getTipoTipoParametroEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__TipoAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0001200000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000FFFC0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000038000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0060000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0020000000000100L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0200800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000007000000000L});

}