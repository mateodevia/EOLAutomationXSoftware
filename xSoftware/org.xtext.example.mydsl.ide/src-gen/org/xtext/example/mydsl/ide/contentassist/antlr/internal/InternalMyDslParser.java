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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'int'", "'boolean'", "'/'", "':'", "'{'", "'}'", "'$'", "'?'", "'E'", "'e'", "'FirstNameType'", "'LastNameType'", "'FamilyNameType'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CityType'", "'CountryCodeType'", "'LatitudeType'", "'LongitudType'", "'RowNumberType'", "'BooleanType'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'Path'", "'Query'", "'Body'", "'apiURL'", "'['", "']'", "'('", "')'", "'mockType'", "'Entity'", "'URL'", "'Request {'", "'Type'", "'SimpleEntity'", "'MyNumeric'", "'valor'", "'MyString'", "'MyBoolean'", "'-'", "'.'", "'Response'", "'Mapping'", "'value'", "'parametro'", "'Asercion'", "'elemento1'", "'elemento2'", "'Parametro'", "'nombre'", "'tipo'", "'PK,mockType'"
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
    public static final int RULE_ID=4;
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
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int RULE_SEMICOLON=7;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
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


    // $ANTLR start "entryRuleAtributo2"
    // InternalMyDsl.g:153:1: entryRuleAtributo2 : ruleAtributo2 EOF ;
    public final void entryRuleAtributo2() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleAtributo2 EOF )
            // InternalMyDsl.g:155:1: ruleAtributo2 EOF
            {
             before(grammarAccess.getAtributo2Rule()); 
            pushFollow(FOLLOW_1);
            ruleAtributo2();

            state._fsp--;

             after(grammarAccess.getAtributo2Rule()); 
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
    // $ANTLR end "entryRuleAtributo2"


    // $ANTLR start "ruleAtributo2"
    // InternalMyDsl.g:162:1: ruleAtributo2 : ( ( rule__Atributo2__Group__0 ) ) ;
    public final void ruleAtributo2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Atributo2__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Atributo2__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Atributo2__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Atributo2__Group__0 )
            {
             before(grammarAccess.getAtributo2Access().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Atributo2__Group__0 )
            // InternalMyDsl.g:169:4: rule__Atributo2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atributo2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributo2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributo2"


    // $ANTLR start "entryRuleAtributoMocka"
    // InternalMyDsl.g:178:1: entryRuleAtributoMocka : ruleAtributoMocka EOF ;
    public final void entryRuleAtributoMocka() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAtributoMocka EOF )
            // InternalMyDsl.g:180:1: ruleAtributoMocka EOF
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
    // InternalMyDsl.g:187:1: ruleAtributoMocka : ( ( rule__AtributoMocka__Group__0 ) ) ;
    public final void ruleAtributoMocka() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__AtributoMocka__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__AtributoMocka__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__AtributoMocka__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__AtributoMocka__Group__0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__AtributoMocka__Group__0 )
            // InternalMyDsl.g:194:4: rule__AtributoMocka__Group__0
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
    // InternalMyDsl.g:203:1: entryRuleAtributoArreglo : ruleAtributoArreglo EOF ;
    public final void entryRuleAtributoArreglo() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleAtributoArreglo EOF )
            // InternalMyDsl.g:205:1: ruleAtributoArreglo EOF
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
    // InternalMyDsl.g:212:1: ruleAtributoArreglo : ( ( rule__AtributoArreglo__Group__0 ) ) ;
    public final void ruleAtributoArreglo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__AtributoArreglo__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__AtributoArreglo__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__AtributoArreglo__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__AtributoArreglo__Group__0 )
            {
             before(grammarAccess.getAtributoArregloAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__AtributoArreglo__Group__0 )
            // InternalMyDsl.g:219:4: rule__AtributoArreglo__Group__0
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
    // InternalMyDsl.g:228:1: entryRuleAtributoSimple : ruleAtributoSimple EOF ;
    public final void entryRuleAtributoSimple() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleAtributoSimple EOF )
            // InternalMyDsl.g:230:1: ruleAtributoSimple EOF
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
    // InternalMyDsl.g:237:1: ruleAtributoSimple : ( ( rule__AtributoSimple__Group__0 ) ) ;
    public final void ruleAtributoSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__AtributoSimple__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__AtributoSimple__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__AtributoSimple__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__AtributoSimple__Group__0 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__AtributoSimple__Group__0 )
            // InternalMyDsl.g:244:4: rule__AtributoSimple__Group__0
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
    // InternalMyDsl.g:253:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleEString EOF )
            // InternalMyDsl.g:255:1: ruleEString EOF
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
    // InternalMyDsl.g:262:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:268:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:269:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:269:4: rule__EString__Alternatives
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
    // InternalMyDsl.g:278:1: entryRuleMockarooEntity : ruleMockarooEntity EOF ;
    public final void entryRuleMockarooEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleMockarooEntity EOF )
            // InternalMyDsl.g:280:1: ruleMockarooEntity EOF
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
    // InternalMyDsl.g:287:1: ruleMockarooEntity : ( ( rule__MockarooEntity__Group__0 ) ) ;
    public final void ruleMockarooEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__MockarooEntity__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__MockarooEntity__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__MockarooEntity__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__MockarooEntity__Group__0 )
            {
             before(grammarAccess.getMockarooEntityAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__MockarooEntity__Group__0 )
            // InternalMyDsl.g:294:4: rule__MockarooEntity__Group__0
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
    // InternalMyDsl.g:303:1: entryRuleServicioRest : ruleServicioRest EOF ;
    public final void entryRuleServicioRest() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleServicioRest EOF )
            // InternalMyDsl.g:305:1: ruleServicioRest EOF
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
    // InternalMyDsl.g:312:1: ruleServicioRest : ( ( rule__ServicioRest__Group__0 ) ) ;
    public final void ruleServicioRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__ServicioRest__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__ServicioRest__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__ServicioRest__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__ServicioRest__Group__0 )
            {
             before(grammarAccess.getServicioRestAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__ServicioRest__Group__0 )
            // InternalMyDsl.g:319:4: rule__ServicioRest__Group__0
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
    // InternalMyDsl.g:328:1: entryRuleSimpleEntity : ruleSimpleEntity EOF ;
    public final void entryRuleSimpleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleSimpleEntity EOF )
            // InternalMyDsl.g:330:1: ruleSimpleEntity EOF
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
    // InternalMyDsl.g:337:1: ruleSimpleEntity : ( ( rule__SimpleEntity__Group__0 ) ) ;
    public final void ruleSimpleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__SimpleEntity__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__SimpleEntity__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__SimpleEntity__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__SimpleEntity__Group__0 )
            {
             before(grammarAccess.getSimpleEntityAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__SimpleEntity__Group__0 )
            // InternalMyDsl.g:344:4: rule__SimpleEntity__Group__0
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
    // InternalMyDsl.g:353:1: entryRuleMyNumeric : ruleMyNumeric EOF ;
    public final void entryRuleMyNumeric() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleMyNumeric EOF )
            // InternalMyDsl.g:355:1: ruleMyNumeric EOF
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
    // InternalMyDsl.g:362:1: ruleMyNumeric : ( ( rule__MyNumeric__Group__0 ) ) ;
    public final void ruleMyNumeric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__MyNumeric__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__MyNumeric__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__MyNumeric__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__MyNumeric__Group__0 )
            {
             before(grammarAccess.getMyNumericAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__MyNumeric__Group__0 )
            // InternalMyDsl.g:369:4: rule__MyNumeric__Group__0
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
    // InternalMyDsl.g:378:1: entryRuleMyString : ruleMyString EOF ;
    public final void entryRuleMyString() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleMyString EOF )
            // InternalMyDsl.g:380:1: ruleMyString EOF
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
    // InternalMyDsl.g:387:1: ruleMyString : ( ( rule__MyString__Group__0 ) ) ;
    public final void ruleMyString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__MyString__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__MyString__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__MyString__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__MyString__Group__0 )
            {
             before(grammarAccess.getMyStringAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__MyString__Group__0 )
            // InternalMyDsl.g:394:4: rule__MyString__Group__0
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
    // InternalMyDsl.g:403:1: entryRuleMyBoolean : ruleMyBoolean EOF ;
    public final void entryRuleMyBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleMyBoolean EOF )
            // InternalMyDsl.g:405:1: ruleMyBoolean EOF
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
    // InternalMyDsl.g:412:1: ruleMyBoolean : ( ( rule__MyBoolean__Group__0 ) ) ;
    public final void ruleMyBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__MyBoolean__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__MyBoolean__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__MyBoolean__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__MyBoolean__Group__0 )
            {
             before(grammarAccess.getMyBooleanAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__MyBoolean__Group__0 )
            // InternalMyDsl.g:419:4: rule__MyBoolean__Group__0
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
    // InternalMyDsl.g:428:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleEDouble EOF )
            // InternalMyDsl.g:430:1: ruleEDouble EOF
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
    // InternalMyDsl.g:437:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__EDouble__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__EDouble__Group__0 )
            // InternalMyDsl.g:444:4: rule__EDouble__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleResponse : ruleResponse EOF ;
    public final void entryRuleResponse() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleResponse EOF )
            // InternalMyDsl.g:455:1: ruleResponse EOF
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
    // InternalMyDsl.g:462:1: ruleResponse : ( ( rule__Response__Group__0 ) ) ;
    public final void ruleResponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Response__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Response__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Response__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Response__Group__0 )
            {
             before(grammarAccess.getResponseAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Response__Group__0 )
            // InternalMyDsl.g:469:4: rule__Response__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleMapping EOF )
            // InternalMyDsl.g:480:1: ruleMapping EOF
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
    // InternalMyDsl.g:487:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Mapping__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Mapping__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Mapping__Group__0 )
            // InternalMyDsl.g:494:4: rule__Mapping__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleAsercion : ruleAsercion EOF ;
    public final void entryRuleAsercion() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleAsercion EOF )
            // InternalMyDsl.g:505:1: ruleAsercion EOF
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
    // InternalMyDsl.g:512:1: ruleAsercion : ( ( rule__Asercion__Group__0 ) ) ;
    public final void ruleAsercion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Asercion__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Asercion__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Asercion__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Asercion__Group__0 )
            {
             before(grammarAccess.getAsercionAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Asercion__Group__0 )
            // InternalMyDsl.g:519:4: rule__Asercion__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleParametro : ruleParametro EOF ;
    public final void entryRuleParametro() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleParametro EOF )
            // InternalMyDsl.g:530:1: ruleParametro EOF
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
    // InternalMyDsl.g:537:1: ruleParametro : ( ( rule__Parametro__Group__0 ) ) ;
    public final void ruleParametro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Parametro__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Parametro__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Parametro__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__Parametro__Group__0 )
            {
             before(grammarAccess.getParametroAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__Parametro__Group__0 )
            // InternalMyDsl.g:544:4: rule__Parametro__Group__0
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
    // InternalMyDsl.g:553:1: ruleTipoAtributo : ( ( rule__TipoAtributo__Alternatives ) ) ;
    public final void ruleTipoAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:557:1: ( ( ( rule__TipoAtributo__Alternatives ) ) )
            // InternalMyDsl.g:558:2: ( ( rule__TipoAtributo__Alternatives ) )
            {
            // InternalMyDsl.g:558:2: ( ( rule__TipoAtributo__Alternatives ) )
            // InternalMyDsl.g:559:3: ( rule__TipoAtributo__Alternatives )
            {
             before(grammarAccess.getTipoAtributoAccess().getAlternatives()); 
            // InternalMyDsl.g:560:3: ( rule__TipoAtributo__Alternatives )
            // InternalMyDsl.g:560:4: rule__TipoAtributo__Alternatives
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
    // InternalMyDsl.g:569:1: ruleMockaroo : ( ( rule__Mockaroo__Alternatives ) ) ;
    public final void ruleMockaroo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:573:1: ( ( ( rule__Mockaroo__Alternatives ) ) )
            // InternalMyDsl.g:574:2: ( ( rule__Mockaroo__Alternatives ) )
            {
            // InternalMyDsl.g:574:2: ( ( rule__Mockaroo__Alternatives ) )
            // InternalMyDsl.g:575:3: ( rule__Mockaroo__Alternatives )
            {
             before(grammarAccess.getMockarooAccess().getAlternatives()); 
            // InternalMyDsl.g:576:3: ( rule__Mockaroo__Alternatives )
            // InternalMyDsl.g:576:4: rule__Mockaroo__Alternatives
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
    // InternalMyDsl.g:585:1: ruleTipoMetodoRest : ( ( rule__TipoMetodoRest__Alternatives ) ) ;
    public final void ruleTipoMetodoRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:589:1: ( ( ( rule__TipoMetodoRest__Alternatives ) ) )
            // InternalMyDsl.g:590:2: ( ( rule__TipoMetodoRest__Alternatives ) )
            {
            // InternalMyDsl.g:590:2: ( ( rule__TipoMetodoRest__Alternatives ) )
            // InternalMyDsl.g:591:3: ( rule__TipoMetodoRest__Alternatives )
            {
             before(grammarAccess.getTipoMetodoRestAccess().getAlternatives()); 
            // InternalMyDsl.g:592:3: ( rule__TipoMetodoRest__Alternatives )
            // InternalMyDsl.g:592:4: rule__TipoMetodoRest__Alternatives
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
    // InternalMyDsl.g:601:1: ruleTipoParametro : ( ( rule__TipoParametro__Alternatives ) ) ;
    public final void ruleTipoParametro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:605:1: ( ( ( rule__TipoParametro__Alternatives ) ) )
            // InternalMyDsl.g:606:2: ( ( rule__TipoParametro__Alternatives ) )
            {
            // InternalMyDsl.g:606:2: ( ( rule__TipoParametro__Alternatives ) )
            // InternalMyDsl.g:607:3: ( rule__TipoParametro__Alternatives )
            {
             before(grammarAccess.getTipoParametroAccess().getAlternatives()); 
            // InternalMyDsl.g:608:3: ( rule__TipoParametro__Alternatives )
            // InternalMyDsl.g:608:4: rule__TipoParametro__Alternatives
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
    // InternalMyDsl.g:616:1: rule__Entidad__Alternatives : ( ( ruleSimpleEntity ) | ( ruleMockarooEntity ) );
    public final void rule__Entidad__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:620:1: ( ( ruleSimpleEntity ) | ( ruleMockarooEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==55) ) {
                alt1=1;
            }
            else if ( (LA1_0==51) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:621:2: ( ruleSimpleEntity )
                    {
                    // InternalMyDsl.g:621:2: ( ruleSimpleEntity )
                    // InternalMyDsl.g:622:3: ruleSimpleEntity
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
                    // InternalMyDsl.g:627:2: ( ruleMockarooEntity )
                    {
                    // InternalMyDsl.g:627:2: ( ruleMockarooEntity )
                    // InternalMyDsl.g:628:3: ruleMockarooEntity
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
    // InternalMyDsl.g:637:1: rule__PrimitiveType__Alternatives : ( ( ruleMyNumeric ) | ( ruleMyString ) | ( ruleMyBoolean ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:1: ( ( ruleMyNumeric ) | ( ruleMyString ) | ( ruleMyBoolean ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt2=1;
                }
                break;
            case 58:
                {
                alt2=2;
                }
                break;
            case 57:
            case 59:
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
                    // InternalMyDsl.g:642:2: ( ruleMyNumeric )
                    {
                    // InternalMyDsl.g:642:2: ( ruleMyNumeric )
                    // InternalMyDsl.g:643:3: ruleMyNumeric
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
                    // InternalMyDsl.g:648:2: ( ruleMyString )
                    {
                    // InternalMyDsl.g:648:2: ( ruleMyString )
                    // InternalMyDsl.g:649:3: ruleMyString
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
                    // InternalMyDsl.g:654:2: ( ruleMyBoolean )
                    {
                    // InternalMyDsl.g:654:2: ( ruleMyBoolean )
                    // InternalMyDsl.g:655:3: ruleMyBoolean
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
    // InternalMyDsl.g:664:1: rule__Atributo__Alternatives : ( ( ruleAtributoMocka ) | ( ruleAtributoArreglo ) | ( ruleAtributoSimple ) );
    public final void rule__Atributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:668:1: ( ( ruleAtributoMocka ) | ( ruleAtributoArreglo ) | ( ruleAtributoSimple ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==48) ) {
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

                    if ( (LA3_5==48) ) {
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
                case 46:
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
                case RULE_STRING:
                    {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==48) ) {
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

                    if ( (LA3_5==48) ) {
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
                case 46:
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
            case 15:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==48) ) {
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

                    if ( (LA3_5==48) ) {
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
                case 46:
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
                    // InternalMyDsl.g:669:2: ( ruleAtributoMocka )
                    {
                    // InternalMyDsl.g:669:2: ( ruleAtributoMocka )
                    // InternalMyDsl.g:670:3: ruleAtributoMocka
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
                    // InternalMyDsl.g:675:2: ( ruleAtributoArreglo )
                    {
                    // InternalMyDsl.g:675:2: ( ruleAtributoArreglo )
                    // InternalMyDsl.g:676:3: ruleAtributoArreglo
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
                    // InternalMyDsl.g:681:2: ( ruleAtributoSimple )
                    {
                    // InternalMyDsl.g:681:2: ( ruleAtributoSimple )
                    // InternalMyDsl.g:682:3: ruleAtributoSimple
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


    // $ANTLR start "rule__Atributo2__Alternatives_0"
    // InternalMyDsl.g:691:1: rule__Atributo2__Alternatives_0 : ( ( RULE_ID ) | ( 'string' ) | ( 'int' ) | ( 'boolean' ) );
    public final void rule__Atributo2__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:695:1: ( ( RULE_ID ) | ( 'string' ) | ( 'int' ) | ( 'boolean' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:696:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:696:2: ( RULE_ID )
                    // InternalMyDsl.g:697:3: RULE_ID
                    {
                     before(grammarAccess.getAtributo2Access().getIDTerminalRuleCall_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getAtributo2Access().getIDTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:702:2: ( 'string' )
                    {
                    // InternalMyDsl.g:702:2: ( 'string' )
                    // InternalMyDsl.g:703:3: 'string'
                    {
                     before(grammarAccess.getAtributo2Access().getStringKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAtributo2Access().getStringKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:708:2: ( 'int' )
                    {
                    // InternalMyDsl.g:708:2: ( 'int' )
                    // InternalMyDsl.g:709:3: 'int'
                    {
                     before(grammarAccess.getAtributo2Access().getIntKeyword_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAtributo2Access().getIntKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:714:2: ( 'boolean' )
                    {
                    // InternalMyDsl.g:714:2: ( 'boolean' )
                    // InternalMyDsl.g:715:3: 'boolean'
                    {
                     before(grammarAccess.getAtributo2Access().getBooleanKeyword_0_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getAtributo2Access().getBooleanKeyword_0_3()); 

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
    // $ANTLR end "rule__Atributo2__Alternatives_0"


    // $ANTLR start "rule__AtributoMocka__Alternatives_2_1"
    // InternalMyDsl.g:724:1: rule__AtributoMocka__Alternatives_2_1 : ( ( ( rule__AtributoMocka__Group_2_1_0__0 ) ) | ( ( rule__AtributoMocka__Group_2_1_1__0 ) ) );
    public final void rule__AtributoMocka__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:728:1: ( ( ( rule__AtributoMocka__Group_2_1_0__0 ) ) | ( ( rule__AtributoMocka__Group_2_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==72) ) {
                alt5=1;
            }
            else if ( (LA5_0==50) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:729:2: ( ( rule__AtributoMocka__Group_2_1_0__0 ) )
                    {
                    // InternalMyDsl.g:729:2: ( ( rule__AtributoMocka__Group_2_1_0__0 ) )
                    // InternalMyDsl.g:730:3: ( rule__AtributoMocka__Group_2_1_0__0 )
                    {
                     before(grammarAccess.getAtributoMockaAccess().getGroup_2_1_0()); 
                    // InternalMyDsl.g:731:3: ( rule__AtributoMocka__Group_2_1_0__0 )
                    // InternalMyDsl.g:731:4: rule__AtributoMocka__Group_2_1_0__0
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
                    // InternalMyDsl.g:735:2: ( ( rule__AtributoMocka__Group_2_1_1__0 ) )
                    {
                    // InternalMyDsl.g:735:2: ( ( rule__AtributoMocka__Group_2_1_1__0 ) )
                    // InternalMyDsl.g:736:3: ( rule__AtributoMocka__Group_2_1_1__0 )
                    {
                     before(grammarAccess.getAtributoMockaAccess().getGroup_2_1_1()); 
                    // InternalMyDsl.g:737:3: ( rule__AtributoMocka__Group_2_1_1__0 )
                    // InternalMyDsl.g:737:4: rule__AtributoMocka__Group_2_1_1__0
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
    // InternalMyDsl.g:745:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:749:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:750:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:750:2: ( RULE_STRING )
                    // InternalMyDsl.g:751:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:756:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:756:2: ( RULE_ID )
                    // InternalMyDsl.g:757:3: RULE_ID
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
    // InternalMyDsl.g:766:1: rule__ServicioRest__Alternatives_7 : ( ( ruleEString ) | ( '/' ) | ( ':' ) | ( '{' ) | ( '}' ) | ( '$' ) | ( '?' ) );
    public final void rule__ServicioRest__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:770:1: ( ( ruleEString ) | ( '/' ) | ( ':' ) | ( '{' ) | ( '}' ) | ( '$' ) | ( '?' ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case 16:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            case 18:
                {
                alt7=4;
                }
                break;
            case 19:
                {
                alt7=5;
                }
                break;
            case 20:
                {
                alt7=6;
                }
                break;
            case 21:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:771:2: ( ruleEString )
                    {
                    // InternalMyDsl.g:771:2: ( ruleEString )
                    // InternalMyDsl.g:772:3: ruleEString
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
                    // InternalMyDsl.g:777:2: ( '/' )
                    {
                    // InternalMyDsl.g:777:2: ( '/' )
                    // InternalMyDsl.g:778:3: '/'
                    {
                     before(grammarAccess.getServicioRestAccess().getSolidusKeyword_7_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getServicioRestAccess().getSolidusKeyword_7_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:783:2: ( ':' )
                    {
                    // InternalMyDsl.g:783:2: ( ':' )
                    // InternalMyDsl.g:784:3: ':'
                    {
                     before(grammarAccess.getServicioRestAccess().getColonKeyword_7_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getServicioRestAccess().getColonKeyword_7_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:789:2: ( '{' )
                    {
                    // InternalMyDsl.g:789:2: ( '{' )
                    // InternalMyDsl.g:790:3: '{'
                    {
                     before(grammarAccess.getServicioRestAccess().getLeftCurlyBracketKeyword_7_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getServicioRestAccess().getLeftCurlyBracketKeyword_7_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:795:2: ( '}' )
                    {
                    // InternalMyDsl.g:795:2: ( '}' )
                    // InternalMyDsl.g:796:3: '}'
                    {
                     before(grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_7_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_7_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:801:2: ( '$' )
                    {
                    // InternalMyDsl.g:801:2: ( '$' )
                    // InternalMyDsl.g:802:3: '$'
                    {
                     before(grammarAccess.getServicioRestAccess().getDollarSignKeyword_7_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getServicioRestAccess().getDollarSignKeyword_7_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:807:2: ( '?' )
                    {
                    // InternalMyDsl.g:807:2: ( '?' )
                    // InternalMyDsl.g:808:3: '?'
                    {
                     before(grammarAccess.getServicioRestAccess().getQuestionMarkKeyword_7_6()); 
                    match(input,21,FOLLOW_2); 
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


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalMyDsl.g:817:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:821:1: ( ( 'E' ) | ( 'e' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:822:2: ( 'E' )
                    {
                    // InternalMyDsl.g:822:2: ( 'E' )
                    // InternalMyDsl.g:823:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:828:2: ( 'e' )
                    {
                    // InternalMyDsl.g:828:2: ( 'e' )
                    // InternalMyDsl.g:829:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:838:1: rule__TipoAtributo__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) );
    public final void rule__TipoAtributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:842:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) )
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
                    // InternalMyDsl.g:843:2: ( ( 'string' ) )
                    {
                    // InternalMyDsl.g:843:2: ( ( 'string' ) )
                    // InternalMyDsl.g:844:3: ( 'string' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:845:3: ( 'string' )
                    // InternalMyDsl.g:845:4: 'string'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:849:2: ( ( 'int' ) )
                    {
                    // InternalMyDsl.g:849:2: ( ( 'int' ) )
                    // InternalMyDsl.g:850:3: ( 'int' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:851:3: ( 'int' )
                    // InternalMyDsl.g:851:4: 'int'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:855:2: ( ( 'boolean' ) )
                    {
                    // InternalMyDsl.g:855:2: ( ( 'boolean' ) )
                    // InternalMyDsl.g:856:3: ( 'boolean' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:857:3: ( 'boolean' )
                    // InternalMyDsl.g:857:4: 'boolean'
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
    // InternalMyDsl.g:865:1: rule__Mockaroo__Alternatives : ( ( ( 'FirstNameType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CityType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'LatitudeType' ) ) | ( ( 'LongitudType' ) ) | ( ( 'RowNumberType' ) ) | ( ( 'BooleanType' ) ) );
    public final void rule__Mockaroo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:869:1: ( ( ( 'FirstNameType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CityType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'LatitudeType' ) ) | ( ( 'LongitudType' ) ) | ( ( 'RowNumberType' ) ) | ( ( 'BooleanType' ) ) )
            int alt10=14;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt10=1;
                }
                break;
            case 25:
                {
                alt10=2;
                }
                break;
            case 26:
                {
                alt10=3;
                }
                break;
            case 27:
                {
                alt10=4;
                }
                break;
            case 28:
                {
                alt10=5;
                }
                break;
            case 29:
                {
                alt10=6;
                }
                break;
            case 30:
                {
                alt10=7;
                }
                break;
            case 31:
                {
                alt10=8;
                }
                break;
            case 32:
                {
                alt10=9;
                }
                break;
            case 33:
                {
                alt10=10;
                }
                break;
            case 34:
                {
                alt10=11;
                }
                break;
            case 35:
                {
                alt10=12;
                }
                break;
            case 36:
                {
                alt10=13;
                }
                break;
            case 37:
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
                    // InternalMyDsl.g:870:2: ( ( 'FirstNameType' ) )
                    {
                    // InternalMyDsl.g:870:2: ( ( 'FirstNameType' ) )
                    // InternalMyDsl.g:871:3: ( 'FirstNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:872:3: ( 'FirstNameType' )
                    // InternalMyDsl.g:872:4: 'FirstNameType'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:876:2: ( ( 'LastNameType' ) )
                    {
                    // InternalMyDsl.g:876:2: ( ( 'LastNameType' ) )
                    // InternalMyDsl.g:877:3: ( 'LastNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:878:3: ( 'LastNameType' )
                    // InternalMyDsl.g:878:4: 'LastNameType'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:882:2: ( ( 'FamilyNameType' ) )
                    {
                    // InternalMyDsl.g:882:2: ( ( 'FamilyNameType' ) )
                    // InternalMyDsl.g:883:3: ( 'FamilyNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:884:3: ( 'FamilyNameType' )
                    // InternalMyDsl.g:884:4: 'FamilyNameType'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:888:2: ( ( 'FullNameType' ) )
                    {
                    // InternalMyDsl.g:888:2: ( ( 'FullNameType' ) )
                    // InternalMyDsl.g:889:3: ( 'FullNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:890:3: ( 'FullNameType' )
                    // InternalMyDsl.g:890:4: 'FullNameType'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:894:2: ( ( 'GenderType' ) )
                    {
                    // InternalMyDsl.g:894:2: ( ( 'GenderType' ) )
                    // InternalMyDsl.g:895:3: ( 'GenderType' )
                    {
                     before(grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:896:3: ( 'GenderType' )
                    // InternalMyDsl.g:896:4: 'GenderType'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:900:2: ( ( 'EmailAddressType' ) )
                    {
                    // InternalMyDsl.g:900:2: ( ( 'EmailAddressType' ) )
                    // InternalMyDsl.g:901:3: ( 'EmailAddressType' )
                    {
                     before(grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:902:3: ( 'EmailAddressType' )
                    // InternalMyDsl.g:902:4: 'EmailAddressType'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:906:2: ( ( 'PhoneType' ) )
                    {
                    // InternalMyDsl.g:906:2: ( ( 'PhoneType' ) )
                    // InternalMyDsl.g:907:3: ( 'PhoneType' )
                    {
                     before(grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:908:3: ( 'PhoneType' )
                    // InternalMyDsl.g:908:4: 'PhoneType'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:912:2: ( ( 'CountryType' ) )
                    {
                    // InternalMyDsl.g:912:2: ( ( 'CountryType' ) )
                    // InternalMyDsl.g:913:3: ( 'CountryType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7()); 
                    // InternalMyDsl.g:914:3: ( 'CountryType' )
                    // InternalMyDsl.g:914:4: 'CountryType'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:918:2: ( ( 'CityType' ) )
                    {
                    // InternalMyDsl.g:918:2: ( ( 'CityType' ) )
                    // InternalMyDsl.g:919:3: ( 'CityType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8()); 
                    // InternalMyDsl.g:920:3: ( 'CityType' )
                    // InternalMyDsl.g:920:4: 'CityType'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:924:2: ( ( 'CountryCodeType' ) )
                    {
                    // InternalMyDsl.g:924:2: ( ( 'CountryCodeType' ) )
                    // InternalMyDsl.g:925:3: ( 'CountryCodeType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9()); 
                    // InternalMyDsl.g:926:3: ( 'CountryCodeType' )
                    // InternalMyDsl.g:926:4: 'CountryCodeType'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:930:2: ( ( 'LatitudeType' ) )
                    {
                    // InternalMyDsl.g:930:2: ( ( 'LatitudeType' ) )
                    // InternalMyDsl.g:931:3: ( 'LatitudeType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10()); 
                    // InternalMyDsl.g:932:3: ( 'LatitudeType' )
                    // InternalMyDsl.g:932:4: 'LatitudeType'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:936:2: ( ( 'LongitudType' ) )
                    {
                    // InternalMyDsl.g:936:2: ( ( 'LongitudType' ) )
                    // InternalMyDsl.g:937:3: ( 'LongitudType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11()); 
                    // InternalMyDsl.g:938:3: ( 'LongitudType' )
                    // InternalMyDsl.g:938:4: 'LongitudType'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:942:2: ( ( 'RowNumberType' ) )
                    {
                    // InternalMyDsl.g:942:2: ( ( 'RowNumberType' ) )
                    // InternalMyDsl.g:943:3: ( 'RowNumberType' )
                    {
                     before(grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 
                    // InternalMyDsl.g:944:3: ( 'RowNumberType' )
                    // InternalMyDsl.g:944:4: 'RowNumberType'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:948:2: ( ( 'BooleanType' ) )
                    {
                    // InternalMyDsl.g:948:2: ( ( 'BooleanType' ) )
                    // InternalMyDsl.g:949:3: ( 'BooleanType' )
                    {
                     before(grammarAccess.getMockarooAccess().getBooleanTypeEnumLiteralDeclaration_13()); 
                    // InternalMyDsl.g:950:3: ( 'BooleanType' )
                    // InternalMyDsl.g:950:4: 'BooleanType'
                    {
                    match(input,37,FOLLOW_2); 

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
    // InternalMyDsl.g:958:1: rule__TipoMetodoRest__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__TipoMetodoRest__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:962:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt11=1;
                }
                break;
            case 39:
                {
                alt11=2;
                }
                break;
            case 40:
                {
                alt11=3;
                }
                break;
            case 41:
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
                    // InternalMyDsl.g:963:2: ( ( 'GET' ) )
                    {
                    // InternalMyDsl.g:963:2: ( ( 'GET' ) )
                    // InternalMyDsl.g:964:3: ( 'GET' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:965:3: ( 'GET' )
                    // InternalMyDsl.g:965:4: 'GET'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:969:2: ( ( 'POST' ) )
                    {
                    // InternalMyDsl.g:969:2: ( ( 'POST' ) )
                    // InternalMyDsl.g:970:3: ( 'POST' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:971:3: ( 'POST' )
                    // InternalMyDsl.g:971:4: 'POST'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:975:2: ( ( 'PUT' ) )
                    {
                    // InternalMyDsl.g:975:2: ( ( 'PUT' ) )
                    // InternalMyDsl.g:976:3: ( 'PUT' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:977:3: ( 'PUT' )
                    // InternalMyDsl.g:977:4: 'PUT'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:981:2: ( ( 'DELETE' ) )
                    {
                    // InternalMyDsl.g:981:2: ( ( 'DELETE' ) )
                    // InternalMyDsl.g:982:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:983:3: ( 'DELETE' )
                    // InternalMyDsl.g:983:4: 'DELETE'
                    {
                    match(input,41,FOLLOW_2); 

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
    // InternalMyDsl.g:991:1: rule__TipoParametro__Alternatives : ( ( ( 'Path' ) ) | ( ( 'Query' ) ) | ( ( 'Body' ) ) );
    public final void rule__TipoParametro__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:995:1: ( ( ( 'Path' ) ) | ( ( 'Query' ) ) | ( ( 'Body' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt12=1;
                }
                break;
            case 43:
                {
                alt12=2;
                }
                break;
            case 44:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:996:2: ( ( 'Path' ) )
                    {
                    // InternalMyDsl.g:996:2: ( ( 'Path' ) )
                    // InternalMyDsl.g:997:3: ( 'Path' )
                    {
                     before(grammarAccess.getTipoParametroAccess().getPathEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:998:3: ( 'Path' )
                    // InternalMyDsl.g:998:4: 'Path'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoParametroAccess().getPathEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1002:2: ( ( 'Query' ) )
                    {
                    // InternalMyDsl.g:1002:2: ( ( 'Query' ) )
                    // InternalMyDsl.g:1003:3: ( 'Query' )
                    {
                     before(grammarAccess.getTipoParametroAccess().getQueryEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1004:3: ( 'Query' )
                    // InternalMyDsl.g:1004:4: 'Query'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoParametroAccess().getQueryEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1008:2: ( ( 'Body' ) )
                    {
                    // InternalMyDsl.g:1008:2: ( ( 'Body' ) )
                    // InternalMyDsl.g:1009:3: ( 'Body' )
                    {
                     before(grammarAccess.getTipoParametroAccess().getBodyEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1010:3: ( 'Body' )
                    // InternalMyDsl.g:1010:4: 'Body'
                    {
                    match(input,44,FOLLOW_2); 

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
    // InternalMyDsl.g:1018:1: rule__Api__Group__0 : rule__Api__Group__0__Impl rule__Api__Group__1 ;
    public final void rule__Api__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1022:1: ( rule__Api__Group__0__Impl rule__Api__Group__1 )
            // InternalMyDsl.g:1023:2: rule__Api__Group__0__Impl rule__Api__Group__1
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
    // InternalMyDsl.g:1030:1: rule__Api__Group__0__Impl : ( () ) ;
    public final void rule__Api__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1034:1: ( ( () ) )
            // InternalMyDsl.g:1035:1: ( () )
            {
            // InternalMyDsl.g:1035:1: ( () )
            // InternalMyDsl.g:1036:2: ()
            {
             before(grammarAccess.getApiAccess().getApiAction_0()); 
            // InternalMyDsl.g:1037:2: ()
            // InternalMyDsl.g:1037:3: 
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
    // InternalMyDsl.g:1045:1: rule__Api__Group__1 : rule__Api__Group__1__Impl rule__Api__Group__2 ;
    public final void rule__Api__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1049:1: ( rule__Api__Group__1__Impl rule__Api__Group__2 )
            // InternalMyDsl.g:1050:2: rule__Api__Group__1__Impl rule__Api__Group__2
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
    // InternalMyDsl.g:1057:1: rule__Api__Group__1__Impl : ( 'apiURL' ) ;
    public final void rule__Api__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1061:1: ( ( 'apiURL' ) )
            // InternalMyDsl.g:1062:1: ( 'apiURL' )
            {
            // InternalMyDsl.g:1062:1: ( 'apiURL' )
            // InternalMyDsl.g:1063:2: 'apiURL'
            {
             before(grammarAccess.getApiAccess().getApiURLKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:1072:1: rule__Api__Group__2 : rule__Api__Group__2__Impl rule__Api__Group__3 ;
    public final void rule__Api__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1076:1: ( rule__Api__Group__2__Impl rule__Api__Group__3 )
            // InternalMyDsl.g:1077:2: rule__Api__Group__2__Impl rule__Api__Group__3
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
    // InternalMyDsl.g:1084:1: rule__Api__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__Api__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1088:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1089:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1089:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1090:2: RULE_EQUAL
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
    // InternalMyDsl.g:1099:1: rule__Api__Group__3 : rule__Api__Group__3__Impl rule__Api__Group__4 ;
    public final void rule__Api__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1103:1: ( rule__Api__Group__3__Impl rule__Api__Group__4 )
            // InternalMyDsl.g:1104:2: rule__Api__Group__3__Impl rule__Api__Group__4
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
    // InternalMyDsl.g:1111:1: rule__Api__Group__3__Impl : ( ( rule__Api__UrlAssignment_3 ) ) ;
    public final void rule__Api__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1115:1: ( ( ( rule__Api__UrlAssignment_3 ) ) )
            // InternalMyDsl.g:1116:1: ( ( rule__Api__UrlAssignment_3 ) )
            {
            // InternalMyDsl.g:1116:1: ( ( rule__Api__UrlAssignment_3 ) )
            // InternalMyDsl.g:1117:2: ( rule__Api__UrlAssignment_3 )
            {
             before(grammarAccess.getApiAccess().getUrlAssignment_3()); 
            // InternalMyDsl.g:1118:2: ( rule__Api__UrlAssignment_3 )
            // InternalMyDsl.g:1118:3: rule__Api__UrlAssignment_3
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
    // InternalMyDsl.g:1126:1: rule__Api__Group__4 : rule__Api__Group__4__Impl rule__Api__Group__5 ;
    public final void rule__Api__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1130:1: ( rule__Api__Group__4__Impl rule__Api__Group__5 )
            // InternalMyDsl.g:1131:2: rule__Api__Group__4__Impl rule__Api__Group__5
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
    // InternalMyDsl.g:1138:1: rule__Api__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Api__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1142:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1143:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1143:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1144:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:1153:1: rule__Api__Group__5 : rule__Api__Group__5__Impl rule__Api__Group__6 ;
    public final void rule__Api__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1157:1: ( rule__Api__Group__5__Impl rule__Api__Group__6 )
            // InternalMyDsl.g:1158:2: rule__Api__Group__5__Impl rule__Api__Group__6
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
    // InternalMyDsl.g:1165:1: rule__Api__Group__5__Impl : ( ( rule__Api__EntidadesAssignment_5 )* ) ;
    public final void rule__Api__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1169:1: ( ( ( rule__Api__EntidadesAssignment_5 )* ) )
            // InternalMyDsl.g:1170:1: ( ( rule__Api__EntidadesAssignment_5 )* )
            {
            // InternalMyDsl.g:1170:1: ( ( rule__Api__EntidadesAssignment_5 )* )
            // InternalMyDsl.g:1171:2: ( rule__Api__EntidadesAssignment_5 )*
            {
             before(grammarAccess.getApiAccess().getEntidadesAssignment_5()); 
            // InternalMyDsl.g:1172:2: ( rule__Api__EntidadesAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==51||LA13_0==55) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1172:3: rule__Api__EntidadesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Api__EntidadesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMyDsl.g:1180:1: rule__Api__Group__6 : rule__Api__Group__6__Impl rule__Api__Group__7 ;
    public final void rule__Api__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1184:1: ( rule__Api__Group__6__Impl rule__Api__Group__7 )
            // InternalMyDsl.g:1185:2: rule__Api__Group__6__Impl rule__Api__Group__7
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
    // InternalMyDsl.g:1192:1: rule__Api__Group__6__Impl : ( ( rule__Api__PrimitivetypesAssignment_6 )* ) ;
    public final void rule__Api__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1196:1: ( ( ( rule__Api__PrimitivetypesAssignment_6 )* ) )
            // InternalMyDsl.g:1197:1: ( ( rule__Api__PrimitivetypesAssignment_6 )* )
            {
            // InternalMyDsl.g:1197:1: ( ( rule__Api__PrimitivetypesAssignment_6 )* )
            // InternalMyDsl.g:1198:2: ( rule__Api__PrimitivetypesAssignment_6 )*
            {
             before(grammarAccess.getApiAccess().getPrimitivetypesAssignment_6()); 
            // InternalMyDsl.g:1199:2: ( rule__Api__PrimitivetypesAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=56 && LA14_0<=59)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1199:3: rule__Api__PrimitivetypesAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Api__PrimitivetypesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMyDsl.g:1207:1: rule__Api__Group__7 : rule__Api__Group__7__Impl ;
    public final void rule__Api__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1211:1: ( rule__Api__Group__7__Impl )
            // InternalMyDsl.g:1212:2: rule__Api__Group__7__Impl
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
    // InternalMyDsl.g:1218:1: rule__Api__Group__7__Impl : ( ( rule__Api__ServiciosRestAssignment_7 )* ) ;
    public final void rule__Api__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1222:1: ( ( ( rule__Api__ServiciosRestAssignment_7 )* ) )
            // InternalMyDsl.g:1223:1: ( ( rule__Api__ServiciosRestAssignment_7 )* )
            {
            // InternalMyDsl.g:1223:1: ( ( rule__Api__ServiciosRestAssignment_7 )* )
            // InternalMyDsl.g:1224:2: ( rule__Api__ServiciosRestAssignment_7 )*
            {
             before(grammarAccess.getApiAccess().getServiciosRestAssignment_7()); 
            // InternalMyDsl.g:1225:2: ( rule__Api__ServiciosRestAssignment_7 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=38 && LA15_0<=41)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1225:3: rule__Api__ServiciosRestAssignment_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Api__ServiciosRestAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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


    // $ANTLR start "rule__Atributo2__Group__0"
    // InternalMyDsl.g:1234:1: rule__Atributo2__Group__0 : rule__Atributo2__Group__0__Impl rule__Atributo2__Group__1 ;
    public final void rule__Atributo2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1238:1: ( rule__Atributo2__Group__0__Impl rule__Atributo2__Group__1 )
            // InternalMyDsl.g:1239:2: rule__Atributo2__Group__0__Impl rule__Atributo2__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Atributo2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo2__Group__0"


    // $ANTLR start "rule__Atributo2__Group__0__Impl"
    // InternalMyDsl.g:1246:1: rule__Atributo2__Group__0__Impl : ( ( rule__Atributo2__Alternatives_0 ) ) ;
    public final void rule__Atributo2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1250:1: ( ( ( rule__Atributo2__Alternatives_0 ) ) )
            // InternalMyDsl.g:1251:1: ( ( rule__Atributo2__Alternatives_0 ) )
            {
            // InternalMyDsl.g:1251:1: ( ( rule__Atributo2__Alternatives_0 ) )
            // InternalMyDsl.g:1252:2: ( rule__Atributo2__Alternatives_0 )
            {
             before(grammarAccess.getAtributo2Access().getAlternatives_0()); 
            // InternalMyDsl.g:1253:2: ( rule__Atributo2__Alternatives_0 )
            // InternalMyDsl.g:1253:3: rule__Atributo2__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Atributo2__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributo2Access().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo2__Group__0__Impl"


    // $ANTLR start "rule__Atributo2__Group__1"
    // InternalMyDsl.g:1261:1: rule__Atributo2__Group__1 : rule__Atributo2__Group__1__Impl ;
    public final void rule__Atributo2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1265:1: ( rule__Atributo2__Group__1__Impl )
            // InternalMyDsl.g:1266:2: rule__Atributo2__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atributo2__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo2__Group__1"


    // $ANTLR start "rule__Atributo2__Group__1__Impl"
    // InternalMyDsl.g:1272:1: rule__Atributo2__Group__1__Impl : ( ( rule__Atributo2__Group_1__0 )? ) ;
    public final void rule__Atributo2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1276:1: ( ( ( rule__Atributo2__Group_1__0 )? ) )
            // InternalMyDsl.g:1277:1: ( ( rule__Atributo2__Group_1__0 )? )
            {
            // InternalMyDsl.g:1277:1: ( ( rule__Atributo2__Group_1__0 )? )
            // InternalMyDsl.g:1278:2: ( rule__Atributo2__Group_1__0 )?
            {
             before(grammarAccess.getAtributo2Access().getGroup_1()); 
            // InternalMyDsl.g:1279:2: ( rule__Atributo2__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==46) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1279:3: rule__Atributo2__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atributo2__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtributo2Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo2__Group__1__Impl"


    // $ANTLR start "rule__Atributo2__Group_1__0"
    // InternalMyDsl.g:1288:1: rule__Atributo2__Group_1__0 : rule__Atributo2__Group_1__0__Impl rule__Atributo2__Group_1__1 ;
    public final void rule__Atributo2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1292:1: ( rule__Atributo2__Group_1__0__Impl rule__Atributo2__Group_1__1 )
            // InternalMyDsl.g:1293:2: rule__Atributo2__Group_1__0__Impl rule__Atributo2__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Atributo2__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo2__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo2__Group_1__0"


    // $ANTLR start "rule__Atributo2__Group_1__0__Impl"
    // InternalMyDsl.g:1300:1: rule__Atributo2__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Atributo2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1304:1: ( ( '[' ) )
            // InternalMyDsl.g:1305:1: ( '[' )
            {
            // InternalMyDsl.g:1305:1: ( '[' )
            // InternalMyDsl.g:1306:2: '['
            {
             before(grammarAccess.getAtributo2Access().getLeftSquareBracketKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAtributo2Access().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo2__Group_1__0__Impl"


    // $ANTLR start "rule__Atributo2__Group_1__1"
    // InternalMyDsl.g:1315:1: rule__Atributo2__Group_1__1 : rule__Atributo2__Group_1__1__Impl ;
    public final void rule__Atributo2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1319:1: ( rule__Atributo2__Group_1__1__Impl )
            // InternalMyDsl.g:1320:2: rule__Atributo2__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atributo2__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo2__Group_1__1"


    // $ANTLR start "rule__Atributo2__Group_1__1__Impl"
    // InternalMyDsl.g:1326:1: rule__Atributo2__Group_1__1__Impl : ( ']' ) ;
    public final void rule__Atributo2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1330:1: ( ( ']' ) )
            // InternalMyDsl.g:1331:1: ( ']' )
            {
            // InternalMyDsl.g:1331:1: ( ']' )
            // InternalMyDsl.g:1332:2: ']'
            {
             before(grammarAccess.getAtributo2Access().getRightSquareBracketKeyword_1_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getAtributo2Access().getRightSquareBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo2__Group_1__1__Impl"


    // $ANTLR start "rule__AtributoMocka__Group__0"
    // InternalMyDsl.g:1342:1: rule__AtributoMocka__Group__0 : rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1 ;
    public final void rule__AtributoMocka__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1346:1: ( rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1 )
            // InternalMyDsl.g:1347:2: rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1
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
    // InternalMyDsl.g:1354:1: rule__AtributoMocka__Group__0__Impl : ( ( rule__AtributoMocka__TipoAssignment_0 ) ) ;
    public final void rule__AtributoMocka__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1358:1: ( ( ( rule__AtributoMocka__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:1359:1: ( ( rule__AtributoMocka__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:1359:1: ( ( rule__AtributoMocka__TipoAssignment_0 ) )
            // InternalMyDsl.g:1360:2: ( rule__AtributoMocka__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:1361:2: ( rule__AtributoMocka__TipoAssignment_0 )
            // InternalMyDsl.g:1361:3: rule__AtributoMocka__TipoAssignment_0
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
    // InternalMyDsl.g:1369:1: rule__AtributoMocka__Group__1 : rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2 ;
    public final void rule__AtributoMocka__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1373:1: ( rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2 )
            // InternalMyDsl.g:1374:2: rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1381:1: rule__AtributoMocka__Group__1__Impl : ( ( rule__AtributoMocka__NombreAssignment_1 ) ) ;
    public final void rule__AtributoMocka__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1385:1: ( ( ( rule__AtributoMocka__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:1386:1: ( ( rule__AtributoMocka__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:1386:1: ( ( rule__AtributoMocka__NombreAssignment_1 ) )
            // InternalMyDsl.g:1387:2: ( rule__AtributoMocka__NombreAssignment_1 )
            {
             before(grammarAccess.getAtributoMockaAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:1388:2: ( rule__AtributoMocka__NombreAssignment_1 )
            // InternalMyDsl.g:1388:3: rule__AtributoMocka__NombreAssignment_1
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
    // InternalMyDsl.g:1396:1: rule__AtributoMocka__Group__2 : rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3 ;
    public final void rule__AtributoMocka__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1400:1: ( rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3 )
            // InternalMyDsl.g:1401:2: rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3
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
    // InternalMyDsl.g:1408:1: rule__AtributoMocka__Group__2__Impl : ( ( rule__AtributoMocka__Group_2__0 ) ) ;
    public final void rule__AtributoMocka__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1412:1: ( ( ( rule__AtributoMocka__Group_2__0 ) ) )
            // InternalMyDsl.g:1413:1: ( ( rule__AtributoMocka__Group_2__0 ) )
            {
            // InternalMyDsl.g:1413:1: ( ( rule__AtributoMocka__Group_2__0 ) )
            // InternalMyDsl.g:1414:2: ( rule__AtributoMocka__Group_2__0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getGroup_2()); 
            // InternalMyDsl.g:1415:2: ( rule__AtributoMocka__Group_2__0 )
            // InternalMyDsl.g:1415:3: rule__AtributoMocka__Group_2__0
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
    // InternalMyDsl.g:1423:1: rule__AtributoMocka__Group__3 : rule__AtributoMocka__Group__3__Impl ;
    public final void rule__AtributoMocka__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1427:1: ( rule__AtributoMocka__Group__3__Impl )
            // InternalMyDsl.g:1428:2: rule__AtributoMocka__Group__3__Impl
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
    // InternalMyDsl.g:1434:1: rule__AtributoMocka__Group__3__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoMocka__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1438:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1439:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1439:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1440:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:1450:1: rule__AtributoMocka__Group_2__0 : rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1 ;
    public final void rule__AtributoMocka__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1454:1: ( rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1 )
            // InternalMyDsl.g:1455:2: rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1462:1: rule__AtributoMocka__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtributoMocka__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1466:1: ( ( '(' ) )
            // InternalMyDsl.g:1467:1: ( '(' )
            {
            // InternalMyDsl.g:1467:1: ( '(' )
            // InternalMyDsl.g:1468:2: '('
            {
             before(grammarAccess.getAtributoMockaAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:1477:1: rule__AtributoMocka__Group_2__1 : rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2 ;
    public final void rule__AtributoMocka__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1481:1: ( rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2 )
            // InternalMyDsl.g:1482:2: rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1489:1: rule__AtributoMocka__Group_2__1__Impl : ( ( rule__AtributoMocka__Alternatives_2_1 ) ) ;
    public final void rule__AtributoMocka__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1493:1: ( ( ( rule__AtributoMocka__Alternatives_2_1 ) ) )
            // InternalMyDsl.g:1494:1: ( ( rule__AtributoMocka__Alternatives_2_1 ) )
            {
            // InternalMyDsl.g:1494:1: ( ( rule__AtributoMocka__Alternatives_2_1 ) )
            // InternalMyDsl.g:1495:2: ( rule__AtributoMocka__Alternatives_2_1 )
            {
             before(grammarAccess.getAtributoMockaAccess().getAlternatives_2_1()); 
            // InternalMyDsl.g:1496:2: ( rule__AtributoMocka__Alternatives_2_1 )
            // InternalMyDsl.g:1496:3: rule__AtributoMocka__Alternatives_2_1
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
    // InternalMyDsl.g:1504:1: rule__AtributoMocka__Group_2__2 : rule__AtributoMocka__Group_2__2__Impl ;
    public final void rule__AtributoMocka__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1508:1: ( rule__AtributoMocka__Group_2__2__Impl )
            // InternalMyDsl.g:1509:2: rule__AtributoMocka__Group_2__2__Impl
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
    // InternalMyDsl.g:1515:1: rule__AtributoMocka__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtributoMocka__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1519:1: ( ( ')' ) )
            // InternalMyDsl.g:1520:1: ( ')' )
            {
            // InternalMyDsl.g:1520:1: ( ')' )
            // InternalMyDsl.g:1521:2: ')'
            {
             before(grammarAccess.getAtributoMockaAccess().getRightParenthesisKeyword_2_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:1531:1: rule__AtributoMocka__Group_2_1_0__0 : rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1 ;
    public final void rule__AtributoMocka__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1535:1: ( rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1 )
            // InternalMyDsl.g:1536:2: rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1
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
    // InternalMyDsl.g:1543:1: rule__AtributoMocka__Group_2_1_0__0__Impl : ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1547:1: ( ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) ) )
            // InternalMyDsl.g:1548:1: ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) )
            {
            // InternalMyDsl.g:1548:1: ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) )
            // InternalMyDsl.g:1549:2: ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyAssignment_2_1_0_0()); 
            // InternalMyDsl.g:1550:2: ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 )
            // InternalMyDsl.g:1550:3: rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0
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
    // InternalMyDsl.g:1558:1: rule__AtributoMocka__Group_2_1_0__1 : rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2 ;
    public final void rule__AtributoMocka__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1562:1: ( rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2 )
            // InternalMyDsl.g:1563:2: rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1570:1: rule__AtributoMocka__Group_2_1_0__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__AtributoMocka__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1574:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1575:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1575:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1576:2: RULE_EQUAL
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
    // InternalMyDsl.g:1585:1: rule__AtributoMocka__Group_2_1_0__2 : rule__AtributoMocka__Group_2_1_0__2__Impl ;
    public final void rule__AtributoMocka__Group_2_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1589:1: ( rule__AtributoMocka__Group_2_1_0__2__Impl )
            // InternalMyDsl.g:1590:2: rule__AtributoMocka__Group_2_1_0__2__Impl
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
    // InternalMyDsl.g:1596:1: rule__AtributoMocka__Group_2_1_0__2__Impl : ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1600:1: ( ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) ) )
            // InternalMyDsl.g:1601:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) )
            {
            // InternalMyDsl.g:1601:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) )
            // InternalMyDsl.g:1602:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 )
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_0_2()); 
            // InternalMyDsl.g:1603:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 )
            // InternalMyDsl.g:1603:3: rule__AtributoMocka__MockTypeAssignment_2_1_0_2
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
    // InternalMyDsl.g:1612:1: rule__AtributoMocka__Group_2_1_1__0 : rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1 ;
    public final void rule__AtributoMocka__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1616:1: ( rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1 )
            // InternalMyDsl.g:1617:2: rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1
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
    // InternalMyDsl.g:1624:1: rule__AtributoMocka__Group_2_1_1__0__Impl : ( 'mockType' ) ;
    public final void rule__AtributoMocka__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1628:1: ( ( 'mockType' ) )
            // InternalMyDsl.g:1629:1: ( 'mockType' )
            {
            // InternalMyDsl.g:1629:1: ( 'mockType' )
            // InternalMyDsl.g:1630:2: 'mockType'
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeKeyword_2_1_1_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:1639:1: rule__AtributoMocka__Group_2_1_1__1 : rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2 ;
    public final void rule__AtributoMocka__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1643:1: ( rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2 )
            // InternalMyDsl.g:1644:2: rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1651:1: rule__AtributoMocka__Group_2_1_1__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__AtributoMocka__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1655:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1656:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1656:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1657:2: RULE_EQUAL
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
    // InternalMyDsl.g:1666:1: rule__AtributoMocka__Group_2_1_1__2 : rule__AtributoMocka__Group_2_1_1__2__Impl ;
    public final void rule__AtributoMocka__Group_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1670:1: ( rule__AtributoMocka__Group_2_1_1__2__Impl )
            // InternalMyDsl.g:1671:2: rule__AtributoMocka__Group_2_1_1__2__Impl
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
    // InternalMyDsl.g:1677:1: rule__AtributoMocka__Group_2_1_1__2__Impl : ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1681:1: ( ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) ) )
            // InternalMyDsl.g:1682:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) )
            {
            // InternalMyDsl.g:1682:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) )
            // InternalMyDsl.g:1683:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 )
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_1_2()); 
            // InternalMyDsl.g:1684:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 )
            // InternalMyDsl.g:1684:3: rule__AtributoMocka__MockTypeAssignment_2_1_1_2
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
    // InternalMyDsl.g:1693:1: rule__AtributoArreglo__Group__0 : rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1 ;
    public final void rule__AtributoArreglo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1697:1: ( rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1 )
            // InternalMyDsl.g:1698:2: rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1705:1: rule__AtributoArreglo__Group__0__Impl : ( ( rule__AtributoArreglo__TipoAssignment_0 ) ) ;
    public final void rule__AtributoArreglo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1709:1: ( ( ( rule__AtributoArreglo__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:1710:1: ( ( rule__AtributoArreglo__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:1710:1: ( ( rule__AtributoArreglo__TipoAssignment_0 ) )
            // InternalMyDsl.g:1711:2: ( rule__AtributoArreglo__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoArregloAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:1712:2: ( rule__AtributoArreglo__TipoAssignment_0 )
            // InternalMyDsl.g:1712:3: rule__AtributoArreglo__TipoAssignment_0
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
    // InternalMyDsl.g:1720:1: rule__AtributoArreglo__Group__1 : rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2 ;
    public final void rule__AtributoArreglo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1724:1: ( rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2 )
            // InternalMyDsl.g:1725:2: rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1732:1: rule__AtributoArreglo__Group__1__Impl : ( '[' ) ;
    public final void rule__AtributoArreglo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1736:1: ( ( '[' ) )
            // InternalMyDsl.g:1737:1: ( '[' )
            {
            // InternalMyDsl.g:1737:1: ( '[' )
            // InternalMyDsl.g:1738:2: '['
            {
             before(grammarAccess.getAtributoArregloAccess().getLeftSquareBracketKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:1747:1: rule__AtributoArreglo__Group__2 : rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3 ;
    public final void rule__AtributoArreglo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1751:1: ( rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3 )
            // InternalMyDsl.g:1752:2: rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3
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
    // InternalMyDsl.g:1759:1: rule__AtributoArreglo__Group__2__Impl : ( ']' ) ;
    public final void rule__AtributoArreglo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1763:1: ( ( ']' ) )
            // InternalMyDsl.g:1764:1: ( ']' )
            {
            // InternalMyDsl.g:1764:1: ( ']' )
            // InternalMyDsl.g:1765:2: ']'
            {
             before(grammarAccess.getAtributoArregloAccess().getRightSquareBracketKeyword_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:1774:1: rule__AtributoArreglo__Group__3 : rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4 ;
    public final void rule__AtributoArreglo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1778:1: ( rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4 )
            // InternalMyDsl.g:1779:2: rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4
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
    // InternalMyDsl.g:1786:1: rule__AtributoArreglo__Group__3__Impl : ( ( rule__AtributoArreglo__NombreAssignment_3 ) ) ;
    public final void rule__AtributoArreglo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1790:1: ( ( ( rule__AtributoArreglo__NombreAssignment_3 ) ) )
            // InternalMyDsl.g:1791:1: ( ( rule__AtributoArreglo__NombreAssignment_3 ) )
            {
            // InternalMyDsl.g:1791:1: ( ( rule__AtributoArreglo__NombreAssignment_3 ) )
            // InternalMyDsl.g:1792:2: ( rule__AtributoArreglo__NombreAssignment_3 )
            {
             before(grammarAccess.getAtributoArregloAccess().getNombreAssignment_3()); 
            // InternalMyDsl.g:1793:2: ( rule__AtributoArreglo__NombreAssignment_3 )
            // InternalMyDsl.g:1793:3: rule__AtributoArreglo__NombreAssignment_3
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
    // InternalMyDsl.g:1801:1: rule__AtributoArreglo__Group__4 : rule__AtributoArreglo__Group__4__Impl ;
    public final void rule__AtributoArreglo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1805:1: ( rule__AtributoArreglo__Group__4__Impl )
            // InternalMyDsl.g:1806:2: rule__AtributoArreglo__Group__4__Impl
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
    // InternalMyDsl.g:1812:1: rule__AtributoArreglo__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoArreglo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1816:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1817:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1817:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1818:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:1828:1: rule__AtributoSimple__Group__0 : rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 ;
    public final void rule__AtributoSimple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1832:1: ( rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 )
            // InternalMyDsl.g:1833:2: rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1
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
    // InternalMyDsl.g:1840:1: rule__AtributoSimple__Group__0__Impl : ( ( rule__AtributoSimple__TipoAssignment_0 ) ) ;
    public final void rule__AtributoSimple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1844:1: ( ( ( rule__AtributoSimple__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:1845:1: ( ( rule__AtributoSimple__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:1845:1: ( ( rule__AtributoSimple__TipoAssignment_0 ) )
            // InternalMyDsl.g:1846:2: ( rule__AtributoSimple__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:1847:2: ( rule__AtributoSimple__TipoAssignment_0 )
            // InternalMyDsl.g:1847:3: rule__AtributoSimple__TipoAssignment_0
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
    // InternalMyDsl.g:1855:1: rule__AtributoSimple__Group__1 : rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 ;
    public final void rule__AtributoSimple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1859:1: ( rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 )
            // InternalMyDsl.g:1860:2: rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2
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
    // InternalMyDsl.g:1867:1: rule__AtributoSimple__Group__1__Impl : ( ( rule__AtributoSimple__NombreAssignment_1 ) ) ;
    public final void rule__AtributoSimple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1871:1: ( ( ( rule__AtributoSimple__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:1872:1: ( ( rule__AtributoSimple__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:1872:1: ( ( rule__AtributoSimple__NombreAssignment_1 ) )
            // InternalMyDsl.g:1873:2: ( rule__AtributoSimple__NombreAssignment_1 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:1874:2: ( rule__AtributoSimple__NombreAssignment_1 )
            // InternalMyDsl.g:1874:3: rule__AtributoSimple__NombreAssignment_1
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
    // InternalMyDsl.g:1882:1: rule__AtributoSimple__Group__2 : rule__AtributoSimple__Group__2__Impl ;
    public final void rule__AtributoSimple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1886:1: ( rule__AtributoSimple__Group__2__Impl )
            // InternalMyDsl.g:1887:2: rule__AtributoSimple__Group__2__Impl
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
    // InternalMyDsl.g:1893:1: rule__AtributoSimple__Group__2__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoSimple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1897:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1898:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1898:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1899:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:1909:1: rule__MockarooEntity__Group__0 : rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1 ;
    public final void rule__MockarooEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1913:1: ( rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1 )
            // InternalMyDsl.g:1914:2: rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1
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
    // InternalMyDsl.g:1921:1: rule__MockarooEntity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__MockarooEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1925:1: ( ( 'Entity' ) )
            // InternalMyDsl.g:1926:1: ( 'Entity' )
            {
            // InternalMyDsl.g:1926:1: ( 'Entity' )
            // InternalMyDsl.g:1927:2: 'Entity'
            {
             before(grammarAccess.getMockarooEntityAccess().getEntityKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:1936:1: rule__MockarooEntity__Group__1 : rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2 ;
    public final void rule__MockarooEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1940:1: ( rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2 )
            // InternalMyDsl.g:1941:2: rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2
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
    // InternalMyDsl.g:1948:1: rule__MockarooEntity__Group__1__Impl : ( ( rule__MockarooEntity__NombreAssignment_1 ) ) ;
    public final void rule__MockarooEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1952:1: ( ( ( rule__MockarooEntity__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:1953:1: ( ( rule__MockarooEntity__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:1953:1: ( ( rule__MockarooEntity__NombreAssignment_1 ) )
            // InternalMyDsl.g:1954:2: ( rule__MockarooEntity__NombreAssignment_1 )
            {
             before(grammarAccess.getMockarooEntityAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:1955:2: ( rule__MockarooEntity__NombreAssignment_1 )
            // InternalMyDsl.g:1955:3: rule__MockarooEntity__NombreAssignment_1
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
    // InternalMyDsl.g:1963:1: rule__MockarooEntity__Group__2 : rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3 ;
    public final void rule__MockarooEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1967:1: ( rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3 )
            // InternalMyDsl.g:1968:2: rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3
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
    // InternalMyDsl.g:1975:1: rule__MockarooEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__MockarooEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1979:1: ( ( '{' ) )
            // InternalMyDsl.g:1980:1: ( '{' )
            {
            // InternalMyDsl.g:1980:1: ( '{' )
            // InternalMyDsl.g:1981:2: '{'
            {
             before(grammarAccess.getMockarooEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1990:1: rule__MockarooEntity__Group__3 : rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4 ;
    public final void rule__MockarooEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1994:1: ( rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4 )
            // InternalMyDsl.g:1995:2: rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4
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
    // InternalMyDsl.g:2002:1: rule__MockarooEntity__Group__3__Impl : ( ( rule__MockarooEntity__AtributosAssignment_3 )* ) ;
    public final void rule__MockarooEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2006:1: ( ( ( rule__MockarooEntity__AtributosAssignment_3 )* ) )
            // InternalMyDsl.g:2007:1: ( ( rule__MockarooEntity__AtributosAssignment_3 )* )
            {
            // InternalMyDsl.g:2007:1: ( ( rule__MockarooEntity__AtributosAssignment_3 )* )
            // InternalMyDsl.g:2008:2: ( rule__MockarooEntity__AtributosAssignment_3 )*
            {
             before(grammarAccess.getMockarooEntityAccess().getAtributosAssignment_3()); 
            // InternalMyDsl.g:2009:2: ( rule__MockarooEntity__AtributosAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=13 && LA17_0<=15)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:2009:3: rule__MockarooEntity__AtributosAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__MockarooEntity__AtributosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMyDsl.g:2017:1: rule__MockarooEntity__Group__4 : rule__MockarooEntity__Group__4__Impl ;
    public final void rule__MockarooEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2021:1: ( rule__MockarooEntity__Group__4__Impl )
            // InternalMyDsl.g:2022:2: rule__MockarooEntity__Group__4__Impl
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
    // InternalMyDsl.g:2028:1: rule__MockarooEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__MockarooEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2032:1: ( ( '}' ) )
            // InternalMyDsl.g:2033:1: ( '}' )
            {
            // InternalMyDsl.g:2033:1: ( '}' )
            // InternalMyDsl.g:2034:2: '}'
            {
             before(grammarAccess.getMockarooEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:2044:1: rule__ServicioRest__Group__0 : rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1 ;
    public final void rule__ServicioRest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2048:1: ( rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1 )
            // InternalMyDsl.g:2049:2: rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1
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
    // InternalMyDsl.g:2056:1: rule__ServicioRest__Group__0__Impl : ( ( rule__ServicioRest__MetodoAssignment_0 ) ) ;
    public final void rule__ServicioRest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2060:1: ( ( ( rule__ServicioRest__MetodoAssignment_0 ) ) )
            // InternalMyDsl.g:2061:1: ( ( rule__ServicioRest__MetodoAssignment_0 ) )
            {
            // InternalMyDsl.g:2061:1: ( ( rule__ServicioRest__MetodoAssignment_0 ) )
            // InternalMyDsl.g:2062:2: ( rule__ServicioRest__MetodoAssignment_0 )
            {
             before(grammarAccess.getServicioRestAccess().getMetodoAssignment_0()); 
            // InternalMyDsl.g:2063:2: ( rule__ServicioRest__MetodoAssignment_0 )
            // InternalMyDsl.g:2063:3: rule__ServicioRest__MetodoAssignment_0
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
    // InternalMyDsl.g:2071:1: rule__ServicioRest__Group__1 : rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2 ;
    public final void rule__ServicioRest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2075:1: ( rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2 )
            // InternalMyDsl.g:2076:2: rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2
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
    // InternalMyDsl.g:2083:1: rule__ServicioRest__Group__1__Impl : ( ( rule__ServicioRest__NombreAssignment_1 ) ) ;
    public final void rule__ServicioRest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2087:1: ( ( ( rule__ServicioRest__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:2088:1: ( ( rule__ServicioRest__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:2088:1: ( ( rule__ServicioRest__NombreAssignment_1 ) )
            // InternalMyDsl.g:2089:2: ( rule__ServicioRest__NombreAssignment_1 )
            {
             before(grammarAccess.getServicioRestAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:2090:2: ( rule__ServicioRest__NombreAssignment_1 )
            // InternalMyDsl.g:2090:3: rule__ServicioRest__NombreAssignment_1
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
    // InternalMyDsl.g:2098:1: rule__ServicioRest__Group__2 : rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3 ;
    public final void rule__ServicioRest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2102:1: ( rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3 )
            // InternalMyDsl.g:2103:2: rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2110:1: rule__ServicioRest__Group__2__Impl : ( '{' ) ;
    public final void rule__ServicioRest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2114:1: ( ( '{' ) )
            // InternalMyDsl.g:2115:1: ( '{' )
            {
            // InternalMyDsl.g:2115:1: ( '{' )
            // InternalMyDsl.g:2116:2: '{'
            {
             before(grammarAccess.getServicioRestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:2125:1: rule__ServicioRest__Group__3 : rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4 ;
    public final void rule__ServicioRest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2129:1: ( rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4 )
            // InternalMyDsl.g:2130:2: rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4
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
    // InternalMyDsl.g:2137:1: rule__ServicioRest__Group__3__Impl : ( 'URL' ) ;
    public final void rule__ServicioRest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2141:1: ( ( 'URL' ) )
            // InternalMyDsl.g:2142:1: ( 'URL' )
            {
            // InternalMyDsl.g:2142:1: ( 'URL' )
            // InternalMyDsl.g:2143:2: 'URL'
            {
             before(grammarAccess.getServicioRestAccess().getURLKeyword_3()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:2152:1: rule__ServicioRest__Group__4 : rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5 ;
    public final void rule__ServicioRest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2156:1: ( rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5 )
            // InternalMyDsl.g:2157:2: rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2164:1: rule__ServicioRest__Group__4__Impl : ( RULE_EQUAL ) ;
    public final void rule__ServicioRest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2168:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:2169:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:2169:1: ( RULE_EQUAL )
            // InternalMyDsl.g:2170:2: RULE_EQUAL
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
    // InternalMyDsl.g:2179:1: rule__ServicioRest__Group__5 : rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6 ;
    public final void rule__ServicioRest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2183:1: ( rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6 )
            // InternalMyDsl.g:2184:2: rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6
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
    // InternalMyDsl.g:2191:1: rule__ServicioRest__Group__5__Impl : ( '/' ) ;
    public final void rule__ServicioRest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2195:1: ( ( '/' ) )
            // InternalMyDsl.g:2196:1: ( '/' )
            {
            // InternalMyDsl.g:2196:1: ( '/' )
            // InternalMyDsl.g:2197:2: '/'
            {
             before(grammarAccess.getServicioRestAccess().getSolidusKeyword_5()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:2206:1: rule__ServicioRest__Group__6 : rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7 ;
    public final void rule__ServicioRest__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2210:1: ( rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7 )
            // InternalMyDsl.g:2211:2: rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2218:1: rule__ServicioRest__Group__6__Impl : ( ( rule__ServicioRest__UrlAssignment_6 ) ) ;
    public final void rule__ServicioRest__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2222:1: ( ( ( rule__ServicioRest__UrlAssignment_6 ) ) )
            // InternalMyDsl.g:2223:1: ( ( rule__ServicioRest__UrlAssignment_6 ) )
            {
            // InternalMyDsl.g:2223:1: ( ( rule__ServicioRest__UrlAssignment_6 ) )
            // InternalMyDsl.g:2224:2: ( rule__ServicioRest__UrlAssignment_6 )
            {
             before(grammarAccess.getServicioRestAccess().getUrlAssignment_6()); 
            // InternalMyDsl.g:2225:2: ( rule__ServicioRest__UrlAssignment_6 )
            // InternalMyDsl.g:2225:3: rule__ServicioRest__UrlAssignment_6
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
    // InternalMyDsl.g:2233:1: rule__ServicioRest__Group__7 : rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8 ;
    public final void rule__ServicioRest__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2237:1: ( rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8 )
            // InternalMyDsl.g:2238:2: rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2245:1: rule__ServicioRest__Group__7__Impl : ( ( rule__ServicioRest__Alternatives_7 )* ) ;
    public final void rule__ServicioRest__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2249:1: ( ( ( rule__ServicioRest__Alternatives_7 )* ) )
            // InternalMyDsl.g:2250:1: ( ( rule__ServicioRest__Alternatives_7 )* )
            {
            // InternalMyDsl.g:2250:1: ( ( rule__ServicioRest__Alternatives_7 )* )
            // InternalMyDsl.g:2251:2: ( rule__ServicioRest__Alternatives_7 )*
            {
             before(grammarAccess.getServicioRestAccess().getAlternatives_7()); 
            // InternalMyDsl.g:2252:2: ( rule__ServicioRest__Alternatives_7 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)||(LA18_0>=16 && LA18_0<=21)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:2252:3: rule__ServicioRest__Alternatives_7
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ServicioRest__Alternatives_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMyDsl.g:2260:1: rule__ServicioRest__Group__8 : rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9 ;
    public final void rule__ServicioRest__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2264:1: ( rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9 )
            // InternalMyDsl.g:2265:2: rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2272:1: rule__ServicioRest__Group__8__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__ServicioRest__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2276:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2277:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2277:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2278:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:2287:1: rule__ServicioRest__Group__9 : rule__ServicioRest__Group__9__Impl rule__ServicioRest__Group__10 ;
    public final void rule__ServicioRest__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2291:1: ( rule__ServicioRest__Group__9__Impl rule__ServicioRest__Group__10 )
            // InternalMyDsl.g:2292:2: rule__ServicioRest__Group__9__Impl rule__ServicioRest__Group__10
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2299:1: rule__ServicioRest__Group__9__Impl : ( ( rule__ServicioRest__Group_9__0 )? ) ;
    public final void rule__ServicioRest__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2303:1: ( ( ( rule__ServicioRest__Group_9__0 )? ) )
            // InternalMyDsl.g:2304:1: ( ( rule__ServicioRest__Group_9__0 )? )
            {
            // InternalMyDsl.g:2304:1: ( ( rule__ServicioRest__Group_9__0 )? )
            // InternalMyDsl.g:2305:2: ( rule__ServicioRest__Group_9__0 )?
            {
             before(grammarAccess.getServicioRestAccess().getGroup_9()); 
            // InternalMyDsl.g:2306:2: ( rule__ServicioRest__Group_9__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==53) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2306:3: rule__ServicioRest__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServicioRest__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServicioRestAccess().getGroup_9()); 

            }


            }

        }
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
    // InternalMyDsl.g:2314:1: rule__ServicioRest__Group__10 : rule__ServicioRest__Group__10__Impl rule__ServicioRest__Group__11 ;
    public final void rule__ServicioRest__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2318:1: ( rule__ServicioRest__Group__10__Impl rule__ServicioRest__Group__11 )
            // InternalMyDsl.g:2319:2: rule__ServicioRest__Group__10__Impl rule__ServicioRest__Group__11
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2326:1: rule__ServicioRest__Group__10__Impl : ( ( rule__ServicioRest__ResponseAssignment_10 ) ) ;
    public final void rule__ServicioRest__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2330:1: ( ( ( rule__ServicioRest__ResponseAssignment_10 ) ) )
            // InternalMyDsl.g:2331:1: ( ( rule__ServicioRest__ResponseAssignment_10 ) )
            {
            // InternalMyDsl.g:2331:1: ( ( rule__ServicioRest__ResponseAssignment_10 ) )
            // InternalMyDsl.g:2332:2: ( rule__ServicioRest__ResponseAssignment_10 )
            {
             before(grammarAccess.getServicioRestAccess().getResponseAssignment_10()); 
            // InternalMyDsl.g:2333:2: ( rule__ServicioRest__ResponseAssignment_10 )
            // InternalMyDsl.g:2333:3: rule__ServicioRest__ResponseAssignment_10
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
    // InternalMyDsl.g:2341:1: rule__ServicioRest__Group__11 : rule__ServicioRest__Group__11__Impl ;
    public final void rule__ServicioRest__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2345:1: ( rule__ServicioRest__Group__11__Impl )
            // InternalMyDsl.g:2346:2: rule__ServicioRest__Group__11__Impl
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
    // InternalMyDsl.g:2352:1: rule__ServicioRest__Group__11__Impl : ( '}' ) ;
    public final void rule__ServicioRest__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2356:1: ( ( '}' ) )
            // InternalMyDsl.g:2357:1: ( '}' )
            {
            // InternalMyDsl.g:2357:1: ( '}' )
            // InternalMyDsl.g:2358:2: '}'
            {
             before(grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_11()); 
            match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__ServicioRest__Group_9__0"
    // InternalMyDsl.g:2368:1: rule__ServicioRest__Group_9__0 : rule__ServicioRest__Group_9__0__Impl rule__ServicioRest__Group_9__1 ;
    public final void rule__ServicioRest__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2372:1: ( rule__ServicioRest__Group_9__0__Impl rule__ServicioRest__Group_9__1 )
            // InternalMyDsl.g:2373:2: rule__ServicioRest__Group_9__0__Impl rule__ServicioRest__Group_9__1
            {
            pushFollow(FOLLOW_26);
            rule__ServicioRest__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group_9__0"


    // $ANTLR start "rule__ServicioRest__Group_9__0__Impl"
    // InternalMyDsl.g:2380:1: rule__ServicioRest__Group_9__0__Impl : ( 'Request {' ) ;
    public final void rule__ServicioRest__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2384:1: ( ( 'Request {' ) )
            // InternalMyDsl.g:2385:1: ( 'Request {' )
            {
            // InternalMyDsl.g:2385:1: ( 'Request {' )
            // InternalMyDsl.g:2386:2: 'Request {'
            {
             before(grammarAccess.getServicioRestAccess().getRequestKeyword_9_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getRequestKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group_9__0__Impl"


    // $ANTLR start "rule__ServicioRest__Group_9__1"
    // InternalMyDsl.g:2395:1: rule__ServicioRest__Group_9__1 : rule__ServicioRest__Group_9__1__Impl rule__ServicioRest__Group_9__2 ;
    public final void rule__ServicioRest__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2399:1: ( rule__ServicioRest__Group_9__1__Impl rule__ServicioRest__Group_9__2 )
            // InternalMyDsl.g:2400:2: rule__ServicioRest__Group_9__1__Impl rule__ServicioRest__Group_9__2
            {
            pushFollow(FOLLOW_4);
            rule__ServicioRest__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group_9__1"


    // $ANTLR start "rule__ServicioRest__Group_9__1__Impl"
    // InternalMyDsl.g:2407:1: rule__ServicioRest__Group_9__1__Impl : ( 'Type' ) ;
    public final void rule__ServicioRest__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2411:1: ( ( 'Type' ) )
            // InternalMyDsl.g:2412:1: ( 'Type' )
            {
            // InternalMyDsl.g:2412:1: ( 'Type' )
            // InternalMyDsl.g:2413:2: 'Type'
            {
             before(grammarAccess.getServicioRestAccess().getTypeKeyword_9_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getTypeKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group_9__1__Impl"


    // $ANTLR start "rule__ServicioRest__Group_9__2"
    // InternalMyDsl.g:2422:1: rule__ServicioRest__Group_9__2 : rule__ServicioRest__Group_9__2__Impl rule__ServicioRest__Group_9__3 ;
    public final void rule__ServicioRest__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2426:1: ( rule__ServicioRest__Group_9__2__Impl rule__ServicioRest__Group_9__3 )
            // InternalMyDsl.g:2427:2: rule__ServicioRest__Group_9__2__Impl rule__ServicioRest__Group_9__3
            {
            pushFollow(FOLLOW_27);
            rule__ServicioRest__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group_9__2"


    // $ANTLR start "rule__ServicioRest__Group_9__2__Impl"
    // InternalMyDsl.g:2434:1: rule__ServicioRest__Group_9__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__ServicioRest__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2438:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:2439:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:2439:1: ( RULE_EQUAL )
            // InternalMyDsl.g:2440:2: RULE_EQUAL
            {
             before(grammarAccess.getServicioRestAccess().getEQUALTerminalRuleCall_9_2()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getEQUALTerminalRuleCall_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group_9__2__Impl"


    // $ANTLR start "rule__ServicioRest__Group_9__3"
    // InternalMyDsl.g:2449:1: rule__ServicioRest__Group_9__3 : rule__ServicioRest__Group_9__3__Impl rule__ServicioRest__Group_9__4 ;
    public final void rule__ServicioRest__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2453:1: ( rule__ServicioRest__Group_9__3__Impl rule__ServicioRest__Group_9__4 )
            // InternalMyDsl.g:2454:2: rule__ServicioRest__Group_9__3__Impl rule__ServicioRest__Group_9__4
            {
            pushFollow(FOLLOW_27);
            rule__ServicioRest__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group_9__3"


    // $ANTLR start "rule__ServicioRest__Group_9__3__Impl"
    // InternalMyDsl.g:2461:1: rule__ServicioRest__Group_9__3__Impl : ( ( ruleEString )* ) ;
    public final void rule__ServicioRest__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2465:1: ( ( ( ruleEString )* ) )
            // InternalMyDsl.g:2466:1: ( ( ruleEString )* )
            {
            // InternalMyDsl.g:2466:1: ( ( ruleEString )* )
            // InternalMyDsl.g:2467:2: ( ruleEString )*
            {
             before(grammarAccess.getServicioRestAccess().getEStringParserRuleCall_9_3()); 
            // InternalMyDsl.g:2468:2: ( ruleEString )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2468:3: ruleEString
            	    {
            	    pushFollow(FOLLOW_28);
            	    ruleEString();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getServicioRestAccess().getEStringParserRuleCall_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group_9__3__Impl"


    // $ANTLR start "rule__ServicioRest__Group_9__4"
    // InternalMyDsl.g:2476:1: rule__ServicioRest__Group_9__4 : rule__ServicioRest__Group_9__4__Impl rule__ServicioRest__Group_9__5 ;
    public final void rule__ServicioRest__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2480:1: ( rule__ServicioRest__Group_9__4__Impl rule__ServicioRest__Group_9__5 )
            // InternalMyDsl.g:2481:2: rule__ServicioRest__Group_9__4__Impl rule__ServicioRest__Group_9__5
            {
            pushFollow(FOLLOW_25);
            rule__ServicioRest__Group_9__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group_9__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group_9__4"


    // $ANTLR start "rule__ServicioRest__Group_9__4__Impl"
    // InternalMyDsl.g:2488:1: rule__ServicioRest__Group_9__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__ServicioRest__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2492:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2493:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2493:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2494:2: RULE_SEMICOLON
            {
             before(grammarAccess.getServicioRestAccess().getSEMICOLONTerminalRuleCall_9_4()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getSEMICOLONTerminalRuleCall_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group_9__4__Impl"


    // $ANTLR start "rule__ServicioRest__Group_9__5"
    // InternalMyDsl.g:2503:1: rule__ServicioRest__Group_9__5 : rule__ServicioRest__Group_9__5__Impl ;
    public final void rule__ServicioRest__Group_9__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2507:1: ( rule__ServicioRest__Group_9__5__Impl )
            // InternalMyDsl.g:2508:2: rule__ServicioRest__Group_9__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group_9__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group_9__5"


    // $ANTLR start "rule__ServicioRest__Group_9__5__Impl"
    // InternalMyDsl.g:2514:1: rule__ServicioRest__Group_9__5__Impl : ( '}' ) ;
    public final void rule__ServicioRest__Group_9__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2518:1: ( ( '}' ) )
            // InternalMyDsl.g:2519:1: ( '}' )
            {
            // InternalMyDsl.g:2519:1: ( '}' )
            // InternalMyDsl.g:2520:2: '}'
            {
             before(grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_9_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_9_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group_9__5__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__0"
    // InternalMyDsl.g:2530:1: rule__SimpleEntity__Group__0 : rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 ;
    public final void rule__SimpleEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2534:1: ( rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 )
            // InternalMyDsl.g:2535:2: rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1
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
    // InternalMyDsl.g:2542:1: rule__SimpleEntity__Group__0__Impl : ( 'SimpleEntity' ) ;
    public final void rule__SimpleEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2546:1: ( ( 'SimpleEntity' ) )
            // InternalMyDsl.g:2547:1: ( 'SimpleEntity' )
            {
            // InternalMyDsl.g:2547:1: ( 'SimpleEntity' )
            // InternalMyDsl.g:2548:2: 'SimpleEntity'
            {
             before(grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMyDsl.g:2557:1: rule__SimpleEntity__Group__1 : rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 ;
    public final void rule__SimpleEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2561:1: ( rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 )
            // InternalMyDsl.g:2562:2: rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2
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
    // InternalMyDsl.g:2569:1: rule__SimpleEntity__Group__1__Impl : ( ( rule__SimpleEntity__NombreAssignment_1 ) ) ;
    public final void rule__SimpleEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2573:1: ( ( ( rule__SimpleEntity__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:2574:1: ( ( rule__SimpleEntity__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:2574:1: ( ( rule__SimpleEntity__NombreAssignment_1 ) )
            // InternalMyDsl.g:2575:2: ( rule__SimpleEntity__NombreAssignment_1 )
            {
             before(grammarAccess.getSimpleEntityAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:2576:2: ( rule__SimpleEntity__NombreAssignment_1 )
            // InternalMyDsl.g:2576:3: rule__SimpleEntity__NombreAssignment_1
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
    // InternalMyDsl.g:2584:1: rule__SimpleEntity__Group__2 : rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 ;
    public final void rule__SimpleEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2588:1: ( rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 )
            // InternalMyDsl.g:2589:2: rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3
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
    // InternalMyDsl.g:2596:1: rule__SimpleEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__SimpleEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2600:1: ( ( '{' ) )
            // InternalMyDsl.g:2601:1: ( '{' )
            {
            // InternalMyDsl.g:2601:1: ( '{' )
            // InternalMyDsl.g:2602:2: '{'
            {
             before(grammarAccess.getSimpleEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:2611:1: rule__SimpleEntity__Group__3 : rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 ;
    public final void rule__SimpleEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2615:1: ( rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 )
            // InternalMyDsl.g:2616:2: rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4
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
    // InternalMyDsl.g:2623:1: rule__SimpleEntity__Group__3__Impl : ( ( rule__SimpleEntity__AtributosAssignment_3 )* ) ;
    public final void rule__SimpleEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2627:1: ( ( ( rule__SimpleEntity__AtributosAssignment_3 )* ) )
            // InternalMyDsl.g:2628:1: ( ( rule__SimpleEntity__AtributosAssignment_3 )* )
            {
            // InternalMyDsl.g:2628:1: ( ( rule__SimpleEntity__AtributosAssignment_3 )* )
            // InternalMyDsl.g:2629:2: ( rule__SimpleEntity__AtributosAssignment_3 )*
            {
             before(grammarAccess.getSimpleEntityAccess().getAtributosAssignment_3()); 
            // InternalMyDsl.g:2630:2: ( rule__SimpleEntity__AtributosAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=13 && LA21_0<=15)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:2630:3: rule__SimpleEntity__AtributosAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__SimpleEntity__AtributosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMyDsl.g:2638:1: rule__SimpleEntity__Group__4 : rule__SimpleEntity__Group__4__Impl ;
    public final void rule__SimpleEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2642:1: ( rule__SimpleEntity__Group__4__Impl )
            // InternalMyDsl.g:2643:2: rule__SimpleEntity__Group__4__Impl
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
    // InternalMyDsl.g:2649:1: rule__SimpleEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__SimpleEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2653:1: ( ( '}' ) )
            // InternalMyDsl.g:2654:1: ( '}' )
            {
            // InternalMyDsl.g:2654:1: ( '}' )
            // InternalMyDsl.g:2655:2: '}'
            {
             before(grammarAccess.getSimpleEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:2665:1: rule__MyNumeric__Group__0 : rule__MyNumeric__Group__0__Impl rule__MyNumeric__Group__1 ;
    public final void rule__MyNumeric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2669:1: ( rule__MyNumeric__Group__0__Impl rule__MyNumeric__Group__1 )
            // InternalMyDsl.g:2670:2: rule__MyNumeric__Group__0__Impl rule__MyNumeric__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:2677:1: rule__MyNumeric__Group__0__Impl : ( () ) ;
    public final void rule__MyNumeric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2681:1: ( ( () ) )
            // InternalMyDsl.g:2682:1: ( () )
            {
            // InternalMyDsl.g:2682:1: ( () )
            // InternalMyDsl.g:2683:2: ()
            {
             before(grammarAccess.getMyNumericAccess().getMyNumericAction_0()); 
            // InternalMyDsl.g:2684:2: ()
            // InternalMyDsl.g:2684:3: 
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
    // InternalMyDsl.g:2692:1: rule__MyNumeric__Group__1 : rule__MyNumeric__Group__1__Impl rule__MyNumeric__Group__2 ;
    public final void rule__MyNumeric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2696:1: ( rule__MyNumeric__Group__1__Impl rule__MyNumeric__Group__2 )
            // InternalMyDsl.g:2697:2: rule__MyNumeric__Group__1__Impl rule__MyNumeric__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2704:1: rule__MyNumeric__Group__1__Impl : ( 'MyNumeric' ) ;
    public final void rule__MyNumeric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2708:1: ( ( 'MyNumeric' ) )
            // InternalMyDsl.g:2709:1: ( 'MyNumeric' )
            {
            // InternalMyDsl.g:2709:1: ( 'MyNumeric' )
            // InternalMyDsl.g:2710:2: 'MyNumeric'
            {
             before(grammarAccess.getMyNumericAccess().getMyNumericKeyword_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMyDsl.g:2719:1: rule__MyNumeric__Group__2 : rule__MyNumeric__Group__2__Impl rule__MyNumeric__Group__3 ;
    public final void rule__MyNumeric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2723:1: ( rule__MyNumeric__Group__2__Impl rule__MyNumeric__Group__3 )
            // InternalMyDsl.g:2724:2: rule__MyNumeric__Group__2__Impl rule__MyNumeric__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:2731:1: rule__MyNumeric__Group__2__Impl : ( '{' ) ;
    public final void rule__MyNumeric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2735:1: ( ( '{' ) )
            // InternalMyDsl.g:2736:1: ( '{' )
            {
            // InternalMyDsl.g:2736:1: ( '{' )
            // InternalMyDsl.g:2737:2: '{'
            {
             before(grammarAccess.getMyNumericAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:2746:1: rule__MyNumeric__Group__3 : rule__MyNumeric__Group__3__Impl rule__MyNumeric__Group__4 ;
    public final void rule__MyNumeric__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2750:1: ( rule__MyNumeric__Group__3__Impl rule__MyNumeric__Group__4 )
            // InternalMyDsl.g:2751:2: rule__MyNumeric__Group__3__Impl rule__MyNumeric__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:2758:1: rule__MyNumeric__Group__3__Impl : ( ( rule__MyNumeric__Group_3__0 )? ) ;
    public final void rule__MyNumeric__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2762:1: ( ( ( rule__MyNumeric__Group_3__0 )? ) )
            // InternalMyDsl.g:2763:1: ( ( rule__MyNumeric__Group_3__0 )? )
            {
            // InternalMyDsl.g:2763:1: ( ( rule__MyNumeric__Group_3__0 )? )
            // InternalMyDsl.g:2764:2: ( rule__MyNumeric__Group_3__0 )?
            {
             before(grammarAccess.getMyNumericAccess().getGroup_3()); 
            // InternalMyDsl.g:2765:2: ( rule__MyNumeric__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==57) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2765:3: rule__MyNumeric__Group_3__0
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
    // InternalMyDsl.g:2773:1: rule__MyNumeric__Group__4 : rule__MyNumeric__Group__4__Impl ;
    public final void rule__MyNumeric__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2777:1: ( rule__MyNumeric__Group__4__Impl )
            // InternalMyDsl.g:2778:2: rule__MyNumeric__Group__4__Impl
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
    // InternalMyDsl.g:2784:1: rule__MyNumeric__Group__4__Impl : ( '}' ) ;
    public final void rule__MyNumeric__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2788:1: ( ( '}' ) )
            // InternalMyDsl.g:2789:1: ( '}' )
            {
            // InternalMyDsl.g:2789:1: ( '}' )
            // InternalMyDsl.g:2790:2: '}'
            {
             before(grammarAccess.getMyNumericAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:2800:1: rule__MyNumeric__Group_3__0 : rule__MyNumeric__Group_3__0__Impl rule__MyNumeric__Group_3__1 ;
    public final void rule__MyNumeric__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2804:1: ( rule__MyNumeric__Group_3__0__Impl rule__MyNumeric__Group_3__1 )
            // InternalMyDsl.g:2805:2: rule__MyNumeric__Group_3__0__Impl rule__MyNumeric__Group_3__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:2812:1: rule__MyNumeric__Group_3__0__Impl : ( 'valor' ) ;
    public final void rule__MyNumeric__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2816:1: ( ( 'valor' ) )
            // InternalMyDsl.g:2817:1: ( 'valor' )
            {
            // InternalMyDsl.g:2817:1: ( 'valor' )
            // InternalMyDsl.g:2818:2: 'valor'
            {
             before(grammarAccess.getMyNumericAccess().getValorKeyword_3_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyDsl.g:2827:1: rule__MyNumeric__Group_3__1 : rule__MyNumeric__Group_3__1__Impl ;
    public final void rule__MyNumeric__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2831:1: ( rule__MyNumeric__Group_3__1__Impl )
            // InternalMyDsl.g:2832:2: rule__MyNumeric__Group_3__1__Impl
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
    // InternalMyDsl.g:2838:1: rule__MyNumeric__Group_3__1__Impl : ( ( rule__MyNumeric__ValorAssignment_3_1 ) ) ;
    public final void rule__MyNumeric__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2842:1: ( ( ( rule__MyNumeric__ValorAssignment_3_1 ) ) )
            // InternalMyDsl.g:2843:1: ( ( rule__MyNumeric__ValorAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2843:1: ( ( rule__MyNumeric__ValorAssignment_3_1 ) )
            // InternalMyDsl.g:2844:2: ( rule__MyNumeric__ValorAssignment_3_1 )
            {
             before(grammarAccess.getMyNumericAccess().getValorAssignment_3_1()); 
            // InternalMyDsl.g:2845:2: ( rule__MyNumeric__ValorAssignment_3_1 )
            // InternalMyDsl.g:2845:3: rule__MyNumeric__ValorAssignment_3_1
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
    // InternalMyDsl.g:2854:1: rule__MyString__Group__0 : rule__MyString__Group__0__Impl rule__MyString__Group__1 ;
    public final void rule__MyString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2858:1: ( rule__MyString__Group__0__Impl rule__MyString__Group__1 )
            // InternalMyDsl.g:2859:2: rule__MyString__Group__0__Impl rule__MyString__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:2866:1: rule__MyString__Group__0__Impl : ( () ) ;
    public final void rule__MyString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2870:1: ( ( () ) )
            // InternalMyDsl.g:2871:1: ( () )
            {
            // InternalMyDsl.g:2871:1: ( () )
            // InternalMyDsl.g:2872:2: ()
            {
             before(grammarAccess.getMyStringAccess().getMyStringAction_0()); 
            // InternalMyDsl.g:2873:2: ()
            // InternalMyDsl.g:2873:3: 
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
    // InternalMyDsl.g:2881:1: rule__MyString__Group__1 : rule__MyString__Group__1__Impl rule__MyString__Group__2 ;
    public final void rule__MyString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2885:1: ( rule__MyString__Group__1__Impl rule__MyString__Group__2 )
            // InternalMyDsl.g:2886:2: rule__MyString__Group__1__Impl rule__MyString__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2893:1: rule__MyString__Group__1__Impl : ( 'MyString' ) ;
    public final void rule__MyString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2897:1: ( ( 'MyString' ) )
            // InternalMyDsl.g:2898:1: ( 'MyString' )
            {
            // InternalMyDsl.g:2898:1: ( 'MyString' )
            // InternalMyDsl.g:2899:2: 'MyString'
            {
             before(grammarAccess.getMyStringAccess().getMyStringKeyword_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalMyDsl.g:2908:1: rule__MyString__Group__2 : rule__MyString__Group__2__Impl rule__MyString__Group__3 ;
    public final void rule__MyString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2912:1: ( rule__MyString__Group__2__Impl rule__MyString__Group__3 )
            // InternalMyDsl.g:2913:2: rule__MyString__Group__2__Impl rule__MyString__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:2920:1: rule__MyString__Group__2__Impl : ( '{' ) ;
    public final void rule__MyString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2924:1: ( ( '{' ) )
            // InternalMyDsl.g:2925:1: ( '{' )
            {
            // InternalMyDsl.g:2925:1: ( '{' )
            // InternalMyDsl.g:2926:2: '{'
            {
             before(grammarAccess.getMyStringAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:2935:1: rule__MyString__Group__3 : rule__MyString__Group__3__Impl rule__MyString__Group__4 ;
    public final void rule__MyString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2939:1: ( rule__MyString__Group__3__Impl rule__MyString__Group__4 )
            // InternalMyDsl.g:2940:2: rule__MyString__Group__3__Impl rule__MyString__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:2947:1: rule__MyString__Group__3__Impl : ( ( rule__MyString__Group_3__0 )? ) ;
    public final void rule__MyString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2951:1: ( ( ( rule__MyString__Group_3__0 )? ) )
            // InternalMyDsl.g:2952:1: ( ( rule__MyString__Group_3__0 )? )
            {
            // InternalMyDsl.g:2952:1: ( ( rule__MyString__Group_3__0 )? )
            // InternalMyDsl.g:2953:2: ( rule__MyString__Group_3__0 )?
            {
             before(grammarAccess.getMyStringAccess().getGroup_3()); 
            // InternalMyDsl.g:2954:2: ( rule__MyString__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==57) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:2954:3: rule__MyString__Group_3__0
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
    // InternalMyDsl.g:2962:1: rule__MyString__Group__4 : rule__MyString__Group__4__Impl ;
    public final void rule__MyString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2966:1: ( rule__MyString__Group__4__Impl )
            // InternalMyDsl.g:2967:2: rule__MyString__Group__4__Impl
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
    // InternalMyDsl.g:2973:1: rule__MyString__Group__4__Impl : ( '}' ) ;
    public final void rule__MyString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2977:1: ( ( '}' ) )
            // InternalMyDsl.g:2978:1: ( '}' )
            {
            // InternalMyDsl.g:2978:1: ( '}' )
            // InternalMyDsl.g:2979:2: '}'
            {
             before(grammarAccess.getMyStringAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:2989:1: rule__MyString__Group_3__0 : rule__MyString__Group_3__0__Impl rule__MyString__Group_3__1 ;
    public final void rule__MyString__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2993:1: ( rule__MyString__Group_3__0__Impl rule__MyString__Group_3__1 )
            // InternalMyDsl.g:2994:2: rule__MyString__Group_3__0__Impl rule__MyString__Group_3__1
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
    // InternalMyDsl.g:3001:1: rule__MyString__Group_3__0__Impl : ( 'valor' ) ;
    public final void rule__MyString__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3005:1: ( ( 'valor' ) )
            // InternalMyDsl.g:3006:1: ( 'valor' )
            {
            // InternalMyDsl.g:3006:1: ( 'valor' )
            // InternalMyDsl.g:3007:2: 'valor'
            {
             before(grammarAccess.getMyStringAccess().getValorKeyword_3_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyDsl.g:3016:1: rule__MyString__Group_3__1 : rule__MyString__Group_3__1__Impl ;
    public final void rule__MyString__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3020:1: ( rule__MyString__Group_3__1__Impl )
            // InternalMyDsl.g:3021:2: rule__MyString__Group_3__1__Impl
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
    // InternalMyDsl.g:3027:1: rule__MyString__Group_3__1__Impl : ( ( rule__MyString__ValorAssignment_3_1 ) ) ;
    public final void rule__MyString__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3031:1: ( ( ( rule__MyString__ValorAssignment_3_1 ) ) )
            // InternalMyDsl.g:3032:1: ( ( rule__MyString__ValorAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3032:1: ( ( rule__MyString__ValorAssignment_3_1 ) )
            // InternalMyDsl.g:3033:2: ( rule__MyString__ValorAssignment_3_1 )
            {
             before(grammarAccess.getMyStringAccess().getValorAssignment_3_1()); 
            // InternalMyDsl.g:3034:2: ( rule__MyString__ValorAssignment_3_1 )
            // InternalMyDsl.g:3034:3: rule__MyString__ValorAssignment_3_1
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
    // InternalMyDsl.g:3043:1: rule__MyBoolean__Group__0 : rule__MyBoolean__Group__0__Impl rule__MyBoolean__Group__1 ;
    public final void rule__MyBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3047:1: ( rule__MyBoolean__Group__0__Impl rule__MyBoolean__Group__1 )
            // InternalMyDsl.g:3048:2: rule__MyBoolean__Group__0__Impl rule__MyBoolean__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3055:1: rule__MyBoolean__Group__0__Impl : ( () ) ;
    public final void rule__MyBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3059:1: ( ( () ) )
            // InternalMyDsl.g:3060:1: ( () )
            {
            // InternalMyDsl.g:3060:1: ( () )
            // InternalMyDsl.g:3061:2: ()
            {
             before(grammarAccess.getMyBooleanAccess().getMyBooleanAction_0()); 
            // InternalMyDsl.g:3062:2: ()
            // InternalMyDsl.g:3062:3: 
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
    // InternalMyDsl.g:3070:1: rule__MyBoolean__Group__1 : rule__MyBoolean__Group__1__Impl rule__MyBoolean__Group__2 ;
    public final void rule__MyBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3074:1: ( rule__MyBoolean__Group__1__Impl rule__MyBoolean__Group__2 )
            // InternalMyDsl.g:3075:2: rule__MyBoolean__Group__1__Impl rule__MyBoolean__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3082:1: rule__MyBoolean__Group__1__Impl : ( ( rule__MyBoolean__ValorAssignment_1 )? ) ;
    public final void rule__MyBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3086:1: ( ( ( rule__MyBoolean__ValorAssignment_1 )? ) )
            // InternalMyDsl.g:3087:1: ( ( rule__MyBoolean__ValorAssignment_1 )? )
            {
            // InternalMyDsl.g:3087:1: ( ( rule__MyBoolean__ValorAssignment_1 )? )
            // InternalMyDsl.g:3088:2: ( rule__MyBoolean__ValorAssignment_1 )?
            {
             before(grammarAccess.getMyBooleanAccess().getValorAssignment_1()); 
            // InternalMyDsl.g:3089:2: ( rule__MyBoolean__ValorAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==57) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:3089:3: rule__MyBoolean__ValorAssignment_1
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
    // InternalMyDsl.g:3097:1: rule__MyBoolean__Group__2 : rule__MyBoolean__Group__2__Impl ;
    public final void rule__MyBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3101:1: ( rule__MyBoolean__Group__2__Impl )
            // InternalMyDsl.g:3102:2: rule__MyBoolean__Group__2__Impl
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
    // InternalMyDsl.g:3108:1: rule__MyBoolean__Group__2__Impl : ( 'MyBoolean' ) ;
    public final void rule__MyBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3112:1: ( ( 'MyBoolean' ) )
            // InternalMyDsl.g:3113:1: ( 'MyBoolean' )
            {
            // InternalMyDsl.g:3113:1: ( 'MyBoolean' )
            // InternalMyDsl.g:3114:2: 'MyBoolean'
            {
             before(grammarAccess.getMyBooleanAccess().getMyBooleanKeyword_2()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMyDsl.g:3124:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3128:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalMyDsl.g:3129:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3136:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3140:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:3141:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:3141:1: ( ( '-' )? )
            // InternalMyDsl.g:3142:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:3143:2: ( '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==60) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:3143:3: '-'
                    {
                    match(input,60,FOLLOW_2); 

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
    // InternalMyDsl.g:3151:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3155:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalMyDsl.g:3156:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3163:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3167:1: ( ( ( RULE_INT )? ) )
            // InternalMyDsl.g:3168:1: ( ( RULE_INT )? )
            {
            // InternalMyDsl.g:3168:1: ( ( RULE_INT )? )
            // InternalMyDsl.g:3169:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalMyDsl.g:3170:2: ( RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:3170:3: RULE_INT
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
    // InternalMyDsl.g:3178:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3182:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalMyDsl.g:3183:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:3190:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3194:1: ( ( '.' ) )
            // InternalMyDsl.g:3195:1: ( '.' )
            {
            // InternalMyDsl.g:3195:1: ( '.' )
            // InternalMyDsl.g:3196:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,61,FOLLOW_2); 
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
    // InternalMyDsl.g:3205:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3209:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalMyDsl.g:3210:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:3217:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3221:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3222:1: ( RULE_INT )
            {
            // InternalMyDsl.g:3222:1: ( RULE_INT )
            // InternalMyDsl.g:3223:2: RULE_INT
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
    // InternalMyDsl.g:3232:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3236:1: ( rule__EDouble__Group__4__Impl )
            // InternalMyDsl.g:3237:2: rule__EDouble__Group__4__Impl
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
    // InternalMyDsl.g:3243:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3247:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalMyDsl.g:3248:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalMyDsl.g:3248:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalMyDsl.g:3249:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalMyDsl.g:3250:2: ( rule__EDouble__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=22 && LA27_0<=23)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:3250:3: rule__EDouble__Group_4__0
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
    // InternalMyDsl.g:3259:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3263:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalMyDsl.g:3264:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyDsl.g:3271:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3275:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalMyDsl.g:3276:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalMyDsl.g:3276:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalMyDsl.g:3277:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalMyDsl.g:3278:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalMyDsl.g:3278:3: rule__EDouble__Alternatives_4_0
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
    // InternalMyDsl.g:3286:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3290:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalMyDsl.g:3291:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyDsl.g:3298:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3302:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:3303:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:3303:1: ( ( '-' )? )
            // InternalMyDsl.g:3304:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalMyDsl.g:3305:2: ( '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==60) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:3305:3: '-'
                    {
                    match(input,60,FOLLOW_2); 

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
    // InternalMyDsl.g:3313:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3317:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalMyDsl.g:3318:2: rule__EDouble__Group_4__2__Impl
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
    // InternalMyDsl.g:3324:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3328:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3329:1: ( RULE_INT )
            {
            // InternalMyDsl.g:3329:1: ( RULE_INT )
            // InternalMyDsl.g:3330:2: RULE_INT
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
    // InternalMyDsl.g:3340:1: rule__Response__Group__0 : rule__Response__Group__0__Impl rule__Response__Group__1 ;
    public final void rule__Response__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3344:1: ( rule__Response__Group__0__Impl rule__Response__Group__1 )
            // InternalMyDsl.g:3345:2: rule__Response__Group__0__Impl rule__Response__Group__1
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
    // InternalMyDsl.g:3352:1: rule__Response__Group__0__Impl : ( 'Response' ) ;
    public final void rule__Response__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3356:1: ( ( 'Response' ) )
            // InternalMyDsl.g:3357:1: ( 'Response' )
            {
            // InternalMyDsl.g:3357:1: ( 'Response' )
            // InternalMyDsl.g:3358:2: 'Response'
            {
             before(grammarAccess.getResponseAccess().getResponseKeyword_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalMyDsl.g:3367:1: rule__Response__Group__1 : rule__Response__Group__1__Impl rule__Response__Group__2 ;
    public final void rule__Response__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3371:1: ( rule__Response__Group__1__Impl rule__Response__Group__2 )
            // InternalMyDsl.g:3372:2: rule__Response__Group__1__Impl rule__Response__Group__2
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
    // InternalMyDsl.g:3379:1: rule__Response__Group__1__Impl : ( '{' ) ;
    public final void rule__Response__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3383:1: ( ( '{' ) )
            // InternalMyDsl.g:3384:1: ( '{' )
            {
            // InternalMyDsl.g:3384:1: ( '{' )
            // InternalMyDsl.g:3385:2: '{'
            {
             before(grammarAccess.getResponseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:3394:1: rule__Response__Group__2 : rule__Response__Group__2__Impl rule__Response__Group__3 ;
    public final void rule__Response__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3398:1: ( rule__Response__Group__2__Impl rule__Response__Group__3 )
            // InternalMyDsl.g:3399:2: rule__Response__Group__2__Impl rule__Response__Group__3
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
    // InternalMyDsl.g:3406:1: rule__Response__Group__2__Impl : ( 'Type' ) ;
    public final void rule__Response__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3410:1: ( ( 'Type' ) )
            // InternalMyDsl.g:3411:1: ( 'Type' )
            {
            // InternalMyDsl.g:3411:1: ( 'Type' )
            // InternalMyDsl.g:3412:2: 'Type'
            {
             before(grammarAccess.getResponseAccess().getTypeKeyword_2()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMyDsl.g:3421:1: rule__Response__Group__3 : rule__Response__Group__3__Impl rule__Response__Group__4 ;
    public final void rule__Response__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3425:1: ( rule__Response__Group__3__Impl rule__Response__Group__4 )
            // InternalMyDsl.g:3426:2: rule__Response__Group__3__Impl rule__Response__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:3433:1: rule__Response__Group__3__Impl : ( RULE_EQUAL ) ;
    public final void rule__Response__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3437:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:3438:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:3438:1: ( RULE_EQUAL )
            // InternalMyDsl.g:3439:2: RULE_EQUAL
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
    // InternalMyDsl.g:3448:1: rule__Response__Group__4 : rule__Response__Group__4__Impl rule__Response__Group__5 ;
    public final void rule__Response__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3452:1: ( rule__Response__Group__4__Impl rule__Response__Group__5 )
            // InternalMyDsl.g:3453:2: rule__Response__Group__4__Impl rule__Response__Group__5
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
    // InternalMyDsl.g:3460:1: rule__Response__Group__4__Impl : ( ( rule__Response__AtributosAssignment_4 ) ) ;
    public final void rule__Response__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3464:1: ( ( ( rule__Response__AtributosAssignment_4 ) ) )
            // InternalMyDsl.g:3465:1: ( ( rule__Response__AtributosAssignment_4 ) )
            {
            // InternalMyDsl.g:3465:1: ( ( rule__Response__AtributosAssignment_4 ) )
            // InternalMyDsl.g:3466:2: ( rule__Response__AtributosAssignment_4 )
            {
             before(grammarAccess.getResponseAccess().getAtributosAssignment_4()); 
            // InternalMyDsl.g:3467:2: ( rule__Response__AtributosAssignment_4 )
            // InternalMyDsl.g:3467:3: rule__Response__AtributosAssignment_4
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
    // InternalMyDsl.g:3475:1: rule__Response__Group__5 : rule__Response__Group__5__Impl rule__Response__Group__6 ;
    public final void rule__Response__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3479:1: ( rule__Response__Group__5__Impl rule__Response__Group__6 )
            // InternalMyDsl.g:3480:2: rule__Response__Group__5__Impl rule__Response__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:3487:1: rule__Response__Group__5__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Response__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3491:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:3492:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:3492:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:3493:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:3502:1: rule__Response__Group__6 : rule__Response__Group__6__Impl ;
    public final void rule__Response__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3506:1: ( rule__Response__Group__6__Impl )
            // InternalMyDsl.g:3507:2: rule__Response__Group__6__Impl
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
    // InternalMyDsl.g:3513:1: rule__Response__Group__6__Impl : ( '}' ) ;
    public final void rule__Response__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3517:1: ( ( '}' ) )
            // InternalMyDsl.g:3518:1: ( '}' )
            {
            // InternalMyDsl.g:3518:1: ( '}' )
            // InternalMyDsl.g:3519:2: '}'
            {
             before(grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__Mapping__Group__0"
    // InternalMyDsl.g:3529:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3533:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalMyDsl.g:3534:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
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
    // InternalMyDsl.g:3541:1: rule__Mapping__Group__0__Impl : ( 'Mapping' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3545:1: ( ( 'Mapping' ) )
            // InternalMyDsl.g:3546:1: ( 'Mapping' )
            {
            // InternalMyDsl.g:3546:1: ( 'Mapping' )
            // InternalMyDsl.g:3547:2: 'Mapping'
            {
             before(grammarAccess.getMappingAccess().getMappingKeyword_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalMyDsl.g:3556:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3560:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalMyDsl.g:3561:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:3568:1: rule__Mapping__Group__1__Impl : ( '{' ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3572:1: ( ( '{' ) )
            // InternalMyDsl.g:3573:1: ( '{' )
            {
            // InternalMyDsl.g:3573:1: ( '{' )
            // InternalMyDsl.g:3574:2: '{'
            {
             before(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:3583:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3587:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // InternalMyDsl.g:3588:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
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
    // InternalMyDsl.g:3595:1: rule__Mapping__Group__2__Impl : ( 'value' ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3599:1: ( ( 'value' ) )
            // InternalMyDsl.g:3600:1: ( 'value' )
            {
            // InternalMyDsl.g:3600:1: ( 'value' )
            // InternalMyDsl.g:3601:2: 'value'
            {
             before(grammarAccess.getMappingAccess().getValueKeyword_2()); 
            match(input,64,FOLLOW_2); 
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
    // InternalMyDsl.g:3610:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3614:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // InternalMyDsl.g:3615:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:3622:1: rule__Mapping__Group__3__Impl : ( ( rule__Mapping__ValueAssignment_3 ) ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3626:1: ( ( ( rule__Mapping__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:3627:1: ( ( rule__Mapping__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:3627:1: ( ( rule__Mapping__ValueAssignment_3 ) )
            // InternalMyDsl.g:3628:2: ( rule__Mapping__ValueAssignment_3 )
            {
             before(grammarAccess.getMappingAccess().getValueAssignment_3()); 
            // InternalMyDsl.g:3629:2: ( rule__Mapping__ValueAssignment_3 )
            // InternalMyDsl.g:3629:3: rule__Mapping__ValueAssignment_3
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
    // InternalMyDsl.g:3637:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl rule__Mapping__Group__5 ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3641:1: ( rule__Mapping__Group__4__Impl rule__Mapping__Group__5 )
            // InternalMyDsl.g:3642:2: rule__Mapping__Group__4__Impl rule__Mapping__Group__5
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:3649:1: rule__Mapping__Group__4__Impl : ( 'parametro' ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3653:1: ( ( 'parametro' ) )
            // InternalMyDsl.g:3654:1: ( 'parametro' )
            {
            // InternalMyDsl.g:3654:1: ( 'parametro' )
            // InternalMyDsl.g:3655:2: 'parametro'
            {
             before(grammarAccess.getMappingAccess().getParametroKeyword_4()); 
            match(input,65,FOLLOW_2); 
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
    // InternalMyDsl.g:3664:1: rule__Mapping__Group__5 : rule__Mapping__Group__5__Impl rule__Mapping__Group__6 ;
    public final void rule__Mapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3668:1: ( rule__Mapping__Group__5__Impl rule__Mapping__Group__6 )
            // InternalMyDsl.g:3669:2: rule__Mapping__Group__5__Impl rule__Mapping__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:3676:1: rule__Mapping__Group__5__Impl : ( ( rule__Mapping__ParametroAssignment_5 ) ) ;
    public final void rule__Mapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3680:1: ( ( ( rule__Mapping__ParametroAssignment_5 ) ) )
            // InternalMyDsl.g:3681:1: ( ( rule__Mapping__ParametroAssignment_5 ) )
            {
            // InternalMyDsl.g:3681:1: ( ( rule__Mapping__ParametroAssignment_5 ) )
            // InternalMyDsl.g:3682:2: ( rule__Mapping__ParametroAssignment_5 )
            {
             before(grammarAccess.getMappingAccess().getParametroAssignment_5()); 
            // InternalMyDsl.g:3683:2: ( rule__Mapping__ParametroAssignment_5 )
            // InternalMyDsl.g:3683:3: rule__Mapping__ParametroAssignment_5
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
    // InternalMyDsl.g:3691:1: rule__Mapping__Group__6 : rule__Mapping__Group__6__Impl ;
    public final void rule__Mapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3695:1: ( rule__Mapping__Group__6__Impl )
            // InternalMyDsl.g:3696:2: rule__Mapping__Group__6__Impl
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
    // InternalMyDsl.g:3702:1: rule__Mapping__Group__6__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3706:1: ( ( '}' ) )
            // InternalMyDsl.g:3707:1: ( '}' )
            {
            // InternalMyDsl.g:3707:1: ( '}' )
            // InternalMyDsl.g:3708:2: '}'
            {
             before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:3718:1: rule__Asercion__Group__0 : rule__Asercion__Group__0__Impl rule__Asercion__Group__1 ;
    public final void rule__Asercion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3722:1: ( rule__Asercion__Group__0__Impl rule__Asercion__Group__1 )
            // InternalMyDsl.g:3723:2: rule__Asercion__Group__0__Impl rule__Asercion__Group__1
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
    // InternalMyDsl.g:3730:1: rule__Asercion__Group__0__Impl : ( 'Asercion' ) ;
    public final void rule__Asercion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3734:1: ( ( 'Asercion' ) )
            // InternalMyDsl.g:3735:1: ( 'Asercion' )
            {
            // InternalMyDsl.g:3735:1: ( 'Asercion' )
            // InternalMyDsl.g:3736:2: 'Asercion'
            {
             before(grammarAccess.getAsercionAccess().getAsercionKeyword_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalMyDsl.g:3745:1: rule__Asercion__Group__1 : rule__Asercion__Group__1__Impl rule__Asercion__Group__2 ;
    public final void rule__Asercion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3749:1: ( rule__Asercion__Group__1__Impl rule__Asercion__Group__2 )
            // InternalMyDsl.g:3750:2: rule__Asercion__Group__1__Impl rule__Asercion__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:3757:1: rule__Asercion__Group__1__Impl : ( '{' ) ;
    public final void rule__Asercion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3761:1: ( ( '{' ) )
            // InternalMyDsl.g:3762:1: ( '{' )
            {
            // InternalMyDsl.g:3762:1: ( '{' )
            // InternalMyDsl.g:3763:2: '{'
            {
             before(grammarAccess.getAsercionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:3772:1: rule__Asercion__Group__2 : rule__Asercion__Group__2__Impl rule__Asercion__Group__3 ;
    public final void rule__Asercion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3776:1: ( rule__Asercion__Group__2__Impl rule__Asercion__Group__3 )
            // InternalMyDsl.g:3777:2: rule__Asercion__Group__2__Impl rule__Asercion__Group__3
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
    // InternalMyDsl.g:3784:1: rule__Asercion__Group__2__Impl : ( 'elemento1' ) ;
    public final void rule__Asercion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3788:1: ( ( 'elemento1' ) )
            // InternalMyDsl.g:3789:1: ( 'elemento1' )
            {
            // InternalMyDsl.g:3789:1: ( 'elemento1' )
            // InternalMyDsl.g:3790:2: 'elemento1'
            {
             before(grammarAccess.getAsercionAccess().getElemento1Keyword_2()); 
            match(input,67,FOLLOW_2); 
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
    // InternalMyDsl.g:3799:1: rule__Asercion__Group__3 : rule__Asercion__Group__3__Impl rule__Asercion__Group__4 ;
    public final void rule__Asercion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3803:1: ( rule__Asercion__Group__3__Impl rule__Asercion__Group__4 )
            // InternalMyDsl.g:3804:2: rule__Asercion__Group__3__Impl rule__Asercion__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:3811:1: rule__Asercion__Group__3__Impl : ( ( rule__Asercion__Elemento1Assignment_3 ) ) ;
    public final void rule__Asercion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3815:1: ( ( ( rule__Asercion__Elemento1Assignment_3 ) ) )
            // InternalMyDsl.g:3816:1: ( ( rule__Asercion__Elemento1Assignment_3 ) )
            {
            // InternalMyDsl.g:3816:1: ( ( rule__Asercion__Elemento1Assignment_3 ) )
            // InternalMyDsl.g:3817:2: ( rule__Asercion__Elemento1Assignment_3 )
            {
             before(grammarAccess.getAsercionAccess().getElemento1Assignment_3()); 
            // InternalMyDsl.g:3818:2: ( rule__Asercion__Elemento1Assignment_3 )
            // InternalMyDsl.g:3818:3: rule__Asercion__Elemento1Assignment_3
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
    // InternalMyDsl.g:3826:1: rule__Asercion__Group__4 : rule__Asercion__Group__4__Impl rule__Asercion__Group__5 ;
    public final void rule__Asercion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3830:1: ( rule__Asercion__Group__4__Impl rule__Asercion__Group__5 )
            // InternalMyDsl.g:3831:2: rule__Asercion__Group__4__Impl rule__Asercion__Group__5
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
    // InternalMyDsl.g:3838:1: rule__Asercion__Group__4__Impl : ( 'elemento2' ) ;
    public final void rule__Asercion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3842:1: ( ( 'elemento2' ) )
            // InternalMyDsl.g:3843:1: ( 'elemento2' )
            {
            // InternalMyDsl.g:3843:1: ( 'elemento2' )
            // InternalMyDsl.g:3844:2: 'elemento2'
            {
             before(grammarAccess.getAsercionAccess().getElemento2Keyword_4()); 
            match(input,68,FOLLOW_2); 
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
    // InternalMyDsl.g:3853:1: rule__Asercion__Group__5 : rule__Asercion__Group__5__Impl rule__Asercion__Group__6 ;
    public final void rule__Asercion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3857:1: ( rule__Asercion__Group__5__Impl rule__Asercion__Group__6 )
            // InternalMyDsl.g:3858:2: rule__Asercion__Group__5__Impl rule__Asercion__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:3865:1: rule__Asercion__Group__5__Impl : ( ( rule__Asercion__Elemento2Assignment_5 ) ) ;
    public final void rule__Asercion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3869:1: ( ( ( rule__Asercion__Elemento2Assignment_5 ) ) )
            // InternalMyDsl.g:3870:1: ( ( rule__Asercion__Elemento2Assignment_5 ) )
            {
            // InternalMyDsl.g:3870:1: ( ( rule__Asercion__Elemento2Assignment_5 ) )
            // InternalMyDsl.g:3871:2: ( rule__Asercion__Elemento2Assignment_5 )
            {
             before(grammarAccess.getAsercionAccess().getElemento2Assignment_5()); 
            // InternalMyDsl.g:3872:2: ( rule__Asercion__Elemento2Assignment_5 )
            // InternalMyDsl.g:3872:3: rule__Asercion__Elemento2Assignment_5
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
    // InternalMyDsl.g:3880:1: rule__Asercion__Group__6 : rule__Asercion__Group__6__Impl ;
    public final void rule__Asercion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3884:1: ( rule__Asercion__Group__6__Impl )
            // InternalMyDsl.g:3885:2: rule__Asercion__Group__6__Impl
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
    // InternalMyDsl.g:3891:1: rule__Asercion__Group__6__Impl : ( '}' ) ;
    public final void rule__Asercion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3895:1: ( ( '}' ) )
            // InternalMyDsl.g:3896:1: ( '}' )
            {
            // InternalMyDsl.g:3896:1: ( '}' )
            // InternalMyDsl.g:3897:2: '}'
            {
             before(grammarAccess.getAsercionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:3907:1: rule__Parametro__Group__0 : rule__Parametro__Group__0__Impl rule__Parametro__Group__1 ;
    public final void rule__Parametro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3911:1: ( rule__Parametro__Group__0__Impl rule__Parametro__Group__1 )
            // InternalMyDsl.g:3912:2: rule__Parametro__Group__0__Impl rule__Parametro__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:3919:1: rule__Parametro__Group__0__Impl : ( () ) ;
    public final void rule__Parametro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3923:1: ( ( () ) )
            // InternalMyDsl.g:3924:1: ( () )
            {
            // InternalMyDsl.g:3924:1: ( () )
            // InternalMyDsl.g:3925:2: ()
            {
             before(grammarAccess.getParametroAccess().getParametroAction_0()); 
            // InternalMyDsl.g:3926:2: ()
            // InternalMyDsl.g:3926:3: 
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
    // InternalMyDsl.g:3934:1: rule__Parametro__Group__1 : rule__Parametro__Group__1__Impl rule__Parametro__Group__2 ;
    public final void rule__Parametro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3938:1: ( rule__Parametro__Group__1__Impl rule__Parametro__Group__2 )
            // InternalMyDsl.g:3939:2: rule__Parametro__Group__1__Impl rule__Parametro__Group__2
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
    // InternalMyDsl.g:3946:1: rule__Parametro__Group__1__Impl : ( 'Parametro' ) ;
    public final void rule__Parametro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3950:1: ( ( 'Parametro' ) )
            // InternalMyDsl.g:3951:1: ( 'Parametro' )
            {
            // InternalMyDsl.g:3951:1: ( 'Parametro' )
            // InternalMyDsl.g:3952:2: 'Parametro'
            {
             before(grammarAccess.getParametroAccess().getParametroKeyword_1()); 
            match(input,69,FOLLOW_2); 
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
    // InternalMyDsl.g:3961:1: rule__Parametro__Group__2 : rule__Parametro__Group__2__Impl rule__Parametro__Group__3 ;
    public final void rule__Parametro__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3965:1: ( rule__Parametro__Group__2__Impl rule__Parametro__Group__3 )
            // InternalMyDsl.g:3966:2: rule__Parametro__Group__2__Impl rule__Parametro__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:3973:1: rule__Parametro__Group__2__Impl : ( '{' ) ;
    public final void rule__Parametro__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3977:1: ( ( '{' ) )
            // InternalMyDsl.g:3978:1: ( '{' )
            {
            // InternalMyDsl.g:3978:1: ( '{' )
            // InternalMyDsl.g:3979:2: '{'
            {
             before(grammarAccess.getParametroAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:3988:1: rule__Parametro__Group__3 : rule__Parametro__Group__3__Impl rule__Parametro__Group__4 ;
    public final void rule__Parametro__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3992:1: ( rule__Parametro__Group__3__Impl rule__Parametro__Group__4 )
            // InternalMyDsl.g:3993:2: rule__Parametro__Group__3__Impl rule__Parametro__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:4000:1: rule__Parametro__Group__3__Impl : ( ( rule__Parametro__Group_3__0 )? ) ;
    public final void rule__Parametro__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4004:1: ( ( ( rule__Parametro__Group_3__0 )? ) )
            // InternalMyDsl.g:4005:1: ( ( rule__Parametro__Group_3__0 )? )
            {
            // InternalMyDsl.g:4005:1: ( ( rule__Parametro__Group_3__0 )? )
            // InternalMyDsl.g:4006:2: ( rule__Parametro__Group_3__0 )?
            {
             before(grammarAccess.getParametroAccess().getGroup_3()); 
            // InternalMyDsl.g:4007:2: ( rule__Parametro__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==70) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:4007:3: rule__Parametro__Group_3__0
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
    // InternalMyDsl.g:4015:1: rule__Parametro__Group__4 : rule__Parametro__Group__4__Impl rule__Parametro__Group__5 ;
    public final void rule__Parametro__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4019:1: ( rule__Parametro__Group__4__Impl rule__Parametro__Group__5 )
            // InternalMyDsl.g:4020:2: rule__Parametro__Group__4__Impl rule__Parametro__Group__5
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:4027:1: rule__Parametro__Group__4__Impl : ( ( rule__Parametro__Group_4__0 )? ) ;
    public final void rule__Parametro__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4031:1: ( ( ( rule__Parametro__Group_4__0 )? ) )
            // InternalMyDsl.g:4032:1: ( ( rule__Parametro__Group_4__0 )? )
            {
            // InternalMyDsl.g:4032:1: ( ( rule__Parametro__Group_4__0 )? )
            // InternalMyDsl.g:4033:2: ( rule__Parametro__Group_4__0 )?
            {
             before(grammarAccess.getParametroAccess().getGroup_4()); 
            // InternalMyDsl.g:4034:2: ( rule__Parametro__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==71) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:4034:3: rule__Parametro__Group_4__0
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
    // InternalMyDsl.g:4042:1: rule__Parametro__Group__5 : rule__Parametro__Group__5__Impl ;
    public final void rule__Parametro__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4046:1: ( rule__Parametro__Group__5__Impl )
            // InternalMyDsl.g:4047:2: rule__Parametro__Group__5__Impl
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
    // InternalMyDsl.g:4053:1: rule__Parametro__Group__5__Impl : ( '}' ) ;
    public final void rule__Parametro__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4057:1: ( ( '}' ) )
            // InternalMyDsl.g:4058:1: ( '}' )
            {
            // InternalMyDsl.g:4058:1: ( '}' )
            // InternalMyDsl.g:4059:2: '}'
            {
             before(grammarAccess.getParametroAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:4069:1: rule__Parametro__Group_3__0 : rule__Parametro__Group_3__0__Impl rule__Parametro__Group_3__1 ;
    public final void rule__Parametro__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4073:1: ( rule__Parametro__Group_3__0__Impl rule__Parametro__Group_3__1 )
            // InternalMyDsl.g:4074:2: rule__Parametro__Group_3__0__Impl rule__Parametro__Group_3__1
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
    // InternalMyDsl.g:4081:1: rule__Parametro__Group_3__0__Impl : ( 'nombre' ) ;
    public final void rule__Parametro__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4085:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:4086:1: ( 'nombre' )
            {
            // InternalMyDsl.g:4086:1: ( 'nombre' )
            // InternalMyDsl.g:4087:2: 'nombre'
            {
             before(grammarAccess.getParametroAccess().getNombreKeyword_3_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalMyDsl.g:4096:1: rule__Parametro__Group_3__1 : rule__Parametro__Group_3__1__Impl ;
    public final void rule__Parametro__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4100:1: ( rule__Parametro__Group_3__1__Impl )
            // InternalMyDsl.g:4101:2: rule__Parametro__Group_3__1__Impl
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
    // InternalMyDsl.g:4107:1: rule__Parametro__Group_3__1__Impl : ( ( rule__Parametro__NombreAssignment_3_1 ) ) ;
    public final void rule__Parametro__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4111:1: ( ( ( rule__Parametro__NombreAssignment_3_1 ) ) )
            // InternalMyDsl.g:4112:1: ( ( rule__Parametro__NombreAssignment_3_1 ) )
            {
            // InternalMyDsl.g:4112:1: ( ( rule__Parametro__NombreAssignment_3_1 ) )
            // InternalMyDsl.g:4113:2: ( rule__Parametro__NombreAssignment_3_1 )
            {
             before(grammarAccess.getParametroAccess().getNombreAssignment_3_1()); 
            // InternalMyDsl.g:4114:2: ( rule__Parametro__NombreAssignment_3_1 )
            // InternalMyDsl.g:4114:3: rule__Parametro__NombreAssignment_3_1
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
    // InternalMyDsl.g:4123:1: rule__Parametro__Group_4__0 : rule__Parametro__Group_4__0__Impl rule__Parametro__Group_4__1 ;
    public final void rule__Parametro__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4127:1: ( rule__Parametro__Group_4__0__Impl rule__Parametro__Group_4__1 )
            // InternalMyDsl.g:4128:2: rule__Parametro__Group_4__0__Impl rule__Parametro__Group_4__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:4135:1: rule__Parametro__Group_4__0__Impl : ( 'tipo' ) ;
    public final void rule__Parametro__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4139:1: ( ( 'tipo' ) )
            // InternalMyDsl.g:4140:1: ( 'tipo' )
            {
            // InternalMyDsl.g:4140:1: ( 'tipo' )
            // InternalMyDsl.g:4141:2: 'tipo'
            {
             before(grammarAccess.getParametroAccess().getTipoKeyword_4_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalMyDsl.g:4150:1: rule__Parametro__Group_4__1 : rule__Parametro__Group_4__1__Impl ;
    public final void rule__Parametro__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4154:1: ( rule__Parametro__Group_4__1__Impl )
            // InternalMyDsl.g:4155:2: rule__Parametro__Group_4__1__Impl
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
    // InternalMyDsl.g:4161:1: rule__Parametro__Group_4__1__Impl : ( ( rule__Parametro__TipoAssignment_4_1 ) ) ;
    public final void rule__Parametro__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4165:1: ( ( ( rule__Parametro__TipoAssignment_4_1 ) ) )
            // InternalMyDsl.g:4166:1: ( ( rule__Parametro__TipoAssignment_4_1 ) )
            {
            // InternalMyDsl.g:4166:1: ( ( rule__Parametro__TipoAssignment_4_1 ) )
            // InternalMyDsl.g:4167:2: ( rule__Parametro__TipoAssignment_4_1 )
            {
             before(grammarAccess.getParametroAccess().getTipoAssignment_4_1()); 
            // InternalMyDsl.g:4168:2: ( rule__Parametro__TipoAssignment_4_1 )
            // InternalMyDsl.g:4168:3: rule__Parametro__TipoAssignment_4_1
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
    // InternalMyDsl.g:4177:1: rule__Api__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Api__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4181:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4182:2: ( ruleEString )
            {
            // InternalMyDsl.g:4182:2: ( ruleEString )
            // InternalMyDsl.g:4183:3: ruleEString
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
    // InternalMyDsl.g:4192:1: rule__Api__EntidadesAssignment_5 : ( ruleEntidad ) ;
    public final void rule__Api__EntidadesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4196:1: ( ( ruleEntidad ) )
            // InternalMyDsl.g:4197:2: ( ruleEntidad )
            {
            // InternalMyDsl.g:4197:2: ( ruleEntidad )
            // InternalMyDsl.g:4198:3: ruleEntidad
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
    // InternalMyDsl.g:4207:1: rule__Api__PrimitivetypesAssignment_6 : ( rulePrimitiveType ) ;
    public final void rule__Api__PrimitivetypesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4211:1: ( ( rulePrimitiveType ) )
            // InternalMyDsl.g:4212:2: ( rulePrimitiveType )
            {
            // InternalMyDsl.g:4212:2: ( rulePrimitiveType )
            // InternalMyDsl.g:4213:3: rulePrimitiveType
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
    // InternalMyDsl.g:4222:1: rule__Api__ServiciosRestAssignment_7 : ( ruleServicioRest ) ;
    public final void rule__Api__ServiciosRestAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4226:1: ( ( ruleServicioRest ) )
            // InternalMyDsl.g:4227:2: ( ruleServicioRest )
            {
            // InternalMyDsl.g:4227:2: ( ruleServicioRest )
            // InternalMyDsl.g:4228:3: ruleServicioRest
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
    // InternalMyDsl.g:4237:1: rule__AtributoMocka__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoMocka__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4241:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:4242:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:4242:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:4243:3: ruleTipoAtributo
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
    // InternalMyDsl.g:4252:1: rule__AtributoMocka__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__AtributoMocka__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4256:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4257:2: ( ruleEString )
            {
            // InternalMyDsl.g:4257:2: ( ruleEString )
            // InternalMyDsl.g:4258:3: ruleEString
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
    // InternalMyDsl.g:4267:1: rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 : ( ( 'PK,mockType' ) ) ;
    public final void rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4271:1: ( ( ( 'PK,mockType' ) ) )
            // InternalMyDsl.g:4272:2: ( ( 'PK,mockType' ) )
            {
            // InternalMyDsl.g:4272:2: ( ( 'PK,mockType' ) )
            // InternalMyDsl.g:4273:3: ( 'PK,mockType' )
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 
            // InternalMyDsl.g:4274:3: ( 'PK,mockType' )
            // InternalMyDsl.g:4275:4: 'PK,mockType'
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalMyDsl.g:4286:1: rule__AtributoMocka__MockTypeAssignment_2_1_0_2 : ( ruleMockaroo ) ;
    public final void rule__AtributoMocka__MockTypeAssignment_2_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4290:1: ( ( ruleMockaroo ) )
            // InternalMyDsl.g:4291:2: ( ruleMockaroo )
            {
            // InternalMyDsl.g:4291:2: ( ruleMockaroo )
            // InternalMyDsl.g:4292:3: ruleMockaroo
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
    // InternalMyDsl.g:4301:1: rule__AtributoMocka__MockTypeAssignment_2_1_1_2 : ( ruleMockaroo ) ;
    public final void rule__AtributoMocka__MockTypeAssignment_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4305:1: ( ( ruleMockaroo ) )
            // InternalMyDsl.g:4306:2: ( ruleMockaroo )
            {
            // InternalMyDsl.g:4306:2: ( ruleMockaroo )
            // InternalMyDsl.g:4307:3: ruleMockaroo
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
    // InternalMyDsl.g:4316:1: rule__AtributoArreglo__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoArreglo__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4320:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:4321:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:4321:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:4322:3: ruleTipoAtributo
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
    // InternalMyDsl.g:4331:1: rule__AtributoArreglo__NombreAssignment_3 : ( ruleEString ) ;
    public final void rule__AtributoArreglo__NombreAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4335:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4336:2: ( ruleEString )
            {
            // InternalMyDsl.g:4336:2: ( ruleEString )
            // InternalMyDsl.g:4337:3: ruleEString
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
    // InternalMyDsl.g:4346:1: rule__AtributoSimple__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoSimple__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4350:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:4351:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:4351:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:4352:3: ruleTipoAtributo
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
    // InternalMyDsl.g:4361:1: rule__AtributoSimple__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__AtributoSimple__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4365:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4366:2: ( ruleEString )
            {
            // InternalMyDsl.g:4366:2: ( ruleEString )
            // InternalMyDsl.g:4367:3: ruleEString
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
    // InternalMyDsl.g:4376:1: rule__MockarooEntity__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__MockarooEntity__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4380:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4381:2: ( ruleEString )
            {
            // InternalMyDsl.g:4381:2: ( ruleEString )
            // InternalMyDsl.g:4382:3: ruleEString
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
    // InternalMyDsl.g:4391:1: rule__MockarooEntity__AtributosAssignment_3 : ( ruleAtributo ) ;
    public final void rule__MockarooEntity__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4395:1: ( ( ruleAtributo ) )
            // InternalMyDsl.g:4396:2: ( ruleAtributo )
            {
            // InternalMyDsl.g:4396:2: ( ruleAtributo )
            // InternalMyDsl.g:4397:3: ruleAtributo
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
    // InternalMyDsl.g:4406:1: rule__ServicioRest__MetodoAssignment_0 : ( ruleTipoMetodoRest ) ;
    public final void rule__ServicioRest__MetodoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4410:1: ( ( ruleTipoMetodoRest ) )
            // InternalMyDsl.g:4411:2: ( ruleTipoMetodoRest )
            {
            // InternalMyDsl.g:4411:2: ( ruleTipoMetodoRest )
            // InternalMyDsl.g:4412:3: ruleTipoMetodoRest
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
    // InternalMyDsl.g:4421:1: rule__ServicioRest__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__ServicioRest__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4425:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4426:2: ( ruleEString )
            {
            // InternalMyDsl.g:4426:2: ( ruleEString )
            // InternalMyDsl.g:4427:3: ruleEString
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
    // InternalMyDsl.g:4436:1: rule__ServicioRest__UrlAssignment_6 : ( ruleEString ) ;
    public final void rule__ServicioRest__UrlAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4440:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4441:2: ( ruleEString )
            {
            // InternalMyDsl.g:4441:2: ( ruleEString )
            // InternalMyDsl.g:4442:3: ruleEString
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


    // $ANTLR start "rule__ServicioRest__ResponseAssignment_10"
    // InternalMyDsl.g:4451:1: rule__ServicioRest__ResponseAssignment_10 : ( ruleResponse ) ;
    public final void rule__ServicioRest__ResponseAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4455:1: ( ( ruleResponse ) )
            // InternalMyDsl.g:4456:2: ( ruleResponse )
            {
            // InternalMyDsl.g:4456:2: ( ruleResponse )
            // InternalMyDsl.g:4457:3: ruleResponse
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
    // InternalMyDsl.g:4466:1: rule__SimpleEntity__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__SimpleEntity__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4470:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4471:2: ( ruleEString )
            {
            // InternalMyDsl.g:4471:2: ( ruleEString )
            // InternalMyDsl.g:4472:3: ruleEString
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
    // InternalMyDsl.g:4481:1: rule__SimpleEntity__AtributosAssignment_3 : ( ruleAtributoSimple ) ;
    public final void rule__SimpleEntity__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4485:1: ( ( ruleAtributoSimple ) )
            // InternalMyDsl.g:4486:2: ( ruleAtributoSimple )
            {
            // InternalMyDsl.g:4486:2: ( ruleAtributoSimple )
            // InternalMyDsl.g:4487:3: ruleAtributoSimple
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
    // InternalMyDsl.g:4496:1: rule__MyNumeric__ValorAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__MyNumeric__ValorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4500:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:4501:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:4501:2: ( ruleEDouble )
            // InternalMyDsl.g:4502:3: ruleEDouble
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
    // InternalMyDsl.g:4511:1: rule__MyString__ValorAssignment_3_1 : ( ruleEString ) ;
    public final void rule__MyString__ValorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4515:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4516:2: ( ruleEString )
            {
            // InternalMyDsl.g:4516:2: ( ruleEString )
            // InternalMyDsl.g:4517:3: ruleEString
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
    // InternalMyDsl.g:4526:1: rule__MyBoolean__ValorAssignment_1 : ( ( 'valor' ) ) ;
    public final void rule__MyBoolean__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4530:1: ( ( ( 'valor' ) ) )
            // InternalMyDsl.g:4531:2: ( ( 'valor' ) )
            {
            // InternalMyDsl.g:4531:2: ( ( 'valor' ) )
            // InternalMyDsl.g:4532:3: ( 'valor' )
            {
             before(grammarAccess.getMyBooleanAccess().getValorValorKeyword_1_0()); 
            // InternalMyDsl.g:4533:3: ( 'valor' )
            // InternalMyDsl.g:4534:4: 'valor'
            {
             before(grammarAccess.getMyBooleanAccess().getValorValorKeyword_1_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyDsl.g:4545:1: rule__Response__AtributosAssignment_4 : ( ruleAtributo2 ) ;
    public final void rule__Response__AtributosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4549:1: ( ( ruleAtributo2 ) )
            // InternalMyDsl.g:4550:2: ( ruleAtributo2 )
            {
            // InternalMyDsl.g:4550:2: ( ruleAtributo2 )
            // InternalMyDsl.g:4551:3: ruleAtributo2
            {
             before(grammarAccess.getResponseAccess().getAtributosAtributo2ParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo2();

            state._fsp--;

             after(grammarAccess.getResponseAccess().getAtributosAtributo2ParserRuleCall_4_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Mapping__ValueAssignment_3"
    // InternalMyDsl.g:4560:1: rule__Mapping__ValueAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Mapping__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4564:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:4565:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:4565:2: ( ( ruleEString ) )
            // InternalMyDsl.g:4566:3: ( ruleEString )
            {
             before(grammarAccess.getMappingAccess().getValueElementoCrossReference_3_0()); 
            // InternalMyDsl.g:4567:3: ( ruleEString )
            // InternalMyDsl.g:4568:4: ruleEString
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
    // InternalMyDsl.g:4579:1: rule__Mapping__ParametroAssignment_5 : ( ruleParametro ) ;
    public final void rule__Mapping__ParametroAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4583:1: ( ( ruleParametro ) )
            // InternalMyDsl.g:4584:2: ( ruleParametro )
            {
            // InternalMyDsl.g:4584:2: ( ruleParametro )
            // InternalMyDsl.g:4585:3: ruleParametro
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
    // InternalMyDsl.g:4594:1: rule__Asercion__Elemento1Assignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Asercion__Elemento1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4598:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:4599:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:4599:2: ( ( ruleEString ) )
            // InternalMyDsl.g:4600:3: ( ruleEString )
            {
             before(grammarAccess.getAsercionAccess().getElemento1ElementoCrossReference_3_0()); 
            // InternalMyDsl.g:4601:3: ( ruleEString )
            // InternalMyDsl.g:4602:4: ruleEString
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
    // InternalMyDsl.g:4613:1: rule__Asercion__Elemento2Assignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Asercion__Elemento2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4617:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:4618:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:4618:2: ( ( ruleEString ) )
            // InternalMyDsl.g:4619:3: ( ruleEString )
            {
             before(grammarAccess.getAsercionAccess().getElemento2ElementoCrossReference_5_0()); 
            // InternalMyDsl.g:4620:3: ( ruleEString )
            // InternalMyDsl.g:4621:4: ruleEString
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
    // InternalMyDsl.g:4632:1: rule__Parametro__NombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Parametro__NombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4636:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4637:2: ( ruleEString )
            {
            // InternalMyDsl.g:4637:2: ( ruleEString )
            // InternalMyDsl.g:4638:3: ruleEString
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
    // InternalMyDsl.g:4647:1: rule__Parametro__TipoAssignment_4_1 : ( ruleTipoParametro ) ;
    public final void rule__Parametro__TipoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4651:1: ( ( ruleTipoParametro ) )
            // InternalMyDsl.g:4652:2: ( ruleTipoParametro )
            {
            // InternalMyDsl.g:4652:2: ( ruleTipoParametro )
            // InternalMyDsl.g:4653:3: ruleTipoParametro
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0F8803C000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0088000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0F00000000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000003FFF000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000008E000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000003F00B0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000003F0032L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x4020000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0200000000080000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x3000000000000100L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0F00000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1000000000000100L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000000000E010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000080000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00001C0000000000L});

}