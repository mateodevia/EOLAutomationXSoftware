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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'int'", "'boolean'", "'FirstNameType'", "'LastNameType'", "'FamilyNameType'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CityType'", "'CountryCodeType'", "'LatitudeType'", "'LongitudType'", "'RowNumberType'", "'BooleanType'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'apiURL'", "'('", "')'", "'mockType'", "'['", "']'", "'Entity'", "'{'", "'}'", "'URL'", "'/'", "'?${'", "'/:{'", "'SimpleEntity'", "'Response'", "'Type'", "'Request'", "'Mapping'", "'value'", "'Asercion'", "'elemento1'", "'elemento2'", "'PK,mockType'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int RULE_EQUAL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SEMICOLON=7;
    public static final int T__20=20;
    public static final int T__21=21;
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


    // $ANTLR start "entryRulePrimitiveType"
    // InternalMyDsl.g:103:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( rulePrimitiveType EOF )
            // InternalMyDsl.g:105:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalMyDsl.g:112:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__PrimitiveType__Alternatives )
            // InternalMyDsl.g:119:4: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleAtributo"
    // InternalMyDsl.g:128:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleAtributo EOF )
            // InternalMyDsl.g:130:1: ruleAtributo EOF
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
    // InternalMyDsl.g:137:1: ruleAtributo : ( ( rule__Atributo__Alternatives ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Atributo__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Atributo__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Atributo__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Atributo__Alternatives )
            {
             before(grammarAccess.getAtributoAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Atributo__Alternatives )
            // InternalMyDsl.g:144:4: rule__Atributo__Alternatives
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
    // InternalMyDsl.g:153:1: entryRuleAtributoMocka : ruleAtributoMocka EOF ;
    public final void entryRuleAtributoMocka() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleAtributoMocka EOF )
            // InternalMyDsl.g:155:1: ruleAtributoMocka EOF
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
    // InternalMyDsl.g:162:1: ruleAtributoMocka : ( ( rule__AtributoMocka__Group__0 ) ) ;
    public final void ruleAtributoMocka() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__AtributoMocka__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__AtributoMocka__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__AtributoMocka__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__AtributoMocka__Group__0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__AtributoMocka__Group__0 )
            // InternalMyDsl.g:169:4: rule__AtributoMocka__Group__0
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
    // InternalMyDsl.g:178:1: entryRuleAtributoArreglo : ruleAtributoArreglo EOF ;
    public final void entryRuleAtributoArreglo() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAtributoArreglo EOF )
            // InternalMyDsl.g:180:1: ruleAtributoArreglo EOF
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
    // InternalMyDsl.g:187:1: ruleAtributoArreglo : ( ( rule__AtributoArreglo__Group__0 ) ) ;
    public final void ruleAtributoArreglo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__AtributoArreglo__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__AtributoArreglo__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__AtributoArreglo__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__AtributoArreglo__Group__0 )
            {
             before(grammarAccess.getAtributoArregloAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__AtributoArreglo__Group__0 )
            // InternalMyDsl.g:194:4: rule__AtributoArreglo__Group__0
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
    // InternalMyDsl.g:203:1: entryRuleAtributoSimple : ruleAtributoSimple EOF ;
    public final void entryRuleAtributoSimple() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleAtributoSimple EOF )
            // InternalMyDsl.g:205:1: ruleAtributoSimple EOF
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
    // InternalMyDsl.g:212:1: ruleAtributoSimple : ( ( rule__AtributoSimple__Group__0 ) ) ;
    public final void ruleAtributoSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__AtributoSimple__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__AtributoSimple__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__AtributoSimple__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__AtributoSimple__Group__0 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__AtributoSimple__Group__0 )
            // InternalMyDsl.g:219:4: rule__AtributoSimple__Group__0
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
    // InternalMyDsl.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleEString EOF )
            // InternalMyDsl.g:230:1: ruleEString EOF
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
    // InternalMyDsl.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:244:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:244:4: rule__EString__Alternatives
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
    // InternalMyDsl.g:253:1: entryRuleMockarooEntity : ruleMockarooEntity EOF ;
    public final void entryRuleMockarooEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleMockarooEntity EOF )
            // InternalMyDsl.g:255:1: ruleMockarooEntity EOF
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
    // InternalMyDsl.g:262:1: ruleMockarooEntity : ( ( rule__MockarooEntity__Group__0 ) ) ;
    public final void ruleMockarooEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__MockarooEntity__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__MockarooEntity__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__MockarooEntity__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__MockarooEntity__Group__0 )
            {
             before(grammarAccess.getMockarooEntityAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__MockarooEntity__Group__0 )
            // InternalMyDsl.g:269:4: rule__MockarooEntity__Group__0
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


    // $ANTLR start "entryRuleServicioRest"
    // InternalMyDsl.g:278:1: entryRuleServicioRest : ruleServicioRest EOF ;
    public final void entryRuleServicioRest() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleServicioRest EOF )
            // InternalMyDsl.g:280:1: ruleServicioRest EOF
            {
             before(grammarAccess.getServicioRestRule()); 
            pushFollow(FOLLOW_1);
            ruleServicioRest();

            state._fsp--;

             after(grammarAccess.getServicioRestRule()); 
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
    // $ANTLR end "entryRuleServicioRest"


    // $ANTLR start "ruleServicioRest"
    // InternalMyDsl.g:287:1: ruleServicioRest : ( ( rule__ServicioRest__Group__0 ) ) ;
    public final void ruleServicioRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__ServicioRest__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__ServicioRest__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__ServicioRest__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__ServicioRest__Group__0 )
            {
             before(grammarAccess.getServicioRestAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__ServicioRest__Group__0 )
            // InternalMyDsl.g:294:4: rule__ServicioRest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServicioRestAccess().getGroup()); 

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
    // $ANTLR end "ruleServicioRest"


    // $ANTLR start "entryRuleParametro"
    // InternalMyDsl.g:303:1: entryRuleParametro : ruleParametro EOF ;
    public final void entryRuleParametro() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleParametro EOF )
            // InternalMyDsl.g:305:1: ruleParametro EOF
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
    // InternalMyDsl.g:312:1: ruleParametro : ( ( rule__Parametro__Alternatives ) ) ;
    public final void ruleParametro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Parametro__Alternatives ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Parametro__Alternatives ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Parametro__Alternatives ) )
            // InternalMyDsl.g:318:3: ( rule__Parametro__Alternatives )
            {
             before(grammarAccess.getParametroAccess().getAlternatives()); 
            // InternalMyDsl.g:319:3: ( rule__Parametro__Alternatives )
            // InternalMyDsl.g:319:4: rule__Parametro__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleQueryParam"
    // InternalMyDsl.g:328:1: entryRuleQueryParam : ruleQueryParam EOF ;
    public final void entryRuleQueryParam() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleQueryParam EOF )
            // InternalMyDsl.g:330:1: ruleQueryParam EOF
            {
             before(grammarAccess.getQueryParamRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryParam();

            state._fsp--;

             after(grammarAccess.getQueryParamRule()); 
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
    // $ANTLR end "entryRuleQueryParam"


    // $ANTLR start "ruleQueryParam"
    // InternalMyDsl.g:337:1: ruleQueryParam : ( ( rule__QueryParam__Group__0 ) ) ;
    public final void ruleQueryParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__QueryParam__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__QueryParam__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__QueryParam__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__QueryParam__Group__0 )
            {
             before(grammarAccess.getQueryParamAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__QueryParam__Group__0 )
            // InternalMyDsl.g:344:4: rule__QueryParam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryParamAccess().getGroup()); 

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
    // $ANTLR end "ruleQueryParam"


    // $ANTLR start "entryRulePathParam"
    // InternalMyDsl.g:353:1: entryRulePathParam : rulePathParam EOF ;
    public final void entryRulePathParam() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( rulePathParam EOF )
            // InternalMyDsl.g:355:1: rulePathParam EOF
            {
             before(grammarAccess.getPathParamRule()); 
            pushFollow(FOLLOW_1);
            rulePathParam();

            state._fsp--;

             after(grammarAccess.getPathParamRule()); 
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
    // $ANTLR end "entryRulePathParam"


    // $ANTLR start "rulePathParam"
    // InternalMyDsl.g:362:1: rulePathParam : ( ( rule__PathParam__Group__0 ) ) ;
    public final void rulePathParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__PathParam__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__PathParam__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__PathParam__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__PathParam__Group__0 )
            {
             before(grammarAccess.getPathParamAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__PathParam__Group__0 )
            // InternalMyDsl.g:369:4: rule__PathParam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PathParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathParamAccess().getGroup()); 

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
    // $ANTLR end "rulePathParam"


    // $ANTLR start "entryRuleSimpleEntity"
    // InternalMyDsl.g:378:1: entryRuleSimpleEntity : ruleSimpleEntity EOF ;
    public final void entryRuleSimpleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleSimpleEntity EOF )
            // InternalMyDsl.g:380:1: ruleSimpleEntity EOF
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
    // InternalMyDsl.g:387:1: ruleSimpleEntity : ( ( rule__SimpleEntity__Group__0 ) ) ;
    public final void ruleSimpleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__SimpleEntity__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__SimpleEntity__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__SimpleEntity__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__SimpleEntity__Group__0 )
            {
             before(grammarAccess.getSimpleEntityAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__SimpleEntity__Group__0 )
            // InternalMyDsl.g:394:4: rule__SimpleEntity__Group__0
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


    // $ANTLR start "entryRuleResponse"
    // InternalMyDsl.g:403:1: entryRuleResponse : ruleResponse EOF ;
    public final void entryRuleResponse() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleResponse EOF )
            // InternalMyDsl.g:405:1: ruleResponse EOF
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
    // InternalMyDsl.g:412:1: ruleResponse : ( ( rule__Response__Group__0 ) ) ;
    public final void ruleResponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Response__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Response__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Response__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Response__Group__0 )
            {
             before(grammarAccess.getResponseAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Response__Group__0 )
            // InternalMyDsl.g:419:4: rule__Response__Group__0
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


    // $ANTLR start "entryRuleRequest"
    // InternalMyDsl.g:428:1: entryRuleRequest : ruleRequest EOF ;
    public final void entryRuleRequest() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleRequest EOF )
            // InternalMyDsl.g:430:1: ruleRequest EOF
            {
             before(grammarAccess.getRequestRule()); 
            pushFollow(FOLLOW_1);
            ruleRequest();

            state._fsp--;

             after(grammarAccess.getRequestRule()); 
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
    // $ANTLR end "entryRuleRequest"


    // $ANTLR start "ruleRequest"
    // InternalMyDsl.g:437:1: ruleRequest : ( ( rule__Request__Group__0 ) ) ;
    public final void ruleRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Request__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Request__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Request__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Request__Group__0 )
            {
             before(grammarAccess.getRequestAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Request__Group__0 )
            // InternalMyDsl.g:444:4: rule__Request__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Request__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequestAccess().getGroup()); 

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
    // $ANTLR end "ruleRequest"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:453:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleType EOF )
            // InternalMyDsl.g:455:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:462:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Type__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Type__Group__0 )
            // InternalMyDsl.g:469:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTipoEntidad"
    // InternalMyDsl.g:478:1: entryRuleTipoEntidad : ruleTipoEntidad EOF ;
    public final void entryRuleTipoEntidad() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleTipoEntidad EOF )
            // InternalMyDsl.g:480:1: ruleTipoEntidad EOF
            {
             before(grammarAccess.getTipoEntidadRule()); 
            pushFollow(FOLLOW_1);
            ruleTipoEntidad();

            state._fsp--;

             after(grammarAccess.getTipoEntidadRule()); 
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
    // $ANTLR end "entryRuleTipoEntidad"


    // $ANTLR start "ruleTipoEntidad"
    // InternalMyDsl.g:487:1: ruleTipoEntidad : ( ( rule__TipoEntidad__NombreAssignment ) ) ;
    public final void ruleTipoEntidad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__TipoEntidad__NombreAssignment ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__TipoEntidad__NombreAssignment ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__TipoEntidad__NombreAssignment ) )
            // InternalMyDsl.g:493:3: ( rule__TipoEntidad__NombreAssignment )
            {
             before(grammarAccess.getTipoEntidadAccess().getNombreAssignment()); 
            // InternalMyDsl.g:494:3: ( rule__TipoEntidad__NombreAssignment )
            // InternalMyDsl.g:494:4: rule__TipoEntidad__NombreAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TipoEntidad__NombreAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTipoEntidadAccess().getNombreAssignment()); 

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
    // $ANTLR end "ruleTipoEntidad"


    // $ANTLR start "entryRuleMyString"
    // InternalMyDsl.g:503:1: entryRuleMyString : ruleMyString EOF ;
    public final void entryRuleMyString() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleMyString EOF )
            // InternalMyDsl.g:505:1: ruleMyString EOF
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
    // InternalMyDsl.g:512:1: ruleMyString : ( ( rule__MyString__NombreAssignment ) ) ;
    public final void ruleMyString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__MyString__NombreAssignment ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__MyString__NombreAssignment ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__MyString__NombreAssignment ) )
            // InternalMyDsl.g:518:3: ( rule__MyString__NombreAssignment )
            {
             before(grammarAccess.getMyStringAccess().getNombreAssignment()); 
            // InternalMyDsl.g:519:3: ( rule__MyString__NombreAssignment )
            // InternalMyDsl.g:519:4: rule__MyString__NombreAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MyString__NombreAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMyStringAccess().getNombreAssignment()); 

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


    // $ANTLR start "entryRuleMyNumeric"
    // InternalMyDsl.g:528:1: entryRuleMyNumeric : ruleMyNumeric EOF ;
    public final void entryRuleMyNumeric() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleMyNumeric EOF )
            // InternalMyDsl.g:530:1: ruleMyNumeric EOF
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
    // InternalMyDsl.g:537:1: ruleMyNumeric : ( ( rule__MyNumeric__NombreAssignment ) ) ;
    public final void ruleMyNumeric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__MyNumeric__NombreAssignment ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__MyNumeric__NombreAssignment ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__MyNumeric__NombreAssignment ) )
            // InternalMyDsl.g:543:3: ( rule__MyNumeric__NombreAssignment )
            {
             before(grammarAccess.getMyNumericAccess().getNombreAssignment()); 
            // InternalMyDsl.g:544:3: ( rule__MyNumeric__NombreAssignment )
            // InternalMyDsl.g:544:4: rule__MyNumeric__NombreAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MyNumeric__NombreAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMyNumericAccess().getNombreAssignment()); 

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


    // $ANTLR start "entryRuleMyBoolean"
    // InternalMyDsl.g:553:1: entryRuleMyBoolean : ruleMyBoolean EOF ;
    public final void entryRuleMyBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleMyBoolean EOF )
            // InternalMyDsl.g:555:1: ruleMyBoolean EOF
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
    // InternalMyDsl.g:562:1: ruleMyBoolean : ( ( rule__MyBoolean__NombreAssignment ) ) ;
    public final void ruleMyBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__MyBoolean__NombreAssignment ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__MyBoolean__NombreAssignment ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__MyBoolean__NombreAssignment ) )
            // InternalMyDsl.g:568:3: ( rule__MyBoolean__NombreAssignment )
            {
             before(grammarAccess.getMyBooleanAccess().getNombreAssignment()); 
            // InternalMyDsl.g:569:3: ( rule__MyBoolean__NombreAssignment )
            // InternalMyDsl.g:569:4: rule__MyBoolean__NombreAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MyBoolean__NombreAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMyBooleanAccess().getNombreAssignment()); 

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


    // $ANTLR start "entryRuleMapping"
    // InternalMyDsl.g:578:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleMapping EOF )
            // InternalMyDsl.g:580:1: ruleMapping EOF
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
    // InternalMyDsl.g:587:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__Mapping__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__Mapping__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__Mapping__Group__0 )
            // InternalMyDsl.g:594:4: rule__Mapping__Group__0
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
    // InternalMyDsl.g:603:1: entryRuleAsercion : ruleAsercion EOF ;
    public final void entryRuleAsercion() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleAsercion EOF )
            // InternalMyDsl.g:605:1: ruleAsercion EOF
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
    // InternalMyDsl.g:612:1: ruleAsercion : ( ( rule__Asercion__Group__0 ) ) ;
    public final void ruleAsercion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__Asercion__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__Asercion__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__Asercion__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__Asercion__Group__0 )
            {
             before(grammarAccess.getAsercionAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__Asercion__Group__0 )
            // InternalMyDsl.g:619:4: rule__Asercion__Group__0
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


    // $ANTLR start "ruleTipoAtributo"
    // InternalMyDsl.g:628:1: ruleTipoAtributo : ( ( rule__TipoAtributo__Alternatives ) ) ;
    public final void ruleTipoAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:632:1: ( ( ( rule__TipoAtributo__Alternatives ) ) )
            // InternalMyDsl.g:633:2: ( ( rule__TipoAtributo__Alternatives ) )
            {
            // InternalMyDsl.g:633:2: ( ( rule__TipoAtributo__Alternatives ) )
            // InternalMyDsl.g:634:3: ( rule__TipoAtributo__Alternatives )
            {
             before(grammarAccess.getTipoAtributoAccess().getAlternatives()); 
            // InternalMyDsl.g:635:3: ( rule__TipoAtributo__Alternatives )
            // InternalMyDsl.g:635:4: rule__TipoAtributo__Alternatives
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
    // InternalMyDsl.g:644:1: ruleMockaroo : ( ( rule__Mockaroo__Alternatives ) ) ;
    public final void ruleMockaroo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:648:1: ( ( ( rule__Mockaroo__Alternatives ) ) )
            // InternalMyDsl.g:649:2: ( ( rule__Mockaroo__Alternatives ) )
            {
            // InternalMyDsl.g:649:2: ( ( rule__Mockaroo__Alternatives ) )
            // InternalMyDsl.g:650:3: ( rule__Mockaroo__Alternatives )
            {
             before(grammarAccess.getMockarooAccess().getAlternatives()); 
            // InternalMyDsl.g:651:3: ( rule__Mockaroo__Alternatives )
            // InternalMyDsl.g:651:4: rule__Mockaroo__Alternatives
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
    // InternalMyDsl.g:660:1: ruleTipoMetodoRest : ( ( rule__TipoMetodoRest__Alternatives ) ) ;
    public final void ruleTipoMetodoRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:664:1: ( ( ( rule__TipoMetodoRest__Alternatives ) ) )
            // InternalMyDsl.g:665:2: ( ( rule__TipoMetodoRest__Alternatives ) )
            {
            // InternalMyDsl.g:665:2: ( ( rule__TipoMetodoRest__Alternatives ) )
            // InternalMyDsl.g:666:3: ( rule__TipoMetodoRest__Alternatives )
            {
             before(grammarAccess.getTipoMetodoRestAccess().getAlternatives()); 
            // InternalMyDsl.g:667:3: ( rule__TipoMetodoRest__Alternatives )
            // InternalMyDsl.g:667:4: rule__TipoMetodoRest__Alternatives
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


    // $ANTLR start "rule__Entidad__Alternatives"
    // InternalMyDsl.g:675:1: rule__Entidad__Alternatives : ( ( ruleSimpleEntity ) | ( ruleMockarooEntity ) );
    public final void rule__Entidad__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:679:1: ( ( ruleSimpleEntity ) | ( ruleMockarooEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==47) ) {
                alt1=1;
            }
            else if ( (LA1_0==40) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:680:2: ( ruleSimpleEntity )
                    {
                    // InternalMyDsl.g:680:2: ( ruleSimpleEntity )
                    // InternalMyDsl.g:681:3: ruleSimpleEntity
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
                    // InternalMyDsl.g:686:2: ( ruleMockarooEntity )
                    {
                    // InternalMyDsl.g:686:2: ( ruleMockarooEntity )
                    // InternalMyDsl.g:687:3: ruleMockarooEntity
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


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // InternalMyDsl.g:696:1: rule__PrimitiveType__Alternatives : ( ( ruleMyNumeric ) | ( ruleMyString ) | ( ruleMyBoolean ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:700:1: ( ( ruleMyNumeric ) | ( ruleMyString ) | ( ruleMyBoolean ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:701:2: ( ruleMyNumeric )
                    {
                    // InternalMyDsl.g:701:2: ( ruleMyNumeric )
                    // InternalMyDsl.g:702:3: ruleMyNumeric
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getMyNumericParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMyNumeric();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getMyNumericParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:707:2: ( ruleMyString )
                    {
                    // InternalMyDsl.g:707:2: ( ruleMyString )
                    // InternalMyDsl.g:708:3: ruleMyString
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getMyStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMyString();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getMyStringParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:713:2: ( ruleMyBoolean )
                    {
                    // InternalMyDsl.g:713:2: ( ruleMyBoolean )
                    // InternalMyDsl.g:714:3: ruleMyBoolean
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getMyBooleanParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMyBoolean();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getMyBooleanParserRuleCall_2()); 

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
    // $ANTLR end "rule__PrimitiveType__Alternatives"


    // $ANTLR start "rule__Atributo__Alternatives"
    // InternalMyDsl.g:723:1: rule__Atributo__Alternatives : ( ( ruleAtributoMocka ) | ( ruleAtributoArreglo ) | ( ruleAtributoSimple ) );
    public final void rule__Atributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:727:1: ( ( ruleAtributoMocka ) | ( ruleAtributoArreglo ) | ( ruleAtributoSimple ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==35) ) {
                        alt3=1;
                    }
                    else if ( (LA3_4==RULE_SEMICOLON) ) {
                        alt3=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==RULE_SEMICOLON) ) {
                        alt3=3;
                    }
                    else if ( (LA3_5==35) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 38:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

                }
                break;
            case 14:
                {
                switch ( input.LA(2) ) {
                case 38:
                    {
                    alt3=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==35) ) {
                        alt3=1;
                    }
                    else if ( (LA3_4==RULE_SEMICOLON) ) {
                        alt3=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==RULE_SEMICOLON) ) {
                        alt3=3;
                    }
                    else if ( (LA3_5==35) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }

                }
                break;
            case 15:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==35) ) {
                        alt3=1;
                    }
                    else if ( (LA3_4==RULE_SEMICOLON) ) {
                        alt3=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==RULE_SEMICOLON) ) {
                        alt3=3;
                    }
                    else if ( (LA3_5==35) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 38:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:728:2: ( ruleAtributoMocka )
                    {
                    // InternalMyDsl.g:728:2: ( ruleAtributoMocka )
                    // InternalMyDsl.g:729:3: ruleAtributoMocka
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
                    // InternalMyDsl.g:734:2: ( ruleAtributoArreglo )
                    {
                    // InternalMyDsl.g:734:2: ( ruleAtributoArreglo )
                    // InternalMyDsl.g:735:3: ruleAtributoArreglo
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
                    // InternalMyDsl.g:740:2: ( ruleAtributoSimple )
                    {
                    // InternalMyDsl.g:740:2: ( ruleAtributoSimple )
                    // InternalMyDsl.g:741:3: ruleAtributoSimple
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
    // InternalMyDsl.g:750:1: rule__AtributoMocka__Alternatives_2_1 : ( ( ( rule__AtributoMocka__Group_2_1_0__0 ) ) | ( ( rule__AtributoMocka__Group_2_1_1__0 ) ) );
    public final void rule__AtributoMocka__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:754:1: ( ( ( rule__AtributoMocka__Group_2_1_0__0 ) ) | ( ( rule__AtributoMocka__Group_2_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==56) ) {
                alt4=1;
            }
            else if ( (LA4_0==37) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:755:2: ( ( rule__AtributoMocka__Group_2_1_0__0 ) )
                    {
                    // InternalMyDsl.g:755:2: ( ( rule__AtributoMocka__Group_2_1_0__0 ) )
                    // InternalMyDsl.g:756:3: ( rule__AtributoMocka__Group_2_1_0__0 )
                    {
                     before(grammarAccess.getAtributoMockaAccess().getGroup_2_1_0()); 
                    // InternalMyDsl.g:757:3: ( rule__AtributoMocka__Group_2_1_0__0 )
                    // InternalMyDsl.g:757:4: rule__AtributoMocka__Group_2_1_0__0
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
                    // InternalMyDsl.g:761:2: ( ( rule__AtributoMocka__Group_2_1_1__0 ) )
                    {
                    // InternalMyDsl.g:761:2: ( ( rule__AtributoMocka__Group_2_1_1__0 ) )
                    // InternalMyDsl.g:762:3: ( rule__AtributoMocka__Group_2_1_1__0 )
                    {
                     before(grammarAccess.getAtributoMockaAccess().getGroup_2_1_1()); 
                    // InternalMyDsl.g:763:3: ( rule__AtributoMocka__Group_2_1_1__0 )
                    // InternalMyDsl.g:763:4: rule__AtributoMocka__Group_2_1_1__0
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
    // InternalMyDsl.g:771:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:775:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:776:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:776:2: ( RULE_STRING )
                    // InternalMyDsl.g:777:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:782:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:782:2: ( RULE_ID )
                    // InternalMyDsl.g:783:3: RULE_ID
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


    // $ANTLR start "rule__ServicioRest__Alternatives_7"
    // InternalMyDsl.g:792:1: rule__ServicioRest__Alternatives_7 : ( ( ( rule__ServicioRest__ParametrosAssignment_7_0 ) ) | ( ( rule__ServicioRest__Group_7_1__0 ) ) );
    public final void rule__ServicioRest__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:796:1: ( ( ( rule__ServicioRest__ParametrosAssignment_7_0 ) ) | ( ( rule__ServicioRest__Group_7_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=45 && LA6_0<=46)) ) {
                alt6=1;
            }
            else if ( (LA6_0==44) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:797:2: ( ( rule__ServicioRest__ParametrosAssignment_7_0 ) )
                    {
                    // InternalMyDsl.g:797:2: ( ( rule__ServicioRest__ParametrosAssignment_7_0 ) )
                    // InternalMyDsl.g:798:3: ( rule__ServicioRest__ParametrosAssignment_7_0 )
                    {
                     before(grammarAccess.getServicioRestAccess().getParametrosAssignment_7_0()); 
                    // InternalMyDsl.g:799:3: ( rule__ServicioRest__ParametrosAssignment_7_0 )
                    // InternalMyDsl.g:799:4: rule__ServicioRest__ParametrosAssignment_7_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServicioRest__ParametrosAssignment_7_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getServicioRestAccess().getParametrosAssignment_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:803:2: ( ( rule__ServicioRest__Group_7_1__0 ) )
                    {
                    // InternalMyDsl.g:803:2: ( ( rule__ServicioRest__Group_7_1__0 ) )
                    // InternalMyDsl.g:804:3: ( rule__ServicioRest__Group_7_1__0 )
                    {
                     before(grammarAccess.getServicioRestAccess().getGroup_7_1()); 
                    // InternalMyDsl.g:805:3: ( rule__ServicioRest__Group_7_1__0 )
                    // InternalMyDsl.g:805:4: rule__ServicioRest__Group_7_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServicioRest__Group_7_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getServicioRestAccess().getGroup_7_1()); 

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
    // $ANTLR end "rule__ServicioRest__Alternatives_7"


    // $ANTLR start "rule__Parametro__Alternatives"
    // InternalMyDsl.g:813:1: rule__Parametro__Alternatives : ( ( ruleQueryParam ) | ( rulePathParam ) );
    public final void rule__Parametro__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:817:1: ( ( ruleQueryParam ) | ( rulePathParam ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==45) ) {
                alt7=1;
            }
            else if ( (LA7_0==46) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:818:2: ( ruleQueryParam )
                    {
                    // InternalMyDsl.g:818:2: ( ruleQueryParam )
                    // InternalMyDsl.g:819:3: ruleQueryParam
                    {
                     before(grammarAccess.getParametroAccess().getQueryParamParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleQueryParam();

                    state._fsp--;

                     after(grammarAccess.getParametroAccess().getQueryParamParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:824:2: ( rulePathParam )
                    {
                    // InternalMyDsl.g:824:2: ( rulePathParam )
                    // InternalMyDsl.g:825:3: rulePathParam
                    {
                     before(grammarAccess.getParametroAccess().getPathParamParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePathParam();

                    state._fsp--;

                     after(grammarAccess.getParametroAccess().getPathParamParserRuleCall_1()); 

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
    // $ANTLR end "rule__Parametro__Alternatives"


    // $ANTLR start "rule__Type__Alternatives_0"
    // InternalMyDsl.g:834:1: rule__Type__Alternatives_0 : ( ( ruleTipoEntidad ) | ( rulePrimitiveType ) );
    public final void rule__Type__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:838:1: ( ( ruleTipoEntidad ) | ( rulePrimitiveType ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=13 && LA8_0<=15)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:839:2: ( ruleTipoEntidad )
                    {
                    // InternalMyDsl.g:839:2: ( ruleTipoEntidad )
                    // InternalMyDsl.g:840:3: ruleTipoEntidad
                    {
                     before(grammarAccess.getTypeAccess().getTipoEntidadParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTipoEntidad();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getTipoEntidadParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:845:2: ( rulePrimitiveType )
                    {
                    // InternalMyDsl.g:845:2: ( rulePrimitiveType )
                    // InternalMyDsl.g:846:3: rulePrimitiveType
                    {
                     before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Type__Alternatives_0"


    // $ANTLR start "rule__TipoAtributo__Alternatives"
    // InternalMyDsl.g:855:1: rule__TipoAtributo__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) );
    public final void rule__TipoAtributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:859:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt9=1;
                }
                break;
            case 14:
                {
                alt9=2;
                }
                break;
            case 15:
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
                    // InternalMyDsl.g:860:2: ( ( 'string' ) )
                    {
                    // InternalMyDsl.g:860:2: ( ( 'string' ) )
                    // InternalMyDsl.g:861:3: ( 'string' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:862:3: ( 'string' )
                    // InternalMyDsl.g:862:4: 'string'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:866:2: ( ( 'int' ) )
                    {
                    // InternalMyDsl.g:866:2: ( ( 'int' ) )
                    // InternalMyDsl.g:867:3: ( 'int' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:868:3: ( 'int' )
                    // InternalMyDsl.g:868:4: 'int'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:872:2: ( ( 'boolean' ) )
                    {
                    // InternalMyDsl.g:872:2: ( ( 'boolean' ) )
                    // InternalMyDsl.g:873:3: ( 'boolean' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:874:3: ( 'boolean' )
                    // InternalMyDsl.g:874:4: 'boolean'
                    {
                    match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:882:1: rule__Mockaroo__Alternatives : ( ( ( 'FirstNameType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CityType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'LatitudeType' ) ) | ( ( 'LongitudType' ) ) | ( ( 'RowNumberType' ) ) | ( ( 'BooleanType' ) ) );
    public final void rule__Mockaroo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:886:1: ( ( ( 'FirstNameType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CityType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'LatitudeType' ) ) | ( ( 'LongitudType' ) ) | ( ( 'RowNumberType' ) ) | ( ( 'BooleanType' ) ) )
            int alt10=14;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt10=1;
                }
                break;
            case 17:
                {
                alt10=2;
                }
                break;
            case 18:
                {
                alt10=3;
                }
                break;
            case 19:
                {
                alt10=4;
                }
                break;
            case 20:
                {
                alt10=5;
                }
                break;
            case 21:
                {
                alt10=6;
                }
                break;
            case 22:
                {
                alt10=7;
                }
                break;
            case 23:
                {
                alt10=8;
                }
                break;
            case 24:
                {
                alt10=9;
                }
                break;
            case 25:
                {
                alt10=10;
                }
                break;
            case 26:
                {
                alt10=11;
                }
                break;
            case 27:
                {
                alt10=12;
                }
                break;
            case 28:
                {
                alt10=13;
                }
                break;
            case 29:
                {
                alt10=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:887:2: ( ( 'FirstNameType' ) )
                    {
                    // InternalMyDsl.g:887:2: ( ( 'FirstNameType' ) )
                    // InternalMyDsl.g:888:3: ( 'FirstNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:889:3: ( 'FirstNameType' )
                    // InternalMyDsl.g:889:4: 'FirstNameType'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:893:2: ( ( 'LastNameType' ) )
                    {
                    // InternalMyDsl.g:893:2: ( ( 'LastNameType' ) )
                    // InternalMyDsl.g:894:3: ( 'LastNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:895:3: ( 'LastNameType' )
                    // InternalMyDsl.g:895:4: 'LastNameType'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:899:2: ( ( 'FamilyNameType' ) )
                    {
                    // InternalMyDsl.g:899:2: ( ( 'FamilyNameType' ) )
                    // InternalMyDsl.g:900:3: ( 'FamilyNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:901:3: ( 'FamilyNameType' )
                    // InternalMyDsl.g:901:4: 'FamilyNameType'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:905:2: ( ( 'FullNameType' ) )
                    {
                    // InternalMyDsl.g:905:2: ( ( 'FullNameType' ) )
                    // InternalMyDsl.g:906:3: ( 'FullNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:907:3: ( 'FullNameType' )
                    // InternalMyDsl.g:907:4: 'FullNameType'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:911:2: ( ( 'GenderType' ) )
                    {
                    // InternalMyDsl.g:911:2: ( ( 'GenderType' ) )
                    // InternalMyDsl.g:912:3: ( 'GenderType' )
                    {
                     before(grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:913:3: ( 'GenderType' )
                    // InternalMyDsl.g:913:4: 'GenderType'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:917:2: ( ( 'EmailAddressType' ) )
                    {
                    // InternalMyDsl.g:917:2: ( ( 'EmailAddressType' ) )
                    // InternalMyDsl.g:918:3: ( 'EmailAddressType' )
                    {
                     before(grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:919:3: ( 'EmailAddressType' )
                    // InternalMyDsl.g:919:4: 'EmailAddressType'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:923:2: ( ( 'PhoneType' ) )
                    {
                    // InternalMyDsl.g:923:2: ( ( 'PhoneType' ) )
                    // InternalMyDsl.g:924:3: ( 'PhoneType' )
                    {
                     before(grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:925:3: ( 'PhoneType' )
                    // InternalMyDsl.g:925:4: 'PhoneType'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:929:2: ( ( 'CountryType' ) )
                    {
                    // InternalMyDsl.g:929:2: ( ( 'CountryType' ) )
                    // InternalMyDsl.g:930:3: ( 'CountryType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7()); 
                    // InternalMyDsl.g:931:3: ( 'CountryType' )
                    // InternalMyDsl.g:931:4: 'CountryType'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:935:2: ( ( 'CityType' ) )
                    {
                    // InternalMyDsl.g:935:2: ( ( 'CityType' ) )
                    // InternalMyDsl.g:936:3: ( 'CityType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8()); 
                    // InternalMyDsl.g:937:3: ( 'CityType' )
                    // InternalMyDsl.g:937:4: 'CityType'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:941:2: ( ( 'CountryCodeType' ) )
                    {
                    // InternalMyDsl.g:941:2: ( ( 'CountryCodeType' ) )
                    // InternalMyDsl.g:942:3: ( 'CountryCodeType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9()); 
                    // InternalMyDsl.g:943:3: ( 'CountryCodeType' )
                    // InternalMyDsl.g:943:4: 'CountryCodeType'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:947:2: ( ( 'LatitudeType' ) )
                    {
                    // InternalMyDsl.g:947:2: ( ( 'LatitudeType' ) )
                    // InternalMyDsl.g:948:3: ( 'LatitudeType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10()); 
                    // InternalMyDsl.g:949:3: ( 'LatitudeType' )
                    // InternalMyDsl.g:949:4: 'LatitudeType'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:953:2: ( ( 'LongitudType' ) )
                    {
                    // InternalMyDsl.g:953:2: ( ( 'LongitudType' ) )
                    // InternalMyDsl.g:954:3: ( 'LongitudType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11()); 
                    // InternalMyDsl.g:955:3: ( 'LongitudType' )
                    // InternalMyDsl.g:955:4: 'LongitudType'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:959:2: ( ( 'RowNumberType' ) )
                    {
                    // InternalMyDsl.g:959:2: ( ( 'RowNumberType' ) )
                    // InternalMyDsl.g:960:3: ( 'RowNumberType' )
                    {
                     before(grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 
                    // InternalMyDsl.g:961:3: ( 'RowNumberType' )
                    // InternalMyDsl.g:961:4: 'RowNumberType'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:965:2: ( ( 'BooleanType' ) )
                    {
                    // InternalMyDsl.g:965:2: ( ( 'BooleanType' ) )
                    // InternalMyDsl.g:966:3: ( 'BooleanType' )
                    {
                     before(grammarAccess.getMockarooAccess().getBooleanTypeEnumLiteralDeclaration_13()); 
                    // InternalMyDsl.g:967:3: ( 'BooleanType' )
                    // InternalMyDsl.g:967:4: 'BooleanType'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalMyDsl.g:975:1: rule__TipoMetodoRest__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__TipoMetodoRest__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:979:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case 32:
                {
                alt11=3;
                }
                break;
            case 33:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:980:2: ( ( 'GET' ) )
                    {
                    // InternalMyDsl.g:980:2: ( ( 'GET' ) )
                    // InternalMyDsl.g:981:3: ( 'GET' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:982:3: ( 'GET' )
                    // InternalMyDsl.g:982:4: 'GET'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:986:2: ( ( 'POST' ) )
                    {
                    // InternalMyDsl.g:986:2: ( ( 'POST' ) )
                    // InternalMyDsl.g:987:3: ( 'POST' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:988:3: ( 'POST' )
                    // InternalMyDsl.g:988:4: 'POST'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:992:2: ( ( 'PUT' ) )
                    {
                    // InternalMyDsl.g:992:2: ( ( 'PUT' ) )
                    // InternalMyDsl.g:993:3: ( 'PUT' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:994:3: ( 'PUT' )
                    // InternalMyDsl.g:994:4: 'PUT'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:998:2: ( ( 'DELETE' ) )
                    {
                    // InternalMyDsl.g:998:2: ( ( 'DELETE' ) )
                    // InternalMyDsl.g:999:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1000:3: ( 'DELETE' )
                    // InternalMyDsl.g:1000:4: 'DELETE'
                    {
                    match(input,33,FOLLOW_2); 

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


    // $ANTLR start "rule__Api__Group__0"
    // InternalMyDsl.g:1008:1: rule__Api__Group__0 : rule__Api__Group__0__Impl rule__Api__Group__1 ;
    public final void rule__Api__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1012:1: ( rule__Api__Group__0__Impl rule__Api__Group__1 )
            // InternalMyDsl.g:1013:2: rule__Api__Group__0__Impl rule__Api__Group__1
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
    // InternalMyDsl.g:1020:1: rule__Api__Group__0__Impl : ( () ) ;
    public final void rule__Api__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1024:1: ( ( () ) )
            // InternalMyDsl.g:1025:1: ( () )
            {
            // InternalMyDsl.g:1025:1: ( () )
            // InternalMyDsl.g:1026:2: ()
            {
             before(grammarAccess.getApiAccess().getApiAction_0()); 
            // InternalMyDsl.g:1027:2: ()
            // InternalMyDsl.g:1027:3: 
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
    // InternalMyDsl.g:1035:1: rule__Api__Group__1 : rule__Api__Group__1__Impl rule__Api__Group__2 ;
    public final void rule__Api__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1039:1: ( rule__Api__Group__1__Impl rule__Api__Group__2 )
            // InternalMyDsl.g:1040:2: rule__Api__Group__1__Impl rule__Api__Group__2
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
    // InternalMyDsl.g:1047:1: rule__Api__Group__1__Impl : ( 'apiURL' ) ;
    public final void rule__Api__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1051:1: ( ( 'apiURL' ) )
            // InternalMyDsl.g:1052:1: ( 'apiURL' )
            {
            // InternalMyDsl.g:1052:1: ( 'apiURL' )
            // InternalMyDsl.g:1053:2: 'apiURL'
            {
             before(grammarAccess.getApiAccess().getApiURLKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:1062:1: rule__Api__Group__2 : rule__Api__Group__2__Impl rule__Api__Group__3 ;
    public final void rule__Api__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1066:1: ( rule__Api__Group__2__Impl rule__Api__Group__3 )
            // InternalMyDsl.g:1067:2: rule__Api__Group__2__Impl rule__Api__Group__3
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
    // InternalMyDsl.g:1074:1: rule__Api__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__Api__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1078:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1079:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1079:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1080:2: RULE_EQUAL
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
    // InternalMyDsl.g:1089:1: rule__Api__Group__3 : rule__Api__Group__3__Impl rule__Api__Group__4 ;
    public final void rule__Api__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1093:1: ( rule__Api__Group__3__Impl rule__Api__Group__4 )
            // InternalMyDsl.g:1094:2: rule__Api__Group__3__Impl rule__Api__Group__4
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
    // InternalMyDsl.g:1101:1: rule__Api__Group__3__Impl : ( ( rule__Api__UrlAssignment_3 ) ) ;
    public final void rule__Api__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1105:1: ( ( ( rule__Api__UrlAssignment_3 ) ) )
            // InternalMyDsl.g:1106:1: ( ( rule__Api__UrlAssignment_3 ) )
            {
            // InternalMyDsl.g:1106:1: ( ( rule__Api__UrlAssignment_3 ) )
            // InternalMyDsl.g:1107:2: ( rule__Api__UrlAssignment_3 )
            {
             before(grammarAccess.getApiAccess().getUrlAssignment_3()); 
            // InternalMyDsl.g:1108:2: ( rule__Api__UrlAssignment_3 )
            // InternalMyDsl.g:1108:3: rule__Api__UrlAssignment_3
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
    // InternalMyDsl.g:1116:1: rule__Api__Group__4 : rule__Api__Group__4__Impl rule__Api__Group__5 ;
    public final void rule__Api__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1120:1: ( rule__Api__Group__4__Impl rule__Api__Group__5 )
            // InternalMyDsl.g:1121:2: rule__Api__Group__4__Impl rule__Api__Group__5
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
    // InternalMyDsl.g:1128:1: rule__Api__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Api__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1132:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1133:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1133:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1134:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:1143:1: rule__Api__Group__5 : rule__Api__Group__5__Impl rule__Api__Group__6 ;
    public final void rule__Api__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1147:1: ( rule__Api__Group__5__Impl rule__Api__Group__6 )
            // InternalMyDsl.g:1148:2: rule__Api__Group__5__Impl rule__Api__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Api__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__6();

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
    // InternalMyDsl.g:1155:1: rule__Api__Group__5__Impl : ( ( rule__Api__EntidadesAssignment_5 )* ) ;
    public final void rule__Api__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1159:1: ( ( ( rule__Api__EntidadesAssignment_5 )* ) )
            // InternalMyDsl.g:1160:1: ( ( rule__Api__EntidadesAssignment_5 )* )
            {
            // InternalMyDsl.g:1160:1: ( ( rule__Api__EntidadesAssignment_5 )* )
            // InternalMyDsl.g:1161:2: ( rule__Api__EntidadesAssignment_5 )*
            {
             before(grammarAccess.getApiAccess().getEntidadesAssignment_5()); 
            // InternalMyDsl.g:1162:2: ( rule__Api__EntidadesAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==40||LA12_0==47) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1162:3: rule__Api__EntidadesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Api__EntidadesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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


    // $ANTLR start "rule__Api__Group__6"
    // InternalMyDsl.g:1170:1: rule__Api__Group__6 : rule__Api__Group__6__Impl rule__Api__Group__7 ;
    public final void rule__Api__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1174:1: ( rule__Api__Group__6__Impl rule__Api__Group__7 )
            // InternalMyDsl.g:1175:2: rule__Api__Group__6__Impl rule__Api__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Api__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__7();

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
    // $ANTLR end "rule__Api__Group__6"


    // $ANTLR start "rule__Api__Group__6__Impl"
    // InternalMyDsl.g:1182:1: rule__Api__Group__6__Impl : ( ( rule__Api__PrimitivetypesAssignment_6 )* ) ;
    public final void rule__Api__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1186:1: ( ( ( rule__Api__PrimitivetypesAssignment_6 )* ) )
            // InternalMyDsl.g:1187:1: ( ( rule__Api__PrimitivetypesAssignment_6 )* )
            {
            // InternalMyDsl.g:1187:1: ( ( rule__Api__PrimitivetypesAssignment_6 )* )
            // InternalMyDsl.g:1188:2: ( rule__Api__PrimitivetypesAssignment_6 )*
            {
             before(grammarAccess.getApiAccess().getPrimitivetypesAssignment_6()); 
            // InternalMyDsl.g:1189:2: ( rule__Api__PrimitivetypesAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=13 && LA13_0<=15)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1189:3: rule__Api__PrimitivetypesAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Api__PrimitivetypesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getApiAccess().getPrimitivetypesAssignment_6()); 

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
    // $ANTLR end "rule__Api__Group__6__Impl"


    // $ANTLR start "rule__Api__Group__7"
    // InternalMyDsl.g:1197:1: rule__Api__Group__7 : rule__Api__Group__7__Impl ;
    public final void rule__Api__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1201:1: ( rule__Api__Group__7__Impl )
            // InternalMyDsl.g:1202:2: rule__Api__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Api__Group__7__Impl();

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
    // $ANTLR end "rule__Api__Group__7"


    // $ANTLR start "rule__Api__Group__7__Impl"
    // InternalMyDsl.g:1208:1: rule__Api__Group__7__Impl : ( ( rule__Api__ServiciosRestAssignment_7 )* ) ;
    public final void rule__Api__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1212:1: ( ( ( rule__Api__ServiciosRestAssignment_7 )* ) )
            // InternalMyDsl.g:1213:1: ( ( rule__Api__ServiciosRestAssignment_7 )* )
            {
            // InternalMyDsl.g:1213:1: ( ( rule__Api__ServiciosRestAssignment_7 )* )
            // InternalMyDsl.g:1214:2: ( rule__Api__ServiciosRestAssignment_7 )*
            {
             before(grammarAccess.getApiAccess().getServiciosRestAssignment_7()); 
            // InternalMyDsl.g:1215:2: ( rule__Api__ServiciosRestAssignment_7 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=30 && LA14_0<=33)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1215:3: rule__Api__ServiciosRestAssignment_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Api__ServiciosRestAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getApiAccess().getServiciosRestAssignment_7()); 

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
    // $ANTLR end "rule__Api__Group__7__Impl"


    // $ANTLR start "rule__AtributoMocka__Group__0"
    // InternalMyDsl.g:1224:1: rule__AtributoMocka__Group__0 : rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1 ;
    public final void rule__AtributoMocka__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1228:1: ( rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1 )
            // InternalMyDsl.g:1229:2: rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1
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
    // InternalMyDsl.g:1236:1: rule__AtributoMocka__Group__0__Impl : ( ( rule__AtributoMocka__TipoAssignment_0 ) ) ;
    public final void rule__AtributoMocka__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1240:1: ( ( ( rule__AtributoMocka__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:1241:1: ( ( rule__AtributoMocka__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:1241:1: ( ( rule__AtributoMocka__TipoAssignment_0 ) )
            // InternalMyDsl.g:1242:2: ( rule__AtributoMocka__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:1243:2: ( rule__AtributoMocka__TipoAssignment_0 )
            // InternalMyDsl.g:1243:3: rule__AtributoMocka__TipoAssignment_0
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
    // InternalMyDsl.g:1251:1: rule__AtributoMocka__Group__1 : rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2 ;
    public final void rule__AtributoMocka__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1255:1: ( rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2 )
            // InternalMyDsl.g:1256:2: rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1263:1: rule__AtributoMocka__Group__1__Impl : ( ( rule__AtributoMocka__NombreAssignment_1 ) ) ;
    public final void rule__AtributoMocka__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1267:1: ( ( ( rule__AtributoMocka__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:1268:1: ( ( rule__AtributoMocka__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:1268:1: ( ( rule__AtributoMocka__NombreAssignment_1 ) )
            // InternalMyDsl.g:1269:2: ( rule__AtributoMocka__NombreAssignment_1 )
            {
             before(grammarAccess.getAtributoMockaAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:1270:2: ( rule__AtributoMocka__NombreAssignment_1 )
            // InternalMyDsl.g:1270:3: rule__AtributoMocka__NombreAssignment_1
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
    // InternalMyDsl.g:1278:1: rule__AtributoMocka__Group__2 : rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3 ;
    public final void rule__AtributoMocka__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1282:1: ( rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3 )
            // InternalMyDsl.g:1283:2: rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3
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
    // InternalMyDsl.g:1290:1: rule__AtributoMocka__Group__2__Impl : ( ( rule__AtributoMocka__Group_2__0 ) ) ;
    public final void rule__AtributoMocka__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1294:1: ( ( ( rule__AtributoMocka__Group_2__0 ) ) )
            // InternalMyDsl.g:1295:1: ( ( rule__AtributoMocka__Group_2__0 ) )
            {
            // InternalMyDsl.g:1295:1: ( ( rule__AtributoMocka__Group_2__0 ) )
            // InternalMyDsl.g:1296:2: ( rule__AtributoMocka__Group_2__0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getGroup_2()); 
            // InternalMyDsl.g:1297:2: ( rule__AtributoMocka__Group_2__0 )
            // InternalMyDsl.g:1297:3: rule__AtributoMocka__Group_2__0
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
    // InternalMyDsl.g:1305:1: rule__AtributoMocka__Group__3 : rule__AtributoMocka__Group__3__Impl ;
    public final void rule__AtributoMocka__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1309:1: ( rule__AtributoMocka__Group__3__Impl )
            // InternalMyDsl.g:1310:2: rule__AtributoMocka__Group__3__Impl
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
    // InternalMyDsl.g:1316:1: rule__AtributoMocka__Group__3__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoMocka__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1320:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1321:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1321:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1322:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:1332:1: rule__AtributoMocka__Group_2__0 : rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1 ;
    public final void rule__AtributoMocka__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1336:1: ( rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1 )
            // InternalMyDsl.g:1337:2: rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1344:1: rule__AtributoMocka__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtributoMocka__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1348:1: ( ( '(' ) )
            // InternalMyDsl.g:1349:1: ( '(' )
            {
            // InternalMyDsl.g:1349:1: ( '(' )
            // InternalMyDsl.g:1350:2: '('
            {
             before(grammarAccess.getAtributoMockaAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:1359:1: rule__AtributoMocka__Group_2__1 : rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2 ;
    public final void rule__AtributoMocka__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1363:1: ( rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2 )
            // InternalMyDsl.g:1364:2: rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1371:1: rule__AtributoMocka__Group_2__1__Impl : ( ( rule__AtributoMocka__Alternatives_2_1 ) ) ;
    public final void rule__AtributoMocka__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1375:1: ( ( ( rule__AtributoMocka__Alternatives_2_1 ) ) )
            // InternalMyDsl.g:1376:1: ( ( rule__AtributoMocka__Alternatives_2_1 ) )
            {
            // InternalMyDsl.g:1376:1: ( ( rule__AtributoMocka__Alternatives_2_1 ) )
            // InternalMyDsl.g:1377:2: ( rule__AtributoMocka__Alternatives_2_1 )
            {
             before(grammarAccess.getAtributoMockaAccess().getAlternatives_2_1()); 
            // InternalMyDsl.g:1378:2: ( rule__AtributoMocka__Alternatives_2_1 )
            // InternalMyDsl.g:1378:3: rule__AtributoMocka__Alternatives_2_1
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
    // InternalMyDsl.g:1386:1: rule__AtributoMocka__Group_2__2 : rule__AtributoMocka__Group_2__2__Impl ;
    public final void rule__AtributoMocka__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1390:1: ( rule__AtributoMocka__Group_2__2__Impl )
            // InternalMyDsl.g:1391:2: rule__AtributoMocka__Group_2__2__Impl
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
    // InternalMyDsl.g:1397:1: rule__AtributoMocka__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtributoMocka__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1401:1: ( ( ')' ) )
            // InternalMyDsl.g:1402:1: ( ')' )
            {
            // InternalMyDsl.g:1402:1: ( ')' )
            // InternalMyDsl.g:1403:2: ')'
            {
             before(grammarAccess.getAtributoMockaAccess().getRightParenthesisKeyword_2_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:1413:1: rule__AtributoMocka__Group_2_1_0__0 : rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1 ;
    public final void rule__AtributoMocka__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1417:1: ( rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1 )
            // InternalMyDsl.g:1418:2: rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1
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
    // InternalMyDsl.g:1425:1: rule__AtributoMocka__Group_2_1_0__0__Impl : ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1429:1: ( ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) ) )
            // InternalMyDsl.g:1430:1: ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) )
            {
            // InternalMyDsl.g:1430:1: ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) )
            // InternalMyDsl.g:1431:2: ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyAssignment_2_1_0_0()); 
            // InternalMyDsl.g:1432:2: ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 )
            // InternalMyDsl.g:1432:3: rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0
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
    // InternalMyDsl.g:1440:1: rule__AtributoMocka__Group_2_1_0__1 : rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2 ;
    public final void rule__AtributoMocka__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1444:1: ( rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2 )
            // InternalMyDsl.g:1445:2: rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1452:1: rule__AtributoMocka__Group_2_1_0__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__AtributoMocka__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1456:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1457:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1457:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1458:2: RULE_EQUAL
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
    // InternalMyDsl.g:1467:1: rule__AtributoMocka__Group_2_1_0__2 : rule__AtributoMocka__Group_2_1_0__2__Impl ;
    public final void rule__AtributoMocka__Group_2_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1471:1: ( rule__AtributoMocka__Group_2_1_0__2__Impl )
            // InternalMyDsl.g:1472:2: rule__AtributoMocka__Group_2_1_0__2__Impl
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
    // InternalMyDsl.g:1478:1: rule__AtributoMocka__Group_2_1_0__2__Impl : ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1482:1: ( ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) ) )
            // InternalMyDsl.g:1483:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) )
            {
            // InternalMyDsl.g:1483:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) )
            // InternalMyDsl.g:1484:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 )
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_0_2()); 
            // InternalMyDsl.g:1485:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 )
            // InternalMyDsl.g:1485:3: rule__AtributoMocka__MockTypeAssignment_2_1_0_2
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
    // InternalMyDsl.g:1494:1: rule__AtributoMocka__Group_2_1_1__0 : rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1 ;
    public final void rule__AtributoMocka__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1498:1: ( rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1 )
            // InternalMyDsl.g:1499:2: rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1
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
    // InternalMyDsl.g:1506:1: rule__AtributoMocka__Group_2_1_1__0__Impl : ( 'mockType' ) ;
    public final void rule__AtributoMocka__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1510:1: ( ( 'mockType' ) )
            // InternalMyDsl.g:1511:1: ( 'mockType' )
            {
            // InternalMyDsl.g:1511:1: ( 'mockType' )
            // InternalMyDsl.g:1512:2: 'mockType'
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeKeyword_2_1_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:1521:1: rule__AtributoMocka__Group_2_1_1__1 : rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2 ;
    public final void rule__AtributoMocka__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1525:1: ( rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2 )
            // InternalMyDsl.g:1526:2: rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1533:1: rule__AtributoMocka__Group_2_1_1__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__AtributoMocka__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1537:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1538:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1538:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1539:2: RULE_EQUAL
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
    // InternalMyDsl.g:1548:1: rule__AtributoMocka__Group_2_1_1__2 : rule__AtributoMocka__Group_2_1_1__2__Impl ;
    public final void rule__AtributoMocka__Group_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1552:1: ( rule__AtributoMocka__Group_2_1_1__2__Impl )
            // InternalMyDsl.g:1553:2: rule__AtributoMocka__Group_2_1_1__2__Impl
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
    // InternalMyDsl.g:1559:1: rule__AtributoMocka__Group_2_1_1__2__Impl : ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1563:1: ( ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) ) )
            // InternalMyDsl.g:1564:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) )
            {
            // InternalMyDsl.g:1564:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) )
            // InternalMyDsl.g:1565:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 )
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_1_2()); 
            // InternalMyDsl.g:1566:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 )
            // InternalMyDsl.g:1566:3: rule__AtributoMocka__MockTypeAssignment_2_1_1_2
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
    // InternalMyDsl.g:1575:1: rule__AtributoArreglo__Group__0 : rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1 ;
    public final void rule__AtributoArreglo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1579:1: ( rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1 )
            // InternalMyDsl.g:1580:2: rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1587:1: rule__AtributoArreglo__Group__0__Impl : ( ( rule__AtributoArreglo__TipoAssignment_0 ) ) ;
    public final void rule__AtributoArreglo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1591:1: ( ( ( rule__AtributoArreglo__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:1592:1: ( ( rule__AtributoArreglo__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:1592:1: ( ( rule__AtributoArreglo__TipoAssignment_0 ) )
            // InternalMyDsl.g:1593:2: ( rule__AtributoArreglo__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoArregloAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:1594:2: ( rule__AtributoArreglo__TipoAssignment_0 )
            // InternalMyDsl.g:1594:3: rule__AtributoArreglo__TipoAssignment_0
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
    // InternalMyDsl.g:1602:1: rule__AtributoArreglo__Group__1 : rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2 ;
    public final void rule__AtributoArreglo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1606:1: ( rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2 )
            // InternalMyDsl.g:1607:2: rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1614:1: rule__AtributoArreglo__Group__1__Impl : ( '[' ) ;
    public final void rule__AtributoArreglo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1618:1: ( ( '[' ) )
            // InternalMyDsl.g:1619:1: ( '[' )
            {
            // InternalMyDsl.g:1619:1: ( '[' )
            // InternalMyDsl.g:1620:2: '['
            {
             before(grammarAccess.getAtributoArregloAccess().getLeftSquareBracketKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:1629:1: rule__AtributoArreglo__Group__2 : rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3 ;
    public final void rule__AtributoArreglo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1633:1: ( rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3 )
            // InternalMyDsl.g:1634:2: rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3
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
    // InternalMyDsl.g:1641:1: rule__AtributoArreglo__Group__2__Impl : ( ']' ) ;
    public final void rule__AtributoArreglo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1645:1: ( ( ']' ) )
            // InternalMyDsl.g:1646:1: ( ']' )
            {
            // InternalMyDsl.g:1646:1: ( ']' )
            // InternalMyDsl.g:1647:2: ']'
            {
             before(grammarAccess.getAtributoArregloAccess().getRightSquareBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:1656:1: rule__AtributoArreglo__Group__3 : rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4 ;
    public final void rule__AtributoArreglo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1660:1: ( rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4 )
            // InternalMyDsl.g:1661:2: rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4
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
    // InternalMyDsl.g:1668:1: rule__AtributoArreglo__Group__3__Impl : ( ( rule__AtributoArreglo__NombreAssignment_3 ) ) ;
    public final void rule__AtributoArreglo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1672:1: ( ( ( rule__AtributoArreglo__NombreAssignment_3 ) ) )
            // InternalMyDsl.g:1673:1: ( ( rule__AtributoArreglo__NombreAssignment_3 ) )
            {
            // InternalMyDsl.g:1673:1: ( ( rule__AtributoArreglo__NombreAssignment_3 ) )
            // InternalMyDsl.g:1674:2: ( rule__AtributoArreglo__NombreAssignment_3 )
            {
             before(grammarAccess.getAtributoArregloAccess().getNombreAssignment_3()); 
            // InternalMyDsl.g:1675:2: ( rule__AtributoArreglo__NombreAssignment_3 )
            // InternalMyDsl.g:1675:3: rule__AtributoArreglo__NombreAssignment_3
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
    // InternalMyDsl.g:1683:1: rule__AtributoArreglo__Group__4 : rule__AtributoArreglo__Group__4__Impl ;
    public final void rule__AtributoArreglo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1687:1: ( rule__AtributoArreglo__Group__4__Impl )
            // InternalMyDsl.g:1688:2: rule__AtributoArreglo__Group__4__Impl
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
    // InternalMyDsl.g:1694:1: rule__AtributoArreglo__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoArreglo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1698:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1699:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1699:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1700:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:1710:1: rule__AtributoSimple__Group__0 : rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 ;
    public final void rule__AtributoSimple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1714:1: ( rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 )
            // InternalMyDsl.g:1715:2: rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1
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
    // InternalMyDsl.g:1722:1: rule__AtributoSimple__Group__0__Impl : ( ( rule__AtributoSimple__TipoAssignment_0 ) ) ;
    public final void rule__AtributoSimple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1726:1: ( ( ( rule__AtributoSimple__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:1727:1: ( ( rule__AtributoSimple__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:1727:1: ( ( rule__AtributoSimple__TipoAssignment_0 ) )
            // InternalMyDsl.g:1728:2: ( rule__AtributoSimple__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:1729:2: ( rule__AtributoSimple__TipoAssignment_0 )
            // InternalMyDsl.g:1729:3: rule__AtributoSimple__TipoAssignment_0
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
    // InternalMyDsl.g:1737:1: rule__AtributoSimple__Group__1 : rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 ;
    public final void rule__AtributoSimple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1741:1: ( rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 )
            // InternalMyDsl.g:1742:2: rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2
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
    // InternalMyDsl.g:1749:1: rule__AtributoSimple__Group__1__Impl : ( ( rule__AtributoSimple__NombreAssignment_1 ) ) ;
    public final void rule__AtributoSimple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1753:1: ( ( ( rule__AtributoSimple__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:1754:1: ( ( rule__AtributoSimple__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:1754:1: ( ( rule__AtributoSimple__NombreAssignment_1 ) )
            // InternalMyDsl.g:1755:2: ( rule__AtributoSimple__NombreAssignment_1 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:1756:2: ( rule__AtributoSimple__NombreAssignment_1 )
            // InternalMyDsl.g:1756:3: rule__AtributoSimple__NombreAssignment_1
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
    // InternalMyDsl.g:1764:1: rule__AtributoSimple__Group__2 : rule__AtributoSimple__Group__2__Impl ;
    public final void rule__AtributoSimple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1768:1: ( rule__AtributoSimple__Group__2__Impl )
            // InternalMyDsl.g:1769:2: rule__AtributoSimple__Group__2__Impl
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
    // InternalMyDsl.g:1775:1: rule__AtributoSimple__Group__2__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoSimple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1779:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1780:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1780:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1781:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:1791:1: rule__MockarooEntity__Group__0 : rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1 ;
    public final void rule__MockarooEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1795:1: ( rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1 )
            // InternalMyDsl.g:1796:2: rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1
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
    // InternalMyDsl.g:1803:1: rule__MockarooEntity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__MockarooEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1807:1: ( ( 'Entity' ) )
            // InternalMyDsl.g:1808:1: ( 'Entity' )
            {
            // InternalMyDsl.g:1808:1: ( 'Entity' )
            // InternalMyDsl.g:1809:2: 'Entity'
            {
             before(grammarAccess.getMockarooEntityAccess().getEntityKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:1818:1: rule__MockarooEntity__Group__1 : rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2 ;
    public final void rule__MockarooEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1822:1: ( rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2 )
            // InternalMyDsl.g:1823:2: rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1830:1: rule__MockarooEntity__Group__1__Impl : ( ( rule__MockarooEntity__NombreAssignment_1 ) ) ;
    public final void rule__MockarooEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( ( ( rule__MockarooEntity__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:1835:1: ( ( rule__MockarooEntity__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:1835:1: ( ( rule__MockarooEntity__NombreAssignment_1 ) )
            // InternalMyDsl.g:1836:2: ( rule__MockarooEntity__NombreAssignment_1 )
            {
             before(grammarAccess.getMockarooEntityAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:1837:2: ( rule__MockarooEntity__NombreAssignment_1 )
            // InternalMyDsl.g:1837:3: rule__MockarooEntity__NombreAssignment_1
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
    // InternalMyDsl.g:1845:1: rule__MockarooEntity__Group__2 : rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3 ;
    public final void rule__MockarooEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1849:1: ( rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3 )
            // InternalMyDsl.g:1850:2: rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1857:1: rule__MockarooEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__MockarooEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1861:1: ( ( '{' ) )
            // InternalMyDsl.g:1862:1: ( '{' )
            {
            // InternalMyDsl.g:1862:1: ( '{' )
            // InternalMyDsl.g:1863:2: '{'
            {
             before(grammarAccess.getMockarooEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:1872:1: rule__MockarooEntity__Group__3 : rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4 ;
    public final void rule__MockarooEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1876:1: ( rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4 )
            // InternalMyDsl.g:1877:2: rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1884:1: rule__MockarooEntity__Group__3__Impl : ( ( rule__MockarooEntity__AtributosAssignment_3 )* ) ;
    public final void rule__MockarooEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1888:1: ( ( ( rule__MockarooEntity__AtributosAssignment_3 )* ) )
            // InternalMyDsl.g:1889:1: ( ( rule__MockarooEntity__AtributosAssignment_3 )* )
            {
            // InternalMyDsl.g:1889:1: ( ( rule__MockarooEntity__AtributosAssignment_3 )* )
            // InternalMyDsl.g:1890:2: ( rule__MockarooEntity__AtributosAssignment_3 )*
            {
             before(grammarAccess.getMockarooEntityAccess().getAtributosAssignment_3()); 
            // InternalMyDsl.g:1891:2: ( rule__MockarooEntity__AtributosAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=13 && LA15_0<=15)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1891:3: rule__MockarooEntity__AtributosAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__MockarooEntity__AtributosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMyDsl.g:1899:1: rule__MockarooEntity__Group__4 : rule__MockarooEntity__Group__4__Impl ;
    public final void rule__MockarooEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1903:1: ( rule__MockarooEntity__Group__4__Impl )
            // InternalMyDsl.g:1904:2: rule__MockarooEntity__Group__4__Impl
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
    // InternalMyDsl.g:1910:1: rule__MockarooEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__MockarooEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1914:1: ( ( '}' ) )
            // InternalMyDsl.g:1915:1: ( '}' )
            {
            // InternalMyDsl.g:1915:1: ( '}' )
            // InternalMyDsl.g:1916:2: '}'
            {
             before(grammarAccess.getMockarooEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_2); 
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


    // $ANTLR start "rule__ServicioRest__Group__0"
    // InternalMyDsl.g:1926:1: rule__ServicioRest__Group__0 : rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1 ;
    public final void rule__ServicioRest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1930:1: ( rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1 )
            // InternalMyDsl.g:1931:2: rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ServicioRest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__1();

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
    // $ANTLR end "rule__ServicioRest__Group__0"


    // $ANTLR start "rule__ServicioRest__Group__0__Impl"
    // InternalMyDsl.g:1938:1: rule__ServicioRest__Group__0__Impl : ( ( rule__ServicioRest__MetodoAssignment_0 ) ) ;
    public final void rule__ServicioRest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1942:1: ( ( ( rule__ServicioRest__MetodoAssignment_0 ) ) )
            // InternalMyDsl.g:1943:1: ( ( rule__ServicioRest__MetodoAssignment_0 ) )
            {
            // InternalMyDsl.g:1943:1: ( ( rule__ServicioRest__MetodoAssignment_0 ) )
            // InternalMyDsl.g:1944:2: ( rule__ServicioRest__MetodoAssignment_0 )
            {
             before(grammarAccess.getServicioRestAccess().getMetodoAssignment_0()); 
            // InternalMyDsl.g:1945:2: ( rule__ServicioRest__MetodoAssignment_0 )
            // InternalMyDsl.g:1945:3: rule__ServicioRest__MetodoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__MetodoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getServicioRestAccess().getMetodoAssignment_0()); 

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
    // $ANTLR end "rule__ServicioRest__Group__0__Impl"


    // $ANTLR start "rule__ServicioRest__Group__1"
    // InternalMyDsl.g:1953:1: rule__ServicioRest__Group__1 : rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2 ;
    public final void rule__ServicioRest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1957:1: ( rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2 )
            // InternalMyDsl.g:1958:2: rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ServicioRest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__2();

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
    // $ANTLR end "rule__ServicioRest__Group__1"


    // $ANTLR start "rule__ServicioRest__Group__1__Impl"
    // InternalMyDsl.g:1965:1: rule__ServicioRest__Group__1__Impl : ( ( rule__ServicioRest__NombreAssignment_1 ) ) ;
    public final void rule__ServicioRest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1969:1: ( ( ( rule__ServicioRest__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:1970:1: ( ( rule__ServicioRest__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:1970:1: ( ( rule__ServicioRest__NombreAssignment_1 ) )
            // InternalMyDsl.g:1971:2: ( rule__ServicioRest__NombreAssignment_1 )
            {
             before(grammarAccess.getServicioRestAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:1972:2: ( rule__ServicioRest__NombreAssignment_1 )
            // InternalMyDsl.g:1972:3: rule__ServicioRest__NombreAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServicioRestAccess().getNombreAssignment_1()); 

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
    // $ANTLR end "rule__ServicioRest__Group__1__Impl"


    // $ANTLR start "rule__ServicioRest__Group__2"
    // InternalMyDsl.g:1980:1: rule__ServicioRest__Group__2 : rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3 ;
    public final void rule__ServicioRest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1984:1: ( rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3 )
            // InternalMyDsl.g:1985:2: rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ServicioRest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__3();

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
    // $ANTLR end "rule__ServicioRest__Group__2"


    // $ANTLR start "rule__ServicioRest__Group__2__Impl"
    // InternalMyDsl.g:1992:1: rule__ServicioRest__Group__2__Impl : ( '{' ) ;
    public final void rule__ServicioRest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1996:1: ( ( '{' ) )
            // InternalMyDsl.g:1997:1: ( '{' )
            {
            // InternalMyDsl.g:1997:1: ( '{' )
            // InternalMyDsl.g:1998:2: '{'
            {
             before(grammarAccess.getServicioRestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ServicioRest__Group__2__Impl"


    // $ANTLR start "rule__ServicioRest__Group__3"
    // InternalMyDsl.g:2007:1: rule__ServicioRest__Group__3 : rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4 ;
    public final void rule__ServicioRest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2011:1: ( rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4 )
            // InternalMyDsl.g:2012:2: rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ServicioRest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__4();

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
    // $ANTLR end "rule__ServicioRest__Group__3"


    // $ANTLR start "rule__ServicioRest__Group__3__Impl"
    // InternalMyDsl.g:2019:1: rule__ServicioRest__Group__3__Impl : ( 'URL' ) ;
    public final void rule__ServicioRest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2023:1: ( ( 'URL' ) )
            // InternalMyDsl.g:2024:1: ( 'URL' )
            {
            // InternalMyDsl.g:2024:1: ( 'URL' )
            // InternalMyDsl.g:2025:2: 'URL'
            {
             before(grammarAccess.getServicioRestAccess().getURLKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getURLKeyword_3()); 

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
    // $ANTLR end "rule__ServicioRest__Group__3__Impl"


    // $ANTLR start "rule__ServicioRest__Group__4"
    // InternalMyDsl.g:2034:1: rule__ServicioRest__Group__4 : rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5 ;
    public final void rule__ServicioRest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2038:1: ( rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5 )
            // InternalMyDsl.g:2039:2: rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__ServicioRest__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__5();

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
    // $ANTLR end "rule__ServicioRest__Group__4"


    // $ANTLR start "rule__ServicioRest__Group__4__Impl"
    // InternalMyDsl.g:2046:1: rule__ServicioRest__Group__4__Impl : ( RULE_EQUAL ) ;
    public final void rule__ServicioRest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2050:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:2051:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:2051:1: ( RULE_EQUAL )
            // InternalMyDsl.g:2052:2: RULE_EQUAL
            {
             before(grammarAccess.getServicioRestAccess().getEQUALTerminalRuleCall_4()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getEQUALTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__ServicioRest__Group__4__Impl"


    // $ANTLR start "rule__ServicioRest__Group__5"
    // InternalMyDsl.g:2061:1: rule__ServicioRest__Group__5 : rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6 ;
    public final void rule__ServicioRest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2065:1: ( rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6 )
            // InternalMyDsl.g:2066:2: rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__ServicioRest__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__6();

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
    // $ANTLR end "rule__ServicioRest__Group__5"


    // $ANTLR start "rule__ServicioRest__Group__5__Impl"
    // InternalMyDsl.g:2073:1: rule__ServicioRest__Group__5__Impl : ( '/' ) ;
    public final void rule__ServicioRest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2077:1: ( ( '/' ) )
            // InternalMyDsl.g:2078:1: ( '/' )
            {
            // InternalMyDsl.g:2078:1: ( '/' )
            // InternalMyDsl.g:2079:2: '/'
            {
             before(grammarAccess.getServicioRestAccess().getSolidusKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getSolidusKeyword_5()); 

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
    // $ANTLR end "rule__ServicioRest__Group__5__Impl"


    // $ANTLR start "rule__ServicioRest__Group__6"
    // InternalMyDsl.g:2088:1: rule__ServicioRest__Group__6 : rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7 ;
    public final void rule__ServicioRest__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2092:1: ( rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7 )
            // InternalMyDsl.g:2093:2: rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__ServicioRest__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__7();

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
    // $ANTLR end "rule__ServicioRest__Group__6"


    // $ANTLR start "rule__ServicioRest__Group__6__Impl"
    // InternalMyDsl.g:2100:1: rule__ServicioRest__Group__6__Impl : ( ( rule__ServicioRest__UrlAssignment_6 ) ) ;
    public final void rule__ServicioRest__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2104:1: ( ( ( rule__ServicioRest__UrlAssignment_6 ) ) )
            // InternalMyDsl.g:2105:1: ( ( rule__ServicioRest__UrlAssignment_6 ) )
            {
            // InternalMyDsl.g:2105:1: ( ( rule__ServicioRest__UrlAssignment_6 ) )
            // InternalMyDsl.g:2106:2: ( rule__ServicioRest__UrlAssignment_6 )
            {
             before(grammarAccess.getServicioRestAccess().getUrlAssignment_6()); 
            // InternalMyDsl.g:2107:2: ( rule__ServicioRest__UrlAssignment_6 )
            // InternalMyDsl.g:2107:3: rule__ServicioRest__UrlAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__UrlAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getServicioRestAccess().getUrlAssignment_6()); 

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
    // $ANTLR end "rule__ServicioRest__Group__6__Impl"


    // $ANTLR start "rule__ServicioRest__Group__7"
    // InternalMyDsl.g:2115:1: rule__ServicioRest__Group__7 : rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8 ;
    public final void rule__ServicioRest__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2119:1: ( rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8 )
            // InternalMyDsl.g:2120:2: rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__ServicioRest__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__8();

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
    // $ANTLR end "rule__ServicioRest__Group__7"


    // $ANTLR start "rule__ServicioRest__Group__7__Impl"
    // InternalMyDsl.g:2127:1: rule__ServicioRest__Group__7__Impl : ( ( rule__ServicioRest__Alternatives_7 )* ) ;
    public final void rule__ServicioRest__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2131:1: ( ( ( rule__ServicioRest__Alternatives_7 )* ) )
            // InternalMyDsl.g:2132:1: ( ( rule__ServicioRest__Alternatives_7 )* )
            {
            // InternalMyDsl.g:2132:1: ( ( rule__ServicioRest__Alternatives_7 )* )
            // InternalMyDsl.g:2133:2: ( rule__ServicioRest__Alternatives_7 )*
            {
             before(grammarAccess.getServicioRestAccess().getAlternatives_7()); 
            // InternalMyDsl.g:2134:2: ( rule__ServicioRest__Alternatives_7 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=44 && LA16_0<=46)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:2134:3: rule__ServicioRest__Alternatives_7
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ServicioRest__Alternatives_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getServicioRestAccess().getAlternatives_7()); 

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
    // $ANTLR end "rule__ServicioRest__Group__7__Impl"


    // $ANTLR start "rule__ServicioRest__Group__8"
    // InternalMyDsl.g:2142:1: rule__ServicioRest__Group__8 : rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9 ;
    public final void rule__ServicioRest__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2146:1: ( rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9 )
            // InternalMyDsl.g:2147:2: rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__ServicioRest__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__9();

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
    // $ANTLR end "rule__ServicioRest__Group__8"


    // $ANTLR start "rule__ServicioRest__Group__8__Impl"
    // InternalMyDsl.g:2154:1: rule__ServicioRest__Group__8__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__ServicioRest__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2158:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2159:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2159:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2160:2: RULE_SEMICOLON
            {
             before(grammarAccess.getServicioRestAccess().getSEMICOLONTerminalRuleCall_8()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getSEMICOLONTerminalRuleCall_8()); 

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
    // $ANTLR end "rule__ServicioRest__Group__8__Impl"


    // $ANTLR start "rule__ServicioRest__Group__9"
    // InternalMyDsl.g:2169:1: rule__ServicioRest__Group__9 : rule__ServicioRest__Group__9__Impl rule__ServicioRest__Group__10 ;
    public final void rule__ServicioRest__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2173:1: ( rule__ServicioRest__Group__9__Impl rule__ServicioRest__Group__10 )
            // InternalMyDsl.g:2174:2: rule__ServicioRest__Group__9__Impl rule__ServicioRest__Group__10
            {
            pushFollow(FOLLOW_23);
            rule__ServicioRest__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__10();

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
    // $ANTLR end "rule__ServicioRest__Group__9"


    // $ANTLR start "rule__ServicioRest__Group__9__Impl"
    // InternalMyDsl.g:2181:1: rule__ServicioRest__Group__9__Impl : ( ( rule__ServicioRest__RequestAssignment_9 )? ) ;
    public final void rule__ServicioRest__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2185:1: ( ( ( rule__ServicioRest__RequestAssignment_9 )? ) )
            // InternalMyDsl.g:2186:1: ( ( rule__ServicioRest__RequestAssignment_9 )? )
            {
            // InternalMyDsl.g:2186:1: ( ( rule__ServicioRest__RequestAssignment_9 )? )
            // InternalMyDsl.g:2187:2: ( rule__ServicioRest__RequestAssignment_9 )?
            {
             before(grammarAccess.getServicioRestAccess().getRequestAssignment_9()); 
            // InternalMyDsl.g:2188:2: ( rule__ServicioRest__RequestAssignment_9 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==50) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2188:3: rule__ServicioRest__RequestAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServicioRest__RequestAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServicioRestAccess().getRequestAssignment_9()); 

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
    // $ANTLR end "rule__ServicioRest__Group__9__Impl"


    // $ANTLR start "rule__ServicioRest__Group__10"
    // InternalMyDsl.g:2196:1: rule__ServicioRest__Group__10 : rule__ServicioRest__Group__10__Impl rule__ServicioRest__Group__11 ;
    public final void rule__ServicioRest__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2200:1: ( rule__ServicioRest__Group__10__Impl rule__ServicioRest__Group__11 )
            // InternalMyDsl.g:2201:2: rule__ServicioRest__Group__10__Impl rule__ServicioRest__Group__11
            {
            pushFollow(FOLLOW_24);
            rule__ServicioRest__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__11();

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
    // $ANTLR end "rule__ServicioRest__Group__10"


    // $ANTLR start "rule__ServicioRest__Group__10__Impl"
    // InternalMyDsl.g:2208:1: rule__ServicioRest__Group__10__Impl : ( ( rule__ServicioRest__ResponseAssignment_10 ) ) ;
    public final void rule__ServicioRest__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2212:1: ( ( ( rule__ServicioRest__ResponseAssignment_10 ) ) )
            // InternalMyDsl.g:2213:1: ( ( rule__ServicioRest__ResponseAssignment_10 ) )
            {
            // InternalMyDsl.g:2213:1: ( ( rule__ServicioRest__ResponseAssignment_10 ) )
            // InternalMyDsl.g:2214:2: ( rule__ServicioRest__ResponseAssignment_10 )
            {
             before(grammarAccess.getServicioRestAccess().getResponseAssignment_10()); 
            // InternalMyDsl.g:2215:2: ( rule__ServicioRest__ResponseAssignment_10 )
            // InternalMyDsl.g:2215:3: rule__ServicioRest__ResponseAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__ResponseAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getServicioRestAccess().getResponseAssignment_10()); 

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
    // $ANTLR end "rule__ServicioRest__Group__10__Impl"


    // $ANTLR start "rule__ServicioRest__Group__11"
    // InternalMyDsl.g:2223:1: rule__ServicioRest__Group__11 : rule__ServicioRest__Group__11__Impl ;
    public final void rule__ServicioRest__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2227:1: ( rule__ServicioRest__Group__11__Impl )
            // InternalMyDsl.g:2228:2: rule__ServicioRest__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__11__Impl();

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
    // $ANTLR end "rule__ServicioRest__Group__11"


    // $ANTLR start "rule__ServicioRest__Group__11__Impl"
    // InternalMyDsl.g:2234:1: rule__ServicioRest__Group__11__Impl : ( '}' ) ;
    public final void rule__ServicioRest__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2238:1: ( ( '}' ) )
            // InternalMyDsl.g:2239:1: ( '}' )
            {
            // InternalMyDsl.g:2239:1: ( '}' )
            // InternalMyDsl.g:2240:2: '}'
            {
             before(grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_11()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__ServicioRest__Group__11__Impl"


    // $ANTLR start "rule__ServicioRest__Group_7_1__0"
    // InternalMyDsl.g:2250:1: rule__ServicioRest__Group_7_1__0 : rule__ServicioRest__Group_7_1__0__Impl rule__ServicioRest__Group_7_1__1 ;
    public final void rule__ServicioRest__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2254:1: ( rule__ServicioRest__Group_7_1__0__Impl rule__ServicioRest__Group_7_1__1 )
            // InternalMyDsl.g:2255:2: rule__ServicioRest__Group_7_1__0__Impl rule__ServicioRest__Group_7_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ServicioRest__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group_7_1__1();

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
    // $ANTLR end "rule__ServicioRest__Group_7_1__0"


    // $ANTLR start "rule__ServicioRest__Group_7_1__0__Impl"
    // InternalMyDsl.g:2262:1: rule__ServicioRest__Group_7_1__0__Impl : ( '/' ) ;
    public final void rule__ServicioRest__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2266:1: ( ( '/' ) )
            // InternalMyDsl.g:2267:1: ( '/' )
            {
            // InternalMyDsl.g:2267:1: ( '/' )
            // InternalMyDsl.g:2268:2: '/'
            {
             before(grammarAccess.getServicioRestAccess().getSolidusKeyword_7_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getSolidusKeyword_7_1_0()); 

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
    // $ANTLR end "rule__ServicioRest__Group_7_1__0__Impl"


    // $ANTLR start "rule__ServicioRest__Group_7_1__1"
    // InternalMyDsl.g:2277:1: rule__ServicioRest__Group_7_1__1 : rule__ServicioRest__Group_7_1__1__Impl ;
    public final void rule__ServicioRest__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2281:1: ( rule__ServicioRest__Group_7_1__1__Impl )
            // InternalMyDsl.g:2282:2: rule__ServicioRest__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group_7_1__1__Impl();

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
    // $ANTLR end "rule__ServicioRest__Group_7_1__1"


    // $ANTLR start "rule__ServicioRest__Group_7_1__1__Impl"
    // InternalMyDsl.g:2288:1: rule__ServicioRest__Group_7_1__1__Impl : ( ruleEString ) ;
    public final void rule__ServicioRest__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2292:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2293:1: ( ruleEString )
            {
            // InternalMyDsl.g:2293:1: ( ruleEString )
            // InternalMyDsl.g:2294:2: ruleEString
            {
             before(grammarAccess.getServicioRestAccess().getEStringParserRuleCall_7_1_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServicioRestAccess().getEStringParserRuleCall_7_1_1()); 

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
    // $ANTLR end "rule__ServicioRest__Group_7_1__1__Impl"


    // $ANTLR start "rule__QueryParam__Group__0"
    // InternalMyDsl.g:2304:1: rule__QueryParam__Group__0 : rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1 ;
    public final void rule__QueryParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2308:1: ( rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1 )
            // InternalMyDsl.g:2309:2: rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__QueryParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__1();

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
    // $ANTLR end "rule__QueryParam__Group__0"


    // $ANTLR start "rule__QueryParam__Group__0__Impl"
    // InternalMyDsl.g:2316:1: rule__QueryParam__Group__0__Impl : ( '?${' ) ;
    public final void rule__QueryParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2320:1: ( ( '?${' ) )
            // InternalMyDsl.g:2321:1: ( '?${' )
            {
            // InternalMyDsl.g:2321:1: ( '?${' )
            // InternalMyDsl.g:2322:2: '?${'
            {
             before(grammarAccess.getQueryParamAccess().getQuestionMarkDollarSignLeftCurlyBracketKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getQueryParamAccess().getQuestionMarkDollarSignLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__QueryParam__Group__0__Impl"


    // $ANTLR start "rule__QueryParam__Group__1"
    // InternalMyDsl.g:2331:1: rule__QueryParam__Group__1 : rule__QueryParam__Group__1__Impl rule__QueryParam__Group__2 ;
    public final void rule__QueryParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2335:1: ( rule__QueryParam__Group__1__Impl rule__QueryParam__Group__2 )
            // InternalMyDsl.g:2336:2: rule__QueryParam__Group__1__Impl rule__QueryParam__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__QueryParam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__2();

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
    // $ANTLR end "rule__QueryParam__Group__1"


    // $ANTLR start "rule__QueryParam__Group__1__Impl"
    // InternalMyDsl.g:2343:1: rule__QueryParam__Group__1__Impl : ( ( rule__QueryParam__NombreAssignment_1 ) ) ;
    public final void rule__QueryParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2347:1: ( ( ( rule__QueryParam__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:2348:1: ( ( rule__QueryParam__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:2348:1: ( ( rule__QueryParam__NombreAssignment_1 ) )
            // InternalMyDsl.g:2349:2: ( rule__QueryParam__NombreAssignment_1 )
            {
             before(grammarAccess.getQueryParamAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:2350:2: ( rule__QueryParam__NombreAssignment_1 )
            // InternalMyDsl.g:2350:3: rule__QueryParam__NombreAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryParamAccess().getNombreAssignment_1()); 

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
    // $ANTLR end "rule__QueryParam__Group__1__Impl"


    // $ANTLR start "rule__QueryParam__Group__2"
    // InternalMyDsl.g:2358:1: rule__QueryParam__Group__2 : rule__QueryParam__Group__2__Impl ;
    public final void rule__QueryParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2362:1: ( rule__QueryParam__Group__2__Impl )
            // InternalMyDsl.g:2363:2: rule__QueryParam__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__2__Impl();

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
    // $ANTLR end "rule__QueryParam__Group__2"


    // $ANTLR start "rule__QueryParam__Group__2__Impl"
    // InternalMyDsl.g:2369:1: rule__QueryParam__Group__2__Impl : ( '}' ) ;
    public final void rule__QueryParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2373:1: ( ( '}' ) )
            // InternalMyDsl.g:2374:1: ( '}' )
            {
            // InternalMyDsl.g:2374:1: ( '}' )
            // InternalMyDsl.g:2375:2: '}'
            {
             before(grammarAccess.getQueryParamAccess().getRightCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getQueryParamAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__QueryParam__Group__2__Impl"


    // $ANTLR start "rule__PathParam__Group__0"
    // InternalMyDsl.g:2385:1: rule__PathParam__Group__0 : rule__PathParam__Group__0__Impl rule__PathParam__Group__1 ;
    public final void rule__PathParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2389:1: ( rule__PathParam__Group__0__Impl rule__PathParam__Group__1 )
            // InternalMyDsl.g:2390:2: rule__PathParam__Group__0__Impl rule__PathParam__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PathParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathParam__Group__1();

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
    // $ANTLR end "rule__PathParam__Group__0"


    // $ANTLR start "rule__PathParam__Group__0__Impl"
    // InternalMyDsl.g:2397:1: rule__PathParam__Group__0__Impl : ( '/:{' ) ;
    public final void rule__PathParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2401:1: ( ( '/:{' ) )
            // InternalMyDsl.g:2402:1: ( '/:{' )
            {
            // InternalMyDsl.g:2402:1: ( '/:{' )
            // InternalMyDsl.g:2403:2: '/:{'
            {
             before(grammarAccess.getPathParamAccess().getSolidusColonLeftCurlyBracketKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPathParamAccess().getSolidusColonLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__PathParam__Group__0__Impl"


    // $ANTLR start "rule__PathParam__Group__1"
    // InternalMyDsl.g:2412:1: rule__PathParam__Group__1 : rule__PathParam__Group__1__Impl rule__PathParam__Group__2 ;
    public final void rule__PathParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2416:1: ( rule__PathParam__Group__1__Impl rule__PathParam__Group__2 )
            // InternalMyDsl.g:2417:2: rule__PathParam__Group__1__Impl rule__PathParam__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__PathParam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathParam__Group__2();

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
    // $ANTLR end "rule__PathParam__Group__1"


    // $ANTLR start "rule__PathParam__Group__1__Impl"
    // InternalMyDsl.g:2424:1: rule__PathParam__Group__1__Impl : ( ( rule__PathParam__NombreAssignment_1 ) ) ;
    public final void rule__PathParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2428:1: ( ( ( rule__PathParam__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:2429:1: ( ( rule__PathParam__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:2429:1: ( ( rule__PathParam__NombreAssignment_1 ) )
            // InternalMyDsl.g:2430:2: ( rule__PathParam__NombreAssignment_1 )
            {
             before(grammarAccess.getPathParamAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:2431:2: ( rule__PathParam__NombreAssignment_1 )
            // InternalMyDsl.g:2431:3: rule__PathParam__NombreAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PathParam__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPathParamAccess().getNombreAssignment_1()); 

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
    // $ANTLR end "rule__PathParam__Group__1__Impl"


    // $ANTLR start "rule__PathParam__Group__2"
    // InternalMyDsl.g:2439:1: rule__PathParam__Group__2 : rule__PathParam__Group__2__Impl ;
    public final void rule__PathParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2443:1: ( rule__PathParam__Group__2__Impl )
            // InternalMyDsl.g:2444:2: rule__PathParam__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PathParam__Group__2__Impl();

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
    // $ANTLR end "rule__PathParam__Group__2"


    // $ANTLR start "rule__PathParam__Group__2__Impl"
    // InternalMyDsl.g:2450:1: rule__PathParam__Group__2__Impl : ( '}' ) ;
    public final void rule__PathParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2454:1: ( ( '}' ) )
            // InternalMyDsl.g:2455:1: ( '}' )
            {
            // InternalMyDsl.g:2455:1: ( '}' )
            // InternalMyDsl.g:2456:2: '}'
            {
             before(grammarAccess.getPathParamAccess().getRightCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPathParamAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__PathParam__Group__2__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__0"
    // InternalMyDsl.g:2466:1: rule__SimpleEntity__Group__0 : rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 ;
    public final void rule__SimpleEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2470:1: ( rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 )
            // InternalMyDsl.g:2471:2: rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1
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
    // InternalMyDsl.g:2478:1: rule__SimpleEntity__Group__0__Impl : ( 'SimpleEntity' ) ;
    public final void rule__SimpleEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2482:1: ( ( 'SimpleEntity' ) )
            // InternalMyDsl.g:2483:1: ( 'SimpleEntity' )
            {
            // InternalMyDsl.g:2483:1: ( 'SimpleEntity' )
            // InternalMyDsl.g:2484:2: 'SimpleEntity'
            {
             before(grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:2493:1: rule__SimpleEntity__Group__1 : rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 ;
    public final void rule__SimpleEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2497:1: ( rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 )
            // InternalMyDsl.g:2498:2: rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2505:1: rule__SimpleEntity__Group__1__Impl : ( ( rule__SimpleEntity__NombreAssignment_1 ) ) ;
    public final void rule__SimpleEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2509:1: ( ( ( rule__SimpleEntity__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:2510:1: ( ( rule__SimpleEntity__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:2510:1: ( ( rule__SimpleEntity__NombreAssignment_1 ) )
            // InternalMyDsl.g:2511:2: ( rule__SimpleEntity__NombreAssignment_1 )
            {
             before(grammarAccess.getSimpleEntityAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:2512:2: ( rule__SimpleEntity__NombreAssignment_1 )
            // InternalMyDsl.g:2512:3: rule__SimpleEntity__NombreAssignment_1
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
    // InternalMyDsl.g:2520:1: rule__SimpleEntity__Group__2 : rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 ;
    public final void rule__SimpleEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2524:1: ( rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 )
            // InternalMyDsl.g:2525:2: rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2532:1: rule__SimpleEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__SimpleEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2536:1: ( ( '{' ) )
            // InternalMyDsl.g:2537:1: ( '{' )
            {
            // InternalMyDsl.g:2537:1: ( '{' )
            // InternalMyDsl.g:2538:2: '{'
            {
             before(grammarAccess.getSimpleEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:2547:1: rule__SimpleEntity__Group__3 : rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 ;
    public final void rule__SimpleEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2551:1: ( rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 )
            // InternalMyDsl.g:2552:2: rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2559:1: rule__SimpleEntity__Group__3__Impl : ( ( rule__SimpleEntity__AtributosAssignment_3 )* ) ;
    public final void rule__SimpleEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2563:1: ( ( ( rule__SimpleEntity__AtributosAssignment_3 )* ) )
            // InternalMyDsl.g:2564:1: ( ( rule__SimpleEntity__AtributosAssignment_3 )* )
            {
            // InternalMyDsl.g:2564:1: ( ( rule__SimpleEntity__AtributosAssignment_3 )* )
            // InternalMyDsl.g:2565:2: ( rule__SimpleEntity__AtributosAssignment_3 )*
            {
             before(grammarAccess.getSimpleEntityAccess().getAtributosAssignment_3()); 
            // InternalMyDsl.g:2566:2: ( rule__SimpleEntity__AtributosAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=13 && LA18_0<=15)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:2566:3: rule__SimpleEntity__AtributosAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SimpleEntity__AtributosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMyDsl.g:2574:1: rule__SimpleEntity__Group__4 : rule__SimpleEntity__Group__4__Impl ;
    public final void rule__SimpleEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2578:1: ( rule__SimpleEntity__Group__4__Impl )
            // InternalMyDsl.g:2579:2: rule__SimpleEntity__Group__4__Impl
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
    // InternalMyDsl.g:2585:1: rule__SimpleEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__SimpleEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2589:1: ( ( '}' ) )
            // InternalMyDsl.g:2590:1: ( '}' )
            {
            // InternalMyDsl.g:2590:1: ( '}' )
            // InternalMyDsl.g:2591:2: '}'
            {
             before(grammarAccess.getSimpleEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_2); 
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


    // $ANTLR start "rule__Response__Group__0"
    // InternalMyDsl.g:2601:1: rule__Response__Group__0 : rule__Response__Group__0__Impl rule__Response__Group__1 ;
    public final void rule__Response__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2605:1: ( rule__Response__Group__0__Impl rule__Response__Group__1 )
            // InternalMyDsl.g:2606:2: rule__Response__Group__0__Impl rule__Response__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2613:1: rule__Response__Group__0__Impl : ( 'Response' ) ;
    public final void rule__Response__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2617:1: ( ( 'Response' ) )
            // InternalMyDsl.g:2618:1: ( 'Response' )
            {
            // InternalMyDsl.g:2618:1: ( 'Response' )
            // InternalMyDsl.g:2619:2: 'Response'
            {
             before(grammarAccess.getResponseAccess().getResponseKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:2628:1: rule__Response__Group__1 : rule__Response__Group__1__Impl rule__Response__Group__2 ;
    public final void rule__Response__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2632:1: ( rule__Response__Group__1__Impl rule__Response__Group__2 )
            // InternalMyDsl.g:2633:2: rule__Response__Group__1__Impl rule__Response__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2640:1: rule__Response__Group__1__Impl : ( '{' ) ;
    public final void rule__Response__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2644:1: ( ( '{' ) )
            // InternalMyDsl.g:2645:1: ( '{' )
            {
            // InternalMyDsl.g:2645:1: ( '{' )
            // InternalMyDsl.g:2646:2: '{'
            {
             before(grammarAccess.getResponseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:2655:1: rule__Response__Group__2 : rule__Response__Group__2__Impl rule__Response__Group__3 ;
    public final void rule__Response__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2659:1: ( rule__Response__Group__2__Impl rule__Response__Group__3 )
            // InternalMyDsl.g:2660:2: rule__Response__Group__2__Impl rule__Response__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2667:1: rule__Response__Group__2__Impl : ( 'Type' ) ;
    public final void rule__Response__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2671:1: ( ( 'Type' ) )
            // InternalMyDsl.g:2672:1: ( 'Type' )
            {
            // InternalMyDsl.g:2672:1: ( 'Type' )
            // InternalMyDsl.g:2673:2: 'Type'
            {
             before(grammarAccess.getResponseAccess().getTypeKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getTypeKeyword_2()); 

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
    // InternalMyDsl.g:2682:1: rule__Response__Group__3 : rule__Response__Group__3__Impl rule__Response__Group__4 ;
    public final void rule__Response__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2686:1: ( rule__Response__Group__3__Impl rule__Response__Group__4 )
            // InternalMyDsl.g:2687:2: rule__Response__Group__3__Impl rule__Response__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2694:1: rule__Response__Group__3__Impl : ( RULE_EQUAL ) ;
    public final void rule__Response__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2698:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:2699:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:2699:1: ( RULE_EQUAL )
            // InternalMyDsl.g:2700:2: RULE_EQUAL
            {
             before(grammarAccess.getResponseAccess().getEQUALTerminalRuleCall_3()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getEQUALTerminalRuleCall_3()); 

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
    // InternalMyDsl.g:2709:1: rule__Response__Group__4 : rule__Response__Group__4__Impl rule__Response__Group__5 ;
    public final void rule__Response__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2713:1: ( rule__Response__Group__4__Impl rule__Response__Group__5 )
            // InternalMyDsl.g:2714:2: rule__Response__Group__4__Impl rule__Response__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2721:1: rule__Response__Group__4__Impl : ( ( rule__Response__TypeAssignment_4 ) ) ;
    public final void rule__Response__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2725:1: ( ( ( rule__Response__TypeAssignment_4 ) ) )
            // InternalMyDsl.g:2726:1: ( ( rule__Response__TypeAssignment_4 ) )
            {
            // InternalMyDsl.g:2726:1: ( ( rule__Response__TypeAssignment_4 ) )
            // InternalMyDsl.g:2727:2: ( rule__Response__TypeAssignment_4 )
            {
             before(grammarAccess.getResponseAccess().getTypeAssignment_4()); 
            // InternalMyDsl.g:2728:2: ( rule__Response__TypeAssignment_4 )
            // InternalMyDsl.g:2728:3: rule__Response__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Response__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getTypeAssignment_4()); 

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
    // InternalMyDsl.g:2736:1: rule__Response__Group__5 : rule__Response__Group__5__Impl rule__Response__Group__6 ;
    public final void rule__Response__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2740:1: ( rule__Response__Group__5__Impl rule__Response__Group__6 )
            // InternalMyDsl.g:2741:2: rule__Response__Group__5__Impl rule__Response__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2748:1: rule__Response__Group__5__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Response__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2752:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2753:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2753:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2754:2: RULE_SEMICOLON
            {
             before(grammarAccess.getResponseAccess().getSEMICOLONTerminalRuleCall_5()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getSEMICOLONTerminalRuleCall_5()); 

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
    // InternalMyDsl.g:2763:1: rule__Response__Group__6 : rule__Response__Group__6__Impl ;
    public final void rule__Response__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2767:1: ( rule__Response__Group__6__Impl )
            // InternalMyDsl.g:2768:2: rule__Response__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group__6__Impl();

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
    // InternalMyDsl.g:2774:1: rule__Response__Group__6__Impl : ( '}' ) ;
    public final void rule__Response__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2778:1: ( ( '}' ) )
            // InternalMyDsl.g:2779:1: ( '}' )
            {
            // InternalMyDsl.g:2779:1: ( '}' )
            // InternalMyDsl.g:2780:2: '}'
            {
             before(grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_2); 
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


    // $ANTLR start "rule__Request__Group__0"
    // InternalMyDsl.g:2790:1: rule__Request__Group__0 : rule__Request__Group__0__Impl rule__Request__Group__1 ;
    public final void rule__Request__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2794:1: ( rule__Request__Group__0__Impl rule__Request__Group__1 )
            // InternalMyDsl.g:2795:2: rule__Request__Group__0__Impl rule__Request__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Request__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__1();

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
    // $ANTLR end "rule__Request__Group__0"


    // $ANTLR start "rule__Request__Group__0__Impl"
    // InternalMyDsl.g:2802:1: rule__Request__Group__0__Impl : ( 'Request' ) ;
    public final void rule__Request__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2806:1: ( ( 'Request' ) )
            // InternalMyDsl.g:2807:1: ( 'Request' )
            {
            // InternalMyDsl.g:2807:1: ( 'Request' )
            // InternalMyDsl.g:2808:2: 'Request'
            {
             before(grammarAccess.getRequestAccess().getRequestKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getRequestKeyword_0()); 

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
    // $ANTLR end "rule__Request__Group__0__Impl"


    // $ANTLR start "rule__Request__Group__1"
    // InternalMyDsl.g:2817:1: rule__Request__Group__1 : rule__Request__Group__1__Impl rule__Request__Group__2 ;
    public final void rule__Request__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2821:1: ( rule__Request__Group__1__Impl rule__Request__Group__2 )
            // InternalMyDsl.g:2822:2: rule__Request__Group__1__Impl rule__Request__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Request__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__2();

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
    // $ANTLR end "rule__Request__Group__1"


    // $ANTLR start "rule__Request__Group__1__Impl"
    // InternalMyDsl.g:2829:1: rule__Request__Group__1__Impl : ( '{' ) ;
    public final void rule__Request__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2833:1: ( ( '{' ) )
            // InternalMyDsl.g:2834:1: ( '{' )
            {
            // InternalMyDsl.g:2834:1: ( '{' )
            // InternalMyDsl.g:2835:2: '{'
            {
             before(grammarAccess.getRequestAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Request__Group__1__Impl"


    // $ANTLR start "rule__Request__Group__2"
    // InternalMyDsl.g:2844:1: rule__Request__Group__2 : rule__Request__Group__2__Impl rule__Request__Group__3 ;
    public final void rule__Request__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2848:1: ( rule__Request__Group__2__Impl rule__Request__Group__3 )
            // InternalMyDsl.g:2849:2: rule__Request__Group__2__Impl rule__Request__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Request__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__3();

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
    // $ANTLR end "rule__Request__Group__2"


    // $ANTLR start "rule__Request__Group__2__Impl"
    // InternalMyDsl.g:2856:1: rule__Request__Group__2__Impl : ( 'Type' ) ;
    public final void rule__Request__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2860:1: ( ( 'Type' ) )
            // InternalMyDsl.g:2861:1: ( 'Type' )
            {
            // InternalMyDsl.g:2861:1: ( 'Type' )
            // InternalMyDsl.g:2862:2: 'Type'
            {
             before(grammarAccess.getRequestAccess().getTypeKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getTypeKeyword_2()); 

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
    // $ANTLR end "rule__Request__Group__2__Impl"


    // $ANTLR start "rule__Request__Group__3"
    // InternalMyDsl.g:2871:1: rule__Request__Group__3 : rule__Request__Group__3__Impl rule__Request__Group__4 ;
    public final void rule__Request__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2875:1: ( rule__Request__Group__3__Impl rule__Request__Group__4 )
            // InternalMyDsl.g:2876:2: rule__Request__Group__3__Impl rule__Request__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Request__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__4();

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
    // $ANTLR end "rule__Request__Group__3"


    // $ANTLR start "rule__Request__Group__3__Impl"
    // InternalMyDsl.g:2883:1: rule__Request__Group__3__Impl : ( RULE_EQUAL ) ;
    public final void rule__Request__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2887:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:2888:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:2888:1: ( RULE_EQUAL )
            // InternalMyDsl.g:2889:2: RULE_EQUAL
            {
             before(grammarAccess.getRequestAccess().getEQUALTerminalRuleCall_3()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getEQUALTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__Request__Group__3__Impl"


    // $ANTLR start "rule__Request__Group__4"
    // InternalMyDsl.g:2898:1: rule__Request__Group__4 : rule__Request__Group__4__Impl rule__Request__Group__5 ;
    public final void rule__Request__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2902:1: ( rule__Request__Group__4__Impl rule__Request__Group__5 )
            // InternalMyDsl.g:2903:2: rule__Request__Group__4__Impl rule__Request__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Request__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__5();

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
    // $ANTLR end "rule__Request__Group__4"


    // $ANTLR start "rule__Request__Group__4__Impl"
    // InternalMyDsl.g:2910:1: rule__Request__Group__4__Impl : ( ( rule__Request__TypeAssignment_4 ) ) ;
    public final void rule__Request__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2914:1: ( ( ( rule__Request__TypeAssignment_4 ) ) )
            // InternalMyDsl.g:2915:1: ( ( rule__Request__TypeAssignment_4 ) )
            {
            // InternalMyDsl.g:2915:1: ( ( rule__Request__TypeAssignment_4 ) )
            // InternalMyDsl.g:2916:2: ( rule__Request__TypeAssignment_4 )
            {
             before(grammarAccess.getRequestAccess().getTypeAssignment_4()); 
            // InternalMyDsl.g:2917:2: ( rule__Request__TypeAssignment_4 )
            // InternalMyDsl.g:2917:3: rule__Request__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Request__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRequestAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__Request__Group__4__Impl"


    // $ANTLR start "rule__Request__Group__5"
    // InternalMyDsl.g:2925:1: rule__Request__Group__5 : rule__Request__Group__5__Impl rule__Request__Group__6 ;
    public final void rule__Request__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2929:1: ( rule__Request__Group__5__Impl rule__Request__Group__6 )
            // InternalMyDsl.g:2930:2: rule__Request__Group__5__Impl rule__Request__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Request__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__6();

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
    // $ANTLR end "rule__Request__Group__5"


    // $ANTLR start "rule__Request__Group__5__Impl"
    // InternalMyDsl.g:2937:1: rule__Request__Group__5__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Request__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2941:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2942:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2942:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2943:2: RULE_SEMICOLON
            {
             before(grammarAccess.getRequestAccess().getSEMICOLONTerminalRuleCall_5()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getSEMICOLONTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__Request__Group__5__Impl"


    // $ANTLR start "rule__Request__Group__6"
    // InternalMyDsl.g:2952:1: rule__Request__Group__6 : rule__Request__Group__6__Impl ;
    public final void rule__Request__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2956:1: ( rule__Request__Group__6__Impl )
            // InternalMyDsl.g:2957:2: rule__Request__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Request__Group__6__Impl();

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
    // $ANTLR end "rule__Request__Group__6"


    // $ANTLR start "rule__Request__Group__6__Impl"
    // InternalMyDsl.g:2963:1: rule__Request__Group__6__Impl : ( '}' ) ;
    public final void rule__Request__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2967:1: ( ( '}' ) )
            // InternalMyDsl.g:2968:1: ( '}' )
            {
            // InternalMyDsl.g:2968:1: ( '}' )
            // InternalMyDsl.g:2969:2: '}'
            {
             before(grammarAccess.getRequestAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Request__Group__6__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalMyDsl.g:2979:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2983:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalMyDsl.g:2984:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

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
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalMyDsl.g:2991:1: rule__Type__Group__0__Impl : ( ( rule__Type__Alternatives_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2995:1: ( ( ( rule__Type__Alternatives_0 ) ) )
            // InternalMyDsl.g:2996:1: ( ( rule__Type__Alternatives_0 ) )
            {
            // InternalMyDsl.g:2996:1: ( ( rule__Type__Alternatives_0 ) )
            // InternalMyDsl.g:2997:2: ( rule__Type__Alternatives_0 )
            {
             before(grammarAccess.getTypeAccess().getAlternatives_0()); 
            // InternalMyDsl.g:2998:2: ( rule__Type__Alternatives_0 )
            // InternalMyDsl.g:2998:3: rule__Type__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalMyDsl.g:3006:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3010:1: ( rule__Type__Group__1__Impl )
            // InternalMyDsl.g:3011:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__1__Impl();

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
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalMyDsl.g:3017:1: rule__Type__Group__1__Impl : ( ( rule__Type__Group_1__0 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3021:1: ( ( ( rule__Type__Group_1__0 )? ) )
            // InternalMyDsl.g:3022:1: ( ( rule__Type__Group_1__0 )? )
            {
            // InternalMyDsl.g:3022:1: ( ( rule__Type__Group_1__0 )? )
            // InternalMyDsl.g:3023:2: ( rule__Type__Group_1__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_1()); 
            // InternalMyDsl.g:3024:2: ( rule__Type__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:3024:3: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // InternalMyDsl.g:3033:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3037:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalMyDsl.g:3038:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1();

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
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // InternalMyDsl.g:3045:1: rule__Type__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3049:1: ( ( '[' ) )
            // InternalMyDsl.g:3050:1: ( '[' )
            {
            // InternalMyDsl.g:3050:1: ( '[' )
            // InternalMyDsl.g:3051:2: '['
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // InternalMyDsl.g:3060:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3064:1: ( rule__Type__Group_1__1__Impl )
            // InternalMyDsl.g:3065:2: rule__Type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1__Impl();

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
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // InternalMyDsl.g:3071:1: rule__Type__Group_1__1__Impl : ( ']' ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3075:1: ( ( ']' ) )
            // InternalMyDsl.g:3076:1: ( ']' )
            {
            // InternalMyDsl.g:3076:1: ( ']' )
            // InternalMyDsl.g:3077:2: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_1()); 

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
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Mapping__Group__0"
    // InternalMyDsl.g:3087:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3091:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalMyDsl.g:3092:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:3099:1: rule__Mapping__Group__0__Impl : ( 'Mapping' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3103:1: ( ( 'Mapping' ) )
            // InternalMyDsl.g:3104:1: ( 'Mapping' )
            {
            // InternalMyDsl.g:3104:1: ( 'Mapping' )
            // InternalMyDsl.g:3105:2: 'Mapping'
            {
             before(grammarAccess.getMappingAccess().getMappingKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:3114:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3118:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalMyDsl.g:3119:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3126:1: rule__Mapping__Group__1__Impl : ( '{' ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3130:1: ( ( '{' ) )
            // InternalMyDsl.g:3131:1: ( '{' )
            {
            // InternalMyDsl.g:3131:1: ( '{' )
            // InternalMyDsl.g:3132:2: '{'
            {
             before(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:3141:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3145:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // InternalMyDsl.g:3146:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
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
    // InternalMyDsl.g:3153:1: rule__Mapping__Group__2__Impl : ( 'value' ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3157:1: ( ( 'value' ) )
            // InternalMyDsl.g:3158:1: ( 'value' )
            {
            // InternalMyDsl.g:3158:1: ( 'value' )
            // InternalMyDsl.g:3159:2: 'value'
            {
             before(grammarAccess.getMappingAccess().getValueKeyword_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:3168:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3172:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // InternalMyDsl.g:3173:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:3180:1: rule__Mapping__Group__3__Impl : ( ( rule__Mapping__ValueAssignment_3 ) ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3184:1: ( ( ( rule__Mapping__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:3185:1: ( ( rule__Mapping__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:3185:1: ( ( rule__Mapping__ValueAssignment_3 ) )
            // InternalMyDsl.g:3186:2: ( rule__Mapping__ValueAssignment_3 )
            {
             before(grammarAccess.getMappingAccess().getValueAssignment_3()); 
            // InternalMyDsl.g:3187:2: ( rule__Mapping__ValueAssignment_3 )
            // InternalMyDsl.g:3187:3: rule__Mapping__ValueAssignment_3
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
    // InternalMyDsl.g:3195:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3199:1: ( rule__Mapping__Group__4__Impl )
            // InternalMyDsl.g:3200:2: rule__Mapping__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__4__Impl();

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
    // InternalMyDsl.g:3206:1: rule__Mapping__Group__4__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3210:1: ( ( '}' ) )
            // InternalMyDsl.g:3211:1: ( '}' )
            {
            // InternalMyDsl.g:3211:1: ( '}' )
            // InternalMyDsl.g:3212:2: '}'
            {
             before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__Asercion__Group__0"
    // InternalMyDsl.g:3222:1: rule__Asercion__Group__0 : rule__Asercion__Group__0__Impl rule__Asercion__Group__1 ;
    public final void rule__Asercion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3226:1: ( rule__Asercion__Group__0__Impl rule__Asercion__Group__1 )
            // InternalMyDsl.g:3227:2: rule__Asercion__Group__0__Impl rule__Asercion__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:3234:1: rule__Asercion__Group__0__Impl : ( 'Asercion' ) ;
    public final void rule__Asercion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3238:1: ( ( 'Asercion' ) )
            // InternalMyDsl.g:3239:1: ( 'Asercion' )
            {
            // InternalMyDsl.g:3239:1: ( 'Asercion' )
            // InternalMyDsl.g:3240:2: 'Asercion'
            {
             before(grammarAccess.getAsercionAccess().getAsercionKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:3249:1: rule__Asercion__Group__1 : rule__Asercion__Group__1__Impl rule__Asercion__Group__2 ;
    public final void rule__Asercion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3253:1: ( rule__Asercion__Group__1__Impl rule__Asercion__Group__2 )
            // InternalMyDsl.g:3254:2: rule__Asercion__Group__1__Impl rule__Asercion__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3261:1: rule__Asercion__Group__1__Impl : ( '{' ) ;
    public final void rule__Asercion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3265:1: ( ( '{' ) )
            // InternalMyDsl.g:3266:1: ( '{' )
            {
            // InternalMyDsl.g:3266:1: ( '{' )
            // InternalMyDsl.g:3267:2: '{'
            {
             before(grammarAccess.getAsercionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:3276:1: rule__Asercion__Group__2 : rule__Asercion__Group__2__Impl rule__Asercion__Group__3 ;
    public final void rule__Asercion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3280:1: ( rule__Asercion__Group__2__Impl rule__Asercion__Group__3 )
            // InternalMyDsl.g:3281:2: rule__Asercion__Group__2__Impl rule__Asercion__Group__3
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
    // InternalMyDsl.g:3288:1: rule__Asercion__Group__2__Impl : ( 'elemento1' ) ;
    public final void rule__Asercion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3292:1: ( ( 'elemento1' ) )
            // InternalMyDsl.g:3293:1: ( 'elemento1' )
            {
            // InternalMyDsl.g:3293:1: ( 'elemento1' )
            // InternalMyDsl.g:3294:2: 'elemento1'
            {
             before(grammarAccess.getAsercionAccess().getElemento1Keyword_2()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMyDsl.g:3303:1: rule__Asercion__Group__3 : rule__Asercion__Group__3__Impl rule__Asercion__Group__4 ;
    public final void rule__Asercion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3307:1: ( rule__Asercion__Group__3__Impl rule__Asercion__Group__4 )
            // InternalMyDsl.g:3308:2: rule__Asercion__Group__3__Impl rule__Asercion__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3315:1: rule__Asercion__Group__3__Impl : ( ( rule__Asercion__Elemento1Assignment_3 ) ) ;
    public final void rule__Asercion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3319:1: ( ( ( rule__Asercion__Elemento1Assignment_3 ) ) )
            // InternalMyDsl.g:3320:1: ( ( rule__Asercion__Elemento1Assignment_3 ) )
            {
            // InternalMyDsl.g:3320:1: ( ( rule__Asercion__Elemento1Assignment_3 ) )
            // InternalMyDsl.g:3321:2: ( rule__Asercion__Elemento1Assignment_3 )
            {
             before(grammarAccess.getAsercionAccess().getElemento1Assignment_3()); 
            // InternalMyDsl.g:3322:2: ( rule__Asercion__Elemento1Assignment_3 )
            // InternalMyDsl.g:3322:3: rule__Asercion__Elemento1Assignment_3
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
    // InternalMyDsl.g:3330:1: rule__Asercion__Group__4 : rule__Asercion__Group__4__Impl rule__Asercion__Group__5 ;
    public final void rule__Asercion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3334:1: ( rule__Asercion__Group__4__Impl rule__Asercion__Group__5 )
            // InternalMyDsl.g:3335:2: rule__Asercion__Group__4__Impl rule__Asercion__Group__5
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
    // InternalMyDsl.g:3342:1: rule__Asercion__Group__4__Impl : ( 'elemento2' ) ;
    public final void rule__Asercion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3346:1: ( ( 'elemento2' ) )
            // InternalMyDsl.g:3347:1: ( 'elemento2' )
            {
            // InternalMyDsl.g:3347:1: ( 'elemento2' )
            // InternalMyDsl.g:3348:2: 'elemento2'
            {
             before(grammarAccess.getAsercionAccess().getElemento2Keyword_4()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMyDsl.g:3357:1: rule__Asercion__Group__5 : rule__Asercion__Group__5__Impl rule__Asercion__Group__6 ;
    public final void rule__Asercion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3361:1: ( rule__Asercion__Group__5__Impl rule__Asercion__Group__6 )
            // InternalMyDsl.g:3362:2: rule__Asercion__Group__5__Impl rule__Asercion__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:3369:1: rule__Asercion__Group__5__Impl : ( ( rule__Asercion__Elemento2Assignment_5 ) ) ;
    public final void rule__Asercion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3373:1: ( ( ( rule__Asercion__Elemento2Assignment_5 ) ) )
            // InternalMyDsl.g:3374:1: ( ( rule__Asercion__Elemento2Assignment_5 ) )
            {
            // InternalMyDsl.g:3374:1: ( ( rule__Asercion__Elemento2Assignment_5 ) )
            // InternalMyDsl.g:3375:2: ( rule__Asercion__Elemento2Assignment_5 )
            {
             before(grammarAccess.getAsercionAccess().getElemento2Assignment_5()); 
            // InternalMyDsl.g:3376:2: ( rule__Asercion__Elemento2Assignment_5 )
            // InternalMyDsl.g:3376:3: rule__Asercion__Elemento2Assignment_5
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
    // InternalMyDsl.g:3384:1: rule__Asercion__Group__6 : rule__Asercion__Group__6__Impl ;
    public final void rule__Asercion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3388:1: ( rule__Asercion__Group__6__Impl )
            // InternalMyDsl.g:3389:2: rule__Asercion__Group__6__Impl
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
    // InternalMyDsl.g:3395:1: rule__Asercion__Group__6__Impl : ( '}' ) ;
    public final void rule__Asercion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3399:1: ( ( '}' ) )
            // InternalMyDsl.g:3400:1: ( '}' )
            {
            // InternalMyDsl.g:3400:1: ( '}' )
            // InternalMyDsl.g:3401:2: '}'
            {
             before(grammarAccess.getAsercionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_2); 
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


    // $ANTLR start "rule__Api__UrlAssignment_3"
    // InternalMyDsl.g:3411:1: rule__Api__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Api__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3415:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3416:2: ( ruleEString )
            {
            // InternalMyDsl.g:3416:2: ( ruleEString )
            // InternalMyDsl.g:3417:3: ruleEString
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
    // InternalMyDsl.g:3426:1: rule__Api__EntidadesAssignment_5 : ( ruleEntidad ) ;
    public final void rule__Api__EntidadesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3430:1: ( ( ruleEntidad ) )
            // InternalMyDsl.g:3431:2: ( ruleEntidad )
            {
            // InternalMyDsl.g:3431:2: ( ruleEntidad )
            // InternalMyDsl.g:3432:3: ruleEntidad
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


    // $ANTLR start "rule__Api__PrimitivetypesAssignment_6"
    // InternalMyDsl.g:3441:1: rule__Api__PrimitivetypesAssignment_6 : ( rulePrimitiveType ) ;
    public final void rule__Api__PrimitivetypesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3445:1: ( ( rulePrimitiveType ) )
            // InternalMyDsl.g:3446:2: ( rulePrimitiveType )
            {
            // InternalMyDsl.g:3446:2: ( rulePrimitiveType )
            // InternalMyDsl.g:3447:3: rulePrimitiveType
            {
             before(grammarAccess.getApiAccess().getPrimitivetypesPrimitiveTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getApiAccess().getPrimitivetypesPrimitiveTypeParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Api__PrimitivetypesAssignment_6"


    // $ANTLR start "rule__Api__ServiciosRestAssignment_7"
    // InternalMyDsl.g:3456:1: rule__Api__ServiciosRestAssignment_7 : ( ruleServicioRest ) ;
    public final void rule__Api__ServiciosRestAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3460:1: ( ( ruleServicioRest ) )
            // InternalMyDsl.g:3461:2: ( ruleServicioRest )
            {
            // InternalMyDsl.g:3461:2: ( ruleServicioRest )
            // InternalMyDsl.g:3462:3: ruleServicioRest
            {
             before(grammarAccess.getApiAccess().getServiciosRestServicioRestParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleServicioRest();

            state._fsp--;

             after(grammarAccess.getApiAccess().getServiciosRestServicioRestParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Api__ServiciosRestAssignment_7"


    // $ANTLR start "rule__AtributoMocka__TipoAssignment_0"
    // InternalMyDsl.g:3471:1: rule__AtributoMocka__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoMocka__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3475:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:3476:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:3476:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:3477:3: ruleTipoAtributo
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
    // InternalMyDsl.g:3486:1: rule__AtributoMocka__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__AtributoMocka__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3490:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3491:2: ( ruleEString )
            {
            // InternalMyDsl.g:3491:2: ( ruleEString )
            // InternalMyDsl.g:3492:3: ruleEString
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
    // InternalMyDsl.g:3501:1: rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 : ( ( 'PK,mockType' ) ) ;
    public final void rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3505:1: ( ( ( 'PK,mockType' ) ) )
            // InternalMyDsl.g:3506:2: ( ( 'PK,mockType' ) )
            {
            // InternalMyDsl.g:3506:2: ( ( 'PK,mockType' ) )
            // InternalMyDsl.g:3507:3: ( 'PK,mockType' )
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 
            // InternalMyDsl.g:3508:3: ( 'PK,mockType' )
            // InternalMyDsl.g:3509:4: 'PK,mockType'
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMyDsl.g:3520:1: rule__AtributoMocka__MockTypeAssignment_2_1_0_2 : ( ruleMockaroo ) ;
    public final void rule__AtributoMocka__MockTypeAssignment_2_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3524:1: ( ( ruleMockaroo ) )
            // InternalMyDsl.g:3525:2: ( ruleMockaroo )
            {
            // InternalMyDsl.g:3525:2: ( ruleMockaroo )
            // InternalMyDsl.g:3526:3: ruleMockaroo
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
    // InternalMyDsl.g:3535:1: rule__AtributoMocka__MockTypeAssignment_2_1_1_2 : ( ruleMockaroo ) ;
    public final void rule__AtributoMocka__MockTypeAssignment_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3539:1: ( ( ruleMockaroo ) )
            // InternalMyDsl.g:3540:2: ( ruleMockaroo )
            {
            // InternalMyDsl.g:3540:2: ( ruleMockaroo )
            // InternalMyDsl.g:3541:3: ruleMockaroo
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
    // InternalMyDsl.g:3550:1: rule__AtributoArreglo__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoArreglo__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3554:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:3555:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:3555:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:3556:3: ruleTipoAtributo
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
    // InternalMyDsl.g:3565:1: rule__AtributoArreglo__NombreAssignment_3 : ( ruleEString ) ;
    public final void rule__AtributoArreglo__NombreAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3569:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3570:2: ( ruleEString )
            {
            // InternalMyDsl.g:3570:2: ( ruleEString )
            // InternalMyDsl.g:3571:3: ruleEString
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
    // InternalMyDsl.g:3580:1: rule__AtributoSimple__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoSimple__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3584:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:3585:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:3585:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:3586:3: ruleTipoAtributo
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
    // InternalMyDsl.g:3595:1: rule__AtributoSimple__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__AtributoSimple__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3599:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3600:2: ( ruleEString )
            {
            // InternalMyDsl.g:3600:2: ( ruleEString )
            // InternalMyDsl.g:3601:3: ruleEString
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
    // InternalMyDsl.g:3610:1: rule__MockarooEntity__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__MockarooEntity__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3614:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3615:2: ( ruleEString )
            {
            // InternalMyDsl.g:3615:2: ( ruleEString )
            // InternalMyDsl.g:3616:3: ruleEString
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
    // InternalMyDsl.g:3625:1: rule__MockarooEntity__AtributosAssignment_3 : ( ruleAtributo ) ;
    public final void rule__MockarooEntity__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3629:1: ( ( ruleAtributo ) )
            // InternalMyDsl.g:3630:2: ( ruleAtributo )
            {
            // InternalMyDsl.g:3630:2: ( ruleAtributo )
            // InternalMyDsl.g:3631:3: ruleAtributo
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


    // $ANTLR start "rule__ServicioRest__MetodoAssignment_0"
    // InternalMyDsl.g:3640:1: rule__ServicioRest__MetodoAssignment_0 : ( ruleTipoMetodoRest ) ;
    public final void rule__ServicioRest__MetodoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3644:1: ( ( ruleTipoMetodoRest ) )
            // InternalMyDsl.g:3645:2: ( ruleTipoMetodoRest )
            {
            // InternalMyDsl.g:3645:2: ( ruleTipoMetodoRest )
            // InternalMyDsl.g:3646:3: ruleTipoMetodoRest
            {
             before(grammarAccess.getServicioRestAccess().getMetodoTipoMetodoRestEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoMetodoRest();

            state._fsp--;

             after(grammarAccess.getServicioRestAccess().getMetodoTipoMetodoRestEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__ServicioRest__MetodoAssignment_0"


    // $ANTLR start "rule__ServicioRest__NombreAssignment_1"
    // InternalMyDsl.g:3655:1: rule__ServicioRest__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__ServicioRest__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3659:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3660:2: ( ruleEString )
            {
            // InternalMyDsl.g:3660:2: ( ruleEString )
            // InternalMyDsl.g:3661:3: ruleEString
            {
             before(grammarAccess.getServicioRestAccess().getNombreEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServicioRestAccess().getNombreEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ServicioRest__NombreAssignment_1"


    // $ANTLR start "rule__ServicioRest__UrlAssignment_6"
    // InternalMyDsl.g:3670:1: rule__ServicioRest__UrlAssignment_6 : ( ruleEString ) ;
    public final void rule__ServicioRest__UrlAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3674:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3675:2: ( ruleEString )
            {
            // InternalMyDsl.g:3675:2: ( ruleEString )
            // InternalMyDsl.g:3676:3: ruleEString
            {
             before(grammarAccess.getServicioRestAccess().getUrlEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServicioRestAccess().getUrlEStringParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__ServicioRest__UrlAssignment_6"


    // $ANTLR start "rule__ServicioRest__ParametrosAssignment_7_0"
    // InternalMyDsl.g:3685:1: rule__ServicioRest__ParametrosAssignment_7_0 : ( ruleParametro ) ;
    public final void rule__ServicioRest__ParametrosAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3689:1: ( ( ruleParametro ) )
            // InternalMyDsl.g:3690:2: ( ruleParametro )
            {
            // InternalMyDsl.g:3690:2: ( ruleParametro )
            // InternalMyDsl.g:3691:3: ruleParametro
            {
             before(grammarAccess.getServicioRestAccess().getParametrosParametroParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getServicioRestAccess().getParametrosParametroParserRuleCall_7_0_0()); 

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
    // $ANTLR end "rule__ServicioRest__ParametrosAssignment_7_0"


    // $ANTLR start "rule__ServicioRest__RequestAssignment_9"
    // InternalMyDsl.g:3700:1: rule__ServicioRest__RequestAssignment_9 : ( ruleRequest ) ;
    public final void rule__ServicioRest__RequestAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3704:1: ( ( ruleRequest ) )
            // InternalMyDsl.g:3705:2: ( ruleRequest )
            {
            // InternalMyDsl.g:3705:2: ( ruleRequest )
            // InternalMyDsl.g:3706:3: ruleRequest
            {
             before(grammarAccess.getServicioRestAccess().getRequestRequestParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleRequest();

            state._fsp--;

             after(grammarAccess.getServicioRestAccess().getRequestRequestParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__ServicioRest__RequestAssignment_9"


    // $ANTLR start "rule__ServicioRest__ResponseAssignment_10"
    // InternalMyDsl.g:3715:1: rule__ServicioRest__ResponseAssignment_10 : ( ruleResponse ) ;
    public final void rule__ServicioRest__ResponseAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3719:1: ( ( ruleResponse ) )
            // InternalMyDsl.g:3720:2: ( ruleResponse )
            {
            // InternalMyDsl.g:3720:2: ( ruleResponse )
            // InternalMyDsl.g:3721:3: ruleResponse
            {
             before(grammarAccess.getServicioRestAccess().getResponseResponseParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleResponse();

            state._fsp--;

             after(grammarAccess.getServicioRestAccess().getResponseResponseParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__ServicioRest__ResponseAssignment_10"


    // $ANTLR start "rule__QueryParam__NombreAssignment_1"
    // InternalMyDsl.g:3730:1: rule__QueryParam__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__QueryParam__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3734:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3735:2: ( ruleEString )
            {
            // InternalMyDsl.g:3735:2: ( ruleEString )
            // InternalMyDsl.g:3736:3: ruleEString
            {
             before(grammarAccess.getQueryParamAccess().getNombreEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQueryParamAccess().getNombreEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__QueryParam__NombreAssignment_1"


    // $ANTLR start "rule__PathParam__NombreAssignment_1"
    // InternalMyDsl.g:3745:1: rule__PathParam__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__PathParam__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3749:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3750:2: ( ruleEString )
            {
            // InternalMyDsl.g:3750:2: ( ruleEString )
            // InternalMyDsl.g:3751:3: ruleEString
            {
             before(grammarAccess.getPathParamAccess().getNombreEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPathParamAccess().getNombreEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PathParam__NombreAssignment_1"


    // $ANTLR start "rule__SimpleEntity__NombreAssignment_1"
    // InternalMyDsl.g:3760:1: rule__SimpleEntity__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__SimpleEntity__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3764:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3765:2: ( ruleEString )
            {
            // InternalMyDsl.g:3765:2: ( ruleEString )
            // InternalMyDsl.g:3766:3: ruleEString
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
    // InternalMyDsl.g:3775:1: rule__SimpleEntity__AtributosAssignment_3 : ( ruleAtributoSimple ) ;
    public final void rule__SimpleEntity__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3779:1: ( ( ruleAtributoSimple ) )
            // InternalMyDsl.g:3780:2: ( ruleAtributoSimple )
            {
            // InternalMyDsl.g:3780:2: ( ruleAtributoSimple )
            // InternalMyDsl.g:3781:3: ruleAtributoSimple
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


    // $ANTLR start "rule__Response__TypeAssignment_4"
    // InternalMyDsl.g:3790:1: rule__Response__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__Response__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3794:1: ( ( ruleType ) )
            // InternalMyDsl.g:3795:2: ( ruleType )
            {
            // InternalMyDsl.g:3795:2: ( ruleType )
            // InternalMyDsl.g:3796:3: ruleType
            {
             before(grammarAccess.getResponseAccess().getTypeTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getResponseAccess().getTypeTypeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Response__TypeAssignment_4"


    // $ANTLR start "rule__Request__TypeAssignment_4"
    // InternalMyDsl.g:3805:1: rule__Request__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__Request__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3809:1: ( ( ruleType ) )
            // InternalMyDsl.g:3810:2: ( ruleType )
            {
            // InternalMyDsl.g:3810:2: ( ruleType )
            // InternalMyDsl.g:3811:3: ruleType
            {
             before(grammarAccess.getRequestAccess().getTypeTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getRequestAccess().getTypeTypeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Request__TypeAssignment_4"


    // $ANTLR start "rule__TipoEntidad__NombreAssignment"
    // InternalMyDsl.g:3820:1: rule__TipoEntidad__NombreAssignment : ( ruleEString ) ;
    public final void rule__TipoEntidad__NombreAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3824:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3825:2: ( ruleEString )
            {
            // InternalMyDsl.g:3825:2: ( ruleEString )
            // InternalMyDsl.g:3826:3: ruleEString
            {
             before(grammarAccess.getTipoEntidadAccess().getNombreEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTipoEntidadAccess().getNombreEStringParserRuleCall_0()); 

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
    // $ANTLR end "rule__TipoEntidad__NombreAssignment"


    // $ANTLR start "rule__MyString__NombreAssignment"
    // InternalMyDsl.g:3835:1: rule__MyString__NombreAssignment : ( ( 'string' ) ) ;
    public final void rule__MyString__NombreAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3839:1: ( ( ( 'string' ) ) )
            // InternalMyDsl.g:3840:2: ( ( 'string' ) )
            {
            // InternalMyDsl.g:3840:2: ( ( 'string' ) )
            // InternalMyDsl.g:3841:3: ( 'string' )
            {
             before(grammarAccess.getMyStringAccess().getNombreStringKeyword_0()); 
            // InternalMyDsl.g:3842:3: ( 'string' )
            // InternalMyDsl.g:3843:4: 'string'
            {
             before(grammarAccess.getMyStringAccess().getNombreStringKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMyStringAccess().getNombreStringKeyword_0()); 

            }

             after(grammarAccess.getMyStringAccess().getNombreStringKeyword_0()); 

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
    // $ANTLR end "rule__MyString__NombreAssignment"


    // $ANTLR start "rule__MyNumeric__NombreAssignment"
    // InternalMyDsl.g:3854:1: rule__MyNumeric__NombreAssignment : ( ( 'int' ) ) ;
    public final void rule__MyNumeric__NombreAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3858:1: ( ( ( 'int' ) ) )
            // InternalMyDsl.g:3859:2: ( ( 'int' ) )
            {
            // InternalMyDsl.g:3859:2: ( ( 'int' ) )
            // InternalMyDsl.g:3860:3: ( 'int' )
            {
             before(grammarAccess.getMyNumericAccess().getNombreIntKeyword_0()); 
            // InternalMyDsl.g:3861:3: ( 'int' )
            // InternalMyDsl.g:3862:4: 'int'
            {
             before(grammarAccess.getMyNumericAccess().getNombreIntKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMyNumericAccess().getNombreIntKeyword_0()); 

            }

             after(grammarAccess.getMyNumericAccess().getNombreIntKeyword_0()); 

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
    // $ANTLR end "rule__MyNumeric__NombreAssignment"


    // $ANTLR start "rule__MyBoolean__NombreAssignment"
    // InternalMyDsl.g:3873:1: rule__MyBoolean__NombreAssignment : ( ( 'boolean' ) ) ;
    public final void rule__MyBoolean__NombreAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3877:1: ( ( ( 'boolean' ) ) )
            // InternalMyDsl.g:3878:2: ( ( 'boolean' ) )
            {
            // InternalMyDsl.g:3878:2: ( ( 'boolean' ) )
            // InternalMyDsl.g:3879:3: ( 'boolean' )
            {
             before(grammarAccess.getMyBooleanAccess().getNombreBooleanKeyword_0()); 
            // InternalMyDsl.g:3880:3: ( 'boolean' )
            // InternalMyDsl.g:3881:4: 'boolean'
            {
             before(grammarAccess.getMyBooleanAccess().getNombreBooleanKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMyBooleanAccess().getNombreBooleanKeyword_0()); 

            }

             after(grammarAccess.getMyBooleanAccess().getNombreBooleanKeyword_0()); 

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
    // $ANTLR end "rule__MyBoolean__NombreAssignment"


    // $ANTLR start "rule__Mapping__ValueAssignment_3"
    // InternalMyDsl.g:3892:1: rule__Mapping__ValueAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Mapping__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3896:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3897:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3897:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3898:3: ( ruleEString )
            {
             before(grammarAccess.getMappingAccess().getValueElementoCrossReference_3_0()); 
            // InternalMyDsl.g:3899:3: ( ruleEString )
            // InternalMyDsl.g:3900:4: ruleEString
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


    // $ANTLR start "rule__Asercion__Elemento1Assignment_3"
    // InternalMyDsl.g:3911:1: rule__Asercion__Elemento1Assignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Asercion__Elemento1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3915:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3916:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3916:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3917:3: ( ruleEString )
            {
             before(grammarAccess.getAsercionAccess().getElemento1ElementoCrossReference_3_0()); 
            // InternalMyDsl.g:3918:3: ( ruleEString )
            // InternalMyDsl.g:3919:4: ruleEString
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
    // InternalMyDsl.g:3930:1: rule__Asercion__Elemento2Assignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Asercion__Elemento2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3934:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3935:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3935:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3936:3: ( ruleEString )
            {
             before(grammarAccess.getAsercionAccess().getElemento2ElementoCrossReference_5_0()); 
            // InternalMyDsl.g:3937:3: ( ruleEString )
            // InternalMyDsl.g:3938:4: ruleEString
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00008103C000E000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000810000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0100002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000003FFF0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000004000000E000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000700000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000700000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000000E030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0080000000000000L});

}