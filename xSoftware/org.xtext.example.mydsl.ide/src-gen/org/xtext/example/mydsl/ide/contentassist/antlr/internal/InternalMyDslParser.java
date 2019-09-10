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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'/'", "':'", "'{'", "'}'", "'$'", "'?'", "'string'", "'int'", "'boolean'", "'FirstNameType'", "'LastNameType'", "'FamilyNameType'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CityType'", "'CountryCodeType'", "'LatitudeType'", "'LongitudType'", "'RowNumberType'", "'BooleanType'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'Path'", "'Query'", "'Body'", "'apiURL'", "'('", "')'", "'mockType'", "'['", "']'", "'Entity'", "'URL'", "'SimpleEntity'", "'Response'", "'Type'", "'Request'", "'Mapping'", "'value'", "'parametro'", "'Asercion'", "'elemento1'", "'elemento2'", "'Parametro'", "'nombre'", "'tipo'", "'PK,mockType'"
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
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SEMICOLON=7;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
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


    // $ANTLR start "entryRuleSimpleEntity"
    // InternalMyDsl.g:303:1: entryRuleSimpleEntity : ruleSimpleEntity EOF ;
    public final void entryRuleSimpleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleSimpleEntity EOF )
            // InternalMyDsl.g:305:1: ruleSimpleEntity EOF
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
    // InternalMyDsl.g:312:1: ruleSimpleEntity : ( ( rule__SimpleEntity__Group__0 ) ) ;
    public final void ruleSimpleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__SimpleEntity__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__SimpleEntity__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__SimpleEntity__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__SimpleEntity__Group__0 )
            {
             before(grammarAccess.getSimpleEntityAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__SimpleEntity__Group__0 )
            // InternalMyDsl.g:319:4: rule__SimpleEntity__Group__0
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
    // InternalMyDsl.g:328:1: entryRuleResponse : ruleResponse EOF ;
    public final void entryRuleResponse() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleResponse EOF )
            // InternalMyDsl.g:330:1: ruleResponse EOF
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
    // InternalMyDsl.g:337:1: ruleResponse : ( ( rule__Response__Group__0 ) ) ;
    public final void ruleResponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Response__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Response__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Response__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Response__Group__0 )
            {
             before(grammarAccess.getResponseAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Response__Group__0 )
            // InternalMyDsl.g:344:4: rule__Response__Group__0
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
    // InternalMyDsl.g:353:1: entryRuleRequest : ruleRequest EOF ;
    public final void entryRuleRequest() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleRequest EOF )
            // InternalMyDsl.g:355:1: ruleRequest EOF
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
    // InternalMyDsl.g:362:1: ruleRequest : ( ( rule__Request__Group__0 ) ) ;
    public final void ruleRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Request__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Request__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Request__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Request__Group__0 )
            {
             before(grammarAccess.getRequestAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Request__Group__0 )
            // InternalMyDsl.g:369:4: rule__Request__Group__0
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
    // InternalMyDsl.g:378:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleType EOF )
            // InternalMyDsl.g:380:1: ruleType EOF
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
    // InternalMyDsl.g:387:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Type__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Type__Group__0 )
            // InternalMyDsl.g:394:4: rule__Type__Group__0
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
    // InternalMyDsl.g:403:1: entryRuleTipoEntidad : ruleTipoEntidad EOF ;
    public final void entryRuleTipoEntidad() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleTipoEntidad EOF )
            // InternalMyDsl.g:405:1: ruleTipoEntidad EOF
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
    // InternalMyDsl.g:412:1: ruleTipoEntidad : ( ( rule__TipoEntidad__NombreAssignment ) ) ;
    public final void ruleTipoEntidad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__TipoEntidad__NombreAssignment ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__TipoEntidad__NombreAssignment ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__TipoEntidad__NombreAssignment ) )
            // InternalMyDsl.g:418:3: ( rule__TipoEntidad__NombreAssignment )
            {
             before(grammarAccess.getTipoEntidadAccess().getNombreAssignment()); 
            // InternalMyDsl.g:419:3: ( rule__TipoEntidad__NombreAssignment )
            // InternalMyDsl.g:419:4: rule__TipoEntidad__NombreAssignment
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
    // InternalMyDsl.g:428:1: entryRuleMyString : ruleMyString EOF ;
    public final void entryRuleMyString() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleMyString EOF )
            // InternalMyDsl.g:430:1: ruleMyString EOF
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
    // InternalMyDsl.g:437:1: ruleMyString : ( ( rule__MyString__NombreAssignment ) ) ;
    public final void ruleMyString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__MyString__NombreAssignment ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__MyString__NombreAssignment ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__MyString__NombreAssignment ) )
            // InternalMyDsl.g:443:3: ( rule__MyString__NombreAssignment )
            {
             before(grammarAccess.getMyStringAccess().getNombreAssignment()); 
            // InternalMyDsl.g:444:3: ( rule__MyString__NombreAssignment )
            // InternalMyDsl.g:444:4: rule__MyString__NombreAssignment
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
    // InternalMyDsl.g:453:1: entryRuleMyNumeric : ruleMyNumeric EOF ;
    public final void entryRuleMyNumeric() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleMyNumeric EOF )
            // InternalMyDsl.g:455:1: ruleMyNumeric EOF
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
    // InternalMyDsl.g:462:1: ruleMyNumeric : ( ( rule__MyNumeric__NombreAssignment ) ) ;
    public final void ruleMyNumeric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__MyNumeric__NombreAssignment ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__MyNumeric__NombreAssignment ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__MyNumeric__NombreAssignment ) )
            // InternalMyDsl.g:468:3: ( rule__MyNumeric__NombreAssignment )
            {
             before(grammarAccess.getMyNumericAccess().getNombreAssignment()); 
            // InternalMyDsl.g:469:3: ( rule__MyNumeric__NombreAssignment )
            // InternalMyDsl.g:469:4: rule__MyNumeric__NombreAssignment
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
    // InternalMyDsl.g:478:1: entryRuleMyBoolean : ruleMyBoolean EOF ;
    public final void entryRuleMyBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleMyBoolean EOF )
            // InternalMyDsl.g:480:1: ruleMyBoolean EOF
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
    // InternalMyDsl.g:487:1: ruleMyBoolean : ( ( rule__MyBoolean__NombreAssignment ) ) ;
    public final void ruleMyBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__MyBoolean__NombreAssignment ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__MyBoolean__NombreAssignment ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__MyBoolean__NombreAssignment ) )
            // InternalMyDsl.g:493:3: ( rule__MyBoolean__NombreAssignment )
            {
             before(grammarAccess.getMyBooleanAccess().getNombreAssignment()); 
            // InternalMyDsl.g:494:3: ( rule__MyBoolean__NombreAssignment )
            // InternalMyDsl.g:494:4: rule__MyBoolean__NombreAssignment
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
    // InternalMyDsl.g:503:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleMapping EOF )
            // InternalMyDsl.g:505:1: ruleMapping EOF
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
    // InternalMyDsl.g:512:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Mapping__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Mapping__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Mapping__Group__0 )
            // InternalMyDsl.g:519:4: rule__Mapping__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleAsercion : ruleAsercion EOF ;
    public final void entryRuleAsercion() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleAsercion EOF )
            // InternalMyDsl.g:530:1: ruleAsercion EOF
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
    // InternalMyDsl.g:537:1: ruleAsercion : ( ( rule__Asercion__Group__0 ) ) ;
    public final void ruleAsercion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Asercion__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Asercion__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Asercion__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__Asercion__Group__0 )
            {
             before(grammarAccess.getAsercionAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__Asercion__Group__0 )
            // InternalMyDsl.g:544:4: rule__Asercion__Group__0
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
    // InternalMyDsl.g:553:1: entryRuleParametro : ruleParametro EOF ;
    public final void entryRuleParametro() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleParametro EOF )
            // InternalMyDsl.g:555:1: ruleParametro EOF
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
    // InternalMyDsl.g:562:1: ruleParametro : ( ( rule__Parametro__Group__0 ) ) ;
    public final void ruleParametro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__Parametro__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__Parametro__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__Parametro__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__Parametro__Group__0 )
            {
             before(grammarAccess.getParametroAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__Parametro__Group__0 )
            // InternalMyDsl.g:569:4: rule__Parametro__Group__0
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
    // InternalMyDsl.g:578:1: ruleTipoAtributo : ( ( rule__TipoAtributo__Alternatives ) ) ;
    public final void ruleTipoAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:582:1: ( ( ( rule__TipoAtributo__Alternatives ) ) )
            // InternalMyDsl.g:583:2: ( ( rule__TipoAtributo__Alternatives ) )
            {
            // InternalMyDsl.g:583:2: ( ( rule__TipoAtributo__Alternatives ) )
            // InternalMyDsl.g:584:3: ( rule__TipoAtributo__Alternatives )
            {
             before(grammarAccess.getTipoAtributoAccess().getAlternatives()); 
            // InternalMyDsl.g:585:3: ( rule__TipoAtributo__Alternatives )
            // InternalMyDsl.g:585:4: rule__TipoAtributo__Alternatives
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
    // InternalMyDsl.g:594:1: ruleMockaroo : ( ( rule__Mockaroo__Alternatives ) ) ;
    public final void ruleMockaroo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:598:1: ( ( ( rule__Mockaroo__Alternatives ) ) )
            // InternalMyDsl.g:599:2: ( ( rule__Mockaroo__Alternatives ) )
            {
            // InternalMyDsl.g:599:2: ( ( rule__Mockaroo__Alternatives ) )
            // InternalMyDsl.g:600:3: ( rule__Mockaroo__Alternatives )
            {
             before(grammarAccess.getMockarooAccess().getAlternatives()); 
            // InternalMyDsl.g:601:3: ( rule__Mockaroo__Alternatives )
            // InternalMyDsl.g:601:4: rule__Mockaroo__Alternatives
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
    // InternalMyDsl.g:610:1: ruleTipoMetodoRest : ( ( rule__TipoMetodoRest__Alternatives ) ) ;
    public final void ruleTipoMetodoRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:614:1: ( ( ( rule__TipoMetodoRest__Alternatives ) ) )
            // InternalMyDsl.g:615:2: ( ( rule__TipoMetodoRest__Alternatives ) )
            {
            // InternalMyDsl.g:615:2: ( ( rule__TipoMetodoRest__Alternatives ) )
            // InternalMyDsl.g:616:3: ( rule__TipoMetodoRest__Alternatives )
            {
             before(grammarAccess.getTipoMetodoRestAccess().getAlternatives()); 
            // InternalMyDsl.g:617:3: ( rule__TipoMetodoRest__Alternatives )
            // InternalMyDsl.g:617:4: rule__TipoMetodoRest__Alternatives
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
    // InternalMyDsl.g:626:1: ruleTipoParametro : ( ( rule__TipoParametro__Alternatives ) ) ;
    public final void ruleTipoParametro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:630:1: ( ( ( rule__TipoParametro__Alternatives ) ) )
            // InternalMyDsl.g:631:2: ( ( rule__TipoParametro__Alternatives ) )
            {
            // InternalMyDsl.g:631:2: ( ( rule__TipoParametro__Alternatives ) )
            // InternalMyDsl.g:632:3: ( rule__TipoParametro__Alternatives )
            {
             before(grammarAccess.getTipoParametroAccess().getAlternatives()); 
            // InternalMyDsl.g:633:3: ( rule__TipoParametro__Alternatives )
            // InternalMyDsl.g:633:4: rule__TipoParametro__Alternatives
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
    // InternalMyDsl.g:641:1: rule__Entidad__Alternatives : ( ( ruleSimpleEntity ) | ( ruleMockarooEntity ) );
    public final void rule__Entidad__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:645:1: ( ( ruleSimpleEntity ) | ( ruleMockarooEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==51) ) {
                alt1=1;
            }
            else if ( (LA1_0==49) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:646:2: ( ruleSimpleEntity )
                    {
                    // InternalMyDsl.g:646:2: ( ruleSimpleEntity )
                    // InternalMyDsl.g:647:3: ruleSimpleEntity
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
                    // InternalMyDsl.g:652:2: ( ruleMockarooEntity )
                    {
                    // InternalMyDsl.g:652:2: ( ruleMockarooEntity )
                    // InternalMyDsl.g:653:3: ruleMockarooEntity
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
    // InternalMyDsl.g:662:1: rule__PrimitiveType__Alternatives : ( ( ruleMyNumeric ) | ( ruleMyString ) | ( ruleMyBoolean ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:1: ( ( ruleMyNumeric ) | ( ruleMyString ) | ( ruleMyBoolean ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 21:
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
                    // InternalMyDsl.g:667:2: ( ruleMyNumeric )
                    {
                    // InternalMyDsl.g:667:2: ( ruleMyNumeric )
                    // InternalMyDsl.g:668:3: ruleMyNumeric
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
                    // InternalMyDsl.g:673:2: ( ruleMyString )
                    {
                    // InternalMyDsl.g:673:2: ( ruleMyString )
                    // InternalMyDsl.g:674:3: ruleMyString
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
                    // InternalMyDsl.g:679:2: ( ruleMyBoolean )
                    {
                    // InternalMyDsl.g:679:2: ( ruleMyBoolean )
                    // InternalMyDsl.g:680:3: ruleMyBoolean
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
    // InternalMyDsl.g:689:1: rule__Atributo__Alternatives : ( ( ruleAtributoMocka ) | ( ruleAtributoArreglo ) | ( ruleAtributoSimple ) );
    public final void rule__Atributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:693:1: ( ( ruleAtributoMocka ) | ( ruleAtributoArreglo ) | ( ruleAtributoSimple ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==44) ) {
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

                    if ( (LA3_5==44) ) {
                        alt3=1;
                    }
                    else if ( (LA3_5==RULE_SEMICOLON) ) {
                        alt3=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 47:
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
            case 20:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==44) ) {
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

                    if ( (LA3_5==44) ) {
                        alt3=1;
                    }
                    else if ( (LA3_5==RULE_SEMICOLON) ) {
                        alt3=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 47:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }

                }
                break;
            case 21:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==44) ) {
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

                    if ( (LA3_5==44) ) {
                        alt3=1;
                    }
                    else if ( (LA3_5==RULE_SEMICOLON) ) {
                        alt3=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 47:
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
                    // InternalMyDsl.g:694:2: ( ruleAtributoMocka )
                    {
                    // InternalMyDsl.g:694:2: ( ruleAtributoMocka )
                    // InternalMyDsl.g:695:3: ruleAtributoMocka
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
                    // InternalMyDsl.g:700:2: ( ruleAtributoArreglo )
                    {
                    // InternalMyDsl.g:700:2: ( ruleAtributoArreglo )
                    // InternalMyDsl.g:701:3: ruleAtributoArreglo
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
                    // InternalMyDsl.g:706:2: ( ruleAtributoSimple )
                    {
                    // InternalMyDsl.g:706:2: ( ruleAtributoSimple )
                    // InternalMyDsl.g:707:3: ruleAtributoSimple
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
    // InternalMyDsl.g:716:1: rule__AtributoMocka__Alternatives_2_1 : ( ( ( rule__AtributoMocka__Group_2_1_0__0 ) ) | ( ( rule__AtributoMocka__Group_2_1_1__0 ) ) );
    public final void rule__AtributoMocka__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:720:1: ( ( ( rule__AtributoMocka__Group_2_1_0__0 ) ) | ( ( rule__AtributoMocka__Group_2_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==64) ) {
                alt4=1;
            }
            else if ( (LA4_0==46) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:721:2: ( ( rule__AtributoMocka__Group_2_1_0__0 ) )
                    {
                    // InternalMyDsl.g:721:2: ( ( rule__AtributoMocka__Group_2_1_0__0 ) )
                    // InternalMyDsl.g:722:3: ( rule__AtributoMocka__Group_2_1_0__0 )
                    {
                     before(grammarAccess.getAtributoMockaAccess().getGroup_2_1_0()); 
                    // InternalMyDsl.g:723:3: ( rule__AtributoMocka__Group_2_1_0__0 )
                    // InternalMyDsl.g:723:4: rule__AtributoMocka__Group_2_1_0__0
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
                    // InternalMyDsl.g:727:2: ( ( rule__AtributoMocka__Group_2_1_1__0 ) )
                    {
                    // InternalMyDsl.g:727:2: ( ( rule__AtributoMocka__Group_2_1_1__0 ) )
                    // InternalMyDsl.g:728:3: ( rule__AtributoMocka__Group_2_1_1__0 )
                    {
                     before(grammarAccess.getAtributoMockaAccess().getGroup_2_1_1()); 
                    // InternalMyDsl.g:729:3: ( rule__AtributoMocka__Group_2_1_1__0 )
                    // InternalMyDsl.g:729:4: rule__AtributoMocka__Group_2_1_1__0
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
    // InternalMyDsl.g:737:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalMyDsl.g:742:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:742:2: ( RULE_STRING )
                    // InternalMyDsl.g:743:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:748:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:748:2: ( RULE_ID )
                    // InternalMyDsl.g:749:3: RULE_ID
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
    // InternalMyDsl.g:758:1: rule__ServicioRest__Alternatives_7 : ( ( ruleEString ) | ( '/' ) | ( ':' ) | ( '{' ) | ( '}' ) | ( '$' ) | ( '?' ) );
    public final void rule__ServicioRest__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:762:1: ( ( ruleEString ) | ( '/' ) | ( ':' ) | ( '{' ) | ( '}' ) | ( '$' ) | ( '?' ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 14:
                {
                alt6=3;
                }
                break;
            case 15:
                {
                alt6=4;
                }
                break;
            case 16:
                {
                alt6=5;
                }
                break;
            case 17:
                {
                alt6=6;
                }
                break;
            case 18:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:763:2: ( ruleEString )
                    {
                    // InternalMyDsl.g:763:2: ( ruleEString )
                    // InternalMyDsl.g:764:3: ruleEString
                    {
                     before(grammarAccess.getServicioRestAccess().getEStringParserRuleCall_7_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getServicioRestAccess().getEStringParserRuleCall_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:769:2: ( '/' )
                    {
                    // InternalMyDsl.g:769:2: ( '/' )
                    // InternalMyDsl.g:770:3: '/'
                    {
                     before(grammarAccess.getServicioRestAccess().getSolidusKeyword_7_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getServicioRestAccess().getSolidusKeyword_7_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:775:2: ( ':' )
                    {
                    // InternalMyDsl.g:775:2: ( ':' )
                    // InternalMyDsl.g:776:3: ':'
                    {
                     before(grammarAccess.getServicioRestAccess().getColonKeyword_7_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getServicioRestAccess().getColonKeyword_7_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:781:2: ( '{' )
                    {
                    // InternalMyDsl.g:781:2: ( '{' )
                    // InternalMyDsl.g:782:3: '{'
                    {
                     before(grammarAccess.getServicioRestAccess().getLeftCurlyBracketKeyword_7_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getServicioRestAccess().getLeftCurlyBracketKeyword_7_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:787:2: ( '}' )
                    {
                    // InternalMyDsl.g:787:2: ( '}' )
                    // InternalMyDsl.g:788:3: '}'
                    {
                     before(grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_7_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_7_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:793:2: ( '$' )
                    {
                    // InternalMyDsl.g:793:2: ( '$' )
                    // InternalMyDsl.g:794:3: '$'
                    {
                     before(grammarAccess.getServicioRestAccess().getDollarSignKeyword_7_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getServicioRestAccess().getDollarSignKeyword_7_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:799:2: ( '?' )
                    {
                    // InternalMyDsl.g:799:2: ( '?' )
                    // InternalMyDsl.g:800:3: '?'
                    {
                     before(grammarAccess.getServicioRestAccess().getQuestionMarkKeyword_7_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getServicioRestAccess().getQuestionMarkKeyword_7_6()); 

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


    // $ANTLR start "rule__Type__Alternatives_0"
    // InternalMyDsl.g:809:1: rule__Type__Alternatives_0 : ( ( ruleTipoEntidad ) | ( rulePrimitiveType ) );
    public final void rule__Type__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:813:1: ( ( ruleTipoEntidad ) | ( rulePrimitiveType ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=19 && LA7_0<=21)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:814:2: ( ruleTipoEntidad )
                    {
                    // InternalMyDsl.g:814:2: ( ruleTipoEntidad )
                    // InternalMyDsl.g:815:3: ruleTipoEntidad
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
                    // InternalMyDsl.g:820:2: ( rulePrimitiveType )
                    {
                    // InternalMyDsl.g:820:2: ( rulePrimitiveType )
                    // InternalMyDsl.g:821:3: rulePrimitiveType
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
    // InternalMyDsl.g:830:1: rule__TipoAtributo__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) );
    public final void rule__TipoAtributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:834:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:835:2: ( ( 'string' ) )
                    {
                    // InternalMyDsl.g:835:2: ( ( 'string' ) )
                    // InternalMyDsl.g:836:3: ( 'string' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:837:3: ( 'string' )
                    // InternalMyDsl.g:837:4: 'string'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:841:2: ( ( 'int' ) )
                    {
                    // InternalMyDsl.g:841:2: ( ( 'int' ) )
                    // InternalMyDsl.g:842:3: ( 'int' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:843:3: ( 'int' )
                    // InternalMyDsl.g:843:4: 'int'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:847:2: ( ( 'boolean' ) )
                    {
                    // InternalMyDsl.g:847:2: ( ( 'boolean' ) )
                    // InternalMyDsl.g:848:3: ( 'boolean' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:849:3: ( 'boolean' )
                    // InternalMyDsl.g:849:4: 'boolean'
                    {
                    match(input,21,FOLLOW_2); 

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
    // InternalMyDsl.g:857:1: rule__Mockaroo__Alternatives : ( ( ( 'FirstNameType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CityType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'LatitudeType' ) ) | ( ( 'LongitudType' ) ) | ( ( 'RowNumberType' ) ) | ( ( 'BooleanType' ) ) );
    public final void rule__Mockaroo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:861:1: ( ( ( 'FirstNameType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CityType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'LatitudeType' ) ) | ( ( 'LongitudType' ) ) | ( ( 'RowNumberType' ) ) | ( ( 'BooleanType' ) ) )
            int alt9=14;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            case 26:
                {
                alt9=5;
                }
                break;
            case 27:
                {
                alt9=6;
                }
                break;
            case 28:
                {
                alt9=7;
                }
                break;
            case 29:
                {
                alt9=8;
                }
                break;
            case 30:
                {
                alt9=9;
                }
                break;
            case 31:
                {
                alt9=10;
                }
                break;
            case 32:
                {
                alt9=11;
                }
                break;
            case 33:
                {
                alt9=12;
                }
                break;
            case 34:
                {
                alt9=13;
                }
                break;
            case 35:
                {
                alt9=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:862:2: ( ( 'FirstNameType' ) )
                    {
                    // InternalMyDsl.g:862:2: ( ( 'FirstNameType' ) )
                    // InternalMyDsl.g:863:3: ( 'FirstNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:864:3: ( 'FirstNameType' )
                    // InternalMyDsl.g:864:4: 'FirstNameType'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:868:2: ( ( 'LastNameType' ) )
                    {
                    // InternalMyDsl.g:868:2: ( ( 'LastNameType' ) )
                    // InternalMyDsl.g:869:3: ( 'LastNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:870:3: ( 'LastNameType' )
                    // InternalMyDsl.g:870:4: 'LastNameType'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:874:2: ( ( 'FamilyNameType' ) )
                    {
                    // InternalMyDsl.g:874:2: ( ( 'FamilyNameType' ) )
                    // InternalMyDsl.g:875:3: ( 'FamilyNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:876:3: ( 'FamilyNameType' )
                    // InternalMyDsl.g:876:4: 'FamilyNameType'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:880:2: ( ( 'FullNameType' ) )
                    {
                    // InternalMyDsl.g:880:2: ( ( 'FullNameType' ) )
                    // InternalMyDsl.g:881:3: ( 'FullNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:882:3: ( 'FullNameType' )
                    // InternalMyDsl.g:882:4: 'FullNameType'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:886:2: ( ( 'GenderType' ) )
                    {
                    // InternalMyDsl.g:886:2: ( ( 'GenderType' ) )
                    // InternalMyDsl.g:887:3: ( 'GenderType' )
                    {
                     before(grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:888:3: ( 'GenderType' )
                    // InternalMyDsl.g:888:4: 'GenderType'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:892:2: ( ( 'EmailAddressType' ) )
                    {
                    // InternalMyDsl.g:892:2: ( ( 'EmailAddressType' ) )
                    // InternalMyDsl.g:893:3: ( 'EmailAddressType' )
                    {
                     before(grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:894:3: ( 'EmailAddressType' )
                    // InternalMyDsl.g:894:4: 'EmailAddressType'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:898:2: ( ( 'PhoneType' ) )
                    {
                    // InternalMyDsl.g:898:2: ( ( 'PhoneType' ) )
                    // InternalMyDsl.g:899:3: ( 'PhoneType' )
                    {
                     before(grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:900:3: ( 'PhoneType' )
                    // InternalMyDsl.g:900:4: 'PhoneType'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:904:2: ( ( 'CountryType' ) )
                    {
                    // InternalMyDsl.g:904:2: ( ( 'CountryType' ) )
                    // InternalMyDsl.g:905:3: ( 'CountryType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7()); 
                    // InternalMyDsl.g:906:3: ( 'CountryType' )
                    // InternalMyDsl.g:906:4: 'CountryType'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:910:2: ( ( 'CityType' ) )
                    {
                    // InternalMyDsl.g:910:2: ( ( 'CityType' ) )
                    // InternalMyDsl.g:911:3: ( 'CityType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8()); 
                    // InternalMyDsl.g:912:3: ( 'CityType' )
                    // InternalMyDsl.g:912:4: 'CityType'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:916:2: ( ( 'CountryCodeType' ) )
                    {
                    // InternalMyDsl.g:916:2: ( ( 'CountryCodeType' ) )
                    // InternalMyDsl.g:917:3: ( 'CountryCodeType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9()); 
                    // InternalMyDsl.g:918:3: ( 'CountryCodeType' )
                    // InternalMyDsl.g:918:4: 'CountryCodeType'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:922:2: ( ( 'LatitudeType' ) )
                    {
                    // InternalMyDsl.g:922:2: ( ( 'LatitudeType' ) )
                    // InternalMyDsl.g:923:3: ( 'LatitudeType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10()); 
                    // InternalMyDsl.g:924:3: ( 'LatitudeType' )
                    // InternalMyDsl.g:924:4: 'LatitudeType'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:928:2: ( ( 'LongitudType' ) )
                    {
                    // InternalMyDsl.g:928:2: ( ( 'LongitudType' ) )
                    // InternalMyDsl.g:929:3: ( 'LongitudType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11()); 
                    // InternalMyDsl.g:930:3: ( 'LongitudType' )
                    // InternalMyDsl.g:930:4: 'LongitudType'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:934:2: ( ( 'RowNumberType' ) )
                    {
                    // InternalMyDsl.g:934:2: ( ( 'RowNumberType' ) )
                    // InternalMyDsl.g:935:3: ( 'RowNumberType' )
                    {
                     before(grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 
                    // InternalMyDsl.g:936:3: ( 'RowNumberType' )
                    // InternalMyDsl.g:936:4: 'RowNumberType'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:940:2: ( ( 'BooleanType' ) )
                    {
                    // InternalMyDsl.g:940:2: ( ( 'BooleanType' ) )
                    // InternalMyDsl.g:941:3: ( 'BooleanType' )
                    {
                     before(grammarAccess.getMockarooAccess().getBooleanTypeEnumLiteralDeclaration_13()); 
                    // InternalMyDsl.g:942:3: ( 'BooleanType' )
                    // InternalMyDsl.g:942:4: 'BooleanType'
                    {
                    match(input,35,FOLLOW_2); 

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
    // InternalMyDsl.g:950:1: rule__TipoMetodoRest__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__TipoMetodoRest__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:954:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt10=1;
                }
                break;
            case 37:
                {
                alt10=2;
                }
                break;
            case 38:
                {
                alt10=3;
                }
                break;
            case 39:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:955:2: ( ( 'GET' ) )
                    {
                    // InternalMyDsl.g:955:2: ( ( 'GET' ) )
                    // InternalMyDsl.g:956:3: ( 'GET' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:957:3: ( 'GET' )
                    // InternalMyDsl.g:957:4: 'GET'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:961:2: ( ( 'POST' ) )
                    {
                    // InternalMyDsl.g:961:2: ( ( 'POST' ) )
                    // InternalMyDsl.g:962:3: ( 'POST' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:963:3: ( 'POST' )
                    // InternalMyDsl.g:963:4: 'POST'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:967:2: ( ( 'PUT' ) )
                    {
                    // InternalMyDsl.g:967:2: ( ( 'PUT' ) )
                    // InternalMyDsl.g:968:3: ( 'PUT' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:969:3: ( 'PUT' )
                    // InternalMyDsl.g:969:4: 'PUT'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:973:2: ( ( 'DELETE' ) )
                    {
                    // InternalMyDsl.g:973:2: ( ( 'DELETE' ) )
                    // InternalMyDsl.g:974:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:975:3: ( 'DELETE' )
                    // InternalMyDsl.g:975:4: 'DELETE'
                    {
                    match(input,39,FOLLOW_2); 

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
    // InternalMyDsl.g:983:1: rule__TipoParametro__Alternatives : ( ( ( 'Path' ) ) | ( ( 'Query' ) ) | ( ( 'Body' ) ) );
    public final void rule__TipoParametro__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:987:1: ( ( ( 'Path' ) ) | ( ( 'Query' ) ) | ( ( 'Body' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt11=1;
                }
                break;
            case 41:
                {
                alt11=2;
                }
                break;
            case 42:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:988:2: ( ( 'Path' ) )
                    {
                    // InternalMyDsl.g:988:2: ( ( 'Path' ) )
                    // InternalMyDsl.g:989:3: ( 'Path' )
                    {
                     before(grammarAccess.getTipoParametroAccess().getPathEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:990:3: ( 'Path' )
                    // InternalMyDsl.g:990:4: 'Path'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoParametroAccess().getPathEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:994:2: ( ( 'Query' ) )
                    {
                    // InternalMyDsl.g:994:2: ( ( 'Query' ) )
                    // InternalMyDsl.g:995:3: ( 'Query' )
                    {
                     before(grammarAccess.getTipoParametroAccess().getQueryEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:996:3: ( 'Query' )
                    // InternalMyDsl.g:996:4: 'Query'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoParametroAccess().getQueryEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1000:2: ( ( 'Body' ) )
                    {
                    // InternalMyDsl.g:1000:2: ( ( 'Body' ) )
                    // InternalMyDsl.g:1001:3: ( 'Body' )
                    {
                     before(grammarAccess.getTipoParametroAccess().getBodyEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1002:3: ( 'Body' )
                    // InternalMyDsl.g:1002:4: 'Body'
                    {
                    match(input,42,FOLLOW_2); 

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
    // InternalMyDsl.g:1010:1: rule__Api__Group__0 : rule__Api__Group__0__Impl rule__Api__Group__1 ;
    public final void rule__Api__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1014:1: ( rule__Api__Group__0__Impl rule__Api__Group__1 )
            // InternalMyDsl.g:1015:2: rule__Api__Group__0__Impl rule__Api__Group__1
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
    // InternalMyDsl.g:1022:1: rule__Api__Group__0__Impl : ( () ) ;
    public final void rule__Api__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1026:1: ( ( () ) )
            // InternalMyDsl.g:1027:1: ( () )
            {
            // InternalMyDsl.g:1027:1: ( () )
            // InternalMyDsl.g:1028:2: ()
            {
             before(grammarAccess.getApiAccess().getApiAction_0()); 
            // InternalMyDsl.g:1029:2: ()
            // InternalMyDsl.g:1029:3: 
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
    // InternalMyDsl.g:1037:1: rule__Api__Group__1 : rule__Api__Group__1__Impl rule__Api__Group__2 ;
    public final void rule__Api__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:1: ( rule__Api__Group__1__Impl rule__Api__Group__2 )
            // InternalMyDsl.g:1042:2: rule__Api__Group__1__Impl rule__Api__Group__2
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
    // InternalMyDsl.g:1049:1: rule__Api__Group__1__Impl : ( 'apiURL' ) ;
    public final void rule__Api__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1053:1: ( ( 'apiURL' ) )
            // InternalMyDsl.g:1054:1: ( 'apiURL' )
            {
            // InternalMyDsl.g:1054:1: ( 'apiURL' )
            // InternalMyDsl.g:1055:2: 'apiURL'
            {
             before(grammarAccess.getApiAccess().getApiURLKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:1064:1: rule__Api__Group__2 : rule__Api__Group__2__Impl rule__Api__Group__3 ;
    public final void rule__Api__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1068:1: ( rule__Api__Group__2__Impl rule__Api__Group__3 )
            // InternalMyDsl.g:1069:2: rule__Api__Group__2__Impl rule__Api__Group__3
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
    // InternalMyDsl.g:1076:1: rule__Api__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__Api__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1080:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1081:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1081:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1082:2: RULE_EQUAL
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
    // InternalMyDsl.g:1091:1: rule__Api__Group__3 : rule__Api__Group__3__Impl rule__Api__Group__4 ;
    public final void rule__Api__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1095:1: ( rule__Api__Group__3__Impl rule__Api__Group__4 )
            // InternalMyDsl.g:1096:2: rule__Api__Group__3__Impl rule__Api__Group__4
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
    // InternalMyDsl.g:1103:1: rule__Api__Group__3__Impl : ( ( rule__Api__UrlAssignment_3 ) ) ;
    public final void rule__Api__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1107:1: ( ( ( rule__Api__UrlAssignment_3 ) ) )
            // InternalMyDsl.g:1108:1: ( ( rule__Api__UrlAssignment_3 ) )
            {
            // InternalMyDsl.g:1108:1: ( ( rule__Api__UrlAssignment_3 ) )
            // InternalMyDsl.g:1109:2: ( rule__Api__UrlAssignment_3 )
            {
             before(grammarAccess.getApiAccess().getUrlAssignment_3()); 
            // InternalMyDsl.g:1110:2: ( rule__Api__UrlAssignment_3 )
            // InternalMyDsl.g:1110:3: rule__Api__UrlAssignment_3
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
    // InternalMyDsl.g:1118:1: rule__Api__Group__4 : rule__Api__Group__4__Impl rule__Api__Group__5 ;
    public final void rule__Api__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1122:1: ( rule__Api__Group__4__Impl rule__Api__Group__5 )
            // InternalMyDsl.g:1123:2: rule__Api__Group__4__Impl rule__Api__Group__5
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
    // InternalMyDsl.g:1130:1: rule__Api__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Api__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1134:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1135:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1135:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1136:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:1145:1: rule__Api__Group__5 : rule__Api__Group__5__Impl rule__Api__Group__6 ;
    public final void rule__Api__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1149:1: ( rule__Api__Group__5__Impl rule__Api__Group__6 )
            // InternalMyDsl.g:1150:2: rule__Api__Group__5__Impl rule__Api__Group__6
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
    // InternalMyDsl.g:1157:1: rule__Api__Group__5__Impl : ( ( rule__Api__EntidadesAssignment_5 )* ) ;
    public final void rule__Api__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1161:1: ( ( ( rule__Api__EntidadesAssignment_5 )* ) )
            // InternalMyDsl.g:1162:1: ( ( rule__Api__EntidadesAssignment_5 )* )
            {
            // InternalMyDsl.g:1162:1: ( ( rule__Api__EntidadesAssignment_5 )* )
            // InternalMyDsl.g:1163:2: ( rule__Api__EntidadesAssignment_5 )*
            {
             before(grammarAccess.getApiAccess().getEntidadesAssignment_5()); 
            // InternalMyDsl.g:1164:2: ( rule__Api__EntidadesAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==49||LA12_0==51) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1164:3: rule__Api__EntidadesAssignment_5
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
    // InternalMyDsl.g:1172:1: rule__Api__Group__6 : rule__Api__Group__6__Impl rule__Api__Group__7 ;
    public final void rule__Api__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1176:1: ( rule__Api__Group__6__Impl rule__Api__Group__7 )
            // InternalMyDsl.g:1177:2: rule__Api__Group__6__Impl rule__Api__Group__7
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
    // InternalMyDsl.g:1184:1: rule__Api__Group__6__Impl : ( ( rule__Api__PrimitivetypesAssignment_6 )* ) ;
    public final void rule__Api__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1188:1: ( ( ( rule__Api__PrimitivetypesAssignment_6 )* ) )
            // InternalMyDsl.g:1189:1: ( ( rule__Api__PrimitivetypesAssignment_6 )* )
            {
            // InternalMyDsl.g:1189:1: ( ( rule__Api__PrimitivetypesAssignment_6 )* )
            // InternalMyDsl.g:1190:2: ( rule__Api__PrimitivetypesAssignment_6 )*
            {
             before(grammarAccess.getApiAccess().getPrimitivetypesAssignment_6()); 
            // InternalMyDsl.g:1191:2: ( rule__Api__PrimitivetypesAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=19 && LA13_0<=21)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1191:3: rule__Api__PrimitivetypesAssignment_6
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
    // InternalMyDsl.g:1199:1: rule__Api__Group__7 : rule__Api__Group__7__Impl ;
    public final void rule__Api__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1203:1: ( rule__Api__Group__7__Impl )
            // InternalMyDsl.g:1204:2: rule__Api__Group__7__Impl
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
    // InternalMyDsl.g:1210:1: rule__Api__Group__7__Impl : ( ( rule__Api__ServiciosRestAssignment_7 )* ) ;
    public final void rule__Api__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1214:1: ( ( ( rule__Api__ServiciosRestAssignment_7 )* ) )
            // InternalMyDsl.g:1215:1: ( ( rule__Api__ServiciosRestAssignment_7 )* )
            {
            // InternalMyDsl.g:1215:1: ( ( rule__Api__ServiciosRestAssignment_7 )* )
            // InternalMyDsl.g:1216:2: ( rule__Api__ServiciosRestAssignment_7 )*
            {
             before(grammarAccess.getApiAccess().getServiciosRestAssignment_7()); 
            // InternalMyDsl.g:1217:2: ( rule__Api__ServiciosRestAssignment_7 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=36 && LA14_0<=39)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1217:3: rule__Api__ServiciosRestAssignment_7
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
    // InternalMyDsl.g:1226:1: rule__AtributoMocka__Group__0 : rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1 ;
    public final void rule__AtributoMocka__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1230:1: ( rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1 )
            // InternalMyDsl.g:1231:2: rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1
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
    // InternalMyDsl.g:1238:1: rule__AtributoMocka__Group__0__Impl : ( ( rule__AtributoMocka__TipoAssignment_0 ) ) ;
    public final void rule__AtributoMocka__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1242:1: ( ( ( rule__AtributoMocka__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:1243:1: ( ( rule__AtributoMocka__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:1243:1: ( ( rule__AtributoMocka__TipoAssignment_0 ) )
            // InternalMyDsl.g:1244:2: ( rule__AtributoMocka__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:1245:2: ( rule__AtributoMocka__TipoAssignment_0 )
            // InternalMyDsl.g:1245:3: rule__AtributoMocka__TipoAssignment_0
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
    // InternalMyDsl.g:1253:1: rule__AtributoMocka__Group__1 : rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2 ;
    public final void rule__AtributoMocka__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1257:1: ( rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2 )
            // InternalMyDsl.g:1258:2: rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2
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
    // InternalMyDsl.g:1265:1: rule__AtributoMocka__Group__1__Impl : ( ( rule__AtributoMocka__NombreAssignment_1 ) ) ;
    public final void rule__AtributoMocka__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1269:1: ( ( ( rule__AtributoMocka__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:1270:1: ( ( rule__AtributoMocka__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:1270:1: ( ( rule__AtributoMocka__NombreAssignment_1 ) )
            // InternalMyDsl.g:1271:2: ( rule__AtributoMocka__NombreAssignment_1 )
            {
             before(grammarAccess.getAtributoMockaAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:1272:2: ( rule__AtributoMocka__NombreAssignment_1 )
            // InternalMyDsl.g:1272:3: rule__AtributoMocka__NombreAssignment_1
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
    // InternalMyDsl.g:1280:1: rule__AtributoMocka__Group__2 : rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3 ;
    public final void rule__AtributoMocka__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1284:1: ( rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3 )
            // InternalMyDsl.g:1285:2: rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3
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
    // InternalMyDsl.g:1292:1: rule__AtributoMocka__Group__2__Impl : ( ( rule__AtributoMocka__Group_2__0 ) ) ;
    public final void rule__AtributoMocka__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1296:1: ( ( ( rule__AtributoMocka__Group_2__0 ) ) )
            // InternalMyDsl.g:1297:1: ( ( rule__AtributoMocka__Group_2__0 ) )
            {
            // InternalMyDsl.g:1297:1: ( ( rule__AtributoMocka__Group_2__0 ) )
            // InternalMyDsl.g:1298:2: ( rule__AtributoMocka__Group_2__0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getGroup_2()); 
            // InternalMyDsl.g:1299:2: ( rule__AtributoMocka__Group_2__0 )
            // InternalMyDsl.g:1299:3: rule__AtributoMocka__Group_2__0
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
    // InternalMyDsl.g:1307:1: rule__AtributoMocka__Group__3 : rule__AtributoMocka__Group__3__Impl ;
    public final void rule__AtributoMocka__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1311:1: ( rule__AtributoMocka__Group__3__Impl )
            // InternalMyDsl.g:1312:2: rule__AtributoMocka__Group__3__Impl
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
    // InternalMyDsl.g:1318:1: rule__AtributoMocka__Group__3__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoMocka__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1322:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1323:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1323:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1324:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:1334:1: rule__AtributoMocka__Group_2__0 : rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1 ;
    public final void rule__AtributoMocka__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1338:1: ( rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1 )
            // InternalMyDsl.g:1339:2: rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1
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
    // InternalMyDsl.g:1346:1: rule__AtributoMocka__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtributoMocka__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1350:1: ( ( '(' ) )
            // InternalMyDsl.g:1351:1: ( '(' )
            {
            // InternalMyDsl.g:1351:1: ( '(' )
            // InternalMyDsl.g:1352:2: '('
            {
             before(grammarAccess.getAtributoMockaAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyDsl.g:1361:1: rule__AtributoMocka__Group_2__1 : rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2 ;
    public final void rule__AtributoMocka__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1365:1: ( rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2 )
            // InternalMyDsl.g:1366:2: rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2
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
    // InternalMyDsl.g:1373:1: rule__AtributoMocka__Group_2__1__Impl : ( ( rule__AtributoMocka__Alternatives_2_1 ) ) ;
    public final void rule__AtributoMocka__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1377:1: ( ( ( rule__AtributoMocka__Alternatives_2_1 ) ) )
            // InternalMyDsl.g:1378:1: ( ( rule__AtributoMocka__Alternatives_2_1 ) )
            {
            // InternalMyDsl.g:1378:1: ( ( rule__AtributoMocka__Alternatives_2_1 ) )
            // InternalMyDsl.g:1379:2: ( rule__AtributoMocka__Alternatives_2_1 )
            {
             before(grammarAccess.getAtributoMockaAccess().getAlternatives_2_1()); 
            // InternalMyDsl.g:1380:2: ( rule__AtributoMocka__Alternatives_2_1 )
            // InternalMyDsl.g:1380:3: rule__AtributoMocka__Alternatives_2_1
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
    // InternalMyDsl.g:1388:1: rule__AtributoMocka__Group_2__2 : rule__AtributoMocka__Group_2__2__Impl ;
    public final void rule__AtributoMocka__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1392:1: ( rule__AtributoMocka__Group_2__2__Impl )
            // InternalMyDsl.g:1393:2: rule__AtributoMocka__Group_2__2__Impl
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
    // InternalMyDsl.g:1399:1: rule__AtributoMocka__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtributoMocka__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1403:1: ( ( ')' ) )
            // InternalMyDsl.g:1404:1: ( ')' )
            {
            // InternalMyDsl.g:1404:1: ( ')' )
            // InternalMyDsl.g:1405:2: ')'
            {
             before(grammarAccess.getAtributoMockaAccess().getRightParenthesisKeyword_2_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:1415:1: rule__AtributoMocka__Group_2_1_0__0 : rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1 ;
    public final void rule__AtributoMocka__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1419:1: ( rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1 )
            // InternalMyDsl.g:1420:2: rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1
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
    // InternalMyDsl.g:1427:1: rule__AtributoMocka__Group_2_1_0__0__Impl : ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1431:1: ( ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) ) )
            // InternalMyDsl.g:1432:1: ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) )
            {
            // InternalMyDsl.g:1432:1: ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) )
            // InternalMyDsl.g:1433:2: ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyAssignment_2_1_0_0()); 
            // InternalMyDsl.g:1434:2: ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 )
            // InternalMyDsl.g:1434:3: rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0
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
    // InternalMyDsl.g:1442:1: rule__AtributoMocka__Group_2_1_0__1 : rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2 ;
    public final void rule__AtributoMocka__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1446:1: ( rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2 )
            // InternalMyDsl.g:1447:2: rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2
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
    // InternalMyDsl.g:1454:1: rule__AtributoMocka__Group_2_1_0__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__AtributoMocka__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1458:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1459:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1459:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1460:2: RULE_EQUAL
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
    // InternalMyDsl.g:1469:1: rule__AtributoMocka__Group_2_1_0__2 : rule__AtributoMocka__Group_2_1_0__2__Impl ;
    public final void rule__AtributoMocka__Group_2_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1473:1: ( rule__AtributoMocka__Group_2_1_0__2__Impl )
            // InternalMyDsl.g:1474:2: rule__AtributoMocka__Group_2_1_0__2__Impl
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
    // InternalMyDsl.g:1480:1: rule__AtributoMocka__Group_2_1_0__2__Impl : ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1484:1: ( ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) ) )
            // InternalMyDsl.g:1485:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) )
            {
            // InternalMyDsl.g:1485:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) )
            // InternalMyDsl.g:1486:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 )
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_0_2()); 
            // InternalMyDsl.g:1487:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 )
            // InternalMyDsl.g:1487:3: rule__AtributoMocka__MockTypeAssignment_2_1_0_2
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
    // InternalMyDsl.g:1496:1: rule__AtributoMocka__Group_2_1_1__0 : rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1 ;
    public final void rule__AtributoMocka__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1500:1: ( rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1 )
            // InternalMyDsl.g:1501:2: rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1
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
    // InternalMyDsl.g:1508:1: rule__AtributoMocka__Group_2_1_1__0__Impl : ( 'mockType' ) ;
    public final void rule__AtributoMocka__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1512:1: ( ( 'mockType' ) )
            // InternalMyDsl.g:1513:1: ( 'mockType' )
            {
            // InternalMyDsl.g:1513:1: ( 'mockType' )
            // InternalMyDsl.g:1514:2: 'mockType'
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeKeyword_2_1_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:1523:1: rule__AtributoMocka__Group_2_1_1__1 : rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2 ;
    public final void rule__AtributoMocka__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1527:1: ( rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2 )
            // InternalMyDsl.g:1528:2: rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2
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
    // InternalMyDsl.g:1535:1: rule__AtributoMocka__Group_2_1_1__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__AtributoMocka__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1539:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1540:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1540:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1541:2: RULE_EQUAL
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
    // InternalMyDsl.g:1550:1: rule__AtributoMocka__Group_2_1_1__2 : rule__AtributoMocka__Group_2_1_1__2__Impl ;
    public final void rule__AtributoMocka__Group_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1554:1: ( rule__AtributoMocka__Group_2_1_1__2__Impl )
            // InternalMyDsl.g:1555:2: rule__AtributoMocka__Group_2_1_1__2__Impl
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
    // InternalMyDsl.g:1561:1: rule__AtributoMocka__Group_2_1_1__2__Impl : ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1565:1: ( ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) ) )
            // InternalMyDsl.g:1566:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) )
            {
            // InternalMyDsl.g:1566:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) )
            // InternalMyDsl.g:1567:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 )
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_1_2()); 
            // InternalMyDsl.g:1568:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 )
            // InternalMyDsl.g:1568:3: rule__AtributoMocka__MockTypeAssignment_2_1_1_2
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
    // InternalMyDsl.g:1577:1: rule__AtributoArreglo__Group__0 : rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1 ;
    public final void rule__AtributoArreglo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1581:1: ( rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1 )
            // InternalMyDsl.g:1582:2: rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1
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
    // InternalMyDsl.g:1589:1: rule__AtributoArreglo__Group__0__Impl : ( ( rule__AtributoArreglo__TipoAssignment_0 ) ) ;
    public final void rule__AtributoArreglo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1593:1: ( ( ( rule__AtributoArreglo__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:1594:1: ( ( rule__AtributoArreglo__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:1594:1: ( ( rule__AtributoArreglo__TipoAssignment_0 ) )
            // InternalMyDsl.g:1595:2: ( rule__AtributoArreglo__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoArregloAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:1596:2: ( rule__AtributoArreglo__TipoAssignment_0 )
            // InternalMyDsl.g:1596:3: rule__AtributoArreglo__TipoAssignment_0
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
    // InternalMyDsl.g:1604:1: rule__AtributoArreglo__Group__1 : rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2 ;
    public final void rule__AtributoArreglo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1608:1: ( rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2 )
            // InternalMyDsl.g:1609:2: rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2
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
    // InternalMyDsl.g:1616:1: rule__AtributoArreglo__Group__1__Impl : ( '[' ) ;
    public final void rule__AtributoArreglo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1620:1: ( ( '[' ) )
            // InternalMyDsl.g:1621:1: ( '[' )
            {
            // InternalMyDsl.g:1621:1: ( '[' )
            // InternalMyDsl.g:1622:2: '['
            {
             before(grammarAccess.getAtributoArregloAccess().getLeftSquareBracketKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:1631:1: rule__AtributoArreglo__Group__2 : rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3 ;
    public final void rule__AtributoArreglo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1635:1: ( rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3 )
            // InternalMyDsl.g:1636:2: rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3
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
    // InternalMyDsl.g:1643:1: rule__AtributoArreglo__Group__2__Impl : ( ']' ) ;
    public final void rule__AtributoArreglo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1647:1: ( ( ']' ) )
            // InternalMyDsl.g:1648:1: ( ']' )
            {
            // InternalMyDsl.g:1648:1: ( ']' )
            // InternalMyDsl.g:1649:2: ']'
            {
             before(grammarAccess.getAtributoArregloAccess().getRightSquareBracketKeyword_2()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:1658:1: rule__AtributoArreglo__Group__3 : rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4 ;
    public final void rule__AtributoArreglo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1662:1: ( rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4 )
            // InternalMyDsl.g:1663:2: rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4
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
    // InternalMyDsl.g:1670:1: rule__AtributoArreglo__Group__3__Impl : ( ( rule__AtributoArreglo__NombreAssignment_3 ) ) ;
    public final void rule__AtributoArreglo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1674:1: ( ( ( rule__AtributoArreglo__NombreAssignment_3 ) ) )
            // InternalMyDsl.g:1675:1: ( ( rule__AtributoArreglo__NombreAssignment_3 ) )
            {
            // InternalMyDsl.g:1675:1: ( ( rule__AtributoArreglo__NombreAssignment_3 ) )
            // InternalMyDsl.g:1676:2: ( rule__AtributoArreglo__NombreAssignment_3 )
            {
             before(grammarAccess.getAtributoArregloAccess().getNombreAssignment_3()); 
            // InternalMyDsl.g:1677:2: ( rule__AtributoArreglo__NombreAssignment_3 )
            // InternalMyDsl.g:1677:3: rule__AtributoArreglo__NombreAssignment_3
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
    // InternalMyDsl.g:1685:1: rule__AtributoArreglo__Group__4 : rule__AtributoArreglo__Group__4__Impl ;
    public final void rule__AtributoArreglo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1689:1: ( rule__AtributoArreglo__Group__4__Impl )
            // InternalMyDsl.g:1690:2: rule__AtributoArreglo__Group__4__Impl
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
    // InternalMyDsl.g:1696:1: rule__AtributoArreglo__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoArreglo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1700:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1701:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1701:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1702:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:1712:1: rule__AtributoSimple__Group__0 : rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 ;
    public final void rule__AtributoSimple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1716:1: ( rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 )
            // InternalMyDsl.g:1717:2: rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1
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
    // InternalMyDsl.g:1724:1: rule__AtributoSimple__Group__0__Impl : ( ( rule__AtributoSimple__TipoAssignment_0 ) ) ;
    public final void rule__AtributoSimple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1728:1: ( ( ( rule__AtributoSimple__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:1729:1: ( ( rule__AtributoSimple__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:1729:1: ( ( rule__AtributoSimple__TipoAssignment_0 ) )
            // InternalMyDsl.g:1730:2: ( rule__AtributoSimple__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:1731:2: ( rule__AtributoSimple__TipoAssignment_0 )
            // InternalMyDsl.g:1731:3: rule__AtributoSimple__TipoAssignment_0
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
    // InternalMyDsl.g:1739:1: rule__AtributoSimple__Group__1 : rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 ;
    public final void rule__AtributoSimple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1743:1: ( rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 )
            // InternalMyDsl.g:1744:2: rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2
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
    // InternalMyDsl.g:1751:1: rule__AtributoSimple__Group__1__Impl : ( ( rule__AtributoSimple__NombreAssignment_1 ) ) ;
    public final void rule__AtributoSimple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1755:1: ( ( ( rule__AtributoSimple__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:1756:1: ( ( rule__AtributoSimple__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:1756:1: ( ( rule__AtributoSimple__NombreAssignment_1 ) )
            // InternalMyDsl.g:1757:2: ( rule__AtributoSimple__NombreAssignment_1 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:1758:2: ( rule__AtributoSimple__NombreAssignment_1 )
            // InternalMyDsl.g:1758:3: rule__AtributoSimple__NombreAssignment_1
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
    // InternalMyDsl.g:1766:1: rule__AtributoSimple__Group__2 : rule__AtributoSimple__Group__2__Impl ;
    public final void rule__AtributoSimple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1770:1: ( rule__AtributoSimple__Group__2__Impl )
            // InternalMyDsl.g:1771:2: rule__AtributoSimple__Group__2__Impl
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
    // InternalMyDsl.g:1777:1: rule__AtributoSimple__Group__2__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoSimple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1781:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1782:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1782:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1783:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:1793:1: rule__MockarooEntity__Group__0 : rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1 ;
    public final void rule__MockarooEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1797:1: ( rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1 )
            // InternalMyDsl.g:1798:2: rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1
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
    // InternalMyDsl.g:1805:1: rule__MockarooEntity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__MockarooEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1809:1: ( ( 'Entity' ) )
            // InternalMyDsl.g:1810:1: ( 'Entity' )
            {
            // InternalMyDsl.g:1810:1: ( 'Entity' )
            // InternalMyDsl.g:1811:2: 'Entity'
            {
             before(grammarAccess.getMockarooEntityAccess().getEntityKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:1820:1: rule__MockarooEntity__Group__1 : rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2 ;
    public final void rule__MockarooEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1824:1: ( rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2 )
            // InternalMyDsl.g:1825:2: rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2
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
    // InternalMyDsl.g:1832:1: rule__MockarooEntity__Group__1__Impl : ( ( rule__MockarooEntity__NombreAssignment_1 ) ) ;
    public final void rule__MockarooEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1836:1: ( ( ( rule__MockarooEntity__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:1837:1: ( ( rule__MockarooEntity__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:1837:1: ( ( rule__MockarooEntity__NombreAssignment_1 ) )
            // InternalMyDsl.g:1838:2: ( rule__MockarooEntity__NombreAssignment_1 )
            {
             before(grammarAccess.getMockarooEntityAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:1839:2: ( rule__MockarooEntity__NombreAssignment_1 )
            // InternalMyDsl.g:1839:3: rule__MockarooEntity__NombreAssignment_1
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
    // InternalMyDsl.g:1847:1: rule__MockarooEntity__Group__2 : rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3 ;
    public final void rule__MockarooEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1851:1: ( rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3 )
            // InternalMyDsl.g:1852:2: rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3
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
    // InternalMyDsl.g:1859:1: rule__MockarooEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__MockarooEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1863:1: ( ( '{' ) )
            // InternalMyDsl.g:1864:1: ( '{' )
            {
            // InternalMyDsl.g:1864:1: ( '{' )
            // InternalMyDsl.g:1865:2: '{'
            {
             before(grammarAccess.getMockarooEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:1874:1: rule__MockarooEntity__Group__3 : rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4 ;
    public final void rule__MockarooEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1878:1: ( rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4 )
            // InternalMyDsl.g:1879:2: rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4
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
    // InternalMyDsl.g:1886:1: rule__MockarooEntity__Group__3__Impl : ( ( rule__MockarooEntity__AtributosAssignment_3 )* ) ;
    public final void rule__MockarooEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1890:1: ( ( ( rule__MockarooEntity__AtributosAssignment_3 )* ) )
            // InternalMyDsl.g:1891:1: ( ( rule__MockarooEntity__AtributosAssignment_3 )* )
            {
            // InternalMyDsl.g:1891:1: ( ( rule__MockarooEntity__AtributosAssignment_3 )* )
            // InternalMyDsl.g:1892:2: ( rule__MockarooEntity__AtributosAssignment_3 )*
            {
             before(grammarAccess.getMockarooEntityAccess().getAtributosAssignment_3()); 
            // InternalMyDsl.g:1893:2: ( rule__MockarooEntity__AtributosAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=19 && LA15_0<=21)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1893:3: rule__MockarooEntity__AtributosAssignment_3
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
    // InternalMyDsl.g:1901:1: rule__MockarooEntity__Group__4 : rule__MockarooEntity__Group__4__Impl ;
    public final void rule__MockarooEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1905:1: ( rule__MockarooEntity__Group__4__Impl )
            // InternalMyDsl.g:1906:2: rule__MockarooEntity__Group__4__Impl
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
    // InternalMyDsl.g:1912:1: rule__MockarooEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__MockarooEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1916:1: ( ( '}' ) )
            // InternalMyDsl.g:1917:1: ( '}' )
            {
            // InternalMyDsl.g:1917:1: ( '}' )
            // InternalMyDsl.g:1918:2: '}'
            {
             before(grammarAccess.getMockarooEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:1928:1: rule__ServicioRest__Group__0 : rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1 ;
    public final void rule__ServicioRest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1932:1: ( rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1 )
            // InternalMyDsl.g:1933:2: rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1
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
    // InternalMyDsl.g:1940:1: rule__ServicioRest__Group__0__Impl : ( ( rule__ServicioRest__MetodoAssignment_0 ) ) ;
    public final void rule__ServicioRest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1944:1: ( ( ( rule__ServicioRest__MetodoAssignment_0 ) ) )
            // InternalMyDsl.g:1945:1: ( ( rule__ServicioRest__MetodoAssignment_0 ) )
            {
            // InternalMyDsl.g:1945:1: ( ( rule__ServicioRest__MetodoAssignment_0 ) )
            // InternalMyDsl.g:1946:2: ( rule__ServicioRest__MetodoAssignment_0 )
            {
             before(grammarAccess.getServicioRestAccess().getMetodoAssignment_0()); 
            // InternalMyDsl.g:1947:2: ( rule__ServicioRest__MetodoAssignment_0 )
            // InternalMyDsl.g:1947:3: rule__ServicioRest__MetodoAssignment_0
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
    // InternalMyDsl.g:1955:1: rule__ServicioRest__Group__1 : rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2 ;
    public final void rule__ServicioRest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1959:1: ( rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2 )
            // InternalMyDsl.g:1960:2: rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2
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
    // InternalMyDsl.g:1967:1: rule__ServicioRest__Group__1__Impl : ( ( rule__ServicioRest__NombreAssignment_1 ) ) ;
    public final void rule__ServicioRest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1971:1: ( ( ( rule__ServicioRest__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:1972:1: ( ( rule__ServicioRest__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:1972:1: ( ( rule__ServicioRest__NombreAssignment_1 ) )
            // InternalMyDsl.g:1973:2: ( rule__ServicioRest__NombreAssignment_1 )
            {
             before(grammarAccess.getServicioRestAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:1974:2: ( rule__ServicioRest__NombreAssignment_1 )
            // InternalMyDsl.g:1974:3: rule__ServicioRest__NombreAssignment_1
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
    // InternalMyDsl.g:1982:1: rule__ServicioRest__Group__2 : rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3 ;
    public final void rule__ServicioRest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1986:1: ( rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3 )
            // InternalMyDsl.g:1987:2: rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3
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
    // InternalMyDsl.g:1994:1: rule__ServicioRest__Group__2__Impl : ( '{' ) ;
    public final void rule__ServicioRest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1998:1: ( ( '{' ) )
            // InternalMyDsl.g:1999:1: ( '{' )
            {
            // InternalMyDsl.g:1999:1: ( '{' )
            // InternalMyDsl.g:2000:2: '{'
            {
             before(grammarAccess.getServicioRestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:2009:1: rule__ServicioRest__Group__3 : rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4 ;
    public final void rule__ServicioRest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2013:1: ( rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4 )
            // InternalMyDsl.g:2014:2: rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4
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
    // InternalMyDsl.g:2021:1: rule__ServicioRest__Group__3__Impl : ( 'URL' ) ;
    public final void rule__ServicioRest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2025:1: ( ( 'URL' ) )
            // InternalMyDsl.g:2026:1: ( 'URL' )
            {
            // InternalMyDsl.g:2026:1: ( 'URL' )
            // InternalMyDsl.g:2027:2: 'URL'
            {
             before(grammarAccess.getServicioRestAccess().getURLKeyword_3()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:2036:1: rule__ServicioRest__Group__4 : rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5 ;
    public final void rule__ServicioRest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2040:1: ( rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5 )
            // InternalMyDsl.g:2041:2: rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5
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
    // InternalMyDsl.g:2048:1: rule__ServicioRest__Group__4__Impl : ( RULE_EQUAL ) ;
    public final void rule__ServicioRest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2052:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:2053:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:2053:1: ( RULE_EQUAL )
            // InternalMyDsl.g:2054:2: RULE_EQUAL
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
    // InternalMyDsl.g:2063:1: rule__ServicioRest__Group__5 : rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6 ;
    public final void rule__ServicioRest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2067:1: ( rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6 )
            // InternalMyDsl.g:2068:2: rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6
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
    // InternalMyDsl.g:2075:1: rule__ServicioRest__Group__5__Impl : ( '/' ) ;
    public final void rule__ServicioRest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2079:1: ( ( '/' ) )
            // InternalMyDsl.g:2080:1: ( '/' )
            {
            // InternalMyDsl.g:2080:1: ( '/' )
            // InternalMyDsl.g:2081:2: '/'
            {
             before(grammarAccess.getServicioRestAccess().getSolidusKeyword_5()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMyDsl.g:2090:1: rule__ServicioRest__Group__6 : rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7 ;
    public final void rule__ServicioRest__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2094:1: ( rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7 )
            // InternalMyDsl.g:2095:2: rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7
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
    // InternalMyDsl.g:2102:1: rule__ServicioRest__Group__6__Impl : ( ( rule__ServicioRest__UrlAssignment_6 ) ) ;
    public final void rule__ServicioRest__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2106:1: ( ( ( rule__ServicioRest__UrlAssignment_6 ) ) )
            // InternalMyDsl.g:2107:1: ( ( rule__ServicioRest__UrlAssignment_6 ) )
            {
            // InternalMyDsl.g:2107:1: ( ( rule__ServicioRest__UrlAssignment_6 ) )
            // InternalMyDsl.g:2108:2: ( rule__ServicioRest__UrlAssignment_6 )
            {
             before(grammarAccess.getServicioRestAccess().getUrlAssignment_6()); 
            // InternalMyDsl.g:2109:2: ( rule__ServicioRest__UrlAssignment_6 )
            // InternalMyDsl.g:2109:3: rule__ServicioRest__UrlAssignment_6
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
    // InternalMyDsl.g:2117:1: rule__ServicioRest__Group__7 : rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8 ;
    public final void rule__ServicioRest__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2121:1: ( rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8 )
            // InternalMyDsl.g:2122:2: rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8
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
    // InternalMyDsl.g:2129:1: rule__ServicioRest__Group__7__Impl : ( ( rule__ServicioRest__Alternatives_7 )* ) ;
    public final void rule__ServicioRest__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2133:1: ( ( ( rule__ServicioRest__Alternatives_7 )* ) )
            // InternalMyDsl.g:2134:1: ( ( rule__ServicioRest__Alternatives_7 )* )
            {
            // InternalMyDsl.g:2134:1: ( ( rule__ServicioRest__Alternatives_7 )* )
            // InternalMyDsl.g:2135:2: ( rule__ServicioRest__Alternatives_7 )*
            {
             before(grammarAccess.getServicioRestAccess().getAlternatives_7()); 
            // InternalMyDsl.g:2136:2: ( rule__ServicioRest__Alternatives_7 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||(LA16_0>=13 && LA16_0<=18)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:2136:3: rule__ServicioRest__Alternatives_7
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
    // InternalMyDsl.g:2144:1: rule__ServicioRest__Group__8 : rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9 ;
    public final void rule__ServicioRest__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2148:1: ( rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9 )
            // InternalMyDsl.g:2149:2: rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9
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
    // InternalMyDsl.g:2156:1: rule__ServicioRest__Group__8__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__ServicioRest__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2160:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2161:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2161:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2162:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:2171:1: rule__ServicioRest__Group__9 : rule__ServicioRest__Group__9__Impl rule__ServicioRest__Group__10 ;
    public final void rule__ServicioRest__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2175:1: ( rule__ServicioRest__Group__9__Impl rule__ServicioRest__Group__10 )
            // InternalMyDsl.g:2176:2: rule__ServicioRest__Group__9__Impl rule__ServicioRest__Group__10
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
    // InternalMyDsl.g:2183:1: rule__ServicioRest__Group__9__Impl : ( ( rule__ServicioRest__RequestAssignment_9 )? ) ;
    public final void rule__ServicioRest__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2187:1: ( ( ( rule__ServicioRest__RequestAssignment_9 )? ) )
            // InternalMyDsl.g:2188:1: ( ( rule__ServicioRest__RequestAssignment_9 )? )
            {
            // InternalMyDsl.g:2188:1: ( ( rule__ServicioRest__RequestAssignment_9 )? )
            // InternalMyDsl.g:2189:2: ( rule__ServicioRest__RequestAssignment_9 )?
            {
             before(grammarAccess.getServicioRestAccess().getRequestAssignment_9()); 
            // InternalMyDsl.g:2190:2: ( rule__ServicioRest__RequestAssignment_9 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==54) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2190:3: rule__ServicioRest__RequestAssignment_9
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
    // InternalMyDsl.g:2198:1: rule__ServicioRest__Group__10 : rule__ServicioRest__Group__10__Impl rule__ServicioRest__Group__11 ;
    public final void rule__ServicioRest__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2202:1: ( rule__ServicioRest__Group__10__Impl rule__ServicioRest__Group__11 )
            // InternalMyDsl.g:2203:2: rule__ServicioRest__Group__10__Impl rule__ServicioRest__Group__11
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
    // InternalMyDsl.g:2210:1: rule__ServicioRest__Group__10__Impl : ( ( rule__ServicioRest__ResponseAssignment_10 ) ) ;
    public final void rule__ServicioRest__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2214:1: ( ( ( rule__ServicioRest__ResponseAssignment_10 ) ) )
            // InternalMyDsl.g:2215:1: ( ( rule__ServicioRest__ResponseAssignment_10 ) )
            {
            // InternalMyDsl.g:2215:1: ( ( rule__ServicioRest__ResponseAssignment_10 ) )
            // InternalMyDsl.g:2216:2: ( rule__ServicioRest__ResponseAssignment_10 )
            {
             before(grammarAccess.getServicioRestAccess().getResponseAssignment_10()); 
            // InternalMyDsl.g:2217:2: ( rule__ServicioRest__ResponseAssignment_10 )
            // InternalMyDsl.g:2217:3: rule__ServicioRest__ResponseAssignment_10
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
    // InternalMyDsl.g:2225:1: rule__ServicioRest__Group__11 : rule__ServicioRest__Group__11__Impl ;
    public final void rule__ServicioRest__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2229:1: ( rule__ServicioRest__Group__11__Impl )
            // InternalMyDsl.g:2230:2: rule__ServicioRest__Group__11__Impl
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
    // InternalMyDsl.g:2236:1: rule__ServicioRest__Group__11__Impl : ( '}' ) ;
    public final void rule__ServicioRest__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2240:1: ( ( '}' ) )
            // InternalMyDsl.g:2241:1: ( '}' )
            {
            // InternalMyDsl.g:2241:1: ( '}' )
            // InternalMyDsl.g:2242:2: '}'
            {
             before(grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_11()); 
            match(input,16,FOLLOW_2); 
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


    // $ANTLR start "rule__SimpleEntity__Group__0"
    // InternalMyDsl.g:2252:1: rule__SimpleEntity__Group__0 : rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 ;
    public final void rule__SimpleEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2256:1: ( rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 )
            // InternalMyDsl.g:2257:2: rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1
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
    // InternalMyDsl.g:2264:1: rule__SimpleEntity__Group__0__Impl : ( 'SimpleEntity' ) ;
    public final void rule__SimpleEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2268:1: ( ( 'SimpleEntity' ) )
            // InternalMyDsl.g:2269:1: ( 'SimpleEntity' )
            {
            // InternalMyDsl.g:2269:1: ( 'SimpleEntity' )
            // InternalMyDsl.g:2270:2: 'SimpleEntity'
            {
             before(grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:2279:1: rule__SimpleEntity__Group__1 : rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 ;
    public final void rule__SimpleEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2283:1: ( rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 )
            // InternalMyDsl.g:2284:2: rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2
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
    // InternalMyDsl.g:2291:1: rule__SimpleEntity__Group__1__Impl : ( ( rule__SimpleEntity__NombreAssignment_1 ) ) ;
    public final void rule__SimpleEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2295:1: ( ( ( rule__SimpleEntity__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:2296:1: ( ( rule__SimpleEntity__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:2296:1: ( ( rule__SimpleEntity__NombreAssignment_1 ) )
            // InternalMyDsl.g:2297:2: ( rule__SimpleEntity__NombreAssignment_1 )
            {
             before(grammarAccess.getSimpleEntityAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:2298:2: ( rule__SimpleEntity__NombreAssignment_1 )
            // InternalMyDsl.g:2298:3: rule__SimpleEntity__NombreAssignment_1
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
    // InternalMyDsl.g:2306:1: rule__SimpleEntity__Group__2 : rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 ;
    public final void rule__SimpleEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2310:1: ( rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 )
            // InternalMyDsl.g:2311:2: rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3
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
    // InternalMyDsl.g:2318:1: rule__SimpleEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__SimpleEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2322:1: ( ( '{' ) )
            // InternalMyDsl.g:2323:1: ( '{' )
            {
            // InternalMyDsl.g:2323:1: ( '{' )
            // InternalMyDsl.g:2324:2: '{'
            {
             before(grammarAccess.getSimpleEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:2333:1: rule__SimpleEntity__Group__3 : rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 ;
    public final void rule__SimpleEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2337:1: ( rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 )
            // InternalMyDsl.g:2338:2: rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4
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
    // InternalMyDsl.g:2345:1: rule__SimpleEntity__Group__3__Impl : ( ( rule__SimpleEntity__AtributosAssignment_3 )* ) ;
    public final void rule__SimpleEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2349:1: ( ( ( rule__SimpleEntity__AtributosAssignment_3 )* ) )
            // InternalMyDsl.g:2350:1: ( ( rule__SimpleEntity__AtributosAssignment_3 )* )
            {
            // InternalMyDsl.g:2350:1: ( ( rule__SimpleEntity__AtributosAssignment_3 )* )
            // InternalMyDsl.g:2351:2: ( rule__SimpleEntity__AtributosAssignment_3 )*
            {
             before(grammarAccess.getSimpleEntityAccess().getAtributosAssignment_3()); 
            // InternalMyDsl.g:2352:2: ( rule__SimpleEntity__AtributosAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=19 && LA18_0<=21)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:2352:3: rule__SimpleEntity__AtributosAssignment_3
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
    // InternalMyDsl.g:2360:1: rule__SimpleEntity__Group__4 : rule__SimpleEntity__Group__4__Impl ;
    public final void rule__SimpleEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2364:1: ( rule__SimpleEntity__Group__4__Impl )
            // InternalMyDsl.g:2365:2: rule__SimpleEntity__Group__4__Impl
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
    // InternalMyDsl.g:2371:1: rule__SimpleEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__SimpleEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2375:1: ( ( '}' ) )
            // InternalMyDsl.g:2376:1: ( '}' )
            {
            // InternalMyDsl.g:2376:1: ( '}' )
            // InternalMyDsl.g:2377:2: '}'
            {
             before(grammarAccess.getSimpleEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:2387:1: rule__Response__Group__0 : rule__Response__Group__0__Impl rule__Response__Group__1 ;
    public final void rule__Response__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2391:1: ( rule__Response__Group__0__Impl rule__Response__Group__1 )
            // InternalMyDsl.g:2392:2: rule__Response__Group__0__Impl rule__Response__Group__1
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
    // InternalMyDsl.g:2399:1: rule__Response__Group__0__Impl : ( 'Response' ) ;
    public final void rule__Response__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2403:1: ( ( 'Response' ) )
            // InternalMyDsl.g:2404:1: ( 'Response' )
            {
            // InternalMyDsl.g:2404:1: ( 'Response' )
            // InternalMyDsl.g:2405:2: 'Response'
            {
             before(grammarAccess.getResponseAccess().getResponseKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:2414:1: rule__Response__Group__1 : rule__Response__Group__1__Impl rule__Response__Group__2 ;
    public final void rule__Response__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2418:1: ( rule__Response__Group__1__Impl rule__Response__Group__2 )
            // InternalMyDsl.g:2419:2: rule__Response__Group__1__Impl rule__Response__Group__2
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
    // InternalMyDsl.g:2426:1: rule__Response__Group__1__Impl : ( '{' ) ;
    public final void rule__Response__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2430:1: ( ( '{' ) )
            // InternalMyDsl.g:2431:1: ( '{' )
            {
            // InternalMyDsl.g:2431:1: ( '{' )
            // InternalMyDsl.g:2432:2: '{'
            {
             before(grammarAccess.getResponseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:2441:1: rule__Response__Group__2 : rule__Response__Group__2__Impl rule__Response__Group__3 ;
    public final void rule__Response__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2445:1: ( rule__Response__Group__2__Impl rule__Response__Group__3 )
            // InternalMyDsl.g:2446:2: rule__Response__Group__2__Impl rule__Response__Group__3
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
    // InternalMyDsl.g:2453:1: rule__Response__Group__2__Impl : ( 'Type' ) ;
    public final void rule__Response__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2457:1: ( ( 'Type' ) )
            // InternalMyDsl.g:2458:1: ( 'Type' )
            {
            // InternalMyDsl.g:2458:1: ( 'Type' )
            // InternalMyDsl.g:2459:2: 'Type'
            {
             before(grammarAccess.getResponseAccess().getTypeKeyword_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:2468:1: rule__Response__Group__3 : rule__Response__Group__3__Impl rule__Response__Group__4 ;
    public final void rule__Response__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2472:1: ( rule__Response__Group__3__Impl rule__Response__Group__4 )
            // InternalMyDsl.g:2473:2: rule__Response__Group__3__Impl rule__Response__Group__4
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
    // InternalMyDsl.g:2480:1: rule__Response__Group__3__Impl : ( RULE_EQUAL ) ;
    public final void rule__Response__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2484:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:2485:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:2485:1: ( RULE_EQUAL )
            // InternalMyDsl.g:2486:2: RULE_EQUAL
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
    // InternalMyDsl.g:2495:1: rule__Response__Group__4 : rule__Response__Group__4__Impl rule__Response__Group__5 ;
    public final void rule__Response__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2499:1: ( rule__Response__Group__4__Impl rule__Response__Group__5 )
            // InternalMyDsl.g:2500:2: rule__Response__Group__4__Impl rule__Response__Group__5
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
    // InternalMyDsl.g:2507:1: rule__Response__Group__4__Impl : ( ( rule__Response__TypeAssignment_4 ) ) ;
    public final void rule__Response__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2511:1: ( ( ( rule__Response__TypeAssignment_4 ) ) )
            // InternalMyDsl.g:2512:1: ( ( rule__Response__TypeAssignment_4 ) )
            {
            // InternalMyDsl.g:2512:1: ( ( rule__Response__TypeAssignment_4 ) )
            // InternalMyDsl.g:2513:2: ( rule__Response__TypeAssignment_4 )
            {
             before(grammarAccess.getResponseAccess().getTypeAssignment_4()); 
            // InternalMyDsl.g:2514:2: ( rule__Response__TypeAssignment_4 )
            // InternalMyDsl.g:2514:3: rule__Response__TypeAssignment_4
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
    // InternalMyDsl.g:2522:1: rule__Response__Group__5 : rule__Response__Group__5__Impl rule__Response__Group__6 ;
    public final void rule__Response__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2526:1: ( rule__Response__Group__5__Impl rule__Response__Group__6 )
            // InternalMyDsl.g:2527:2: rule__Response__Group__5__Impl rule__Response__Group__6
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
    // InternalMyDsl.g:2534:1: rule__Response__Group__5__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Response__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2538:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2539:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2539:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2540:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:2549:1: rule__Response__Group__6 : rule__Response__Group__6__Impl ;
    public final void rule__Response__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2553:1: ( rule__Response__Group__6__Impl )
            // InternalMyDsl.g:2554:2: rule__Response__Group__6__Impl
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
    // InternalMyDsl.g:2560:1: rule__Response__Group__6__Impl : ( '}' ) ;
    public final void rule__Response__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2564:1: ( ( '}' ) )
            // InternalMyDsl.g:2565:1: ( '}' )
            {
            // InternalMyDsl.g:2565:1: ( '}' )
            // InternalMyDsl.g:2566:2: '}'
            {
             before(grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:2576:1: rule__Request__Group__0 : rule__Request__Group__0__Impl rule__Request__Group__1 ;
    public final void rule__Request__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2580:1: ( rule__Request__Group__0__Impl rule__Request__Group__1 )
            // InternalMyDsl.g:2581:2: rule__Request__Group__0__Impl rule__Request__Group__1
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
    // InternalMyDsl.g:2588:1: rule__Request__Group__0__Impl : ( 'Request' ) ;
    public final void rule__Request__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2592:1: ( ( 'Request' ) )
            // InternalMyDsl.g:2593:1: ( 'Request' )
            {
            // InternalMyDsl.g:2593:1: ( 'Request' )
            // InternalMyDsl.g:2594:2: 'Request'
            {
             before(grammarAccess.getRequestAccess().getRequestKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMyDsl.g:2603:1: rule__Request__Group__1 : rule__Request__Group__1__Impl rule__Request__Group__2 ;
    public final void rule__Request__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2607:1: ( rule__Request__Group__1__Impl rule__Request__Group__2 )
            // InternalMyDsl.g:2608:2: rule__Request__Group__1__Impl rule__Request__Group__2
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
    // InternalMyDsl.g:2615:1: rule__Request__Group__1__Impl : ( '{' ) ;
    public final void rule__Request__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2619:1: ( ( '{' ) )
            // InternalMyDsl.g:2620:1: ( '{' )
            {
            // InternalMyDsl.g:2620:1: ( '{' )
            // InternalMyDsl.g:2621:2: '{'
            {
             before(grammarAccess.getRequestAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:2630:1: rule__Request__Group__2 : rule__Request__Group__2__Impl rule__Request__Group__3 ;
    public final void rule__Request__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2634:1: ( rule__Request__Group__2__Impl rule__Request__Group__3 )
            // InternalMyDsl.g:2635:2: rule__Request__Group__2__Impl rule__Request__Group__3
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
    // InternalMyDsl.g:2642:1: rule__Request__Group__2__Impl : ( 'Type' ) ;
    public final void rule__Request__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2646:1: ( ( 'Type' ) )
            // InternalMyDsl.g:2647:1: ( 'Type' )
            {
            // InternalMyDsl.g:2647:1: ( 'Type' )
            // InternalMyDsl.g:2648:2: 'Type'
            {
             before(grammarAccess.getRequestAccess().getTypeKeyword_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:2657:1: rule__Request__Group__3 : rule__Request__Group__3__Impl rule__Request__Group__4 ;
    public final void rule__Request__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2661:1: ( rule__Request__Group__3__Impl rule__Request__Group__4 )
            // InternalMyDsl.g:2662:2: rule__Request__Group__3__Impl rule__Request__Group__4
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
    // InternalMyDsl.g:2669:1: rule__Request__Group__3__Impl : ( RULE_EQUAL ) ;
    public final void rule__Request__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2673:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:2674:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:2674:1: ( RULE_EQUAL )
            // InternalMyDsl.g:2675:2: RULE_EQUAL
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
    // InternalMyDsl.g:2684:1: rule__Request__Group__4 : rule__Request__Group__4__Impl rule__Request__Group__5 ;
    public final void rule__Request__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2688:1: ( rule__Request__Group__4__Impl rule__Request__Group__5 )
            // InternalMyDsl.g:2689:2: rule__Request__Group__4__Impl rule__Request__Group__5
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
    // InternalMyDsl.g:2696:1: rule__Request__Group__4__Impl : ( ( rule__Request__TypeAssignment_4 ) ) ;
    public final void rule__Request__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2700:1: ( ( ( rule__Request__TypeAssignment_4 ) ) )
            // InternalMyDsl.g:2701:1: ( ( rule__Request__TypeAssignment_4 ) )
            {
            // InternalMyDsl.g:2701:1: ( ( rule__Request__TypeAssignment_4 ) )
            // InternalMyDsl.g:2702:2: ( rule__Request__TypeAssignment_4 )
            {
             before(grammarAccess.getRequestAccess().getTypeAssignment_4()); 
            // InternalMyDsl.g:2703:2: ( rule__Request__TypeAssignment_4 )
            // InternalMyDsl.g:2703:3: rule__Request__TypeAssignment_4
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
    // InternalMyDsl.g:2711:1: rule__Request__Group__5 : rule__Request__Group__5__Impl rule__Request__Group__6 ;
    public final void rule__Request__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2715:1: ( rule__Request__Group__5__Impl rule__Request__Group__6 )
            // InternalMyDsl.g:2716:2: rule__Request__Group__5__Impl rule__Request__Group__6
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
    // InternalMyDsl.g:2723:1: rule__Request__Group__5__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Request__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2727:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2728:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2728:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2729:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:2738:1: rule__Request__Group__6 : rule__Request__Group__6__Impl ;
    public final void rule__Request__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2742:1: ( rule__Request__Group__6__Impl )
            // InternalMyDsl.g:2743:2: rule__Request__Group__6__Impl
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
    // InternalMyDsl.g:2749:1: rule__Request__Group__6__Impl : ( '}' ) ;
    public final void rule__Request__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2753:1: ( ( '}' ) )
            // InternalMyDsl.g:2754:1: ( '}' )
            {
            // InternalMyDsl.g:2754:1: ( '}' )
            // InternalMyDsl.g:2755:2: '}'
            {
             before(grammarAccess.getRequestAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:2765:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2769:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalMyDsl.g:2770:2: rule__Type__Group__0__Impl rule__Type__Group__1
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
    // InternalMyDsl.g:2777:1: rule__Type__Group__0__Impl : ( ( rule__Type__Alternatives_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2781:1: ( ( ( rule__Type__Alternatives_0 ) ) )
            // InternalMyDsl.g:2782:1: ( ( rule__Type__Alternatives_0 ) )
            {
            // InternalMyDsl.g:2782:1: ( ( rule__Type__Alternatives_0 ) )
            // InternalMyDsl.g:2783:2: ( rule__Type__Alternatives_0 )
            {
             before(grammarAccess.getTypeAccess().getAlternatives_0()); 
            // InternalMyDsl.g:2784:2: ( rule__Type__Alternatives_0 )
            // InternalMyDsl.g:2784:3: rule__Type__Alternatives_0
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
    // InternalMyDsl.g:2792:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2796:1: ( rule__Type__Group__1__Impl )
            // InternalMyDsl.g:2797:2: rule__Type__Group__1__Impl
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
    // InternalMyDsl.g:2803:1: rule__Type__Group__1__Impl : ( ( rule__Type__Group_1__0 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2807:1: ( ( ( rule__Type__Group_1__0 )? ) )
            // InternalMyDsl.g:2808:1: ( ( rule__Type__Group_1__0 )? )
            {
            // InternalMyDsl.g:2808:1: ( ( rule__Type__Group_1__0 )? )
            // InternalMyDsl.g:2809:2: ( rule__Type__Group_1__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_1()); 
            // InternalMyDsl.g:2810:2: ( rule__Type__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==47) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2810:3: rule__Type__Group_1__0
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
    // InternalMyDsl.g:2819:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2823:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalMyDsl.g:2824:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
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
    // InternalMyDsl.g:2831:1: rule__Type__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2835:1: ( ( '[' ) )
            // InternalMyDsl.g:2836:1: ( '[' )
            {
            // InternalMyDsl.g:2836:1: ( '[' )
            // InternalMyDsl.g:2837:2: '['
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:2846:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2850:1: ( rule__Type__Group_1__1__Impl )
            // InternalMyDsl.g:2851:2: rule__Type__Group_1__1__Impl
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
    // InternalMyDsl.g:2857:1: rule__Type__Group_1__1__Impl : ( ']' ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2861:1: ( ( ']' ) )
            // InternalMyDsl.g:2862:1: ( ']' )
            {
            // InternalMyDsl.g:2862:1: ( ']' )
            // InternalMyDsl.g:2863:2: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:2873:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2877:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalMyDsl.g:2878:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
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
    // InternalMyDsl.g:2885:1: rule__Mapping__Group__0__Impl : ( 'Mapping' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2889:1: ( ( 'Mapping' ) )
            // InternalMyDsl.g:2890:1: ( 'Mapping' )
            {
            // InternalMyDsl.g:2890:1: ( 'Mapping' )
            // InternalMyDsl.g:2891:2: 'Mapping'
            {
             before(grammarAccess.getMappingAccess().getMappingKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMyDsl.g:2900:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2904:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalMyDsl.g:2905:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
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
    // InternalMyDsl.g:2912:1: rule__Mapping__Group__1__Impl : ( '{' ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2916:1: ( ( '{' ) )
            // InternalMyDsl.g:2917:1: ( '{' )
            {
            // InternalMyDsl.g:2917:1: ( '{' )
            // InternalMyDsl.g:2918:2: '{'
            {
             before(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:2927:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2931:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // InternalMyDsl.g:2932:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
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
    // InternalMyDsl.g:2939:1: rule__Mapping__Group__2__Impl : ( 'value' ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2943:1: ( ( 'value' ) )
            // InternalMyDsl.g:2944:1: ( 'value' )
            {
            // InternalMyDsl.g:2944:1: ( 'value' )
            // InternalMyDsl.g:2945:2: 'value'
            {
             before(grammarAccess.getMappingAccess().getValueKeyword_2()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMyDsl.g:2954:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2958:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // InternalMyDsl.g:2959:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:2966:1: rule__Mapping__Group__3__Impl : ( ( rule__Mapping__ValueAssignment_3 ) ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2970:1: ( ( ( rule__Mapping__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:2971:1: ( ( rule__Mapping__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:2971:1: ( ( rule__Mapping__ValueAssignment_3 ) )
            // InternalMyDsl.g:2972:2: ( rule__Mapping__ValueAssignment_3 )
            {
             before(grammarAccess.getMappingAccess().getValueAssignment_3()); 
            // InternalMyDsl.g:2973:2: ( rule__Mapping__ValueAssignment_3 )
            // InternalMyDsl.g:2973:3: rule__Mapping__ValueAssignment_3
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
    // InternalMyDsl.g:2981:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl rule__Mapping__Group__5 ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2985:1: ( rule__Mapping__Group__4__Impl rule__Mapping__Group__5 )
            // InternalMyDsl.g:2986:2: rule__Mapping__Group__4__Impl rule__Mapping__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:2993:1: rule__Mapping__Group__4__Impl : ( 'parametro' ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2997:1: ( ( 'parametro' ) )
            // InternalMyDsl.g:2998:1: ( 'parametro' )
            {
            // InternalMyDsl.g:2998:1: ( 'parametro' )
            // InternalMyDsl.g:2999:2: 'parametro'
            {
             before(grammarAccess.getMappingAccess().getParametroKeyword_4()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyDsl.g:3008:1: rule__Mapping__Group__5 : rule__Mapping__Group__5__Impl rule__Mapping__Group__6 ;
    public final void rule__Mapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3012:1: ( rule__Mapping__Group__5__Impl rule__Mapping__Group__6 )
            // InternalMyDsl.g:3013:2: rule__Mapping__Group__5__Impl rule__Mapping__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:3020:1: rule__Mapping__Group__5__Impl : ( ( rule__Mapping__ParametroAssignment_5 ) ) ;
    public final void rule__Mapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3024:1: ( ( ( rule__Mapping__ParametroAssignment_5 ) ) )
            // InternalMyDsl.g:3025:1: ( ( rule__Mapping__ParametroAssignment_5 ) )
            {
            // InternalMyDsl.g:3025:1: ( ( rule__Mapping__ParametroAssignment_5 ) )
            // InternalMyDsl.g:3026:2: ( rule__Mapping__ParametroAssignment_5 )
            {
             before(grammarAccess.getMappingAccess().getParametroAssignment_5()); 
            // InternalMyDsl.g:3027:2: ( rule__Mapping__ParametroAssignment_5 )
            // InternalMyDsl.g:3027:3: rule__Mapping__ParametroAssignment_5
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
    // InternalMyDsl.g:3035:1: rule__Mapping__Group__6 : rule__Mapping__Group__6__Impl ;
    public final void rule__Mapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3039:1: ( rule__Mapping__Group__6__Impl )
            // InternalMyDsl.g:3040:2: rule__Mapping__Group__6__Impl
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
    // InternalMyDsl.g:3046:1: rule__Mapping__Group__6__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3050:1: ( ( '}' ) )
            // InternalMyDsl.g:3051:1: ( '}' )
            {
            // InternalMyDsl.g:3051:1: ( '}' )
            // InternalMyDsl.g:3052:2: '}'
            {
             before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:3062:1: rule__Asercion__Group__0 : rule__Asercion__Group__0__Impl rule__Asercion__Group__1 ;
    public final void rule__Asercion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3066:1: ( rule__Asercion__Group__0__Impl rule__Asercion__Group__1 )
            // InternalMyDsl.g:3067:2: rule__Asercion__Group__0__Impl rule__Asercion__Group__1
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
    // InternalMyDsl.g:3074:1: rule__Asercion__Group__0__Impl : ( 'Asercion' ) ;
    public final void rule__Asercion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3078:1: ( ( 'Asercion' ) )
            // InternalMyDsl.g:3079:1: ( 'Asercion' )
            {
            // InternalMyDsl.g:3079:1: ( 'Asercion' )
            // InternalMyDsl.g:3080:2: 'Asercion'
            {
             before(grammarAccess.getAsercionAccess().getAsercionKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalMyDsl.g:3089:1: rule__Asercion__Group__1 : rule__Asercion__Group__1__Impl rule__Asercion__Group__2 ;
    public final void rule__Asercion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3093:1: ( rule__Asercion__Group__1__Impl rule__Asercion__Group__2 )
            // InternalMyDsl.g:3094:2: rule__Asercion__Group__1__Impl rule__Asercion__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3101:1: rule__Asercion__Group__1__Impl : ( '{' ) ;
    public final void rule__Asercion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3105:1: ( ( '{' ) )
            // InternalMyDsl.g:3106:1: ( '{' )
            {
            // InternalMyDsl.g:3106:1: ( '{' )
            // InternalMyDsl.g:3107:2: '{'
            {
             before(grammarAccess.getAsercionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:3116:1: rule__Asercion__Group__2 : rule__Asercion__Group__2__Impl rule__Asercion__Group__3 ;
    public final void rule__Asercion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3120:1: ( rule__Asercion__Group__2__Impl rule__Asercion__Group__3 )
            // InternalMyDsl.g:3121:2: rule__Asercion__Group__2__Impl rule__Asercion__Group__3
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
    // InternalMyDsl.g:3128:1: rule__Asercion__Group__2__Impl : ( 'elemento1' ) ;
    public final void rule__Asercion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3132:1: ( ( 'elemento1' ) )
            // InternalMyDsl.g:3133:1: ( 'elemento1' )
            {
            // InternalMyDsl.g:3133:1: ( 'elemento1' )
            // InternalMyDsl.g:3134:2: 'elemento1'
            {
             before(grammarAccess.getAsercionAccess().getElemento1Keyword_2()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMyDsl.g:3143:1: rule__Asercion__Group__3 : rule__Asercion__Group__3__Impl rule__Asercion__Group__4 ;
    public final void rule__Asercion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3147:1: ( rule__Asercion__Group__3__Impl rule__Asercion__Group__4 )
            // InternalMyDsl.g:3148:2: rule__Asercion__Group__3__Impl rule__Asercion__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3155:1: rule__Asercion__Group__3__Impl : ( ( rule__Asercion__Elemento1Assignment_3 ) ) ;
    public final void rule__Asercion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3159:1: ( ( ( rule__Asercion__Elemento1Assignment_3 ) ) )
            // InternalMyDsl.g:3160:1: ( ( rule__Asercion__Elemento1Assignment_3 ) )
            {
            // InternalMyDsl.g:3160:1: ( ( rule__Asercion__Elemento1Assignment_3 ) )
            // InternalMyDsl.g:3161:2: ( rule__Asercion__Elemento1Assignment_3 )
            {
             before(grammarAccess.getAsercionAccess().getElemento1Assignment_3()); 
            // InternalMyDsl.g:3162:2: ( rule__Asercion__Elemento1Assignment_3 )
            // InternalMyDsl.g:3162:3: rule__Asercion__Elemento1Assignment_3
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
    // InternalMyDsl.g:3170:1: rule__Asercion__Group__4 : rule__Asercion__Group__4__Impl rule__Asercion__Group__5 ;
    public final void rule__Asercion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3174:1: ( rule__Asercion__Group__4__Impl rule__Asercion__Group__5 )
            // InternalMyDsl.g:3175:2: rule__Asercion__Group__4__Impl rule__Asercion__Group__5
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
    // InternalMyDsl.g:3182:1: rule__Asercion__Group__4__Impl : ( 'elemento2' ) ;
    public final void rule__Asercion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3186:1: ( ( 'elemento2' ) )
            // InternalMyDsl.g:3187:1: ( 'elemento2' )
            {
            // InternalMyDsl.g:3187:1: ( 'elemento2' )
            // InternalMyDsl.g:3188:2: 'elemento2'
            {
             before(grammarAccess.getAsercionAccess().getElemento2Keyword_4()); 
            match(input,60,FOLLOW_2); 
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
    // InternalMyDsl.g:3197:1: rule__Asercion__Group__5 : rule__Asercion__Group__5__Impl rule__Asercion__Group__6 ;
    public final void rule__Asercion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3201:1: ( rule__Asercion__Group__5__Impl rule__Asercion__Group__6 )
            // InternalMyDsl.g:3202:2: rule__Asercion__Group__5__Impl rule__Asercion__Group__6
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
    // InternalMyDsl.g:3209:1: rule__Asercion__Group__5__Impl : ( ( rule__Asercion__Elemento2Assignment_5 ) ) ;
    public final void rule__Asercion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3213:1: ( ( ( rule__Asercion__Elemento2Assignment_5 ) ) )
            // InternalMyDsl.g:3214:1: ( ( rule__Asercion__Elemento2Assignment_5 ) )
            {
            // InternalMyDsl.g:3214:1: ( ( rule__Asercion__Elemento2Assignment_5 ) )
            // InternalMyDsl.g:3215:2: ( rule__Asercion__Elemento2Assignment_5 )
            {
             before(grammarAccess.getAsercionAccess().getElemento2Assignment_5()); 
            // InternalMyDsl.g:3216:2: ( rule__Asercion__Elemento2Assignment_5 )
            // InternalMyDsl.g:3216:3: rule__Asercion__Elemento2Assignment_5
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
    // InternalMyDsl.g:3224:1: rule__Asercion__Group__6 : rule__Asercion__Group__6__Impl ;
    public final void rule__Asercion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3228:1: ( rule__Asercion__Group__6__Impl )
            // InternalMyDsl.g:3229:2: rule__Asercion__Group__6__Impl
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
    // InternalMyDsl.g:3235:1: rule__Asercion__Group__6__Impl : ( '}' ) ;
    public final void rule__Asercion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3239:1: ( ( '}' ) )
            // InternalMyDsl.g:3240:1: ( '}' )
            {
            // InternalMyDsl.g:3240:1: ( '}' )
            // InternalMyDsl.g:3241:2: '}'
            {
             before(grammarAccess.getAsercionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:3251:1: rule__Parametro__Group__0 : rule__Parametro__Group__0__Impl rule__Parametro__Group__1 ;
    public final void rule__Parametro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3255:1: ( rule__Parametro__Group__0__Impl rule__Parametro__Group__1 )
            // InternalMyDsl.g:3256:2: rule__Parametro__Group__0__Impl rule__Parametro__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3263:1: rule__Parametro__Group__0__Impl : ( () ) ;
    public final void rule__Parametro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3267:1: ( ( () ) )
            // InternalMyDsl.g:3268:1: ( () )
            {
            // InternalMyDsl.g:3268:1: ( () )
            // InternalMyDsl.g:3269:2: ()
            {
             before(grammarAccess.getParametroAccess().getParametroAction_0()); 
            // InternalMyDsl.g:3270:2: ()
            // InternalMyDsl.g:3270:3: 
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
    // InternalMyDsl.g:3278:1: rule__Parametro__Group__1 : rule__Parametro__Group__1__Impl rule__Parametro__Group__2 ;
    public final void rule__Parametro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3282:1: ( rule__Parametro__Group__1__Impl rule__Parametro__Group__2 )
            // InternalMyDsl.g:3283:2: rule__Parametro__Group__1__Impl rule__Parametro__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:3290:1: rule__Parametro__Group__1__Impl : ( 'Parametro' ) ;
    public final void rule__Parametro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3294:1: ( ( 'Parametro' ) )
            // InternalMyDsl.g:3295:1: ( 'Parametro' )
            {
            // InternalMyDsl.g:3295:1: ( 'Parametro' )
            // InternalMyDsl.g:3296:2: 'Parametro'
            {
             before(grammarAccess.getParametroAccess().getParametroKeyword_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalMyDsl.g:3305:1: rule__Parametro__Group__2 : rule__Parametro__Group__2__Impl rule__Parametro__Group__3 ;
    public final void rule__Parametro__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3309:1: ( rule__Parametro__Group__2__Impl rule__Parametro__Group__3 )
            // InternalMyDsl.g:3310:2: rule__Parametro__Group__2__Impl rule__Parametro__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:3317:1: rule__Parametro__Group__2__Impl : ( '{' ) ;
    public final void rule__Parametro__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3321:1: ( ( '{' ) )
            // InternalMyDsl.g:3322:1: ( '{' )
            {
            // InternalMyDsl.g:3322:1: ( '{' )
            // InternalMyDsl.g:3323:2: '{'
            {
             before(grammarAccess.getParametroAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:3332:1: rule__Parametro__Group__3 : rule__Parametro__Group__3__Impl rule__Parametro__Group__4 ;
    public final void rule__Parametro__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3336:1: ( rule__Parametro__Group__3__Impl rule__Parametro__Group__4 )
            // InternalMyDsl.g:3337:2: rule__Parametro__Group__3__Impl rule__Parametro__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:3344:1: rule__Parametro__Group__3__Impl : ( ( rule__Parametro__Group_3__0 )? ) ;
    public final void rule__Parametro__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3348:1: ( ( ( rule__Parametro__Group_3__0 )? ) )
            // InternalMyDsl.g:3349:1: ( ( rule__Parametro__Group_3__0 )? )
            {
            // InternalMyDsl.g:3349:1: ( ( rule__Parametro__Group_3__0 )? )
            // InternalMyDsl.g:3350:2: ( rule__Parametro__Group_3__0 )?
            {
             before(grammarAccess.getParametroAccess().getGroup_3()); 
            // InternalMyDsl.g:3351:2: ( rule__Parametro__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==62) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:3351:3: rule__Parametro__Group_3__0
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
    // InternalMyDsl.g:3359:1: rule__Parametro__Group__4 : rule__Parametro__Group__4__Impl rule__Parametro__Group__5 ;
    public final void rule__Parametro__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3363:1: ( rule__Parametro__Group__4__Impl rule__Parametro__Group__5 )
            // InternalMyDsl.g:3364:2: rule__Parametro__Group__4__Impl rule__Parametro__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:3371:1: rule__Parametro__Group__4__Impl : ( ( rule__Parametro__Group_4__0 )? ) ;
    public final void rule__Parametro__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3375:1: ( ( ( rule__Parametro__Group_4__0 )? ) )
            // InternalMyDsl.g:3376:1: ( ( rule__Parametro__Group_4__0 )? )
            {
            // InternalMyDsl.g:3376:1: ( ( rule__Parametro__Group_4__0 )? )
            // InternalMyDsl.g:3377:2: ( rule__Parametro__Group_4__0 )?
            {
             before(grammarAccess.getParametroAccess().getGroup_4()); 
            // InternalMyDsl.g:3378:2: ( rule__Parametro__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==63) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:3378:3: rule__Parametro__Group_4__0
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
    // InternalMyDsl.g:3386:1: rule__Parametro__Group__5 : rule__Parametro__Group__5__Impl ;
    public final void rule__Parametro__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3390:1: ( rule__Parametro__Group__5__Impl )
            // InternalMyDsl.g:3391:2: rule__Parametro__Group__5__Impl
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
    // InternalMyDsl.g:3397:1: rule__Parametro__Group__5__Impl : ( '}' ) ;
    public final void rule__Parametro__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3401:1: ( ( '}' ) )
            // InternalMyDsl.g:3402:1: ( '}' )
            {
            // InternalMyDsl.g:3402:1: ( '}' )
            // InternalMyDsl.g:3403:2: '}'
            {
             before(grammarAccess.getParametroAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:3413:1: rule__Parametro__Group_3__0 : rule__Parametro__Group_3__0__Impl rule__Parametro__Group_3__1 ;
    public final void rule__Parametro__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3417:1: ( rule__Parametro__Group_3__0__Impl rule__Parametro__Group_3__1 )
            // InternalMyDsl.g:3418:2: rule__Parametro__Group_3__0__Impl rule__Parametro__Group_3__1
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
    // InternalMyDsl.g:3425:1: rule__Parametro__Group_3__0__Impl : ( 'nombre' ) ;
    public final void rule__Parametro__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3429:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:3430:1: ( 'nombre' )
            {
            // InternalMyDsl.g:3430:1: ( 'nombre' )
            // InternalMyDsl.g:3431:2: 'nombre'
            {
             before(grammarAccess.getParametroAccess().getNombreKeyword_3_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalMyDsl.g:3440:1: rule__Parametro__Group_3__1 : rule__Parametro__Group_3__1__Impl ;
    public final void rule__Parametro__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3444:1: ( rule__Parametro__Group_3__1__Impl )
            // InternalMyDsl.g:3445:2: rule__Parametro__Group_3__1__Impl
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
    // InternalMyDsl.g:3451:1: rule__Parametro__Group_3__1__Impl : ( ( rule__Parametro__NombreAssignment_3_1 ) ) ;
    public final void rule__Parametro__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3455:1: ( ( ( rule__Parametro__NombreAssignment_3_1 ) ) )
            // InternalMyDsl.g:3456:1: ( ( rule__Parametro__NombreAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3456:1: ( ( rule__Parametro__NombreAssignment_3_1 ) )
            // InternalMyDsl.g:3457:2: ( rule__Parametro__NombreAssignment_3_1 )
            {
             before(grammarAccess.getParametroAccess().getNombreAssignment_3_1()); 
            // InternalMyDsl.g:3458:2: ( rule__Parametro__NombreAssignment_3_1 )
            // InternalMyDsl.g:3458:3: rule__Parametro__NombreAssignment_3_1
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
    // InternalMyDsl.g:3467:1: rule__Parametro__Group_4__0 : rule__Parametro__Group_4__0__Impl rule__Parametro__Group_4__1 ;
    public final void rule__Parametro__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3471:1: ( rule__Parametro__Group_4__0__Impl rule__Parametro__Group_4__1 )
            // InternalMyDsl.g:3472:2: rule__Parametro__Group_4__0__Impl rule__Parametro__Group_4__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3479:1: rule__Parametro__Group_4__0__Impl : ( 'tipo' ) ;
    public final void rule__Parametro__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3483:1: ( ( 'tipo' ) )
            // InternalMyDsl.g:3484:1: ( 'tipo' )
            {
            // InternalMyDsl.g:3484:1: ( 'tipo' )
            // InternalMyDsl.g:3485:2: 'tipo'
            {
             before(grammarAccess.getParametroAccess().getTipoKeyword_4_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalMyDsl.g:3494:1: rule__Parametro__Group_4__1 : rule__Parametro__Group_4__1__Impl ;
    public final void rule__Parametro__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3498:1: ( rule__Parametro__Group_4__1__Impl )
            // InternalMyDsl.g:3499:2: rule__Parametro__Group_4__1__Impl
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
    // InternalMyDsl.g:3505:1: rule__Parametro__Group_4__1__Impl : ( ( rule__Parametro__TipoAssignment_4_1 ) ) ;
    public final void rule__Parametro__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3509:1: ( ( ( rule__Parametro__TipoAssignment_4_1 ) ) )
            // InternalMyDsl.g:3510:1: ( ( rule__Parametro__TipoAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3510:1: ( ( rule__Parametro__TipoAssignment_4_1 ) )
            // InternalMyDsl.g:3511:2: ( rule__Parametro__TipoAssignment_4_1 )
            {
             before(grammarAccess.getParametroAccess().getTipoAssignment_4_1()); 
            // InternalMyDsl.g:3512:2: ( rule__Parametro__TipoAssignment_4_1 )
            // InternalMyDsl.g:3512:3: rule__Parametro__TipoAssignment_4_1
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
    // InternalMyDsl.g:3521:1: rule__Api__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Api__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3525:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3526:2: ( ruleEString )
            {
            // InternalMyDsl.g:3526:2: ( ruleEString )
            // InternalMyDsl.g:3527:3: ruleEString
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
    // InternalMyDsl.g:3536:1: rule__Api__EntidadesAssignment_5 : ( ruleEntidad ) ;
    public final void rule__Api__EntidadesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3540:1: ( ( ruleEntidad ) )
            // InternalMyDsl.g:3541:2: ( ruleEntidad )
            {
            // InternalMyDsl.g:3541:2: ( ruleEntidad )
            // InternalMyDsl.g:3542:3: ruleEntidad
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
    // InternalMyDsl.g:3551:1: rule__Api__PrimitivetypesAssignment_6 : ( rulePrimitiveType ) ;
    public final void rule__Api__PrimitivetypesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3555:1: ( ( rulePrimitiveType ) )
            // InternalMyDsl.g:3556:2: ( rulePrimitiveType )
            {
            // InternalMyDsl.g:3556:2: ( rulePrimitiveType )
            // InternalMyDsl.g:3557:3: rulePrimitiveType
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
    // InternalMyDsl.g:3566:1: rule__Api__ServiciosRestAssignment_7 : ( ruleServicioRest ) ;
    public final void rule__Api__ServiciosRestAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3570:1: ( ( ruleServicioRest ) )
            // InternalMyDsl.g:3571:2: ( ruleServicioRest )
            {
            // InternalMyDsl.g:3571:2: ( ruleServicioRest )
            // InternalMyDsl.g:3572:3: ruleServicioRest
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
    // InternalMyDsl.g:3581:1: rule__AtributoMocka__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoMocka__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3585:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:3586:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:3586:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:3587:3: ruleTipoAtributo
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
    // InternalMyDsl.g:3596:1: rule__AtributoMocka__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__AtributoMocka__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3600:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3601:2: ( ruleEString )
            {
            // InternalMyDsl.g:3601:2: ( ruleEString )
            // InternalMyDsl.g:3602:3: ruleEString
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
    // InternalMyDsl.g:3611:1: rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 : ( ( 'PK,mockType' ) ) ;
    public final void rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3615:1: ( ( ( 'PK,mockType' ) ) )
            // InternalMyDsl.g:3616:2: ( ( 'PK,mockType' ) )
            {
            // InternalMyDsl.g:3616:2: ( ( 'PK,mockType' ) )
            // InternalMyDsl.g:3617:3: ( 'PK,mockType' )
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 
            // InternalMyDsl.g:3618:3: ( 'PK,mockType' )
            // InternalMyDsl.g:3619:4: 'PK,mockType'
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalMyDsl.g:3630:1: rule__AtributoMocka__MockTypeAssignment_2_1_0_2 : ( ruleMockaroo ) ;
    public final void rule__AtributoMocka__MockTypeAssignment_2_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3634:1: ( ( ruleMockaroo ) )
            // InternalMyDsl.g:3635:2: ( ruleMockaroo )
            {
            // InternalMyDsl.g:3635:2: ( ruleMockaroo )
            // InternalMyDsl.g:3636:3: ruleMockaroo
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
    // InternalMyDsl.g:3645:1: rule__AtributoMocka__MockTypeAssignment_2_1_1_2 : ( ruleMockaroo ) ;
    public final void rule__AtributoMocka__MockTypeAssignment_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3649:1: ( ( ruleMockaroo ) )
            // InternalMyDsl.g:3650:2: ( ruleMockaroo )
            {
            // InternalMyDsl.g:3650:2: ( ruleMockaroo )
            // InternalMyDsl.g:3651:3: ruleMockaroo
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
    // InternalMyDsl.g:3660:1: rule__AtributoArreglo__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoArreglo__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3664:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:3665:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:3665:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:3666:3: ruleTipoAtributo
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
    // InternalMyDsl.g:3675:1: rule__AtributoArreglo__NombreAssignment_3 : ( ruleEString ) ;
    public final void rule__AtributoArreglo__NombreAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3679:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3680:2: ( ruleEString )
            {
            // InternalMyDsl.g:3680:2: ( ruleEString )
            // InternalMyDsl.g:3681:3: ruleEString
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
    // InternalMyDsl.g:3690:1: rule__AtributoSimple__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoSimple__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3694:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:3695:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:3695:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:3696:3: ruleTipoAtributo
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
    // InternalMyDsl.g:3705:1: rule__AtributoSimple__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__AtributoSimple__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3709:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3710:2: ( ruleEString )
            {
            // InternalMyDsl.g:3710:2: ( ruleEString )
            // InternalMyDsl.g:3711:3: ruleEString
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
    // InternalMyDsl.g:3720:1: rule__MockarooEntity__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__MockarooEntity__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3724:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3725:2: ( ruleEString )
            {
            // InternalMyDsl.g:3725:2: ( ruleEString )
            // InternalMyDsl.g:3726:3: ruleEString
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
    // InternalMyDsl.g:3735:1: rule__MockarooEntity__AtributosAssignment_3 : ( ruleAtributo ) ;
    public final void rule__MockarooEntity__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3739:1: ( ( ruleAtributo ) )
            // InternalMyDsl.g:3740:2: ( ruleAtributo )
            {
            // InternalMyDsl.g:3740:2: ( ruleAtributo )
            // InternalMyDsl.g:3741:3: ruleAtributo
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
    // InternalMyDsl.g:3750:1: rule__ServicioRest__MetodoAssignment_0 : ( ruleTipoMetodoRest ) ;
    public final void rule__ServicioRest__MetodoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3754:1: ( ( ruleTipoMetodoRest ) )
            // InternalMyDsl.g:3755:2: ( ruleTipoMetodoRest )
            {
            // InternalMyDsl.g:3755:2: ( ruleTipoMetodoRest )
            // InternalMyDsl.g:3756:3: ruleTipoMetodoRest
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
    // InternalMyDsl.g:3765:1: rule__ServicioRest__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__ServicioRest__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3769:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3770:2: ( ruleEString )
            {
            // InternalMyDsl.g:3770:2: ( ruleEString )
            // InternalMyDsl.g:3771:3: ruleEString
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
    // InternalMyDsl.g:3780:1: rule__ServicioRest__UrlAssignment_6 : ( ruleEString ) ;
    public final void rule__ServicioRest__UrlAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3784:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3785:2: ( ruleEString )
            {
            // InternalMyDsl.g:3785:2: ( ruleEString )
            // InternalMyDsl.g:3786:3: ruleEString
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


    // $ANTLR start "rule__ServicioRest__RequestAssignment_9"
    // InternalMyDsl.g:3795:1: rule__ServicioRest__RequestAssignment_9 : ( ruleRequest ) ;
    public final void rule__ServicioRest__RequestAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3799:1: ( ( ruleRequest ) )
            // InternalMyDsl.g:3800:2: ( ruleRequest )
            {
            // InternalMyDsl.g:3800:2: ( ruleRequest )
            // InternalMyDsl.g:3801:3: ruleRequest
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
    // InternalMyDsl.g:3810:1: rule__ServicioRest__ResponseAssignment_10 : ( ruleResponse ) ;
    public final void rule__ServicioRest__ResponseAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3814:1: ( ( ruleResponse ) )
            // InternalMyDsl.g:3815:2: ( ruleResponse )
            {
            // InternalMyDsl.g:3815:2: ( ruleResponse )
            // InternalMyDsl.g:3816:3: ruleResponse
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


    // $ANTLR start "rule__SimpleEntity__NombreAssignment_1"
    // InternalMyDsl.g:3825:1: rule__SimpleEntity__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__SimpleEntity__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3829:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3830:2: ( ruleEString )
            {
            // InternalMyDsl.g:3830:2: ( ruleEString )
            // InternalMyDsl.g:3831:3: ruleEString
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
    // InternalMyDsl.g:3840:1: rule__SimpleEntity__AtributosAssignment_3 : ( ruleAtributoSimple ) ;
    public final void rule__SimpleEntity__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3844:1: ( ( ruleAtributoSimple ) )
            // InternalMyDsl.g:3845:2: ( ruleAtributoSimple )
            {
            // InternalMyDsl.g:3845:2: ( ruleAtributoSimple )
            // InternalMyDsl.g:3846:3: ruleAtributoSimple
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
    // InternalMyDsl.g:3855:1: rule__Response__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__Response__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3859:1: ( ( ruleType ) )
            // InternalMyDsl.g:3860:2: ( ruleType )
            {
            // InternalMyDsl.g:3860:2: ( ruleType )
            // InternalMyDsl.g:3861:3: ruleType
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
    // InternalMyDsl.g:3870:1: rule__Request__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__Request__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3874:1: ( ( ruleType ) )
            // InternalMyDsl.g:3875:2: ( ruleType )
            {
            // InternalMyDsl.g:3875:2: ( ruleType )
            // InternalMyDsl.g:3876:3: ruleType
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
    // InternalMyDsl.g:3885:1: rule__TipoEntidad__NombreAssignment : ( ruleEString ) ;
    public final void rule__TipoEntidad__NombreAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3889:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3890:2: ( ruleEString )
            {
            // InternalMyDsl.g:3890:2: ( ruleEString )
            // InternalMyDsl.g:3891:3: ruleEString
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
    // InternalMyDsl.g:3900:1: rule__MyString__NombreAssignment : ( ( 'string' ) ) ;
    public final void rule__MyString__NombreAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3904:1: ( ( ( 'string' ) ) )
            // InternalMyDsl.g:3905:2: ( ( 'string' ) )
            {
            // InternalMyDsl.g:3905:2: ( ( 'string' ) )
            // InternalMyDsl.g:3906:3: ( 'string' )
            {
             before(grammarAccess.getMyStringAccess().getNombreStringKeyword_0()); 
            // InternalMyDsl.g:3907:3: ( 'string' )
            // InternalMyDsl.g:3908:4: 'string'
            {
             before(grammarAccess.getMyStringAccess().getNombreStringKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:3919:1: rule__MyNumeric__NombreAssignment : ( ( 'int' ) ) ;
    public final void rule__MyNumeric__NombreAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3923:1: ( ( ( 'int' ) ) )
            // InternalMyDsl.g:3924:2: ( ( 'int' ) )
            {
            // InternalMyDsl.g:3924:2: ( ( 'int' ) )
            // InternalMyDsl.g:3925:3: ( 'int' )
            {
             before(grammarAccess.getMyNumericAccess().getNombreIntKeyword_0()); 
            // InternalMyDsl.g:3926:3: ( 'int' )
            // InternalMyDsl.g:3927:4: 'int'
            {
             before(grammarAccess.getMyNumericAccess().getNombreIntKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:3938:1: rule__MyBoolean__NombreAssignment : ( ( 'boolean' ) ) ;
    public final void rule__MyBoolean__NombreAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3942:1: ( ( ( 'boolean' ) ) )
            // InternalMyDsl.g:3943:2: ( ( 'boolean' ) )
            {
            // InternalMyDsl.g:3943:2: ( ( 'boolean' ) )
            // InternalMyDsl.g:3944:3: ( 'boolean' )
            {
             before(grammarAccess.getMyBooleanAccess().getNombreBooleanKeyword_0()); 
            // InternalMyDsl.g:3945:3: ( 'boolean' )
            // InternalMyDsl.g:3946:4: 'boolean'
            {
             before(grammarAccess.getMyBooleanAccess().getNombreBooleanKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:3957:1: rule__Mapping__ValueAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Mapping__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3961:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3962:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3962:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3963:3: ( ruleEString )
            {
             before(grammarAccess.getMappingAccess().getValueElementoCrossReference_3_0()); 
            // InternalMyDsl.g:3964:3: ( ruleEString )
            // InternalMyDsl.g:3965:4: ruleEString
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
    // InternalMyDsl.g:3976:1: rule__Mapping__ParametroAssignment_5 : ( ruleParametro ) ;
    public final void rule__Mapping__ParametroAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3980:1: ( ( ruleParametro ) )
            // InternalMyDsl.g:3981:2: ( ruleParametro )
            {
            // InternalMyDsl.g:3981:2: ( ruleParametro )
            // InternalMyDsl.g:3982:3: ruleParametro
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
    // InternalMyDsl.g:3991:1: rule__Asercion__Elemento1Assignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Asercion__Elemento1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3995:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3996:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3996:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3997:3: ( ruleEString )
            {
             before(grammarAccess.getAsercionAccess().getElemento1ElementoCrossReference_3_0()); 
            // InternalMyDsl.g:3998:3: ( ruleEString )
            // InternalMyDsl.g:3999:4: ruleEString
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
    // InternalMyDsl.g:4010:1: rule__Asercion__Elemento2Assignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Asercion__Elemento2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4014:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:4015:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:4015:2: ( ( ruleEString ) )
            // InternalMyDsl.g:4016:3: ( ruleEString )
            {
             before(grammarAccess.getAsercionAccess().getElemento2ElementoCrossReference_5_0()); 
            // InternalMyDsl.g:4017:3: ( ruleEString )
            // InternalMyDsl.g:4018:4: ruleEString
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
    // InternalMyDsl.g:4029:1: rule__Parametro__NombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Parametro__NombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4033:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4034:2: ( ruleEString )
            {
            // InternalMyDsl.g:4034:2: ( ruleEString )
            // InternalMyDsl.g:4035:3: ruleEString
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
    // InternalMyDsl.g:4044:1: rule__Parametro__TipoAssignment_4_1 : ( ruleTipoParametro ) ;
    public final void rule__Parametro__TipoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4048:1: ( ( ruleTipoParametro ) )
            // InternalMyDsl.g:4049:2: ( ruleTipoParametro )
            {
            // InternalMyDsl.g:4049:2: ( ruleTipoParametro )
            // InternalMyDsl.g:4050:3: ruleTipoParametro
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000A00F000380000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000A000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000FFFC00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000390000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000007E0B0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000007E032L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000380030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xC000000000010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000070000000000L});

}