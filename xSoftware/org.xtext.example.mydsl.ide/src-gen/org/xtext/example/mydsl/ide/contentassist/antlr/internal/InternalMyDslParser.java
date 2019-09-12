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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'string'", "'int'", "'boolean'", "'FirstNameType'", "'LastNameType'", "'FamilyNameType'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CityType'", "'CountryCodeType'", "'LatitudeType'", "'LongitudType'", "'RowNumberType'", "'BooleanType'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'apiURL'", "'SimpleEntity'", "'{'", "'}'", "'('", "')'", "'mockType'", "'['", "']'", "'Entity'", "'URL'", "'/'", "'?${'", "'/:{'", "'Response'", "'Type'", "'Request'", "'Test'", "'service'", "'description'", "'Assertions'", "'Mapping'", "'{parameter'", "'.'", "','", "'value'", "'request->'", "'Asercion'", "'elemento1'", "'elemento2'", "'PK,mockType'"
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
    public static final int RULE_ID=6;
    public static final int RULE_EQUAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SEMICOLON=8;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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


    // $ANTLR start "entryRuleSimpleEntity"
    // InternalMyDsl.g:103:1: entryRuleSimpleEntity : ruleSimpleEntity EOF ;
    public final void entryRuleSimpleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleSimpleEntity EOF )
            // InternalMyDsl.g:105:1: ruleSimpleEntity EOF
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
    // InternalMyDsl.g:112:1: ruleSimpleEntity : ( ( rule__SimpleEntity__Group__0 ) ) ;
    public final void ruleSimpleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__SimpleEntity__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__SimpleEntity__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__SimpleEntity__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__SimpleEntity__Group__0 )
            {
             before(grammarAccess.getSimpleEntityAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__SimpleEntity__Group__0 )
            // InternalMyDsl.g:119:4: rule__SimpleEntity__Group__0
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


    // $ANTLR start "entryRuleMyString"
    // InternalMyDsl.g:228:1: entryRuleMyString : ruleMyString EOF ;
    public final void entryRuleMyString() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleMyString EOF )
            // InternalMyDsl.g:230:1: ruleMyString EOF
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
    // InternalMyDsl.g:237:1: ruleMyString : ( ( rule__MyString__NameAssignment ) ) ;
    public final void ruleMyString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__MyString__NameAssignment ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__MyString__NameAssignment ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__MyString__NameAssignment ) )
            // InternalMyDsl.g:243:3: ( rule__MyString__NameAssignment )
            {
             before(grammarAccess.getMyStringAccess().getNameAssignment()); 
            // InternalMyDsl.g:244:3: ( rule__MyString__NameAssignment )
            // InternalMyDsl.g:244:4: rule__MyString__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MyString__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMyStringAccess().getNameAssignment()); 

            }


            }

        }
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
    // InternalMyDsl.g:253:1: entryRuleMyNumeric : ruleMyNumeric EOF ;
    public final void entryRuleMyNumeric() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleMyNumeric EOF )
            // InternalMyDsl.g:255:1: ruleMyNumeric EOF
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
    // InternalMyDsl.g:262:1: ruleMyNumeric : ( ( rule__MyNumeric__NameAssignment ) ) ;
    public final void ruleMyNumeric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__MyNumeric__NameAssignment ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__MyNumeric__NameAssignment ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__MyNumeric__NameAssignment ) )
            // InternalMyDsl.g:268:3: ( rule__MyNumeric__NameAssignment )
            {
             before(grammarAccess.getMyNumericAccess().getNameAssignment()); 
            // InternalMyDsl.g:269:3: ( rule__MyNumeric__NameAssignment )
            // InternalMyDsl.g:269:4: rule__MyNumeric__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MyNumeric__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMyNumericAccess().getNameAssignment()); 

            }


            }

        }
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
    // InternalMyDsl.g:278:1: entryRuleMyBoolean : ruleMyBoolean EOF ;
    public final void entryRuleMyBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleMyBoolean EOF )
            // InternalMyDsl.g:280:1: ruleMyBoolean EOF
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
    // InternalMyDsl.g:287:1: ruleMyBoolean : ( ( rule__MyBoolean__NameAssignment ) ) ;
    public final void ruleMyBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__MyBoolean__NameAssignment ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__MyBoolean__NameAssignment ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__MyBoolean__NameAssignment ) )
            // InternalMyDsl.g:293:3: ( rule__MyBoolean__NameAssignment )
            {
             before(grammarAccess.getMyBooleanAccess().getNameAssignment()); 
            // InternalMyDsl.g:294:3: ( rule__MyBoolean__NameAssignment )
            // InternalMyDsl.g:294:4: rule__MyBoolean__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MyBoolean__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMyBooleanAccess().getNameAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleMockarooEntity"
    // InternalMyDsl.g:303:1: entryRuleMockarooEntity : ruleMockarooEntity EOF ;
    public final void entryRuleMockarooEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleMockarooEntity EOF )
            // InternalMyDsl.g:305:1: ruleMockarooEntity EOF
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
    // InternalMyDsl.g:312:1: ruleMockarooEntity : ( ( rule__MockarooEntity__Group__0 ) ) ;
    public final void ruleMockarooEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__MockarooEntity__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__MockarooEntity__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__MockarooEntity__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__MockarooEntity__Group__0 )
            {
             before(grammarAccess.getMockarooEntityAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__MockarooEntity__Group__0 )
            // InternalMyDsl.g:319:4: rule__MockarooEntity__Group__0
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
    // InternalMyDsl.g:328:1: entryRuleServicioRest : ruleServicioRest EOF ;
    public final void entryRuleServicioRest() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleServicioRest EOF )
            // InternalMyDsl.g:330:1: ruleServicioRest EOF
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
    // InternalMyDsl.g:337:1: ruleServicioRest : ( ( rule__ServicioRest__Group__0 ) ) ;
    public final void ruleServicioRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__ServicioRest__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__ServicioRest__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__ServicioRest__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__ServicioRest__Group__0 )
            {
             before(grammarAccess.getServicioRestAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__ServicioRest__Group__0 )
            // InternalMyDsl.g:344:4: rule__ServicioRest__Group__0
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
    // InternalMyDsl.g:353:1: entryRuleParametro : ruleParametro EOF ;
    public final void entryRuleParametro() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleParametro EOF )
            // InternalMyDsl.g:355:1: ruleParametro EOF
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
    // InternalMyDsl.g:362:1: ruleParametro : ( ( rule__Parametro__Alternatives ) ) ;
    public final void ruleParametro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Parametro__Alternatives ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Parametro__Alternatives ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Parametro__Alternatives ) )
            // InternalMyDsl.g:368:3: ( rule__Parametro__Alternatives )
            {
             before(grammarAccess.getParametroAccess().getAlternatives()); 
            // InternalMyDsl.g:369:3: ( rule__Parametro__Alternatives )
            // InternalMyDsl.g:369:4: rule__Parametro__Alternatives
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
    // InternalMyDsl.g:378:1: entryRuleQueryParam : ruleQueryParam EOF ;
    public final void entryRuleQueryParam() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleQueryParam EOF )
            // InternalMyDsl.g:380:1: ruleQueryParam EOF
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
    // InternalMyDsl.g:387:1: ruleQueryParam : ( ( rule__QueryParam__Group__0 ) ) ;
    public final void ruleQueryParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__QueryParam__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__QueryParam__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__QueryParam__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__QueryParam__Group__0 )
            {
             before(grammarAccess.getQueryParamAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__QueryParam__Group__0 )
            // InternalMyDsl.g:394:4: rule__QueryParam__Group__0
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
    // InternalMyDsl.g:403:1: entryRulePathParam : rulePathParam EOF ;
    public final void entryRulePathParam() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( rulePathParam EOF )
            // InternalMyDsl.g:405:1: rulePathParam EOF
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
    // InternalMyDsl.g:412:1: rulePathParam : ( ( rule__PathParam__Group__0 ) ) ;
    public final void rulePathParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__PathParam__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__PathParam__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__PathParam__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__PathParam__Group__0 )
            {
             before(grammarAccess.getPathParamAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__PathParam__Group__0 )
            // InternalMyDsl.g:419:4: rule__PathParam__Group__0
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


    // $ANTLR start "entryRuleResponse"
    // InternalMyDsl.g:428:1: entryRuleResponse : ruleResponse EOF ;
    public final void entryRuleResponse() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleResponse EOF )
            // InternalMyDsl.g:430:1: ruleResponse EOF
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
    // InternalMyDsl.g:437:1: ruleResponse : ( ( rule__Response__Group__0 ) ) ;
    public final void ruleResponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Response__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Response__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Response__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Response__Group__0 )
            {
             before(grammarAccess.getResponseAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Response__Group__0 )
            // InternalMyDsl.g:444:4: rule__Response__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleRequest : ruleRequest EOF ;
    public final void entryRuleRequest() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleRequest EOF )
            // InternalMyDsl.g:455:1: ruleRequest EOF
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
    // InternalMyDsl.g:462:1: ruleRequest : ( ( rule__Request__Group__0 ) ) ;
    public final void ruleRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Request__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Request__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Request__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Request__Group__0 )
            {
             before(grammarAccess.getRequestAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Request__Group__0 )
            // InternalMyDsl.g:469:4: rule__Request__Group__0
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


    // $ANTLR start "entryRulePrimitiveType"
    // InternalMyDsl.g:478:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( rulePrimitiveType EOF )
            // InternalMyDsl.g:480:1: rulePrimitiveType EOF
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
    // InternalMyDsl.g:487:1: rulePrimitiveType : ( ( rule__PrimitiveType__NameAssignment ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__PrimitiveType__NameAssignment ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__PrimitiveType__NameAssignment ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__PrimitiveType__NameAssignment ) )
            // InternalMyDsl.g:493:3: ( rule__PrimitiveType__NameAssignment )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameAssignment()); 
            // InternalMyDsl.g:494:3: ( rule__PrimitiveType__NameAssignment )
            // InternalMyDsl.g:494:4: rule__PrimitiveType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getNameAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleDatoPrimitivo"
    // InternalMyDsl.g:503:1: entryRuleDatoPrimitivo : ruleDatoPrimitivo EOF ;
    public final void entryRuleDatoPrimitivo() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleDatoPrimitivo EOF )
            // InternalMyDsl.g:505:1: ruleDatoPrimitivo EOF
            {
             before(grammarAccess.getDatoPrimitivoRule()); 
            pushFollow(FOLLOW_1);
            ruleDatoPrimitivo();

            state._fsp--;

             after(grammarAccess.getDatoPrimitivoRule()); 
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
    // $ANTLR end "entryRuleDatoPrimitivo"


    // $ANTLR start "ruleDatoPrimitivo"
    // InternalMyDsl.g:512:1: ruleDatoPrimitivo : ( ( rule__DatoPrimitivo__Alternatives ) ) ;
    public final void ruleDatoPrimitivo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__DatoPrimitivo__Alternatives ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__DatoPrimitivo__Alternatives ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__DatoPrimitivo__Alternatives ) )
            // InternalMyDsl.g:518:3: ( rule__DatoPrimitivo__Alternatives )
            {
             before(grammarAccess.getDatoPrimitivoAccess().getAlternatives()); 
            // InternalMyDsl.g:519:3: ( rule__DatoPrimitivo__Alternatives )
            // InternalMyDsl.g:519:4: rule__DatoPrimitivo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DatoPrimitivo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatoPrimitivoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatoPrimitivo"


    // $ANTLR start "entryRuleTest"
    // InternalMyDsl.g:528:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleTest EOF )
            // InternalMyDsl.g:530:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
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
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalMyDsl.g:537:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Test__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Test__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Test__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__Test__Group__0 )
            // InternalMyDsl.g:544:4: rule__Test__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleMapping"
    // InternalMyDsl.g:553:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleMapping EOF )
            // InternalMyDsl.g:555:1: ruleMapping EOF
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
    // InternalMyDsl.g:562:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__Mapping__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__Mapping__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__Mapping__Group__0 )
            // InternalMyDsl.g:569:4: rule__Mapping__Group__0
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
    // InternalMyDsl.g:578:1: entryRuleAsercion : ruleAsercion EOF ;
    public final void entryRuleAsercion() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleAsercion EOF )
            // InternalMyDsl.g:580:1: ruleAsercion EOF
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
    // InternalMyDsl.g:587:1: ruleAsercion : ( ( rule__Asercion__Group__0 ) ) ;
    public final void ruleAsercion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__Asercion__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__Asercion__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__Asercion__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__Asercion__Group__0 )
            {
             before(grammarAccess.getAsercionAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__Asercion__Group__0 )
            // InternalMyDsl.g:594:4: rule__Asercion__Group__0
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalMyDsl.g:603:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleEBoolean EOF )
            // InternalMyDsl.g:605:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalMyDsl.g:612:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalMyDsl.g:618:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalMyDsl.g:619:3: ( rule__EBoolean__Alternatives )
            // InternalMyDsl.g:619:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:628:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleEInt EOF )
            // InternalMyDsl.g:630:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:637:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( RULE_INT ) )
            // InternalMyDsl.g:642:2: ( RULE_INT )
            {
            // InternalMyDsl.g:642:2: ( RULE_INT )
            // InternalMyDsl.g:643:3: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:653:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleEString EOF )
            // InternalMyDsl.g:655:1: ruleEString EOF
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
    // InternalMyDsl.g:662:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:668:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:669:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:669:4: rule__EString__Alternatives
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


    // $ANTLR start "ruleTipoAtributo"
    // InternalMyDsl.g:678:1: ruleTipoAtributo : ( ( rule__TipoAtributo__Alternatives ) ) ;
    public final void ruleTipoAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:682:1: ( ( ( rule__TipoAtributo__Alternatives ) ) )
            // InternalMyDsl.g:683:2: ( ( rule__TipoAtributo__Alternatives ) )
            {
            // InternalMyDsl.g:683:2: ( ( rule__TipoAtributo__Alternatives ) )
            // InternalMyDsl.g:684:3: ( rule__TipoAtributo__Alternatives )
            {
             before(grammarAccess.getTipoAtributoAccess().getAlternatives()); 
            // InternalMyDsl.g:685:3: ( rule__TipoAtributo__Alternatives )
            // InternalMyDsl.g:685:4: rule__TipoAtributo__Alternatives
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
    // InternalMyDsl.g:694:1: ruleMockaroo : ( ( rule__Mockaroo__Alternatives ) ) ;
    public final void ruleMockaroo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:698:1: ( ( ( rule__Mockaroo__Alternatives ) ) )
            // InternalMyDsl.g:699:2: ( ( rule__Mockaroo__Alternatives ) )
            {
            // InternalMyDsl.g:699:2: ( ( rule__Mockaroo__Alternatives ) )
            // InternalMyDsl.g:700:3: ( rule__Mockaroo__Alternatives )
            {
             before(grammarAccess.getMockarooAccess().getAlternatives()); 
            // InternalMyDsl.g:701:3: ( rule__Mockaroo__Alternatives )
            // InternalMyDsl.g:701:4: rule__Mockaroo__Alternatives
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
    // InternalMyDsl.g:710:1: ruleTipoMetodoRest : ( ( rule__TipoMetodoRest__Alternatives ) ) ;
    public final void ruleTipoMetodoRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:714:1: ( ( ( rule__TipoMetodoRest__Alternatives ) ) )
            // InternalMyDsl.g:715:2: ( ( rule__TipoMetodoRest__Alternatives ) )
            {
            // InternalMyDsl.g:715:2: ( ( rule__TipoMetodoRest__Alternatives ) )
            // InternalMyDsl.g:716:3: ( rule__TipoMetodoRest__Alternatives )
            {
             before(grammarAccess.getTipoMetodoRestAccess().getAlternatives()); 
            // InternalMyDsl.g:717:3: ( rule__TipoMetodoRest__Alternatives )
            // InternalMyDsl.g:717:4: rule__TipoMetodoRest__Alternatives
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
    // InternalMyDsl.g:725:1: rule__Entidad__Alternatives : ( ( ruleSimpleEntity ) | ( ruleMockarooEntity ) );
    public final void rule__Entidad__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:729:1: ( ( ruleSimpleEntity ) | ( ruleMockarooEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==37) ) {
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
                    // InternalMyDsl.g:730:2: ( ruleSimpleEntity )
                    {
                    // InternalMyDsl.g:730:2: ( ruleSimpleEntity )
                    // InternalMyDsl.g:731:3: ruleSimpleEntity
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
                    // InternalMyDsl.g:736:2: ( ruleMockarooEntity )
                    {
                    // InternalMyDsl.g:736:2: ( ruleMockarooEntity )
                    // InternalMyDsl.g:737:3: ruleMockarooEntity
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
    // InternalMyDsl.g:746:1: rule__Atributo__Alternatives : ( ( ruleAtributoMocka ) | ( ruleAtributoArreglo ) | ( ruleAtributoSimple ) );
    public final void rule__Atributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:750:1: ( ( ruleAtributoMocka ) | ( ruleAtributoArreglo ) | ( ruleAtributoSimple ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
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
                else if ( (LA2_1==43) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_ID) ) {
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
                else if ( (LA2_2==43) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==RULE_ID) ) {
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
                else if ( (LA2_3==43) ) {
                    alt2=2;
                }
                else {
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
                    // InternalMyDsl.g:751:2: ( ruleAtributoMocka )
                    {
                    // InternalMyDsl.g:751:2: ( ruleAtributoMocka )
                    // InternalMyDsl.g:752:3: ruleAtributoMocka
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
                    // InternalMyDsl.g:757:2: ( ruleAtributoArreglo )
                    {
                    // InternalMyDsl.g:757:2: ( ruleAtributoArreglo )
                    // InternalMyDsl.g:758:3: ruleAtributoArreglo
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
                    // InternalMyDsl.g:763:2: ( ruleAtributoSimple )
                    {
                    // InternalMyDsl.g:763:2: ( ruleAtributoSimple )
                    // InternalMyDsl.g:764:3: ruleAtributoSimple
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
    // InternalMyDsl.g:773:1: rule__AtributoMocka__Alternatives_2_1 : ( ( ( rule__AtributoMocka__Group_2_1_0__0 ) ) | ( ( rule__AtributoMocka__Group_2_1_1__0 ) ) );
    public final void rule__AtributoMocka__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:777:1: ( ( ( rule__AtributoMocka__Group_2_1_0__0 ) ) | ( ( rule__AtributoMocka__Group_2_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==66) ) {
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
                    // InternalMyDsl.g:778:2: ( ( rule__AtributoMocka__Group_2_1_0__0 ) )
                    {
                    // InternalMyDsl.g:778:2: ( ( rule__AtributoMocka__Group_2_1_0__0 ) )
                    // InternalMyDsl.g:779:3: ( rule__AtributoMocka__Group_2_1_0__0 )
                    {
                     before(grammarAccess.getAtributoMockaAccess().getGroup_2_1_0()); 
                    // InternalMyDsl.g:780:3: ( rule__AtributoMocka__Group_2_1_0__0 )
                    // InternalMyDsl.g:780:4: rule__AtributoMocka__Group_2_1_0__0
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
                    // InternalMyDsl.g:784:2: ( ( rule__AtributoMocka__Group_2_1_1__0 ) )
                    {
                    // InternalMyDsl.g:784:2: ( ( rule__AtributoMocka__Group_2_1_1__0 ) )
                    // InternalMyDsl.g:785:3: ( rule__AtributoMocka__Group_2_1_1__0 )
                    {
                     before(grammarAccess.getAtributoMockaAccess().getGroup_2_1_1()); 
                    // InternalMyDsl.g:786:3: ( rule__AtributoMocka__Group_2_1_1__0 )
                    // InternalMyDsl.g:786:4: rule__AtributoMocka__Group_2_1_1__0
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


    // $ANTLR start "rule__ServicioRest__Alternatives_7"
    // InternalMyDsl.g:794:1: rule__ServicioRest__Alternatives_7 : ( ( ( rule__ServicioRest__ParametrosAssignment_7_0 ) ) | ( ( rule__ServicioRest__Group_7_1__0 ) ) );
    public final void rule__ServicioRest__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:798:1: ( ( ( rule__ServicioRest__ParametrosAssignment_7_0 ) ) | ( ( rule__ServicioRest__Group_7_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=48 && LA4_0<=49)) ) {
                alt4=1;
            }
            else if ( (LA4_0==47) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:799:2: ( ( rule__ServicioRest__ParametrosAssignment_7_0 ) )
                    {
                    // InternalMyDsl.g:799:2: ( ( rule__ServicioRest__ParametrosAssignment_7_0 ) )
                    // InternalMyDsl.g:800:3: ( rule__ServicioRest__ParametrosAssignment_7_0 )
                    {
                     before(grammarAccess.getServicioRestAccess().getParametrosAssignment_7_0()); 
                    // InternalMyDsl.g:801:3: ( rule__ServicioRest__ParametrosAssignment_7_0 )
                    // InternalMyDsl.g:801:4: rule__ServicioRest__ParametrosAssignment_7_0
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
                    // InternalMyDsl.g:805:2: ( ( rule__ServicioRest__Group_7_1__0 ) )
                    {
                    // InternalMyDsl.g:805:2: ( ( rule__ServicioRest__Group_7_1__0 ) )
                    // InternalMyDsl.g:806:3: ( rule__ServicioRest__Group_7_1__0 )
                    {
                     before(grammarAccess.getServicioRestAccess().getGroup_7_1()); 
                    // InternalMyDsl.g:807:3: ( rule__ServicioRest__Group_7_1__0 )
                    // InternalMyDsl.g:807:4: rule__ServicioRest__Group_7_1__0
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
    // InternalMyDsl.g:815:1: rule__Parametro__Alternatives : ( ( ruleQueryParam ) | ( rulePathParam ) );
    public final void rule__Parametro__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:819:1: ( ( ruleQueryParam ) | ( rulePathParam ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==48) ) {
                alt5=1;
            }
            else if ( (LA5_0==49) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:820:2: ( ruleQueryParam )
                    {
                    // InternalMyDsl.g:820:2: ( ruleQueryParam )
                    // InternalMyDsl.g:821:3: ruleQueryParam
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
                    // InternalMyDsl.g:826:2: ( rulePathParam )
                    {
                    // InternalMyDsl.g:826:2: ( rulePathParam )
                    // InternalMyDsl.g:827:3: rulePathParam
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


    // $ANTLR start "rule__Response__Alternatives_4"
    // InternalMyDsl.g:836:1: rule__Response__Alternatives_4 : ( ( ( rule__Response__TipoEntidadAssignment_4_0 ) ) | ( ( rule__Response__TipoPrimitivoAssignment_4_1 ) ) );
    public final void rule__Response__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:840:1: ( ( ( rule__Response__TipoEntidadAssignment_4_0 ) ) | ( ( rule__Response__TipoPrimitivoAssignment_4_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=15 && LA6_0<=17)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:841:2: ( ( rule__Response__TipoEntidadAssignment_4_0 ) )
                    {
                    // InternalMyDsl.g:841:2: ( ( rule__Response__TipoEntidadAssignment_4_0 ) )
                    // InternalMyDsl.g:842:3: ( rule__Response__TipoEntidadAssignment_4_0 )
                    {
                     before(grammarAccess.getResponseAccess().getTipoEntidadAssignment_4_0()); 
                    // InternalMyDsl.g:843:3: ( rule__Response__TipoEntidadAssignment_4_0 )
                    // InternalMyDsl.g:843:4: rule__Response__TipoEntidadAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Response__TipoEntidadAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getResponseAccess().getTipoEntidadAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:847:2: ( ( rule__Response__TipoPrimitivoAssignment_4_1 ) )
                    {
                    // InternalMyDsl.g:847:2: ( ( rule__Response__TipoPrimitivoAssignment_4_1 ) )
                    // InternalMyDsl.g:848:3: ( rule__Response__TipoPrimitivoAssignment_4_1 )
                    {
                     before(grammarAccess.getResponseAccess().getTipoPrimitivoAssignment_4_1()); 
                    // InternalMyDsl.g:849:3: ( rule__Response__TipoPrimitivoAssignment_4_1 )
                    // InternalMyDsl.g:849:4: rule__Response__TipoPrimitivoAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Response__TipoPrimitivoAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getResponseAccess().getTipoPrimitivoAssignment_4_1()); 

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
    // $ANTLR end "rule__Response__Alternatives_4"


    // $ANTLR start "rule__Request__Alternatives_4"
    // InternalMyDsl.g:857:1: rule__Request__Alternatives_4 : ( ( ( rule__Request__TipoEntidadAssignment_4_0 ) ) | ( ( rule__Request__TipoPrimitivoAssignment_4_1 ) ) );
    public final void rule__Request__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:861:1: ( ( ( rule__Request__TipoEntidadAssignment_4_0 ) ) | ( ( rule__Request__TipoPrimitivoAssignment_4_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=15 && LA7_0<=17)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:862:2: ( ( rule__Request__TipoEntidadAssignment_4_0 ) )
                    {
                    // InternalMyDsl.g:862:2: ( ( rule__Request__TipoEntidadAssignment_4_0 ) )
                    // InternalMyDsl.g:863:3: ( rule__Request__TipoEntidadAssignment_4_0 )
                    {
                     before(grammarAccess.getRequestAccess().getTipoEntidadAssignment_4_0()); 
                    // InternalMyDsl.g:864:3: ( rule__Request__TipoEntidadAssignment_4_0 )
                    // InternalMyDsl.g:864:4: rule__Request__TipoEntidadAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Request__TipoEntidadAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRequestAccess().getTipoEntidadAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:868:2: ( ( rule__Request__TipoPrimitivoAssignment_4_1 ) )
                    {
                    // InternalMyDsl.g:868:2: ( ( rule__Request__TipoPrimitivoAssignment_4_1 ) )
                    // InternalMyDsl.g:869:3: ( rule__Request__TipoPrimitivoAssignment_4_1 )
                    {
                     before(grammarAccess.getRequestAccess().getTipoPrimitivoAssignment_4_1()); 
                    // InternalMyDsl.g:870:3: ( rule__Request__TipoPrimitivoAssignment_4_1 )
                    // InternalMyDsl.g:870:4: rule__Request__TipoPrimitivoAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Request__TipoPrimitivoAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRequestAccess().getTipoPrimitivoAssignment_4_1()); 

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
    // $ANTLR end "rule__Request__Alternatives_4"


    // $ANTLR start "rule__DatoPrimitivo__Alternatives"
    // InternalMyDsl.g:878:1: rule__DatoPrimitivo__Alternatives : ( ( ruleMyNumeric ) | ( ruleMyString ) | ( ruleMyBoolean ) );
    public final void rule__DatoPrimitivo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:882:1: ( ( ruleMyNumeric ) | ( ruleMyString ) | ( ruleMyBoolean ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 13:
            case 14:
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
                    // InternalMyDsl.g:883:2: ( ruleMyNumeric )
                    {
                    // InternalMyDsl.g:883:2: ( ruleMyNumeric )
                    // InternalMyDsl.g:884:3: ruleMyNumeric
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getMyNumericParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMyNumeric();

                    state._fsp--;

                     after(grammarAccess.getDatoPrimitivoAccess().getMyNumericParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:889:2: ( ruleMyString )
                    {
                    // InternalMyDsl.g:889:2: ( ruleMyString )
                    // InternalMyDsl.g:890:3: ruleMyString
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getMyStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMyString();

                    state._fsp--;

                     after(grammarAccess.getDatoPrimitivoAccess().getMyStringParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:895:2: ( ruleMyBoolean )
                    {
                    // InternalMyDsl.g:895:2: ( ruleMyBoolean )
                    // InternalMyDsl.g:896:3: ruleMyBoolean
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getMyBooleanParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMyBoolean();

                    state._fsp--;

                     after(grammarAccess.getDatoPrimitivoAccess().getMyBooleanParserRuleCall_2()); 

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
    // $ANTLR end "rule__DatoPrimitivo__Alternatives"


    // $ANTLR start "rule__Mapping__Alternatives_8"
    // InternalMyDsl.g:905:1: rule__Mapping__Alternatives_8 : ( ( ( rule__Mapping__Group_8_0__0 ) ) | ( ( rule__Mapping__DatoprimitivoAssignment_8_1 ) ) );
    public final void rule__Mapping__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:909:1: ( ( ( rule__Mapping__Group_8_0__0 ) ) | ( ( rule__Mapping__DatoprimitivoAssignment_8_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==62) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_ID)||(LA9_0>=13 && LA9_0<=14)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:910:2: ( ( rule__Mapping__Group_8_0__0 ) )
                    {
                    // InternalMyDsl.g:910:2: ( ( rule__Mapping__Group_8_0__0 ) )
                    // InternalMyDsl.g:911:3: ( rule__Mapping__Group_8_0__0 )
                    {
                     before(grammarAccess.getMappingAccess().getGroup_8_0()); 
                    // InternalMyDsl.g:912:3: ( rule__Mapping__Group_8_0__0 )
                    // InternalMyDsl.g:912:4: rule__Mapping__Group_8_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mapping__Group_8_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMappingAccess().getGroup_8_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:916:2: ( ( rule__Mapping__DatoprimitivoAssignment_8_1 ) )
                    {
                    // InternalMyDsl.g:916:2: ( ( rule__Mapping__DatoprimitivoAssignment_8_1 ) )
                    // InternalMyDsl.g:917:3: ( rule__Mapping__DatoprimitivoAssignment_8_1 )
                    {
                     before(grammarAccess.getMappingAccess().getDatoprimitivoAssignment_8_1()); 
                    // InternalMyDsl.g:918:3: ( rule__Mapping__DatoprimitivoAssignment_8_1 )
                    // InternalMyDsl.g:918:4: rule__Mapping__DatoprimitivoAssignment_8_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mapping__DatoprimitivoAssignment_8_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMappingAccess().getDatoprimitivoAssignment_8_1()); 

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
    // $ANTLR end "rule__Mapping__Alternatives_8"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalMyDsl.g:926:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:930:1: ( ( 'true' ) | ( 'false' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            else if ( (LA10_0==14) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:931:2: ( 'true' )
                    {
                    // InternalMyDsl.g:931:2: ( 'true' )
                    // InternalMyDsl.g:932:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:937:2: ( 'false' )
                    {
                    // InternalMyDsl.g:937:2: ( 'false' )
                    // InternalMyDsl.g:938:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:947:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:951:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:952:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:952:2: ( RULE_STRING )
                    // InternalMyDsl.g:953:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:958:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:958:2: ( RULE_ID )
                    // InternalMyDsl.g:959:3: RULE_ID
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


    // $ANTLR start "rule__TipoAtributo__Alternatives"
    // InternalMyDsl.g:968:1: rule__TipoAtributo__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) );
    public final void rule__TipoAtributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:972:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt12=1;
                }
                break;
            case 16:
                {
                alt12=2;
                }
                break;
            case 17:
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
                    // InternalMyDsl.g:973:2: ( ( 'string' ) )
                    {
                    // InternalMyDsl.g:973:2: ( ( 'string' ) )
                    // InternalMyDsl.g:974:3: ( 'string' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:975:3: ( 'string' )
                    // InternalMyDsl.g:975:4: 'string'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:979:2: ( ( 'int' ) )
                    {
                    // InternalMyDsl.g:979:2: ( ( 'int' ) )
                    // InternalMyDsl.g:980:3: ( 'int' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:981:3: ( 'int' )
                    // InternalMyDsl.g:981:4: 'int'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:985:2: ( ( 'boolean' ) )
                    {
                    // InternalMyDsl.g:985:2: ( ( 'boolean' ) )
                    // InternalMyDsl.g:986:3: ( 'boolean' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:987:3: ( 'boolean' )
                    // InternalMyDsl.g:987:4: 'boolean'
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
    // InternalMyDsl.g:995:1: rule__Mockaroo__Alternatives : ( ( ( 'FirstNameType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CityType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'LatitudeType' ) ) | ( ( 'LongitudType' ) ) | ( ( 'RowNumberType' ) ) | ( ( 'BooleanType' ) ) );
    public final void rule__Mockaroo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:999:1: ( ( ( 'FirstNameType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CityType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'LatitudeType' ) ) | ( ( 'LongitudType' ) ) | ( ( 'RowNumberType' ) ) | ( ( 'BooleanType' ) ) )
            int alt13=14;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt13=1;
                }
                break;
            case 19:
                {
                alt13=2;
                }
                break;
            case 20:
                {
                alt13=3;
                }
                break;
            case 21:
                {
                alt13=4;
                }
                break;
            case 22:
                {
                alt13=5;
                }
                break;
            case 23:
                {
                alt13=6;
                }
                break;
            case 24:
                {
                alt13=7;
                }
                break;
            case 25:
                {
                alt13=8;
                }
                break;
            case 26:
                {
                alt13=9;
                }
                break;
            case 27:
                {
                alt13=10;
                }
                break;
            case 28:
                {
                alt13=11;
                }
                break;
            case 29:
                {
                alt13=12;
                }
                break;
            case 30:
                {
                alt13=13;
                }
                break;
            case 31:
                {
                alt13=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1000:2: ( ( 'FirstNameType' ) )
                    {
                    // InternalMyDsl.g:1000:2: ( ( 'FirstNameType' ) )
                    // InternalMyDsl.g:1001:3: ( 'FirstNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1002:3: ( 'FirstNameType' )
                    // InternalMyDsl.g:1002:4: 'FirstNameType'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1006:2: ( ( 'LastNameType' ) )
                    {
                    // InternalMyDsl.g:1006:2: ( ( 'LastNameType' ) )
                    // InternalMyDsl.g:1007:3: ( 'LastNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1008:3: ( 'LastNameType' )
                    // InternalMyDsl.g:1008:4: 'LastNameType'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1012:2: ( ( 'FamilyNameType' ) )
                    {
                    // InternalMyDsl.g:1012:2: ( ( 'FamilyNameType' ) )
                    // InternalMyDsl.g:1013:3: ( 'FamilyNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1014:3: ( 'FamilyNameType' )
                    // InternalMyDsl.g:1014:4: 'FamilyNameType'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1018:2: ( ( 'FullNameType' ) )
                    {
                    // InternalMyDsl.g:1018:2: ( ( 'FullNameType' ) )
                    // InternalMyDsl.g:1019:3: ( 'FullNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1020:3: ( 'FullNameType' )
                    // InternalMyDsl.g:1020:4: 'FullNameType'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1024:2: ( ( 'GenderType' ) )
                    {
                    // InternalMyDsl.g:1024:2: ( ( 'GenderType' ) )
                    // InternalMyDsl.g:1025:3: ( 'GenderType' )
                    {
                     before(grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:1026:3: ( 'GenderType' )
                    // InternalMyDsl.g:1026:4: 'GenderType'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1030:2: ( ( 'EmailAddressType' ) )
                    {
                    // InternalMyDsl.g:1030:2: ( ( 'EmailAddressType' ) )
                    // InternalMyDsl.g:1031:3: ( 'EmailAddressType' )
                    {
                     before(grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:1032:3: ( 'EmailAddressType' )
                    // InternalMyDsl.g:1032:4: 'EmailAddressType'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1036:2: ( ( 'PhoneType' ) )
                    {
                    // InternalMyDsl.g:1036:2: ( ( 'PhoneType' ) )
                    // InternalMyDsl.g:1037:3: ( 'PhoneType' )
                    {
                     before(grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:1038:3: ( 'PhoneType' )
                    // InternalMyDsl.g:1038:4: 'PhoneType'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1042:2: ( ( 'CountryType' ) )
                    {
                    // InternalMyDsl.g:1042:2: ( ( 'CountryType' ) )
                    // InternalMyDsl.g:1043:3: ( 'CountryType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7()); 
                    // InternalMyDsl.g:1044:3: ( 'CountryType' )
                    // InternalMyDsl.g:1044:4: 'CountryType'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1048:2: ( ( 'CityType' ) )
                    {
                    // InternalMyDsl.g:1048:2: ( ( 'CityType' ) )
                    // InternalMyDsl.g:1049:3: ( 'CityType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8()); 
                    // InternalMyDsl.g:1050:3: ( 'CityType' )
                    // InternalMyDsl.g:1050:4: 'CityType'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:1054:2: ( ( 'CountryCodeType' ) )
                    {
                    // InternalMyDsl.g:1054:2: ( ( 'CountryCodeType' ) )
                    // InternalMyDsl.g:1055:3: ( 'CountryCodeType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9()); 
                    // InternalMyDsl.g:1056:3: ( 'CountryCodeType' )
                    // InternalMyDsl.g:1056:4: 'CountryCodeType'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:1060:2: ( ( 'LatitudeType' ) )
                    {
                    // InternalMyDsl.g:1060:2: ( ( 'LatitudeType' ) )
                    // InternalMyDsl.g:1061:3: ( 'LatitudeType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10()); 
                    // InternalMyDsl.g:1062:3: ( 'LatitudeType' )
                    // InternalMyDsl.g:1062:4: 'LatitudeType'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:1066:2: ( ( 'LongitudType' ) )
                    {
                    // InternalMyDsl.g:1066:2: ( ( 'LongitudType' ) )
                    // InternalMyDsl.g:1067:3: ( 'LongitudType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11()); 
                    // InternalMyDsl.g:1068:3: ( 'LongitudType' )
                    // InternalMyDsl.g:1068:4: 'LongitudType'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:1072:2: ( ( 'RowNumberType' ) )
                    {
                    // InternalMyDsl.g:1072:2: ( ( 'RowNumberType' ) )
                    // InternalMyDsl.g:1073:3: ( 'RowNumberType' )
                    {
                     before(grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 
                    // InternalMyDsl.g:1074:3: ( 'RowNumberType' )
                    // InternalMyDsl.g:1074:4: 'RowNumberType'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:1078:2: ( ( 'BooleanType' ) )
                    {
                    // InternalMyDsl.g:1078:2: ( ( 'BooleanType' ) )
                    // InternalMyDsl.g:1079:3: ( 'BooleanType' )
                    {
                     before(grammarAccess.getMockarooAccess().getBooleanTypeEnumLiteralDeclaration_13()); 
                    // InternalMyDsl.g:1080:3: ( 'BooleanType' )
                    // InternalMyDsl.g:1080:4: 'BooleanType'
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
    // InternalMyDsl.g:1088:1: rule__TipoMetodoRest__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__TipoMetodoRest__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1092:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt14=1;
                }
                break;
            case 33:
                {
                alt14=2;
                }
                break;
            case 34:
                {
                alt14=3;
                }
                break;
            case 35:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1093:2: ( ( 'GET' ) )
                    {
                    // InternalMyDsl.g:1093:2: ( ( 'GET' ) )
                    // InternalMyDsl.g:1094:3: ( 'GET' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1095:3: ( 'GET' )
                    // InternalMyDsl.g:1095:4: 'GET'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1099:2: ( ( 'POST' ) )
                    {
                    // InternalMyDsl.g:1099:2: ( ( 'POST' ) )
                    // InternalMyDsl.g:1100:3: ( 'POST' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1101:3: ( 'POST' )
                    // InternalMyDsl.g:1101:4: 'POST'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1105:2: ( ( 'PUT' ) )
                    {
                    // InternalMyDsl.g:1105:2: ( ( 'PUT' ) )
                    // InternalMyDsl.g:1106:3: ( 'PUT' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1107:3: ( 'PUT' )
                    // InternalMyDsl.g:1107:4: 'PUT'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1111:2: ( ( 'DELETE' ) )
                    {
                    // InternalMyDsl.g:1111:2: ( ( 'DELETE' ) )
                    // InternalMyDsl.g:1112:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1113:3: ( 'DELETE' )
                    // InternalMyDsl.g:1113:4: 'DELETE'
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


    // $ANTLR start "rule__Api__Group__0"
    // InternalMyDsl.g:1121:1: rule__Api__Group__0 : rule__Api__Group__0__Impl rule__Api__Group__1 ;
    public final void rule__Api__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1125:1: ( rule__Api__Group__0__Impl rule__Api__Group__1 )
            // InternalMyDsl.g:1126:2: rule__Api__Group__0__Impl rule__Api__Group__1
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
    // InternalMyDsl.g:1133:1: rule__Api__Group__0__Impl : ( () ) ;
    public final void rule__Api__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1137:1: ( ( () ) )
            // InternalMyDsl.g:1138:1: ( () )
            {
            // InternalMyDsl.g:1138:1: ( () )
            // InternalMyDsl.g:1139:2: ()
            {
             before(grammarAccess.getApiAccess().getApiAction_0()); 
            // InternalMyDsl.g:1140:2: ()
            // InternalMyDsl.g:1140:3: 
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
    // InternalMyDsl.g:1148:1: rule__Api__Group__1 : rule__Api__Group__1__Impl rule__Api__Group__2 ;
    public final void rule__Api__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1152:1: ( rule__Api__Group__1__Impl rule__Api__Group__2 )
            // InternalMyDsl.g:1153:2: rule__Api__Group__1__Impl rule__Api__Group__2
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
    // InternalMyDsl.g:1160:1: rule__Api__Group__1__Impl : ( 'apiURL' ) ;
    public final void rule__Api__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1164:1: ( ( 'apiURL' ) )
            // InternalMyDsl.g:1165:1: ( 'apiURL' )
            {
            // InternalMyDsl.g:1165:1: ( 'apiURL' )
            // InternalMyDsl.g:1166:2: 'apiURL'
            {
             before(grammarAccess.getApiAccess().getApiURLKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:1175:1: rule__Api__Group__2 : rule__Api__Group__2__Impl rule__Api__Group__3 ;
    public final void rule__Api__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1179:1: ( rule__Api__Group__2__Impl rule__Api__Group__3 )
            // InternalMyDsl.g:1180:2: rule__Api__Group__2__Impl rule__Api__Group__3
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
    // InternalMyDsl.g:1187:1: rule__Api__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__Api__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1191:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1192:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1192:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1193:2: RULE_EQUAL
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
    // InternalMyDsl.g:1202:1: rule__Api__Group__3 : rule__Api__Group__3__Impl rule__Api__Group__4 ;
    public final void rule__Api__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1206:1: ( rule__Api__Group__3__Impl rule__Api__Group__4 )
            // InternalMyDsl.g:1207:2: rule__Api__Group__3__Impl rule__Api__Group__4
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
    // InternalMyDsl.g:1214:1: rule__Api__Group__3__Impl : ( ( rule__Api__UrlAssignment_3 ) ) ;
    public final void rule__Api__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1218:1: ( ( ( rule__Api__UrlAssignment_3 ) ) )
            // InternalMyDsl.g:1219:1: ( ( rule__Api__UrlAssignment_3 ) )
            {
            // InternalMyDsl.g:1219:1: ( ( rule__Api__UrlAssignment_3 ) )
            // InternalMyDsl.g:1220:2: ( rule__Api__UrlAssignment_3 )
            {
             before(grammarAccess.getApiAccess().getUrlAssignment_3()); 
            // InternalMyDsl.g:1221:2: ( rule__Api__UrlAssignment_3 )
            // InternalMyDsl.g:1221:3: rule__Api__UrlAssignment_3
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
    // InternalMyDsl.g:1229:1: rule__Api__Group__4 : rule__Api__Group__4__Impl rule__Api__Group__5 ;
    public final void rule__Api__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1233:1: ( rule__Api__Group__4__Impl rule__Api__Group__5 )
            // InternalMyDsl.g:1234:2: rule__Api__Group__4__Impl rule__Api__Group__5
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
    // InternalMyDsl.g:1241:1: rule__Api__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Api__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1245:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1246:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1246:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1247:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:1256:1: rule__Api__Group__5 : rule__Api__Group__5__Impl rule__Api__Group__6 ;
    public final void rule__Api__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1260:1: ( rule__Api__Group__5__Impl rule__Api__Group__6 )
            // InternalMyDsl.g:1261:2: rule__Api__Group__5__Impl rule__Api__Group__6
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
    // InternalMyDsl.g:1268:1: rule__Api__Group__5__Impl : ( ( rule__Api__EntidadesAssignment_5 )* ) ;
    public final void rule__Api__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1272:1: ( ( ( rule__Api__EntidadesAssignment_5 )* ) )
            // InternalMyDsl.g:1273:1: ( ( rule__Api__EntidadesAssignment_5 )* )
            {
            // InternalMyDsl.g:1273:1: ( ( rule__Api__EntidadesAssignment_5 )* )
            // InternalMyDsl.g:1274:2: ( rule__Api__EntidadesAssignment_5 )*
            {
             before(grammarAccess.getApiAccess().getEntidadesAssignment_5()); 
            // InternalMyDsl.g:1275:2: ( rule__Api__EntidadesAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==37||LA15_0==45) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1275:3: rule__Api__EntidadesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Api__EntidadesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMyDsl.g:1283:1: rule__Api__Group__6 : rule__Api__Group__6__Impl rule__Api__Group__7 ;
    public final void rule__Api__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1287:1: ( rule__Api__Group__6__Impl rule__Api__Group__7 )
            // InternalMyDsl.g:1288:2: rule__Api__Group__6__Impl rule__Api__Group__7
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
    // InternalMyDsl.g:1295:1: rule__Api__Group__6__Impl : ( ( rule__Api__PrimitivetypesAssignment_6 )* ) ;
    public final void rule__Api__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1299:1: ( ( ( rule__Api__PrimitivetypesAssignment_6 )* ) )
            // InternalMyDsl.g:1300:1: ( ( rule__Api__PrimitivetypesAssignment_6 )* )
            {
            // InternalMyDsl.g:1300:1: ( ( rule__Api__PrimitivetypesAssignment_6 )* )
            // InternalMyDsl.g:1301:2: ( rule__Api__PrimitivetypesAssignment_6 )*
            {
             before(grammarAccess.getApiAccess().getPrimitivetypesAssignment_6()); 
            // InternalMyDsl.g:1302:2: ( rule__Api__PrimitivetypesAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=15 && LA16_0<=17)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1302:3: rule__Api__PrimitivetypesAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Api__PrimitivetypesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalMyDsl.g:1310:1: rule__Api__Group__7 : rule__Api__Group__7__Impl rule__Api__Group__8 ;
    public final void rule__Api__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1314:1: ( rule__Api__Group__7__Impl rule__Api__Group__8 )
            // InternalMyDsl.g:1315:2: rule__Api__Group__7__Impl rule__Api__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Api__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__8();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1322:1: rule__Api__Group__7__Impl : ( ( rule__Api__ServiciosRestAssignment_7 )* ) ;
    public final void rule__Api__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1326:1: ( ( ( rule__Api__ServiciosRestAssignment_7 )* ) )
            // InternalMyDsl.g:1327:1: ( ( rule__Api__ServiciosRestAssignment_7 )* )
            {
            // InternalMyDsl.g:1327:1: ( ( rule__Api__ServiciosRestAssignment_7 )* )
            // InternalMyDsl.g:1328:2: ( rule__Api__ServiciosRestAssignment_7 )*
            {
             before(grammarAccess.getApiAccess().getServiciosRestAssignment_7()); 
            // InternalMyDsl.g:1329:2: ( rule__Api__ServiciosRestAssignment_7 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=32 && LA17_0<=35)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1329:3: rule__Api__ServiciosRestAssignment_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Api__ServiciosRestAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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


    // $ANTLR start "rule__Api__Group__8"
    // InternalMyDsl.g:1337:1: rule__Api__Group__8 : rule__Api__Group__8__Impl ;
    public final void rule__Api__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1341:1: ( rule__Api__Group__8__Impl )
            // InternalMyDsl.g:1342:2: rule__Api__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Api__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__8"


    // $ANTLR start "rule__Api__Group__8__Impl"
    // InternalMyDsl.g:1348:1: rule__Api__Group__8__Impl : ( ( rule__Api__TestsAssignment_8 )* ) ;
    public final void rule__Api__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1352:1: ( ( ( rule__Api__TestsAssignment_8 )* ) )
            // InternalMyDsl.g:1353:1: ( ( rule__Api__TestsAssignment_8 )* )
            {
            // InternalMyDsl.g:1353:1: ( ( rule__Api__TestsAssignment_8 )* )
            // InternalMyDsl.g:1354:2: ( rule__Api__TestsAssignment_8 )*
            {
             before(grammarAccess.getApiAccess().getTestsAssignment_8()); 
            // InternalMyDsl.g:1355:2: ( rule__Api__TestsAssignment_8 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==53) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1355:3: rule__Api__TestsAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Api__TestsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getApiAccess().getTestsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__8__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__0"
    // InternalMyDsl.g:1364:1: rule__SimpleEntity__Group__0 : rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 ;
    public final void rule__SimpleEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1368:1: ( rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 )
            // InternalMyDsl.g:1369:2: rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1376:1: rule__SimpleEntity__Group__0__Impl : ( 'SimpleEntity' ) ;
    public final void rule__SimpleEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1380:1: ( ( 'SimpleEntity' ) )
            // InternalMyDsl.g:1381:1: ( 'SimpleEntity' )
            {
            // InternalMyDsl.g:1381:1: ( 'SimpleEntity' )
            // InternalMyDsl.g:1382:2: 'SimpleEntity'
            {
             before(grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:1391:1: rule__SimpleEntity__Group__1 : rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 ;
    public final void rule__SimpleEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1395:1: ( rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 )
            // InternalMyDsl.g:1396:2: rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1403:1: rule__SimpleEntity__Group__1__Impl : ( ( rule__SimpleEntity__NameAssignment_1 ) ) ;
    public final void rule__SimpleEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1407:1: ( ( ( rule__SimpleEntity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1408:1: ( ( rule__SimpleEntity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1408:1: ( ( rule__SimpleEntity__NameAssignment_1 ) )
            // InternalMyDsl.g:1409:2: ( rule__SimpleEntity__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1410:2: ( rule__SimpleEntity__NameAssignment_1 )
            // InternalMyDsl.g:1410:3: rule__SimpleEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleEntityAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:1418:1: rule__SimpleEntity__Group__2 : rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 ;
    public final void rule__SimpleEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1422:1: ( rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 )
            // InternalMyDsl.g:1423:2: rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1430:1: rule__SimpleEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__SimpleEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1434:1: ( ( '{' ) )
            // InternalMyDsl.g:1435:1: ( '{' )
            {
            // InternalMyDsl.g:1435:1: ( '{' )
            // InternalMyDsl.g:1436:2: '{'
            {
             before(grammarAccess.getSimpleEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:1445:1: rule__SimpleEntity__Group__3 : rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 ;
    public final void rule__SimpleEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1449:1: ( rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 )
            // InternalMyDsl.g:1450:2: rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1457:1: rule__SimpleEntity__Group__3__Impl : ( ( rule__SimpleEntity__AtributosAssignment_3 )* ) ;
    public final void rule__SimpleEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1461:1: ( ( ( rule__SimpleEntity__AtributosAssignment_3 )* ) )
            // InternalMyDsl.g:1462:1: ( ( rule__SimpleEntity__AtributosAssignment_3 )* )
            {
            // InternalMyDsl.g:1462:1: ( ( rule__SimpleEntity__AtributosAssignment_3 )* )
            // InternalMyDsl.g:1463:2: ( rule__SimpleEntity__AtributosAssignment_3 )*
            {
             before(grammarAccess.getSimpleEntityAccess().getAtributosAssignment_3()); 
            // InternalMyDsl.g:1464:2: ( rule__SimpleEntity__AtributosAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=15 && LA19_0<=17)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1464:3: rule__SimpleEntity__AtributosAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SimpleEntity__AtributosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMyDsl.g:1472:1: rule__SimpleEntity__Group__4 : rule__SimpleEntity__Group__4__Impl ;
    public final void rule__SimpleEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1476:1: ( rule__SimpleEntity__Group__4__Impl )
            // InternalMyDsl.g:1477:2: rule__SimpleEntity__Group__4__Impl
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
    // InternalMyDsl.g:1483:1: rule__SimpleEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__SimpleEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1487:1: ( ( '}' ) )
            // InternalMyDsl.g:1488:1: ( '}' )
            {
            // InternalMyDsl.g:1488:1: ( '}' )
            // InternalMyDsl.g:1489:2: '}'
            {
             before(grammarAccess.getSimpleEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,39,FOLLOW_2); 
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


    // $ANTLR start "rule__AtributoMocka__Group__0"
    // InternalMyDsl.g:1499:1: rule__AtributoMocka__Group__0 : rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1 ;
    public final void rule__AtributoMocka__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1503:1: ( rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1 )
            // InternalMyDsl.g:1504:2: rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1511:1: rule__AtributoMocka__Group__0__Impl : ( ( rule__AtributoMocka__TipoAssignment_0 ) ) ;
    public final void rule__AtributoMocka__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1515:1: ( ( ( rule__AtributoMocka__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:1516:1: ( ( rule__AtributoMocka__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:1516:1: ( ( rule__AtributoMocka__TipoAssignment_0 ) )
            // InternalMyDsl.g:1517:2: ( rule__AtributoMocka__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:1518:2: ( rule__AtributoMocka__TipoAssignment_0 )
            // InternalMyDsl.g:1518:3: rule__AtributoMocka__TipoAssignment_0
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
    // InternalMyDsl.g:1526:1: rule__AtributoMocka__Group__1 : rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2 ;
    public final void rule__AtributoMocka__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1530:1: ( rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2 )
            // InternalMyDsl.g:1531:2: rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1538:1: rule__AtributoMocka__Group__1__Impl : ( ( rule__AtributoMocka__NameAssignment_1 ) ) ;
    public final void rule__AtributoMocka__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1542:1: ( ( ( rule__AtributoMocka__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1543:1: ( ( rule__AtributoMocka__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1543:1: ( ( rule__AtributoMocka__NameAssignment_1 ) )
            // InternalMyDsl.g:1544:2: ( rule__AtributoMocka__NameAssignment_1 )
            {
             before(grammarAccess.getAtributoMockaAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1545:2: ( rule__AtributoMocka__NameAssignment_1 )
            // InternalMyDsl.g:1545:3: rule__AtributoMocka__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:1553:1: rule__AtributoMocka__Group__2 : rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3 ;
    public final void rule__AtributoMocka__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1557:1: ( rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3 )
            // InternalMyDsl.g:1558:2: rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3
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
    // InternalMyDsl.g:1565:1: rule__AtributoMocka__Group__2__Impl : ( ( rule__AtributoMocka__Group_2__0 ) ) ;
    public final void rule__AtributoMocka__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1569:1: ( ( ( rule__AtributoMocka__Group_2__0 ) ) )
            // InternalMyDsl.g:1570:1: ( ( rule__AtributoMocka__Group_2__0 ) )
            {
            // InternalMyDsl.g:1570:1: ( ( rule__AtributoMocka__Group_2__0 ) )
            // InternalMyDsl.g:1571:2: ( rule__AtributoMocka__Group_2__0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getGroup_2()); 
            // InternalMyDsl.g:1572:2: ( rule__AtributoMocka__Group_2__0 )
            // InternalMyDsl.g:1572:3: rule__AtributoMocka__Group_2__0
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
    // InternalMyDsl.g:1580:1: rule__AtributoMocka__Group__3 : rule__AtributoMocka__Group__3__Impl ;
    public final void rule__AtributoMocka__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1584:1: ( rule__AtributoMocka__Group__3__Impl )
            // InternalMyDsl.g:1585:2: rule__AtributoMocka__Group__3__Impl
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
    // InternalMyDsl.g:1591:1: rule__AtributoMocka__Group__3__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoMocka__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1595:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1596:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1596:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1597:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:1607:1: rule__AtributoMocka__Group_2__0 : rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1 ;
    public final void rule__AtributoMocka__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1611:1: ( rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1 )
            // InternalMyDsl.g:1612:2: rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1619:1: rule__AtributoMocka__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtributoMocka__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1623:1: ( ( '(' ) )
            // InternalMyDsl.g:1624:1: ( '(' )
            {
            // InternalMyDsl.g:1624:1: ( '(' )
            // InternalMyDsl.g:1625:2: '('
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
    // InternalMyDsl.g:1634:1: rule__AtributoMocka__Group_2__1 : rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2 ;
    public final void rule__AtributoMocka__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1638:1: ( rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2 )
            // InternalMyDsl.g:1639:2: rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1646:1: rule__AtributoMocka__Group_2__1__Impl : ( ( rule__AtributoMocka__Alternatives_2_1 ) ) ;
    public final void rule__AtributoMocka__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1650:1: ( ( ( rule__AtributoMocka__Alternatives_2_1 ) ) )
            // InternalMyDsl.g:1651:1: ( ( rule__AtributoMocka__Alternatives_2_1 ) )
            {
            // InternalMyDsl.g:1651:1: ( ( rule__AtributoMocka__Alternatives_2_1 ) )
            // InternalMyDsl.g:1652:2: ( rule__AtributoMocka__Alternatives_2_1 )
            {
             before(grammarAccess.getAtributoMockaAccess().getAlternatives_2_1()); 
            // InternalMyDsl.g:1653:2: ( rule__AtributoMocka__Alternatives_2_1 )
            // InternalMyDsl.g:1653:3: rule__AtributoMocka__Alternatives_2_1
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
    // InternalMyDsl.g:1661:1: rule__AtributoMocka__Group_2__2 : rule__AtributoMocka__Group_2__2__Impl ;
    public final void rule__AtributoMocka__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1665:1: ( rule__AtributoMocka__Group_2__2__Impl )
            // InternalMyDsl.g:1666:2: rule__AtributoMocka__Group_2__2__Impl
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
    // InternalMyDsl.g:1672:1: rule__AtributoMocka__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtributoMocka__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1676:1: ( ( ')' ) )
            // InternalMyDsl.g:1677:1: ( ')' )
            {
            // InternalMyDsl.g:1677:1: ( ')' )
            // InternalMyDsl.g:1678:2: ')'
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
    // InternalMyDsl.g:1688:1: rule__AtributoMocka__Group_2_1_0__0 : rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1 ;
    public final void rule__AtributoMocka__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1692:1: ( rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1 )
            // InternalMyDsl.g:1693:2: rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1
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
    // InternalMyDsl.g:1700:1: rule__AtributoMocka__Group_2_1_0__0__Impl : ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1704:1: ( ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) ) )
            // InternalMyDsl.g:1705:1: ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) )
            {
            // InternalMyDsl.g:1705:1: ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) )
            // InternalMyDsl.g:1706:2: ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyAssignment_2_1_0_0()); 
            // InternalMyDsl.g:1707:2: ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 )
            // InternalMyDsl.g:1707:3: rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0
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
    // InternalMyDsl.g:1715:1: rule__AtributoMocka__Group_2_1_0__1 : rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2 ;
    public final void rule__AtributoMocka__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1719:1: ( rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2 )
            // InternalMyDsl.g:1720:2: rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1727:1: rule__AtributoMocka__Group_2_1_0__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__AtributoMocka__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1731:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1732:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1732:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1733:2: RULE_EQUAL
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
    // InternalMyDsl.g:1742:1: rule__AtributoMocka__Group_2_1_0__2 : rule__AtributoMocka__Group_2_1_0__2__Impl ;
    public final void rule__AtributoMocka__Group_2_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1746:1: ( rule__AtributoMocka__Group_2_1_0__2__Impl )
            // InternalMyDsl.g:1747:2: rule__AtributoMocka__Group_2_1_0__2__Impl
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
    // InternalMyDsl.g:1753:1: rule__AtributoMocka__Group_2_1_0__2__Impl : ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1757:1: ( ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) ) )
            // InternalMyDsl.g:1758:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) )
            {
            // InternalMyDsl.g:1758:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) )
            // InternalMyDsl.g:1759:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 )
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_0_2()); 
            // InternalMyDsl.g:1760:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 )
            // InternalMyDsl.g:1760:3: rule__AtributoMocka__MockTypeAssignment_2_1_0_2
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
    // InternalMyDsl.g:1769:1: rule__AtributoMocka__Group_2_1_1__0 : rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1 ;
    public final void rule__AtributoMocka__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1773:1: ( rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1 )
            // InternalMyDsl.g:1774:2: rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1
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
    // InternalMyDsl.g:1781:1: rule__AtributoMocka__Group_2_1_1__0__Impl : ( 'mockType' ) ;
    public final void rule__AtributoMocka__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1785:1: ( ( 'mockType' ) )
            // InternalMyDsl.g:1786:1: ( 'mockType' )
            {
            // InternalMyDsl.g:1786:1: ( 'mockType' )
            // InternalMyDsl.g:1787:2: 'mockType'
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
    // InternalMyDsl.g:1796:1: rule__AtributoMocka__Group_2_1_1__1 : rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2 ;
    public final void rule__AtributoMocka__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1800:1: ( rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2 )
            // InternalMyDsl.g:1801:2: rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1808:1: rule__AtributoMocka__Group_2_1_1__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__AtributoMocka__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1812:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1813:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1813:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1814:2: RULE_EQUAL
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
    // InternalMyDsl.g:1823:1: rule__AtributoMocka__Group_2_1_1__2 : rule__AtributoMocka__Group_2_1_1__2__Impl ;
    public final void rule__AtributoMocka__Group_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1827:1: ( rule__AtributoMocka__Group_2_1_1__2__Impl )
            // InternalMyDsl.g:1828:2: rule__AtributoMocka__Group_2_1_1__2__Impl
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
    // InternalMyDsl.g:1834:1: rule__AtributoMocka__Group_2_1_1__2__Impl : ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1838:1: ( ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) ) )
            // InternalMyDsl.g:1839:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) )
            {
            // InternalMyDsl.g:1839:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) )
            // InternalMyDsl.g:1840:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 )
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_1_2()); 
            // InternalMyDsl.g:1841:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 )
            // InternalMyDsl.g:1841:3: rule__AtributoMocka__MockTypeAssignment_2_1_1_2
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
    // InternalMyDsl.g:1850:1: rule__AtributoArreglo__Group__0 : rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1 ;
    public final void rule__AtributoArreglo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1854:1: ( rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1 )
            // InternalMyDsl.g:1855:2: rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1862:1: rule__AtributoArreglo__Group__0__Impl : ( ( rule__AtributoArreglo__TipoAssignment_0 ) ) ;
    public final void rule__AtributoArreglo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1866:1: ( ( ( rule__AtributoArreglo__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:1867:1: ( ( rule__AtributoArreglo__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:1867:1: ( ( rule__AtributoArreglo__TipoAssignment_0 ) )
            // InternalMyDsl.g:1868:2: ( rule__AtributoArreglo__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoArregloAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:1869:2: ( rule__AtributoArreglo__TipoAssignment_0 )
            // InternalMyDsl.g:1869:3: rule__AtributoArreglo__TipoAssignment_0
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
    // InternalMyDsl.g:1877:1: rule__AtributoArreglo__Group__1 : rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2 ;
    public final void rule__AtributoArreglo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1881:1: ( rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2 )
            // InternalMyDsl.g:1882:2: rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1889:1: rule__AtributoArreglo__Group__1__Impl : ( '[' ) ;
    public final void rule__AtributoArreglo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1893:1: ( ( '[' ) )
            // InternalMyDsl.g:1894:1: ( '[' )
            {
            // InternalMyDsl.g:1894:1: ( '[' )
            // InternalMyDsl.g:1895:2: '['
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
    // InternalMyDsl.g:1904:1: rule__AtributoArreglo__Group__2 : rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3 ;
    public final void rule__AtributoArreglo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1908:1: ( rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3 )
            // InternalMyDsl.g:1909:2: rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1916:1: rule__AtributoArreglo__Group__2__Impl : ( ']' ) ;
    public final void rule__AtributoArreglo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1920:1: ( ( ']' ) )
            // InternalMyDsl.g:1921:1: ( ']' )
            {
            // InternalMyDsl.g:1921:1: ( ']' )
            // InternalMyDsl.g:1922:2: ']'
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
    // InternalMyDsl.g:1931:1: rule__AtributoArreglo__Group__3 : rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4 ;
    public final void rule__AtributoArreglo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1935:1: ( rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4 )
            // InternalMyDsl.g:1936:2: rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4
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
    // InternalMyDsl.g:1943:1: rule__AtributoArreglo__Group__3__Impl : ( ( rule__AtributoArreglo__NameAssignment_3 ) ) ;
    public final void rule__AtributoArreglo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1947:1: ( ( ( rule__AtributoArreglo__NameAssignment_3 ) ) )
            // InternalMyDsl.g:1948:1: ( ( rule__AtributoArreglo__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:1948:1: ( ( rule__AtributoArreglo__NameAssignment_3 ) )
            // InternalMyDsl.g:1949:2: ( rule__AtributoArreglo__NameAssignment_3 )
            {
             before(grammarAccess.getAtributoArregloAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:1950:2: ( rule__AtributoArreglo__NameAssignment_3 )
            // InternalMyDsl.g:1950:3: rule__AtributoArreglo__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAtributoArregloAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:1958:1: rule__AtributoArreglo__Group__4 : rule__AtributoArreglo__Group__4__Impl ;
    public final void rule__AtributoArreglo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1962:1: ( rule__AtributoArreglo__Group__4__Impl )
            // InternalMyDsl.g:1963:2: rule__AtributoArreglo__Group__4__Impl
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
    // InternalMyDsl.g:1969:1: rule__AtributoArreglo__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoArreglo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1973:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1974:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1974:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1975:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:1985:1: rule__AtributoSimple__Group__0 : rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 ;
    public final void rule__AtributoSimple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1989:1: ( rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 )
            // InternalMyDsl.g:1990:2: rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1997:1: rule__AtributoSimple__Group__0__Impl : ( ( rule__AtributoSimple__TipoAssignment_0 ) ) ;
    public final void rule__AtributoSimple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2001:1: ( ( ( rule__AtributoSimple__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:2002:1: ( ( rule__AtributoSimple__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:2002:1: ( ( rule__AtributoSimple__TipoAssignment_0 ) )
            // InternalMyDsl.g:2003:2: ( rule__AtributoSimple__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:2004:2: ( rule__AtributoSimple__TipoAssignment_0 )
            // InternalMyDsl.g:2004:3: rule__AtributoSimple__TipoAssignment_0
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
    // InternalMyDsl.g:2012:1: rule__AtributoSimple__Group__1 : rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 ;
    public final void rule__AtributoSimple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2016:1: ( rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 )
            // InternalMyDsl.g:2017:2: rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2
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
    // InternalMyDsl.g:2024:1: rule__AtributoSimple__Group__1__Impl : ( ( rule__AtributoSimple__NameAssignment_1 ) ) ;
    public final void rule__AtributoSimple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2028:1: ( ( ( rule__AtributoSimple__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2029:1: ( ( rule__AtributoSimple__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2029:1: ( ( rule__AtributoSimple__NameAssignment_1 ) )
            // InternalMyDsl.g:2030:2: ( rule__AtributoSimple__NameAssignment_1 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2031:2: ( rule__AtributoSimple__NameAssignment_1 )
            // InternalMyDsl.g:2031:3: rule__AtributoSimple__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AtributoSimple__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoSimpleAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:2039:1: rule__AtributoSimple__Group__2 : rule__AtributoSimple__Group__2__Impl ;
    public final void rule__AtributoSimple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2043:1: ( rule__AtributoSimple__Group__2__Impl )
            // InternalMyDsl.g:2044:2: rule__AtributoSimple__Group__2__Impl
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
    // InternalMyDsl.g:2050:1: rule__AtributoSimple__Group__2__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoSimple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2054:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2055:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2055:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2056:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:2066:1: rule__MockarooEntity__Group__0 : rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1 ;
    public final void rule__MockarooEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2070:1: ( rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1 )
            // InternalMyDsl.g:2071:2: rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:2078:1: rule__MockarooEntity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__MockarooEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2082:1: ( ( 'Entity' ) )
            // InternalMyDsl.g:2083:1: ( 'Entity' )
            {
            // InternalMyDsl.g:2083:1: ( 'Entity' )
            // InternalMyDsl.g:2084:2: 'Entity'
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
    // InternalMyDsl.g:2093:1: rule__MockarooEntity__Group__1 : rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2 ;
    public final void rule__MockarooEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2097:1: ( rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2 )
            // InternalMyDsl.g:2098:2: rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:2105:1: rule__MockarooEntity__Group__1__Impl : ( ( rule__MockarooEntity__NameAssignment_1 ) ) ;
    public final void rule__MockarooEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2109:1: ( ( ( rule__MockarooEntity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2110:1: ( ( rule__MockarooEntity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2110:1: ( ( rule__MockarooEntity__NameAssignment_1 ) )
            // InternalMyDsl.g:2111:2: ( rule__MockarooEntity__NameAssignment_1 )
            {
             before(grammarAccess.getMockarooEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2112:2: ( rule__MockarooEntity__NameAssignment_1 )
            // InternalMyDsl.g:2112:3: rule__MockarooEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MockarooEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMockarooEntityAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:2120:1: rule__MockarooEntity__Group__2 : rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3 ;
    public final void rule__MockarooEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2124:1: ( rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3 )
            // InternalMyDsl.g:2125:2: rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:2132:1: rule__MockarooEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__MockarooEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2136:1: ( ( '{' ) )
            // InternalMyDsl.g:2137:1: ( '{' )
            {
            // InternalMyDsl.g:2137:1: ( '{' )
            // InternalMyDsl.g:2138:2: '{'
            {
             before(grammarAccess.getMockarooEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:2147:1: rule__MockarooEntity__Group__3 : rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4 ;
    public final void rule__MockarooEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2151:1: ( rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4 )
            // InternalMyDsl.g:2152:2: rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:2159:1: rule__MockarooEntity__Group__3__Impl : ( ( rule__MockarooEntity__AtributosAssignment_3 )* ) ;
    public final void rule__MockarooEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2163:1: ( ( ( rule__MockarooEntity__AtributosAssignment_3 )* ) )
            // InternalMyDsl.g:2164:1: ( ( rule__MockarooEntity__AtributosAssignment_3 )* )
            {
            // InternalMyDsl.g:2164:1: ( ( rule__MockarooEntity__AtributosAssignment_3 )* )
            // InternalMyDsl.g:2165:2: ( rule__MockarooEntity__AtributosAssignment_3 )*
            {
             before(grammarAccess.getMockarooEntityAccess().getAtributosAssignment_3()); 
            // InternalMyDsl.g:2166:2: ( rule__MockarooEntity__AtributosAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=15 && LA20_0<=17)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2166:3: rule__MockarooEntity__AtributosAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__MockarooEntity__AtributosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMyDsl.g:2174:1: rule__MockarooEntity__Group__4 : rule__MockarooEntity__Group__4__Impl ;
    public final void rule__MockarooEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2178:1: ( rule__MockarooEntity__Group__4__Impl )
            // InternalMyDsl.g:2179:2: rule__MockarooEntity__Group__4__Impl
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
    // InternalMyDsl.g:2185:1: rule__MockarooEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__MockarooEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2189:1: ( ( '}' ) )
            // InternalMyDsl.g:2190:1: ( '}' )
            {
            // InternalMyDsl.g:2190:1: ( '}' )
            // InternalMyDsl.g:2191:2: '}'
            {
             before(grammarAccess.getMockarooEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:2201:1: rule__ServicioRest__Group__0 : rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1 ;
    public final void rule__ServicioRest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2205:1: ( rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1 )
            // InternalMyDsl.g:2206:2: rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1
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
    // InternalMyDsl.g:2213:1: rule__ServicioRest__Group__0__Impl : ( ( rule__ServicioRest__MetodoAssignment_0 ) ) ;
    public final void rule__ServicioRest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2217:1: ( ( ( rule__ServicioRest__MetodoAssignment_0 ) ) )
            // InternalMyDsl.g:2218:1: ( ( rule__ServicioRest__MetodoAssignment_0 ) )
            {
            // InternalMyDsl.g:2218:1: ( ( rule__ServicioRest__MetodoAssignment_0 ) )
            // InternalMyDsl.g:2219:2: ( rule__ServicioRest__MetodoAssignment_0 )
            {
             before(grammarAccess.getServicioRestAccess().getMetodoAssignment_0()); 
            // InternalMyDsl.g:2220:2: ( rule__ServicioRest__MetodoAssignment_0 )
            // InternalMyDsl.g:2220:3: rule__ServicioRest__MetodoAssignment_0
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
    // InternalMyDsl.g:2228:1: rule__ServicioRest__Group__1 : rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2 ;
    public final void rule__ServicioRest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2232:1: ( rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2 )
            // InternalMyDsl.g:2233:2: rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:2240:1: rule__ServicioRest__Group__1__Impl : ( ( rule__ServicioRest__NameAssignment_1 ) ) ;
    public final void rule__ServicioRest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2244:1: ( ( ( rule__ServicioRest__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2245:1: ( ( rule__ServicioRest__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2245:1: ( ( rule__ServicioRest__NameAssignment_1 ) )
            // InternalMyDsl.g:2246:2: ( rule__ServicioRest__NameAssignment_1 )
            {
             before(grammarAccess.getServicioRestAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2247:2: ( rule__ServicioRest__NameAssignment_1 )
            // InternalMyDsl.g:2247:3: rule__ServicioRest__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServicioRestAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:2255:1: rule__ServicioRest__Group__2 : rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3 ;
    public final void rule__ServicioRest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2259:1: ( rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3 )
            // InternalMyDsl.g:2260:2: rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2267:1: rule__ServicioRest__Group__2__Impl : ( '{' ) ;
    public final void rule__ServicioRest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2271:1: ( ( '{' ) )
            // InternalMyDsl.g:2272:1: ( '{' )
            {
            // InternalMyDsl.g:2272:1: ( '{' )
            // InternalMyDsl.g:2273:2: '{'
            {
             before(grammarAccess.getServicioRestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:2282:1: rule__ServicioRest__Group__3 : rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4 ;
    public final void rule__ServicioRest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2286:1: ( rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4 )
            // InternalMyDsl.g:2287:2: rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4
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
    // InternalMyDsl.g:2294:1: rule__ServicioRest__Group__3__Impl : ( 'URL' ) ;
    public final void rule__ServicioRest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2298:1: ( ( 'URL' ) )
            // InternalMyDsl.g:2299:1: ( 'URL' )
            {
            // InternalMyDsl.g:2299:1: ( 'URL' )
            // InternalMyDsl.g:2300:2: 'URL'
            {
             before(grammarAccess.getServicioRestAccess().getURLKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:2309:1: rule__ServicioRest__Group__4 : rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5 ;
    public final void rule__ServicioRest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2313:1: ( rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5 )
            // InternalMyDsl.g:2314:2: rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2321:1: rule__ServicioRest__Group__4__Impl : ( RULE_EQUAL ) ;
    public final void rule__ServicioRest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2325:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:2326:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:2326:1: ( RULE_EQUAL )
            // InternalMyDsl.g:2327:2: RULE_EQUAL
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
    // InternalMyDsl.g:2336:1: rule__ServicioRest__Group__5 : rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6 ;
    public final void rule__ServicioRest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2340:1: ( rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6 )
            // InternalMyDsl.g:2341:2: rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6
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
    // InternalMyDsl.g:2348:1: rule__ServicioRest__Group__5__Impl : ( '/' ) ;
    public final void rule__ServicioRest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2352:1: ( ( '/' ) )
            // InternalMyDsl.g:2353:1: ( '/' )
            {
            // InternalMyDsl.g:2353:1: ( '/' )
            // InternalMyDsl.g:2354:2: '/'
            {
             before(grammarAccess.getServicioRestAccess().getSolidusKeyword_5()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:2363:1: rule__ServicioRest__Group__6 : rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7 ;
    public final void rule__ServicioRest__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2367:1: ( rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7 )
            // InternalMyDsl.g:2368:2: rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2375:1: rule__ServicioRest__Group__6__Impl : ( ( rule__ServicioRest__UrlAssignment_6 ) ) ;
    public final void rule__ServicioRest__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2379:1: ( ( ( rule__ServicioRest__UrlAssignment_6 ) ) )
            // InternalMyDsl.g:2380:1: ( ( rule__ServicioRest__UrlAssignment_6 ) )
            {
            // InternalMyDsl.g:2380:1: ( ( rule__ServicioRest__UrlAssignment_6 ) )
            // InternalMyDsl.g:2381:2: ( rule__ServicioRest__UrlAssignment_6 )
            {
             before(grammarAccess.getServicioRestAccess().getUrlAssignment_6()); 
            // InternalMyDsl.g:2382:2: ( rule__ServicioRest__UrlAssignment_6 )
            // InternalMyDsl.g:2382:3: rule__ServicioRest__UrlAssignment_6
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
    // InternalMyDsl.g:2390:1: rule__ServicioRest__Group__7 : rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8 ;
    public final void rule__ServicioRest__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2394:1: ( rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8 )
            // InternalMyDsl.g:2395:2: rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2402:1: rule__ServicioRest__Group__7__Impl : ( ( rule__ServicioRest__Alternatives_7 )* ) ;
    public final void rule__ServicioRest__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2406:1: ( ( ( rule__ServicioRest__Alternatives_7 )* ) )
            // InternalMyDsl.g:2407:1: ( ( rule__ServicioRest__Alternatives_7 )* )
            {
            // InternalMyDsl.g:2407:1: ( ( rule__ServicioRest__Alternatives_7 )* )
            // InternalMyDsl.g:2408:2: ( rule__ServicioRest__Alternatives_7 )*
            {
             before(grammarAccess.getServicioRestAccess().getAlternatives_7()); 
            // InternalMyDsl.g:2409:2: ( rule__ServicioRest__Alternatives_7 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=47 && LA21_0<=49)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:2409:3: rule__ServicioRest__Alternatives_7
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ServicioRest__Alternatives_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMyDsl.g:2417:1: rule__ServicioRest__Group__8 : rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9 ;
    public final void rule__ServicioRest__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2421:1: ( rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9 )
            // InternalMyDsl.g:2422:2: rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2429:1: rule__ServicioRest__Group__8__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__ServicioRest__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2433:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2434:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2434:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2435:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:2444:1: rule__ServicioRest__Group__9 : rule__ServicioRest__Group__9__Impl rule__ServicioRest__Group__10 ;
    public final void rule__ServicioRest__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2448:1: ( rule__ServicioRest__Group__9__Impl rule__ServicioRest__Group__10 )
            // InternalMyDsl.g:2449:2: rule__ServicioRest__Group__9__Impl rule__ServicioRest__Group__10
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2456:1: rule__ServicioRest__Group__9__Impl : ( ( rule__ServicioRest__RequestAssignment_9 )? ) ;
    public final void rule__ServicioRest__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2460:1: ( ( ( rule__ServicioRest__RequestAssignment_9 )? ) )
            // InternalMyDsl.g:2461:1: ( ( rule__ServicioRest__RequestAssignment_9 )? )
            {
            // InternalMyDsl.g:2461:1: ( ( rule__ServicioRest__RequestAssignment_9 )? )
            // InternalMyDsl.g:2462:2: ( rule__ServicioRest__RequestAssignment_9 )?
            {
             before(grammarAccess.getServicioRestAccess().getRequestAssignment_9()); 
            // InternalMyDsl.g:2463:2: ( rule__ServicioRest__RequestAssignment_9 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==52) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2463:3: rule__ServicioRest__RequestAssignment_9
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
    // InternalMyDsl.g:2471:1: rule__ServicioRest__Group__10 : rule__ServicioRest__Group__10__Impl rule__ServicioRest__Group__11 ;
    public final void rule__ServicioRest__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2475:1: ( rule__ServicioRest__Group__10__Impl rule__ServicioRest__Group__11 )
            // InternalMyDsl.g:2476:2: rule__ServicioRest__Group__10__Impl rule__ServicioRest__Group__11
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2483:1: rule__ServicioRest__Group__10__Impl : ( ( rule__ServicioRest__ResponseAssignment_10 ) ) ;
    public final void rule__ServicioRest__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2487:1: ( ( ( rule__ServicioRest__ResponseAssignment_10 ) ) )
            // InternalMyDsl.g:2488:1: ( ( rule__ServicioRest__ResponseAssignment_10 ) )
            {
            // InternalMyDsl.g:2488:1: ( ( rule__ServicioRest__ResponseAssignment_10 ) )
            // InternalMyDsl.g:2489:2: ( rule__ServicioRest__ResponseAssignment_10 )
            {
             before(grammarAccess.getServicioRestAccess().getResponseAssignment_10()); 
            // InternalMyDsl.g:2490:2: ( rule__ServicioRest__ResponseAssignment_10 )
            // InternalMyDsl.g:2490:3: rule__ServicioRest__ResponseAssignment_10
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
    // InternalMyDsl.g:2498:1: rule__ServicioRest__Group__11 : rule__ServicioRest__Group__11__Impl ;
    public final void rule__ServicioRest__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2502:1: ( rule__ServicioRest__Group__11__Impl )
            // InternalMyDsl.g:2503:2: rule__ServicioRest__Group__11__Impl
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
    // InternalMyDsl.g:2509:1: rule__ServicioRest__Group__11__Impl : ( '}' ) ;
    public final void rule__ServicioRest__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2513:1: ( ( '}' ) )
            // InternalMyDsl.g:2514:1: ( '}' )
            {
            // InternalMyDsl.g:2514:1: ( '}' )
            // InternalMyDsl.g:2515:2: '}'
            {
             before(grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_11()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:2525:1: rule__ServicioRest__Group_7_1__0 : rule__ServicioRest__Group_7_1__0__Impl rule__ServicioRest__Group_7_1__1 ;
    public final void rule__ServicioRest__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2529:1: ( rule__ServicioRest__Group_7_1__0__Impl rule__ServicioRest__Group_7_1__1 )
            // InternalMyDsl.g:2530:2: rule__ServicioRest__Group_7_1__0__Impl rule__ServicioRest__Group_7_1__1
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
    // InternalMyDsl.g:2537:1: rule__ServicioRest__Group_7_1__0__Impl : ( '/' ) ;
    public final void rule__ServicioRest__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2541:1: ( ( '/' ) )
            // InternalMyDsl.g:2542:1: ( '/' )
            {
            // InternalMyDsl.g:2542:1: ( '/' )
            // InternalMyDsl.g:2543:2: '/'
            {
             before(grammarAccess.getServicioRestAccess().getSolidusKeyword_7_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:2552:1: rule__ServicioRest__Group_7_1__1 : rule__ServicioRest__Group_7_1__1__Impl ;
    public final void rule__ServicioRest__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2556:1: ( rule__ServicioRest__Group_7_1__1__Impl )
            // InternalMyDsl.g:2557:2: rule__ServicioRest__Group_7_1__1__Impl
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
    // InternalMyDsl.g:2563:1: rule__ServicioRest__Group_7_1__1__Impl : ( ruleEString ) ;
    public final void rule__ServicioRest__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2567:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2568:1: ( ruleEString )
            {
            // InternalMyDsl.g:2568:1: ( ruleEString )
            // InternalMyDsl.g:2569:2: ruleEString
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
    // InternalMyDsl.g:2579:1: rule__QueryParam__Group__0 : rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1 ;
    public final void rule__QueryParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2583:1: ( rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1 )
            // InternalMyDsl.g:2584:2: rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:2591:1: rule__QueryParam__Group__0__Impl : ( '?${' ) ;
    public final void rule__QueryParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2595:1: ( ( '?${' ) )
            // InternalMyDsl.g:2596:1: ( '?${' )
            {
            // InternalMyDsl.g:2596:1: ( '?${' )
            // InternalMyDsl.g:2597:2: '?${'
            {
             before(grammarAccess.getQueryParamAccess().getQuestionMarkDollarSignLeftCurlyBracketKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:2606:1: rule__QueryParam__Group__1 : rule__QueryParam__Group__1__Impl rule__QueryParam__Group__2 ;
    public final void rule__QueryParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2610:1: ( rule__QueryParam__Group__1__Impl rule__QueryParam__Group__2 )
            // InternalMyDsl.g:2611:2: rule__QueryParam__Group__1__Impl rule__QueryParam__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2618:1: rule__QueryParam__Group__1__Impl : ( ( rule__QueryParam__NameAssignment_1 ) ) ;
    public final void rule__QueryParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2622:1: ( ( ( rule__QueryParam__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2623:1: ( ( rule__QueryParam__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2623:1: ( ( rule__QueryParam__NameAssignment_1 ) )
            // InternalMyDsl.g:2624:2: ( rule__QueryParam__NameAssignment_1 )
            {
             before(grammarAccess.getQueryParamAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2625:2: ( rule__QueryParam__NameAssignment_1 )
            // InternalMyDsl.g:2625:3: rule__QueryParam__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryParamAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:2633:1: rule__QueryParam__Group__2 : rule__QueryParam__Group__2__Impl ;
    public final void rule__QueryParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2637:1: ( rule__QueryParam__Group__2__Impl )
            // InternalMyDsl.g:2638:2: rule__QueryParam__Group__2__Impl
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
    // InternalMyDsl.g:2644:1: rule__QueryParam__Group__2__Impl : ( '}' ) ;
    public final void rule__QueryParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2648:1: ( ( '}' ) )
            // InternalMyDsl.g:2649:1: ( '}' )
            {
            // InternalMyDsl.g:2649:1: ( '}' )
            // InternalMyDsl.g:2650:2: '}'
            {
             before(grammarAccess.getQueryParamAccess().getRightCurlyBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:2660:1: rule__PathParam__Group__0 : rule__PathParam__Group__0__Impl rule__PathParam__Group__1 ;
    public final void rule__PathParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2664:1: ( rule__PathParam__Group__0__Impl rule__PathParam__Group__1 )
            // InternalMyDsl.g:2665:2: rule__PathParam__Group__0__Impl rule__PathParam__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:2672:1: rule__PathParam__Group__0__Impl : ( '/:{' ) ;
    public final void rule__PathParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2676:1: ( ( '/:{' ) )
            // InternalMyDsl.g:2677:1: ( '/:{' )
            {
            // InternalMyDsl.g:2677:1: ( '/:{' )
            // InternalMyDsl.g:2678:2: '/:{'
            {
             before(grammarAccess.getPathParamAccess().getSolidusColonLeftCurlyBracketKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:2687:1: rule__PathParam__Group__1 : rule__PathParam__Group__1__Impl rule__PathParam__Group__2 ;
    public final void rule__PathParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2691:1: ( rule__PathParam__Group__1__Impl rule__PathParam__Group__2 )
            // InternalMyDsl.g:2692:2: rule__PathParam__Group__1__Impl rule__PathParam__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2699:1: rule__PathParam__Group__1__Impl : ( ( rule__PathParam__NameAssignment_1 ) ) ;
    public final void rule__PathParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2703:1: ( ( ( rule__PathParam__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2704:1: ( ( rule__PathParam__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2704:1: ( ( rule__PathParam__NameAssignment_1 ) )
            // InternalMyDsl.g:2705:2: ( rule__PathParam__NameAssignment_1 )
            {
             before(grammarAccess.getPathParamAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2706:2: ( rule__PathParam__NameAssignment_1 )
            // InternalMyDsl.g:2706:3: rule__PathParam__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PathParam__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPathParamAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:2714:1: rule__PathParam__Group__2 : rule__PathParam__Group__2__Impl ;
    public final void rule__PathParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2718:1: ( rule__PathParam__Group__2__Impl )
            // InternalMyDsl.g:2719:2: rule__PathParam__Group__2__Impl
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
    // InternalMyDsl.g:2725:1: rule__PathParam__Group__2__Impl : ( '}' ) ;
    public final void rule__PathParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2729:1: ( ( '}' ) )
            // InternalMyDsl.g:2730:1: ( '}' )
            {
            // InternalMyDsl.g:2730:1: ( '}' )
            // InternalMyDsl.g:2731:2: '}'
            {
             before(grammarAccess.getPathParamAccess().getRightCurlyBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
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


    // $ANTLR start "rule__Response__Group__0"
    // InternalMyDsl.g:2741:1: rule__Response__Group__0 : rule__Response__Group__0__Impl rule__Response__Group__1 ;
    public final void rule__Response__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2745:1: ( rule__Response__Group__0__Impl rule__Response__Group__1 )
            // InternalMyDsl.g:2746:2: rule__Response__Group__0__Impl rule__Response__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:2753:1: rule__Response__Group__0__Impl : ( 'Response' ) ;
    public final void rule__Response__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2757:1: ( ( 'Response' ) )
            // InternalMyDsl.g:2758:1: ( 'Response' )
            {
            // InternalMyDsl.g:2758:1: ( 'Response' )
            // InternalMyDsl.g:2759:2: 'Response'
            {
             before(grammarAccess.getResponseAccess().getResponseKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:2768:1: rule__Response__Group__1 : rule__Response__Group__1__Impl rule__Response__Group__2 ;
    public final void rule__Response__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2772:1: ( rule__Response__Group__1__Impl rule__Response__Group__2 )
            // InternalMyDsl.g:2773:2: rule__Response__Group__1__Impl rule__Response__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:2780:1: rule__Response__Group__1__Impl : ( '{' ) ;
    public final void rule__Response__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2784:1: ( ( '{' ) )
            // InternalMyDsl.g:2785:1: ( '{' )
            {
            // InternalMyDsl.g:2785:1: ( '{' )
            // InternalMyDsl.g:2786:2: '{'
            {
             before(grammarAccess.getResponseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:2795:1: rule__Response__Group__2 : rule__Response__Group__2__Impl rule__Response__Group__3 ;
    public final void rule__Response__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2799:1: ( rule__Response__Group__2__Impl rule__Response__Group__3 )
            // InternalMyDsl.g:2800:2: rule__Response__Group__2__Impl rule__Response__Group__3
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
    // InternalMyDsl.g:2807:1: rule__Response__Group__2__Impl : ( 'Type' ) ;
    public final void rule__Response__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2811:1: ( ( 'Type' ) )
            // InternalMyDsl.g:2812:1: ( 'Type' )
            {
            // InternalMyDsl.g:2812:1: ( 'Type' )
            // InternalMyDsl.g:2813:2: 'Type'
            {
             before(grammarAccess.getResponseAccess().getTypeKeyword_2()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:2822:1: rule__Response__Group__3 : rule__Response__Group__3__Impl rule__Response__Group__4 ;
    public final void rule__Response__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2826:1: ( rule__Response__Group__3__Impl rule__Response__Group__4 )
            // InternalMyDsl.g:2827:2: rule__Response__Group__3__Impl rule__Response__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:2834:1: rule__Response__Group__3__Impl : ( RULE_EQUAL ) ;
    public final void rule__Response__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2838:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:2839:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:2839:1: ( RULE_EQUAL )
            // InternalMyDsl.g:2840:2: RULE_EQUAL
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
    // InternalMyDsl.g:2849:1: rule__Response__Group__4 : rule__Response__Group__4__Impl rule__Response__Group__5 ;
    public final void rule__Response__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2853:1: ( rule__Response__Group__4__Impl rule__Response__Group__5 )
            // InternalMyDsl.g:2854:2: rule__Response__Group__4__Impl rule__Response__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:2861:1: rule__Response__Group__4__Impl : ( ( rule__Response__Alternatives_4 ) ) ;
    public final void rule__Response__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2865:1: ( ( ( rule__Response__Alternatives_4 ) ) )
            // InternalMyDsl.g:2866:1: ( ( rule__Response__Alternatives_4 ) )
            {
            // InternalMyDsl.g:2866:1: ( ( rule__Response__Alternatives_4 ) )
            // InternalMyDsl.g:2867:2: ( rule__Response__Alternatives_4 )
            {
             before(grammarAccess.getResponseAccess().getAlternatives_4()); 
            // InternalMyDsl.g:2868:2: ( rule__Response__Alternatives_4 )
            // InternalMyDsl.g:2868:3: rule__Response__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Response__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getAlternatives_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:2876:1: rule__Response__Group__5 : rule__Response__Group__5__Impl rule__Response__Group__6 ;
    public final void rule__Response__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2880:1: ( rule__Response__Group__5__Impl rule__Response__Group__6 )
            // InternalMyDsl.g:2881:2: rule__Response__Group__5__Impl rule__Response__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:2888:1: rule__Response__Group__5__Impl : ( ( rule__Response__Group_5__0 )? ) ;
    public final void rule__Response__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2892:1: ( ( ( rule__Response__Group_5__0 )? ) )
            // InternalMyDsl.g:2893:1: ( ( rule__Response__Group_5__0 )? )
            {
            // InternalMyDsl.g:2893:1: ( ( rule__Response__Group_5__0 )? )
            // InternalMyDsl.g:2894:2: ( rule__Response__Group_5__0 )?
            {
             before(grammarAccess.getResponseAccess().getGroup_5()); 
            // InternalMyDsl.g:2895:2: ( rule__Response__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:2895:3: rule__Response__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Response__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalMyDsl.g:2903:1: rule__Response__Group__6 : rule__Response__Group__6__Impl rule__Response__Group__7 ;
    public final void rule__Response__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2907:1: ( rule__Response__Group__6__Impl rule__Response__Group__7 )
            // InternalMyDsl.g:2908:2: rule__Response__Group__6__Impl rule__Response__Group__7
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2915:1: rule__Response__Group__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Response__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2919:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2920:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2920:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2921:2: RULE_SEMICOLON
            {
             before(grammarAccess.getResponseAccess().getSEMICOLONTerminalRuleCall_6()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getSEMICOLONTerminalRuleCall_6()); 

            }


            }

        }
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
    // InternalMyDsl.g:2930:1: rule__Response__Group__7 : rule__Response__Group__7__Impl ;
    public final void rule__Response__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2934:1: ( rule__Response__Group__7__Impl )
            // InternalMyDsl.g:2935:2: rule__Response__Group__7__Impl
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
    // InternalMyDsl.g:2941:1: rule__Response__Group__7__Impl : ( '}' ) ;
    public final void rule__Response__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2945:1: ( ( '}' ) )
            // InternalMyDsl.g:2946:1: ( '}' )
            {
            // InternalMyDsl.g:2946:1: ( '}' )
            // InternalMyDsl.g:2947:2: '}'
            {
             before(grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_7()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:2957:1: rule__Response__Group_5__0 : rule__Response__Group_5__0__Impl rule__Response__Group_5__1 ;
    public final void rule__Response__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2961:1: ( rule__Response__Group_5__0__Impl rule__Response__Group_5__1 )
            // InternalMyDsl.g:2962:2: rule__Response__Group_5__0__Impl rule__Response__Group_5__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2969:1: rule__Response__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Response__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2973:1: ( ( '[' ) )
            // InternalMyDsl.g:2974:1: ( '[' )
            {
            // InternalMyDsl.g:2974:1: ( '[' )
            // InternalMyDsl.g:2975:2: '['
            {
             before(grammarAccess.getResponseAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getLeftSquareBracketKeyword_5_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:2984:1: rule__Response__Group_5__1 : rule__Response__Group_5__1__Impl ;
    public final void rule__Response__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2988:1: ( rule__Response__Group_5__1__Impl )
            // InternalMyDsl.g:2989:2: rule__Response__Group_5__1__Impl
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
    // InternalMyDsl.g:2995:1: rule__Response__Group_5__1__Impl : ( ']' ) ;
    public final void rule__Response__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2999:1: ( ( ']' ) )
            // InternalMyDsl.g:3000:1: ( ']' )
            {
            // InternalMyDsl.g:3000:1: ( ']' )
            // InternalMyDsl.g:3001:2: ']'
            {
             before(grammarAccess.getResponseAccess().getRightSquareBracketKeyword_5_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getRightSquareBracketKeyword_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Request__Group__0"
    // InternalMyDsl.g:3011:1: rule__Request__Group__0 : rule__Request__Group__0__Impl rule__Request__Group__1 ;
    public final void rule__Request__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3015:1: ( rule__Request__Group__0__Impl rule__Request__Group__1 )
            // InternalMyDsl.g:3016:2: rule__Request__Group__0__Impl rule__Request__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:3023:1: rule__Request__Group__0__Impl : ( 'Request' ) ;
    public final void rule__Request__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3027:1: ( ( 'Request' ) )
            // InternalMyDsl.g:3028:1: ( 'Request' )
            {
            // InternalMyDsl.g:3028:1: ( 'Request' )
            // InternalMyDsl.g:3029:2: 'Request'
            {
             before(grammarAccess.getRequestAccess().getRequestKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:3038:1: rule__Request__Group__1 : rule__Request__Group__1__Impl rule__Request__Group__2 ;
    public final void rule__Request__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3042:1: ( rule__Request__Group__1__Impl rule__Request__Group__2 )
            // InternalMyDsl.g:3043:2: rule__Request__Group__1__Impl rule__Request__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3050:1: rule__Request__Group__1__Impl : ( '{' ) ;
    public final void rule__Request__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3054:1: ( ( '{' ) )
            // InternalMyDsl.g:3055:1: ( '{' )
            {
            // InternalMyDsl.g:3055:1: ( '{' )
            // InternalMyDsl.g:3056:2: '{'
            {
             before(grammarAccess.getRequestAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:3065:1: rule__Request__Group__2 : rule__Request__Group__2__Impl rule__Request__Group__3 ;
    public final void rule__Request__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3069:1: ( rule__Request__Group__2__Impl rule__Request__Group__3 )
            // InternalMyDsl.g:3070:2: rule__Request__Group__2__Impl rule__Request__Group__3
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
    // InternalMyDsl.g:3077:1: rule__Request__Group__2__Impl : ( 'Type' ) ;
    public final void rule__Request__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3081:1: ( ( 'Type' ) )
            // InternalMyDsl.g:3082:1: ( 'Type' )
            {
            // InternalMyDsl.g:3082:1: ( 'Type' )
            // InternalMyDsl.g:3083:2: 'Type'
            {
             before(grammarAccess.getRequestAccess().getTypeKeyword_2()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:3092:1: rule__Request__Group__3 : rule__Request__Group__3__Impl rule__Request__Group__4 ;
    public final void rule__Request__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3096:1: ( rule__Request__Group__3__Impl rule__Request__Group__4 )
            // InternalMyDsl.g:3097:2: rule__Request__Group__3__Impl rule__Request__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3104:1: rule__Request__Group__3__Impl : ( RULE_EQUAL ) ;
    public final void rule__Request__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3108:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:3109:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:3109:1: ( RULE_EQUAL )
            // InternalMyDsl.g:3110:2: RULE_EQUAL
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
    // InternalMyDsl.g:3119:1: rule__Request__Group__4 : rule__Request__Group__4__Impl rule__Request__Group__5 ;
    public final void rule__Request__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3123:1: ( rule__Request__Group__4__Impl rule__Request__Group__5 )
            // InternalMyDsl.g:3124:2: rule__Request__Group__4__Impl rule__Request__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3131:1: rule__Request__Group__4__Impl : ( ( rule__Request__Alternatives_4 ) ) ;
    public final void rule__Request__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3135:1: ( ( ( rule__Request__Alternatives_4 ) ) )
            // InternalMyDsl.g:3136:1: ( ( rule__Request__Alternatives_4 ) )
            {
            // InternalMyDsl.g:3136:1: ( ( rule__Request__Alternatives_4 ) )
            // InternalMyDsl.g:3137:2: ( rule__Request__Alternatives_4 )
            {
             before(grammarAccess.getRequestAccess().getAlternatives_4()); 
            // InternalMyDsl.g:3138:2: ( rule__Request__Alternatives_4 )
            // InternalMyDsl.g:3138:3: rule__Request__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Request__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getRequestAccess().getAlternatives_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:3146:1: rule__Request__Group__5 : rule__Request__Group__5__Impl rule__Request__Group__6 ;
    public final void rule__Request__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3150:1: ( rule__Request__Group__5__Impl rule__Request__Group__6 )
            // InternalMyDsl.g:3151:2: rule__Request__Group__5__Impl rule__Request__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3158:1: rule__Request__Group__5__Impl : ( ( rule__Request__Group_5__0 )? ) ;
    public final void rule__Request__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3162:1: ( ( ( rule__Request__Group_5__0 )? ) )
            // InternalMyDsl.g:3163:1: ( ( rule__Request__Group_5__0 )? )
            {
            // InternalMyDsl.g:3163:1: ( ( rule__Request__Group_5__0 )? )
            // InternalMyDsl.g:3164:2: ( rule__Request__Group_5__0 )?
            {
             before(grammarAccess.getRequestAccess().getGroup_5()); 
            // InternalMyDsl.g:3165:2: ( rule__Request__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:3165:3: rule__Request__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Request__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequestAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:3173:1: rule__Request__Group__6 : rule__Request__Group__6__Impl rule__Request__Group__7 ;
    public final void rule__Request__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3177:1: ( rule__Request__Group__6__Impl rule__Request__Group__7 )
            // InternalMyDsl.g:3178:2: rule__Request__Group__6__Impl rule__Request__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Request__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__7();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:3185:1: rule__Request__Group__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Request__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3189:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:3190:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:3190:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:3191:2: RULE_SEMICOLON
            {
             before(grammarAccess.getRequestAccess().getSEMICOLONTerminalRuleCall_6()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getSEMICOLONTerminalRuleCall_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Request__Group__7"
    // InternalMyDsl.g:3200:1: rule__Request__Group__7 : rule__Request__Group__7__Impl ;
    public final void rule__Request__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3204:1: ( rule__Request__Group__7__Impl )
            // InternalMyDsl.g:3205:2: rule__Request__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Request__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__7"


    // $ANTLR start "rule__Request__Group__7__Impl"
    // InternalMyDsl.g:3211:1: rule__Request__Group__7__Impl : ( '}' ) ;
    public final void rule__Request__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3215:1: ( ( '}' ) )
            // InternalMyDsl.g:3216:1: ( '}' )
            {
            // InternalMyDsl.g:3216:1: ( '}' )
            // InternalMyDsl.g:3217:2: '}'
            {
             before(grammarAccess.getRequestAccess().getRightCurlyBracketKeyword_7()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__7__Impl"


    // $ANTLR start "rule__Request__Group_5__0"
    // InternalMyDsl.g:3227:1: rule__Request__Group_5__0 : rule__Request__Group_5__0__Impl rule__Request__Group_5__1 ;
    public final void rule__Request__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3231:1: ( rule__Request__Group_5__0__Impl rule__Request__Group_5__1 )
            // InternalMyDsl.g:3232:2: rule__Request__Group_5__0__Impl rule__Request__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__Request__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group_5__0"


    // $ANTLR start "rule__Request__Group_5__0__Impl"
    // InternalMyDsl.g:3239:1: rule__Request__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Request__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3243:1: ( ( '[' ) )
            // InternalMyDsl.g:3244:1: ( '[' )
            {
            // InternalMyDsl.g:3244:1: ( '[' )
            // InternalMyDsl.g:3245:2: '['
            {
             before(grammarAccess.getRequestAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getLeftSquareBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group_5__0__Impl"


    // $ANTLR start "rule__Request__Group_5__1"
    // InternalMyDsl.g:3254:1: rule__Request__Group_5__1 : rule__Request__Group_5__1__Impl ;
    public final void rule__Request__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3258:1: ( rule__Request__Group_5__1__Impl )
            // InternalMyDsl.g:3259:2: rule__Request__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Request__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group_5__1"


    // $ANTLR start "rule__Request__Group_5__1__Impl"
    // InternalMyDsl.g:3265:1: rule__Request__Group_5__1__Impl : ( ']' ) ;
    public final void rule__Request__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3269:1: ( ( ']' ) )
            // InternalMyDsl.g:3270:1: ( ']' )
            {
            // InternalMyDsl.g:3270:1: ( ']' )
            // InternalMyDsl.g:3271:2: ']'
            {
             before(grammarAccess.getRequestAccess().getRightSquareBracketKeyword_5_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getRightSquareBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group_5__1__Impl"


    // $ANTLR start "rule__Test__Group__0"
    // InternalMyDsl.g:3281:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3285:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalMyDsl.g:3286:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0"


    // $ANTLR start "rule__Test__Group__0__Impl"
    // InternalMyDsl.g:3293:1: rule__Test__Group__0__Impl : ( () ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3297:1: ( ( () ) )
            // InternalMyDsl.g:3298:1: ( () )
            {
            // InternalMyDsl.g:3298:1: ( () )
            // InternalMyDsl.g:3299:2: ()
            {
             before(grammarAccess.getTestAccess().getTestAction_0()); 
            // InternalMyDsl.g:3300:2: ()
            // InternalMyDsl.g:3300:3: 
            {
            }

             after(grammarAccess.getTestAccess().getTestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0__Impl"


    // $ANTLR start "rule__Test__Group__1"
    // InternalMyDsl.g:3308:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3312:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalMyDsl.g:3313:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1"


    // $ANTLR start "rule__Test__Group__1__Impl"
    // InternalMyDsl.g:3320:1: rule__Test__Group__1__Impl : ( 'Test' ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3324:1: ( ( 'Test' ) )
            // InternalMyDsl.g:3325:1: ( 'Test' )
            {
            // InternalMyDsl.g:3325:1: ( 'Test' )
            // InternalMyDsl.g:3326:2: 'Test'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getTestKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1__Impl"


    // $ANTLR start "rule__Test__Group__2"
    // InternalMyDsl.g:3335:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3339:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalMyDsl.g:3340:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Test__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2"


    // $ANTLR start "rule__Test__Group__2__Impl"
    // InternalMyDsl.g:3347:1: rule__Test__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3351:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3352:1: ( RULE_ID )
            {
            // InternalMyDsl.g:3352:1: ( RULE_ID )
            // InternalMyDsl.g:3353:2: RULE_ID
            {
             before(grammarAccess.getTestAccess().getIDTerminalRuleCall_2()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getIDTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2__Impl"


    // $ANTLR start "rule__Test__Group__3"
    // InternalMyDsl.g:3362:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3366:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // InternalMyDsl.g:3367:2: rule__Test__Group__3__Impl rule__Test__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Test__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3"


    // $ANTLR start "rule__Test__Group__3__Impl"
    // InternalMyDsl.g:3374:1: rule__Test__Group__3__Impl : ( '{' ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3378:1: ( ( '{' ) )
            // InternalMyDsl.g:3379:1: ( '{' )
            {
            // InternalMyDsl.g:3379:1: ( '{' )
            // InternalMyDsl.g:3380:2: '{'
            {
             before(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3__Impl"


    // $ANTLR start "rule__Test__Group__4"
    // InternalMyDsl.g:3389:1: rule__Test__Group__4 : rule__Test__Group__4__Impl rule__Test__Group__5 ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3393:1: ( rule__Test__Group__4__Impl rule__Test__Group__5 )
            // InternalMyDsl.g:3394:2: rule__Test__Group__4__Impl rule__Test__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Test__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4"


    // $ANTLR start "rule__Test__Group__4__Impl"
    // InternalMyDsl.g:3401:1: rule__Test__Group__4__Impl : ( 'service' ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3405:1: ( ( 'service' ) )
            // InternalMyDsl.g:3406:1: ( 'service' )
            {
            // InternalMyDsl.g:3406:1: ( 'service' )
            // InternalMyDsl.g:3407:2: 'service'
            {
             before(grammarAccess.getTestAccess().getServiceKeyword_4()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getServiceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4__Impl"


    // $ANTLR start "rule__Test__Group__5"
    // InternalMyDsl.g:3416:1: rule__Test__Group__5 : rule__Test__Group__5__Impl rule__Test__Group__6 ;
    public final void rule__Test__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3420:1: ( rule__Test__Group__5__Impl rule__Test__Group__6 )
            // InternalMyDsl.g:3421:2: rule__Test__Group__5__Impl rule__Test__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Test__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__5"


    // $ANTLR start "rule__Test__Group__5__Impl"
    // InternalMyDsl.g:3428:1: rule__Test__Group__5__Impl : ( RULE_EQUAL ) ;
    public final void rule__Test__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3432:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:3433:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:3433:1: ( RULE_EQUAL )
            // InternalMyDsl.g:3434:2: RULE_EQUAL
            {
             before(grammarAccess.getTestAccess().getEQUALTerminalRuleCall_5()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getEQUALTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__5__Impl"


    // $ANTLR start "rule__Test__Group__6"
    // InternalMyDsl.g:3443:1: rule__Test__Group__6 : rule__Test__Group__6__Impl rule__Test__Group__7 ;
    public final void rule__Test__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3447:1: ( rule__Test__Group__6__Impl rule__Test__Group__7 )
            // InternalMyDsl.g:3448:2: rule__Test__Group__6__Impl rule__Test__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__6"


    // $ANTLR start "rule__Test__Group__6__Impl"
    // InternalMyDsl.g:3455:1: rule__Test__Group__6__Impl : ( ( rule__Test__ServiceAssignment_6 ) ) ;
    public final void rule__Test__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3459:1: ( ( ( rule__Test__ServiceAssignment_6 ) ) )
            // InternalMyDsl.g:3460:1: ( ( rule__Test__ServiceAssignment_6 ) )
            {
            // InternalMyDsl.g:3460:1: ( ( rule__Test__ServiceAssignment_6 ) )
            // InternalMyDsl.g:3461:2: ( rule__Test__ServiceAssignment_6 )
            {
             before(grammarAccess.getTestAccess().getServiceAssignment_6()); 
            // InternalMyDsl.g:3462:2: ( rule__Test__ServiceAssignment_6 )
            // InternalMyDsl.g:3462:3: rule__Test__ServiceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Test__ServiceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getServiceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__6__Impl"


    // $ANTLR start "rule__Test__Group__7"
    // InternalMyDsl.g:3470:1: rule__Test__Group__7 : rule__Test__Group__7__Impl rule__Test__Group__8 ;
    public final void rule__Test__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3474:1: ( rule__Test__Group__7__Impl rule__Test__Group__8 )
            // InternalMyDsl.g:3475:2: rule__Test__Group__7__Impl rule__Test__Group__8
            {
            pushFollow(FOLLOW_32);
            rule__Test__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__7"


    // $ANTLR start "rule__Test__Group__7__Impl"
    // InternalMyDsl.g:3482:1: rule__Test__Group__7__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3486:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:3487:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:3487:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:3488:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_7()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__7__Impl"


    // $ANTLR start "rule__Test__Group__8"
    // InternalMyDsl.g:3497:1: rule__Test__Group__8 : rule__Test__Group__8__Impl rule__Test__Group__9 ;
    public final void rule__Test__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3501:1: ( rule__Test__Group__8__Impl rule__Test__Group__9 )
            // InternalMyDsl.g:3502:2: rule__Test__Group__8__Impl rule__Test__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__Test__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__8"


    // $ANTLR start "rule__Test__Group__8__Impl"
    // InternalMyDsl.g:3509:1: rule__Test__Group__8__Impl : ( 'description' ) ;
    public final void rule__Test__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3513:1: ( ( 'description' ) )
            // InternalMyDsl.g:3514:1: ( 'description' )
            {
            // InternalMyDsl.g:3514:1: ( 'description' )
            // InternalMyDsl.g:3515:2: 'description'
            {
             before(grammarAccess.getTestAccess().getDescriptionKeyword_8()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getDescriptionKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__8__Impl"


    // $ANTLR start "rule__Test__Group__9"
    // InternalMyDsl.g:3524:1: rule__Test__Group__9 : rule__Test__Group__9__Impl rule__Test__Group__10 ;
    public final void rule__Test__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3528:1: ( rule__Test__Group__9__Impl rule__Test__Group__10 )
            // InternalMyDsl.g:3529:2: rule__Test__Group__9__Impl rule__Test__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__9"


    // $ANTLR start "rule__Test__Group__9__Impl"
    // InternalMyDsl.g:3536:1: rule__Test__Group__9__Impl : ( RULE_EQUAL ) ;
    public final void rule__Test__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3540:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:3541:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:3541:1: ( RULE_EQUAL )
            // InternalMyDsl.g:3542:2: RULE_EQUAL
            {
             before(grammarAccess.getTestAccess().getEQUALTerminalRuleCall_9()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getEQUALTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__9__Impl"


    // $ANTLR start "rule__Test__Group__10"
    // InternalMyDsl.g:3551:1: rule__Test__Group__10 : rule__Test__Group__10__Impl rule__Test__Group__11 ;
    public final void rule__Test__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3555:1: ( rule__Test__Group__10__Impl rule__Test__Group__11 )
            // InternalMyDsl.g:3556:2: rule__Test__Group__10__Impl rule__Test__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__10"


    // $ANTLR start "rule__Test__Group__10__Impl"
    // InternalMyDsl.g:3563:1: rule__Test__Group__10__Impl : ( ( rule__Test__DescripcionAssignment_10 ) ) ;
    public final void rule__Test__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3567:1: ( ( ( rule__Test__DescripcionAssignment_10 ) ) )
            // InternalMyDsl.g:3568:1: ( ( rule__Test__DescripcionAssignment_10 ) )
            {
            // InternalMyDsl.g:3568:1: ( ( rule__Test__DescripcionAssignment_10 ) )
            // InternalMyDsl.g:3569:2: ( rule__Test__DescripcionAssignment_10 )
            {
             before(grammarAccess.getTestAccess().getDescripcionAssignment_10()); 
            // InternalMyDsl.g:3570:2: ( rule__Test__DescripcionAssignment_10 )
            // InternalMyDsl.g:3570:3: rule__Test__DescripcionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Test__DescripcionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getDescripcionAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__10__Impl"


    // $ANTLR start "rule__Test__Group__11"
    // InternalMyDsl.g:3578:1: rule__Test__Group__11 : rule__Test__Group__11__Impl rule__Test__Group__12 ;
    public final void rule__Test__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3582:1: ( rule__Test__Group__11__Impl rule__Test__Group__12 )
            // InternalMyDsl.g:3583:2: rule__Test__Group__11__Impl rule__Test__Group__12
            {
            pushFollow(FOLLOW_33);
            rule__Test__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__11"


    // $ANTLR start "rule__Test__Group__11__Impl"
    // InternalMyDsl.g:3590:1: rule__Test__Group__11__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3594:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:3595:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:3595:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:3596:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_11()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__11__Impl"


    // $ANTLR start "rule__Test__Group__12"
    // InternalMyDsl.g:3605:1: rule__Test__Group__12 : rule__Test__Group__12__Impl rule__Test__Group__13 ;
    public final void rule__Test__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3609:1: ( rule__Test__Group__12__Impl rule__Test__Group__13 )
            // InternalMyDsl.g:3610:2: rule__Test__Group__12__Impl rule__Test__Group__13
            {
            pushFollow(FOLLOW_33);
            rule__Test__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__12"


    // $ANTLR start "rule__Test__Group__12__Impl"
    // InternalMyDsl.g:3617:1: rule__Test__Group__12__Impl : ( ( rule__Test__Group_12__0 )? ) ;
    public final void rule__Test__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3621:1: ( ( ( rule__Test__Group_12__0 )? ) )
            // InternalMyDsl.g:3622:1: ( ( rule__Test__Group_12__0 )? )
            {
            // InternalMyDsl.g:3622:1: ( ( rule__Test__Group_12__0 )? )
            // InternalMyDsl.g:3623:2: ( rule__Test__Group_12__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_12()); 
            // InternalMyDsl.g:3624:2: ( rule__Test__Group_12__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==57) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:3624:3: rule__Test__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Test__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTestAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__12__Impl"


    // $ANTLR start "rule__Test__Group__13"
    // InternalMyDsl.g:3632:1: rule__Test__Group__13 : rule__Test__Group__13__Impl rule__Test__Group__14 ;
    public final void rule__Test__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3636:1: ( rule__Test__Group__13__Impl rule__Test__Group__14 )
            // InternalMyDsl.g:3637:2: rule__Test__Group__13__Impl rule__Test__Group__14
            {
            pushFollow(FOLLOW_13);
            rule__Test__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__13"


    // $ANTLR start "rule__Test__Group__13__Impl"
    // InternalMyDsl.g:3644:1: rule__Test__Group__13__Impl : ( 'Assertions' ) ;
    public final void rule__Test__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3648:1: ( ( 'Assertions' ) )
            // InternalMyDsl.g:3649:1: ( 'Assertions' )
            {
            // InternalMyDsl.g:3649:1: ( 'Assertions' )
            // InternalMyDsl.g:3650:2: 'Assertions'
            {
             before(grammarAccess.getTestAccess().getAssertionsKeyword_13()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getAssertionsKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__13__Impl"


    // $ANTLR start "rule__Test__Group__14"
    // InternalMyDsl.g:3659:1: rule__Test__Group__14 : rule__Test__Group__14__Impl rule__Test__Group__15 ;
    public final void rule__Test__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3663:1: ( rule__Test__Group__14__Impl rule__Test__Group__15 )
            // InternalMyDsl.g:3664:2: rule__Test__Group__14__Impl rule__Test__Group__15
            {
            pushFollow(FOLLOW_34);
            rule__Test__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__14"


    // $ANTLR start "rule__Test__Group__14__Impl"
    // InternalMyDsl.g:3671:1: rule__Test__Group__14__Impl : ( '{' ) ;
    public final void rule__Test__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3675:1: ( ( '{' ) )
            // InternalMyDsl.g:3676:1: ( '{' )
            {
            // InternalMyDsl.g:3676:1: ( '{' )
            // InternalMyDsl.g:3677:2: '{'
            {
             before(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_14()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__14__Impl"


    // $ANTLR start "rule__Test__Group__15"
    // InternalMyDsl.g:3686:1: rule__Test__Group__15 : rule__Test__Group__15__Impl rule__Test__Group__16 ;
    public final void rule__Test__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3690:1: ( rule__Test__Group__15__Impl rule__Test__Group__16 )
            // InternalMyDsl.g:3691:2: rule__Test__Group__15__Impl rule__Test__Group__16
            {
            pushFollow(FOLLOW_34);
            rule__Test__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__15"


    // $ANTLR start "rule__Test__Group__15__Impl"
    // InternalMyDsl.g:3698:1: rule__Test__Group__15__Impl : ( ( rule__Test__AsertionsAssignment_15 )* ) ;
    public final void rule__Test__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3702:1: ( ( ( rule__Test__AsertionsAssignment_15 )* ) )
            // InternalMyDsl.g:3703:1: ( ( rule__Test__AsertionsAssignment_15 )* )
            {
            // InternalMyDsl.g:3703:1: ( ( rule__Test__AsertionsAssignment_15 )* )
            // InternalMyDsl.g:3704:2: ( rule__Test__AsertionsAssignment_15 )*
            {
             before(grammarAccess.getTestAccess().getAsertionsAssignment_15()); 
            // InternalMyDsl.g:3705:2: ( rule__Test__AsertionsAssignment_15 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==63) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:3705:3: rule__Test__AsertionsAssignment_15
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Test__AsertionsAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getAsertionsAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__15__Impl"


    // $ANTLR start "rule__Test__Group__16"
    // InternalMyDsl.g:3713:1: rule__Test__Group__16 : rule__Test__Group__16__Impl rule__Test__Group__17 ;
    public final void rule__Test__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3717:1: ( rule__Test__Group__16__Impl rule__Test__Group__17 )
            // InternalMyDsl.g:3718:2: rule__Test__Group__16__Impl rule__Test__Group__17
            {
            pushFollow(FOLLOW_26);
            rule__Test__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__16"


    // $ANTLR start "rule__Test__Group__16__Impl"
    // InternalMyDsl.g:3725:1: rule__Test__Group__16__Impl : ( '}' ) ;
    public final void rule__Test__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3729:1: ( ( '}' ) )
            // InternalMyDsl.g:3730:1: ( '}' )
            {
            // InternalMyDsl.g:3730:1: ( '}' )
            // InternalMyDsl.g:3731:2: '}'
            {
             before(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_16()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__16__Impl"


    // $ANTLR start "rule__Test__Group__17"
    // InternalMyDsl.g:3740:1: rule__Test__Group__17 : rule__Test__Group__17__Impl ;
    public final void rule__Test__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3744:1: ( rule__Test__Group__17__Impl )
            // InternalMyDsl.g:3745:2: rule__Test__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__17"


    // $ANTLR start "rule__Test__Group__17__Impl"
    // InternalMyDsl.g:3751:1: rule__Test__Group__17__Impl : ( '}' ) ;
    public final void rule__Test__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3755:1: ( ( '}' ) )
            // InternalMyDsl.g:3756:1: ( '}' )
            {
            // InternalMyDsl.g:3756:1: ( '}' )
            // InternalMyDsl.g:3757:2: '}'
            {
             before(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_17()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__17__Impl"


    // $ANTLR start "rule__Test__Group_12__0"
    // InternalMyDsl.g:3767:1: rule__Test__Group_12__0 : rule__Test__Group_12__0__Impl rule__Test__Group_12__1 ;
    public final void rule__Test__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3771:1: ( rule__Test__Group_12__0__Impl rule__Test__Group_12__1 )
            // InternalMyDsl.g:3772:2: rule__Test__Group_12__0__Impl rule__Test__Group_12__1
            {
            pushFollow(FOLLOW_19);
            rule__Test__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__0"


    // $ANTLR start "rule__Test__Group_12__0__Impl"
    // InternalMyDsl.g:3779:1: rule__Test__Group_12__0__Impl : ( 'Mapping' ) ;
    public final void rule__Test__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3783:1: ( ( 'Mapping' ) )
            // InternalMyDsl.g:3784:1: ( 'Mapping' )
            {
            // InternalMyDsl.g:3784:1: ( 'Mapping' )
            // InternalMyDsl.g:3785:2: 'Mapping'
            {
             before(grammarAccess.getTestAccess().getMappingKeyword_12_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getMappingKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__0__Impl"


    // $ANTLR start "rule__Test__Group_12__1"
    // InternalMyDsl.g:3794:1: rule__Test__Group_12__1 : rule__Test__Group_12__1__Impl rule__Test__Group_12__2 ;
    public final void rule__Test__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3798:1: ( rule__Test__Group_12__1__Impl rule__Test__Group_12__2 )
            // InternalMyDsl.g:3799:2: rule__Test__Group_12__1__Impl rule__Test__Group_12__2
            {
            pushFollow(FOLLOW_36);
            rule__Test__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__1"


    // $ANTLR start "rule__Test__Group_12__1__Impl"
    // InternalMyDsl.g:3806:1: rule__Test__Group_12__1__Impl : ( '[' ) ;
    public final void rule__Test__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3810:1: ( ( '[' ) )
            // InternalMyDsl.g:3811:1: ( '[' )
            {
            // InternalMyDsl.g:3811:1: ( '[' )
            // InternalMyDsl.g:3812:2: '['
            {
             before(grammarAccess.getTestAccess().getLeftSquareBracketKeyword_12_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLeftSquareBracketKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__1__Impl"


    // $ANTLR start "rule__Test__Group_12__2"
    // InternalMyDsl.g:3821:1: rule__Test__Group_12__2 : rule__Test__Group_12__2__Impl rule__Test__Group_12__3 ;
    public final void rule__Test__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3825:1: ( rule__Test__Group_12__2__Impl rule__Test__Group_12__3 )
            // InternalMyDsl.g:3826:2: rule__Test__Group_12__2__Impl rule__Test__Group_12__3
            {
            pushFollow(FOLLOW_36);
            rule__Test__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__2"


    // $ANTLR start "rule__Test__Group_12__2__Impl"
    // InternalMyDsl.g:3833:1: rule__Test__Group_12__2__Impl : ( ( rule__Test__MappingsAssignment_12_2 )* ) ;
    public final void rule__Test__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3837:1: ( ( ( rule__Test__MappingsAssignment_12_2 )* ) )
            // InternalMyDsl.g:3838:1: ( ( rule__Test__MappingsAssignment_12_2 )* )
            {
            // InternalMyDsl.g:3838:1: ( ( rule__Test__MappingsAssignment_12_2 )* )
            // InternalMyDsl.g:3839:2: ( rule__Test__MappingsAssignment_12_2 )*
            {
             before(grammarAccess.getTestAccess().getMappingsAssignment_12_2()); 
            // InternalMyDsl.g:3840:2: ( rule__Test__MappingsAssignment_12_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==58) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:3840:3: rule__Test__MappingsAssignment_12_2
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Test__MappingsAssignment_12_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getMappingsAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__2__Impl"


    // $ANTLR start "rule__Test__Group_12__3"
    // InternalMyDsl.g:3848:1: rule__Test__Group_12__3 : rule__Test__Group_12__3__Impl ;
    public final void rule__Test__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3852:1: ( rule__Test__Group_12__3__Impl )
            // InternalMyDsl.g:3853:2: rule__Test__Group_12__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group_12__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__3"


    // $ANTLR start "rule__Test__Group_12__3__Impl"
    // InternalMyDsl.g:3859:1: rule__Test__Group_12__3__Impl : ( ']' ) ;
    public final void rule__Test__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3863:1: ( ( ']' ) )
            // InternalMyDsl.g:3864:1: ( ']' )
            {
            // InternalMyDsl.g:3864:1: ( ']' )
            // InternalMyDsl.g:3865:2: ']'
            {
             before(grammarAccess.getTestAccess().getRightSquareBracketKeyword_12_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRightSquareBracketKeyword_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__3__Impl"


    // $ANTLR start "rule__Mapping__Group__0"
    // InternalMyDsl.g:3875:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3879:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalMyDsl.g:3880:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3887:1: rule__Mapping__Group__0__Impl : ( '{parameter' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3891:1: ( ( '{parameter' ) )
            // InternalMyDsl.g:3892:1: ( '{parameter' )
            {
            // InternalMyDsl.g:3892:1: ( '{parameter' )
            // InternalMyDsl.g:3893:2: '{parameter'
            {
             before(grammarAccess.getMappingAccess().getParameterKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getParameterKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:3902:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3906:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalMyDsl.g:3907:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:3914:1: rule__Mapping__Group__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3918:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:3919:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:3919:1: ( RULE_EQUAL )
            // InternalMyDsl.g:3920:2: RULE_EQUAL
            {
             before(grammarAccess.getMappingAccess().getEQUALTerminalRuleCall_1()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getEQUALTerminalRuleCall_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:3929:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3933:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // InternalMyDsl.g:3934:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:3941:1: rule__Mapping__Group__2__Impl : ( ( rule__Mapping__ServicioAssignment_2 ) ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3945:1: ( ( ( rule__Mapping__ServicioAssignment_2 ) ) )
            // InternalMyDsl.g:3946:1: ( ( rule__Mapping__ServicioAssignment_2 ) )
            {
            // InternalMyDsl.g:3946:1: ( ( rule__Mapping__ServicioAssignment_2 ) )
            // InternalMyDsl.g:3947:2: ( rule__Mapping__ServicioAssignment_2 )
            {
             before(grammarAccess.getMappingAccess().getServicioAssignment_2()); 
            // InternalMyDsl.g:3948:2: ( rule__Mapping__ServicioAssignment_2 )
            // InternalMyDsl.g:3948:3: rule__Mapping__ServicioAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__ServicioAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getServicioAssignment_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:3956:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3960:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // InternalMyDsl.g:3961:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:3968:1: rule__Mapping__Group__3__Impl : ( '.' ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3972:1: ( ( '.' ) )
            // InternalMyDsl.g:3973:1: ( '.' )
            {
            // InternalMyDsl.g:3973:1: ( '.' )
            // InternalMyDsl.g:3974:2: '.'
            {
             before(grammarAccess.getMappingAccess().getFullStopKeyword_3()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getFullStopKeyword_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:3983:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl rule__Mapping__Group__5 ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3987:1: ( rule__Mapping__Group__4__Impl rule__Mapping__Group__5 )
            // InternalMyDsl.g:3988:2: rule__Mapping__Group__4__Impl rule__Mapping__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:3995:1: rule__Mapping__Group__4__Impl : ( ( rule__Mapping__ParametroAssignment_4 ) ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3999:1: ( ( ( rule__Mapping__ParametroAssignment_4 ) ) )
            // InternalMyDsl.g:4000:1: ( ( rule__Mapping__ParametroAssignment_4 ) )
            {
            // InternalMyDsl.g:4000:1: ( ( rule__Mapping__ParametroAssignment_4 ) )
            // InternalMyDsl.g:4001:2: ( rule__Mapping__ParametroAssignment_4 )
            {
             before(grammarAccess.getMappingAccess().getParametroAssignment_4()); 
            // InternalMyDsl.g:4002:2: ( rule__Mapping__ParametroAssignment_4 )
            // InternalMyDsl.g:4002:3: rule__Mapping__ParametroAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__ParametroAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getParametroAssignment_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:4010:1: rule__Mapping__Group__5 : rule__Mapping__Group__5__Impl rule__Mapping__Group__6 ;
    public final void rule__Mapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4014:1: ( rule__Mapping__Group__5__Impl rule__Mapping__Group__6 )
            // InternalMyDsl.g:4015:2: rule__Mapping__Group__5__Impl rule__Mapping__Group__6
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:4022:1: rule__Mapping__Group__5__Impl : ( ',' ) ;
    public final void rule__Mapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4026:1: ( ( ',' ) )
            // InternalMyDsl.g:4027:1: ( ',' )
            {
            // InternalMyDsl.g:4027:1: ( ',' )
            // InternalMyDsl.g:4028:2: ','
            {
             before(grammarAccess.getMappingAccess().getCommaKeyword_5()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getCommaKeyword_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:4037:1: rule__Mapping__Group__6 : rule__Mapping__Group__6__Impl rule__Mapping__Group__7 ;
    public final void rule__Mapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4041:1: ( rule__Mapping__Group__6__Impl rule__Mapping__Group__7 )
            // InternalMyDsl.g:4042:2: rule__Mapping__Group__6__Impl rule__Mapping__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Mapping__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__7();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:4049:1: rule__Mapping__Group__6__Impl : ( 'value' ) ;
    public final void rule__Mapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4053:1: ( ( 'value' ) )
            // InternalMyDsl.g:4054:1: ( 'value' )
            {
            // InternalMyDsl.g:4054:1: ( 'value' )
            // InternalMyDsl.g:4055:2: 'value'
            {
             before(grammarAccess.getMappingAccess().getValueKeyword_6()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getValueKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Mapping__Group__7"
    // InternalMyDsl.g:4064:1: rule__Mapping__Group__7 : rule__Mapping__Group__7__Impl rule__Mapping__Group__8 ;
    public final void rule__Mapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4068:1: ( rule__Mapping__Group__7__Impl rule__Mapping__Group__8 )
            // InternalMyDsl.g:4069:2: rule__Mapping__Group__7__Impl rule__Mapping__Group__8
            {
            pushFollow(FOLLOW_41);
            rule__Mapping__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__7"


    // $ANTLR start "rule__Mapping__Group__7__Impl"
    // InternalMyDsl.g:4076:1: rule__Mapping__Group__7__Impl : ( RULE_EQUAL ) ;
    public final void rule__Mapping__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4080:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:4081:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:4081:1: ( RULE_EQUAL )
            // InternalMyDsl.g:4082:2: RULE_EQUAL
            {
             before(grammarAccess.getMappingAccess().getEQUALTerminalRuleCall_7()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getEQUALTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__7__Impl"


    // $ANTLR start "rule__Mapping__Group__8"
    // InternalMyDsl.g:4091:1: rule__Mapping__Group__8 : rule__Mapping__Group__8__Impl rule__Mapping__Group__9 ;
    public final void rule__Mapping__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4095:1: ( rule__Mapping__Group__8__Impl rule__Mapping__Group__9 )
            // InternalMyDsl.g:4096:2: rule__Mapping__Group__8__Impl rule__Mapping__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__Mapping__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__8"


    // $ANTLR start "rule__Mapping__Group__8__Impl"
    // InternalMyDsl.g:4103:1: rule__Mapping__Group__8__Impl : ( ( rule__Mapping__Alternatives_8 ) ) ;
    public final void rule__Mapping__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4107:1: ( ( ( rule__Mapping__Alternatives_8 ) ) )
            // InternalMyDsl.g:4108:1: ( ( rule__Mapping__Alternatives_8 ) )
            {
            // InternalMyDsl.g:4108:1: ( ( rule__Mapping__Alternatives_8 ) )
            // InternalMyDsl.g:4109:2: ( rule__Mapping__Alternatives_8 )
            {
             before(grammarAccess.getMappingAccess().getAlternatives_8()); 
            // InternalMyDsl.g:4110:2: ( rule__Mapping__Alternatives_8 )
            // InternalMyDsl.g:4110:3: rule__Mapping__Alternatives_8
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Alternatives_8();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getAlternatives_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__8__Impl"


    // $ANTLR start "rule__Mapping__Group__9"
    // InternalMyDsl.g:4118:1: rule__Mapping__Group__9 : rule__Mapping__Group__9__Impl ;
    public final void rule__Mapping__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4122:1: ( rule__Mapping__Group__9__Impl )
            // InternalMyDsl.g:4123:2: rule__Mapping__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__9"


    // $ANTLR start "rule__Mapping__Group__9__Impl"
    // InternalMyDsl.g:4129:1: rule__Mapping__Group__9__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4133:1: ( ( '}' ) )
            // InternalMyDsl.g:4134:1: ( '}' )
            {
            // InternalMyDsl.g:4134:1: ( '}' )
            // InternalMyDsl.g:4135:2: '}'
            {
             before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_9()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__9__Impl"


    // $ANTLR start "rule__Mapping__Group_8_0__0"
    // InternalMyDsl.g:4145:1: rule__Mapping__Group_8_0__0 : rule__Mapping__Group_8_0__0__Impl rule__Mapping__Group_8_0__1 ;
    public final void rule__Mapping__Group_8_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4149:1: ( rule__Mapping__Group_8_0__0__Impl rule__Mapping__Group_8_0__1 )
            // InternalMyDsl.g:4150:2: rule__Mapping__Group_8_0__0__Impl rule__Mapping__Group_8_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Mapping__Group_8_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group_8_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_8_0__0"


    // $ANTLR start "rule__Mapping__Group_8_0__0__Impl"
    // InternalMyDsl.g:4157:1: rule__Mapping__Group_8_0__0__Impl : ( 'request->' ) ;
    public final void rule__Mapping__Group_8_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4161:1: ( ( 'request->' ) )
            // InternalMyDsl.g:4162:1: ( 'request->' )
            {
            // InternalMyDsl.g:4162:1: ( 'request->' )
            // InternalMyDsl.g:4163:2: 'request->'
            {
             before(grammarAccess.getMappingAccess().getRequestKeyword_8_0_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getRequestKeyword_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_8_0__0__Impl"


    // $ANTLR start "rule__Mapping__Group_8_0__1"
    // InternalMyDsl.g:4172:1: rule__Mapping__Group_8_0__1 : rule__Mapping__Group_8_0__1__Impl rule__Mapping__Group_8_0__2 ;
    public final void rule__Mapping__Group_8_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4176:1: ( rule__Mapping__Group_8_0__1__Impl rule__Mapping__Group_8_0__2 )
            // InternalMyDsl.g:4177:2: rule__Mapping__Group_8_0__1__Impl rule__Mapping__Group_8_0__2
            {
            pushFollow(FOLLOW_38);
            rule__Mapping__Group_8_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group_8_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_8_0__1"


    // $ANTLR start "rule__Mapping__Group_8_0__1__Impl"
    // InternalMyDsl.g:4184:1: rule__Mapping__Group_8_0__1__Impl : ( ( rule__Mapping__ReferenciaEntidadAssignment_8_0_1 ) ) ;
    public final void rule__Mapping__Group_8_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4188:1: ( ( ( rule__Mapping__ReferenciaEntidadAssignment_8_0_1 ) ) )
            // InternalMyDsl.g:4189:1: ( ( rule__Mapping__ReferenciaEntidadAssignment_8_0_1 ) )
            {
            // InternalMyDsl.g:4189:1: ( ( rule__Mapping__ReferenciaEntidadAssignment_8_0_1 ) )
            // InternalMyDsl.g:4190:2: ( rule__Mapping__ReferenciaEntidadAssignment_8_0_1 )
            {
             before(grammarAccess.getMappingAccess().getReferenciaEntidadAssignment_8_0_1()); 
            // InternalMyDsl.g:4191:2: ( rule__Mapping__ReferenciaEntidadAssignment_8_0_1 )
            // InternalMyDsl.g:4191:3: rule__Mapping__ReferenciaEntidadAssignment_8_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__ReferenciaEntidadAssignment_8_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getReferenciaEntidadAssignment_8_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_8_0__1__Impl"


    // $ANTLR start "rule__Mapping__Group_8_0__2"
    // InternalMyDsl.g:4199:1: rule__Mapping__Group_8_0__2 : rule__Mapping__Group_8_0__2__Impl rule__Mapping__Group_8_0__3 ;
    public final void rule__Mapping__Group_8_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4203:1: ( rule__Mapping__Group_8_0__2__Impl rule__Mapping__Group_8_0__3 )
            // InternalMyDsl.g:4204:2: rule__Mapping__Group_8_0__2__Impl rule__Mapping__Group_8_0__3
            {
            pushFollow(FOLLOW_12);
            rule__Mapping__Group_8_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group_8_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_8_0__2"


    // $ANTLR start "rule__Mapping__Group_8_0__2__Impl"
    // InternalMyDsl.g:4211:1: rule__Mapping__Group_8_0__2__Impl : ( '.' ) ;
    public final void rule__Mapping__Group_8_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4215:1: ( ( '.' ) )
            // InternalMyDsl.g:4216:1: ( '.' )
            {
            // InternalMyDsl.g:4216:1: ( '.' )
            // InternalMyDsl.g:4217:2: '.'
            {
             before(grammarAccess.getMappingAccess().getFullStopKeyword_8_0_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getFullStopKeyword_8_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_8_0__2__Impl"


    // $ANTLR start "rule__Mapping__Group_8_0__3"
    // InternalMyDsl.g:4226:1: rule__Mapping__Group_8_0__3 : rule__Mapping__Group_8_0__3__Impl ;
    public final void rule__Mapping__Group_8_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4230:1: ( rule__Mapping__Group_8_0__3__Impl )
            // InternalMyDsl.g:4231:2: rule__Mapping__Group_8_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group_8_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_8_0__3"


    // $ANTLR start "rule__Mapping__Group_8_0__3__Impl"
    // InternalMyDsl.g:4237:1: rule__Mapping__Group_8_0__3__Impl : ( ( rule__Mapping__ReferenciaAssignment_8_0_3 ) ) ;
    public final void rule__Mapping__Group_8_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4241:1: ( ( ( rule__Mapping__ReferenciaAssignment_8_0_3 ) ) )
            // InternalMyDsl.g:4242:1: ( ( rule__Mapping__ReferenciaAssignment_8_0_3 ) )
            {
            // InternalMyDsl.g:4242:1: ( ( rule__Mapping__ReferenciaAssignment_8_0_3 ) )
            // InternalMyDsl.g:4243:2: ( rule__Mapping__ReferenciaAssignment_8_0_3 )
            {
             before(grammarAccess.getMappingAccess().getReferenciaAssignment_8_0_3()); 
            // InternalMyDsl.g:4244:2: ( rule__Mapping__ReferenciaAssignment_8_0_3 )
            // InternalMyDsl.g:4244:3: rule__Mapping__ReferenciaAssignment_8_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__ReferenciaAssignment_8_0_3();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getReferenciaAssignment_8_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_8_0__3__Impl"


    // $ANTLR start "rule__Asercion__Group__0"
    // InternalMyDsl.g:4253:1: rule__Asercion__Group__0 : rule__Asercion__Group__0__Impl rule__Asercion__Group__1 ;
    public final void rule__Asercion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4257:1: ( rule__Asercion__Group__0__Impl rule__Asercion__Group__1 )
            // InternalMyDsl.g:4258:2: rule__Asercion__Group__0__Impl rule__Asercion__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:4265:1: rule__Asercion__Group__0__Impl : ( 'Asercion' ) ;
    public final void rule__Asercion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4269:1: ( ( 'Asercion' ) )
            // InternalMyDsl.g:4270:1: ( 'Asercion' )
            {
            // InternalMyDsl.g:4270:1: ( 'Asercion' )
            // InternalMyDsl.g:4271:2: 'Asercion'
            {
             before(grammarAccess.getAsercionAccess().getAsercionKeyword_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalMyDsl.g:4280:1: rule__Asercion__Group__1 : rule__Asercion__Group__1__Impl rule__Asercion__Group__2 ;
    public final void rule__Asercion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4284:1: ( rule__Asercion__Group__1__Impl rule__Asercion__Group__2 )
            // InternalMyDsl.g:4285:2: rule__Asercion__Group__1__Impl rule__Asercion__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:4292:1: rule__Asercion__Group__1__Impl : ( '{' ) ;
    public final void rule__Asercion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4296:1: ( ( '{' ) )
            // InternalMyDsl.g:4297:1: ( '{' )
            {
            // InternalMyDsl.g:4297:1: ( '{' )
            // InternalMyDsl.g:4298:2: '{'
            {
             before(grammarAccess.getAsercionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:4307:1: rule__Asercion__Group__2 : rule__Asercion__Group__2__Impl rule__Asercion__Group__3 ;
    public final void rule__Asercion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4311:1: ( rule__Asercion__Group__2__Impl rule__Asercion__Group__3 )
            // InternalMyDsl.g:4312:2: rule__Asercion__Group__2__Impl rule__Asercion__Group__3
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
    // InternalMyDsl.g:4319:1: rule__Asercion__Group__2__Impl : ( 'elemento1' ) ;
    public final void rule__Asercion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4323:1: ( ( 'elemento1' ) )
            // InternalMyDsl.g:4324:1: ( 'elemento1' )
            {
            // InternalMyDsl.g:4324:1: ( 'elemento1' )
            // InternalMyDsl.g:4325:2: 'elemento1'
            {
             before(grammarAccess.getAsercionAccess().getElemento1Keyword_2()); 
            match(input,64,FOLLOW_2); 
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
    // InternalMyDsl.g:4334:1: rule__Asercion__Group__3 : rule__Asercion__Group__3__Impl rule__Asercion__Group__4 ;
    public final void rule__Asercion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4338:1: ( rule__Asercion__Group__3__Impl rule__Asercion__Group__4 )
            // InternalMyDsl.g:4339:2: rule__Asercion__Group__3__Impl rule__Asercion__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:4346:1: rule__Asercion__Group__3__Impl : ( ( rule__Asercion__Elemento1Assignment_3 ) ) ;
    public final void rule__Asercion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4350:1: ( ( ( rule__Asercion__Elemento1Assignment_3 ) ) )
            // InternalMyDsl.g:4351:1: ( ( rule__Asercion__Elemento1Assignment_3 ) )
            {
            // InternalMyDsl.g:4351:1: ( ( rule__Asercion__Elemento1Assignment_3 ) )
            // InternalMyDsl.g:4352:2: ( rule__Asercion__Elemento1Assignment_3 )
            {
             before(grammarAccess.getAsercionAccess().getElemento1Assignment_3()); 
            // InternalMyDsl.g:4353:2: ( rule__Asercion__Elemento1Assignment_3 )
            // InternalMyDsl.g:4353:3: rule__Asercion__Elemento1Assignment_3
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
    // InternalMyDsl.g:4361:1: rule__Asercion__Group__4 : rule__Asercion__Group__4__Impl rule__Asercion__Group__5 ;
    public final void rule__Asercion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4365:1: ( rule__Asercion__Group__4__Impl rule__Asercion__Group__5 )
            // InternalMyDsl.g:4366:2: rule__Asercion__Group__4__Impl rule__Asercion__Group__5
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
    // InternalMyDsl.g:4373:1: rule__Asercion__Group__4__Impl : ( 'elemento2' ) ;
    public final void rule__Asercion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4377:1: ( ( 'elemento2' ) )
            // InternalMyDsl.g:4378:1: ( 'elemento2' )
            {
            // InternalMyDsl.g:4378:1: ( 'elemento2' )
            // InternalMyDsl.g:4379:2: 'elemento2'
            {
             before(grammarAccess.getAsercionAccess().getElemento2Keyword_4()); 
            match(input,65,FOLLOW_2); 
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
    // InternalMyDsl.g:4388:1: rule__Asercion__Group__5 : rule__Asercion__Group__5__Impl rule__Asercion__Group__6 ;
    public final void rule__Asercion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4392:1: ( rule__Asercion__Group__5__Impl rule__Asercion__Group__6 )
            // InternalMyDsl.g:4393:2: rule__Asercion__Group__5__Impl rule__Asercion__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:4400:1: rule__Asercion__Group__5__Impl : ( ( rule__Asercion__Elemento2Assignment_5 ) ) ;
    public final void rule__Asercion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4404:1: ( ( ( rule__Asercion__Elemento2Assignment_5 ) ) )
            // InternalMyDsl.g:4405:1: ( ( rule__Asercion__Elemento2Assignment_5 ) )
            {
            // InternalMyDsl.g:4405:1: ( ( rule__Asercion__Elemento2Assignment_5 ) )
            // InternalMyDsl.g:4406:2: ( rule__Asercion__Elemento2Assignment_5 )
            {
             before(grammarAccess.getAsercionAccess().getElemento2Assignment_5()); 
            // InternalMyDsl.g:4407:2: ( rule__Asercion__Elemento2Assignment_5 )
            // InternalMyDsl.g:4407:3: rule__Asercion__Elemento2Assignment_5
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
    // InternalMyDsl.g:4415:1: rule__Asercion__Group__6 : rule__Asercion__Group__6__Impl ;
    public final void rule__Asercion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4419:1: ( rule__Asercion__Group__6__Impl )
            // InternalMyDsl.g:4420:2: rule__Asercion__Group__6__Impl
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
    // InternalMyDsl.g:4426:1: rule__Asercion__Group__6__Impl : ( '}' ) ;
    public final void rule__Asercion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4430:1: ( ( '}' ) )
            // InternalMyDsl.g:4431:1: ( '}' )
            {
            // InternalMyDsl.g:4431:1: ( '}' )
            // InternalMyDsl.g:4432:2: '}'
            {
             before(grammarAccess.getAsercionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:4442:1: rule__Api__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Api__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4446:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4447:2: ( ruleEString )
            {
            // InternalMyDsl.g:4447:2: ( ruleEString )
            // InternalMyDsl.g:4448:3: ruleEString
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
    // InternalMyDsl.g:4457:1: rule__Api__EntidadesAssignment_5 : ( ruleEntidad ) ;
    public final void rule__Api__EntidadesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4461:1: ( ( ruleEntidad ) )
            // InternalMyDsl.g:4462:2: ( ruleEntidad )
            {
            // InternalMyDsl.g:4462:2: ( ruleEntidad )
            // InternalMyDsl.g:4463:3: ruleEntidad
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
    // InternalMyDsl.g:4472:1: rule__Api__PrimitivetypesAssignment_6 : ( rulePrimitiveType ) ;
    public final void rule__Api__PrimitivetypesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4476:1: ( ( rulePrimitiveType ) )
            // InternalMyDsl.g:4477:2: ( rulePrimitiveType )
            {
            // InternalMyDsl.g:4477:2: ( rulePrimitiveType )
            // InternalMyDsl.g:4478:3: rulePrimitiveType
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
    // InternalMyDsl.g:4487:1: rule__Api__ServiciosRestAssignment_7 : ( ruleServicioRest ) ;
    public final void rule__Api__ServiciosRestAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4491:1: ( ( ruleServicioRest ) )
            // InternalMyDsl.g:4492:2: ( ruleServicioRest )
            {
            // InternalMyDsl.g:4492:2: ( ruleServicioRest )
            // InternalMyDsl.g:4493:3: ruleServicioRest
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


    // $ANTLR start "rule__Api__TestsAssignment_8"
    // InternalMyDsl.g:4502:1: rule__Api__TestsAssignment_8 : ( ruleTest ) ;
    public final void rule__Api__TestsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4506:1: ( ( ruleTest ) )
            // InternalMyDsl.g:4507:2: ( ruleTest )
            {
            // InternalMyDsl.g:4507:2: ( ruleTest )
            // InternalMyDsl.g:4508:3: ruleTest
            {
             before(grammarAccess.getApiAccess().getTestsTestParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getApiAccess().getTestsTestParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__TestsAssignment_8"


    // $ANTLR start "rule__SimpleEntity__NameAssignment_1"
    // InternalMyDsl.g:4517:1: rule__SimpleEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4521:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4522:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4522:2: ( RULE_ID )
            // InternalMyDsl.g:4523:3: RULE_ID
            {
             before(grammarAccess.getSimpleEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__NameAssignment_1"


    // $ANTLR start "rule__SimpleEntity__AtributosAssignment_3"
    // InternalMyDsl.g:4532:1: rule__SimpleEntity__AtributosAssignment_3 : ( ruleAtributoSimple ) ;
    public final void rule__SimpleEntity__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4536:1: ( ( ruleAtributoSimple ) )
            // InternalMyDsl.g:4537:2: ( ruleAtributoSimple )
            {
            // InternalMyDsl.g:4537:2: ( ruleAtributoSimple )
            // InternalMyDsl.g:4538:3: ruleAtributoSimple
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


    // $ANTLR start "rule__AtributoMocka__TipoAssignment_0"
    // InternalMyDsl.g:4547:1: rule__AtributoMocka__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoMocka__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4551:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:4552:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:4552:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:4553:3: ruleTipoAtributo
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


    // $ANTLR start "rule__AtributoMocka__NameAssignment_1"
    // InternalMyDsl.g:4562:1: rule__AtributoMocka__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AtributoMocka__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4566:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4567:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4567:2: ( RULE_ID )
            // InternalMyDsl.g:4568:3: RULE_ID
            {
             before(grammarAccess.getAtributoMockaAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__NameAssignment_1"


    // $ANTLR start "rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0"
    // InternalMyDsl.g:4577:1: rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 : ( ( 'PK,mockType' ) ) ;
    public final void rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4581:1: ( ( ( 'PK,mockType' ) ) )
            // InternalMyDsl.g:4582:2: ( ( 'PK,mockType' ) )
            {
            // InternalMyDsl.g:4582:2: ( ( 'PK,mockType' ) )
            // InternalMyDsl.g:4583:3: ( 'PK,mockType' )
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 
            // InternalMyDsl.g:4584:3: ( 'PK,mockType' )
            // InternalMyDsl.g:4585:4: 'PK,mockType'
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalMyDsl.g:4596:1: rule__AtributoMocka__MockTypeAssignment_2_1_0_2 : ( ruleMockaroo ) ;
    public final void rule__AtributoMocka__MockTypeAssignment_2_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4600:1: ( ( ruleMockaroo ) )
            // InternalMyDsl.g:4601:2: ( ruleMockaroo )
            {
            // InternalMyDsl.g:4601:2: ( ruleMockaroo )
            // InternalMyDsl.g:4602:3: ruleMockaroo
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
    // InternalMyDsl.g:4611:1: rule__AtributoMocka__MockTypeAssignment_2_1_1_2 : ( ruleMockaroo ) ;
    public final void rule__AtributoMocka__MockTypeAssignment_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4615:1: ( ( ruleMockaroo ) )
            // InternalMyDsl.g:4616:2: ( ruleMockaroo )
            {
            // InternalMyDsl.g:4616:2: ( ruleMockaroo )
            // InternalMyDsl.g:4617:3: ruleMockaroo
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
    // InternalMyDsl.g:4626:1: rule__AtributoArreglo__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoArreglo__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4630:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:4631:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:4631:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:4632:3: ruleTipoAtributo
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


    // $ANTLR start "rule__AtributoArreglo__NameAssignment_3"
    // InternalMyDsl.g:4641:1: rule__AtributoArreglo__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__AtributoArreglo__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4645:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4646:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4646:2: ( RULE_ID )
            // InternalMyDsl.g:4647:3: RULE_ID
            {
             before(grammarAccess.getAtributoArregloAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtributoArregloAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__NameAssignment_3"


    // $ANTLR start "rule__AtributoSimple__TipoAssignment_0"
    // InternalMyDsl.g:4656:1: rule__AtributoSimple__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoSimple__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4660:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:4661:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:4661:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:4662:3: ruleTipoAtributo
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


    // $ANTLR start "rule__AtributoSimple__NameAssignment_1"
    // InternalMyDsl.g:4671:1: rule__AtributoSimple__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AtributoSimple__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4675:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4676:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4676:2: ( RULE_ID )
            // InternalMyDsl.g:4677:3: RULE_ID
            {
             before(grammarAccess.getAtributoSimpleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtributoSimpleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__NameAssignment_1"


    // $ANTLR start "rule__MyString__NameAssignment"
    // InternalMyDsl.g:4686:1: rule__MyString__NameAssignment : ( ruleEString ) ;
    public final void rule__MyString__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4690:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4691:2: ( ruleEString )
            {
            // InternalMyDsl.g:4691:2: ( ruleEString )
            // InternalMyDsl.g:4692:3: ruleEString
            {
             before(grammarAccess.getMyStringAccess().getNameEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMyStringAccess().getNameEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__NameAssignment"


    // $ANTLR start "rule__MyNumeric__NameAssignment"
    // InternalMyDsl.g:4701:1: rule__MyNumeric__NameAssignment : ( ruleEInt ) ;
    public final void rule__MyNumeric__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4705:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:4706:2: ( ruleEInt )
            {
            // InternalMyDsl.g:4706:2: ( ruleEInt )
            // InternalMyDsl.g:4707:3: ruleEInt
            {
             before(grammarAccess.getMyNumericAccess().getNameEIntParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMyNumericAccess().getNameEIntParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumeric__NameAssignment"


    // $ANTLR start "rule__MyBoolean__NameAssignment"
    // InternalMyDsl.g:4716:1: rule__MyBoolean__NameAssignment : ( ruleEBoolean ) ;
    public final void rule__MyBoolean__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4720:1: ( ( ruleEBoolean ) )
            // InternalMyDsl.g:4721:2: ( ruleEBoolean )
            {
            // InternalMyDsl.g:4721:2: ( ruleEBoolean )
            // InternalMyDsl.g:4722:3: ruleEBoolean
            {
             before(grammarAccess.getMyBooleanAccess().getNameEBooleanParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getMyBooleanAccess().getNameEBooleanParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBoolean__NameAssignment"


    // $ANTLR start "rule__MockarooEntity__NameAssignment_1"
    // InternalMyDsl.g:4731:1: rule__MockarooEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MockarooEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4735:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4736:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4736:2: ( RULE_ID )
            // InternalMyDsl.g:4737:3: RULE_ID
            {
             before(grammarAccess.getMockarooEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMockarooEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__NameAssignment_1"


    // $ANTLR start "rule__MockarooEntity__AtributosAssignment_3"
    // InternalMyDsl.g:4746:1: rule__MockarooEntity__AtributosAssignment_3 : ( ruleAtributo ) ;
    public final void rule__MockarooEntity__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4750:1: ( ( ruleAtributo ) )
            // InternalMyDsl.g:4751:2: ( ruleAtributo )
            {
            // InternalMyDsl.g:4751:2: ( ruleAtributo )
            // InternalMyDsl.g:4752:3: ruleAtributo
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
    // InternalMyDsl.g:4761:1: rule__ServicioRest__MetodoAssignment_0 : ( ruleTipoMetodoRest ) ;
    public final void rule__ServicioRest__MetodoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4765:1: ( ( ruleTipoMetodoRest ) )
            // InternalMyDsl.g:4766:2: ( ruleTipoMetodoRest )
            {
            // InternalMyDsl.g:4766:2: ( ruleTipoMetodoRest )
            // InternalMyDsl.g:4767:3: ruleTipoMetodoRest
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


    // $ANTLR start "rule__ServicioRest__NameAssignment_1"
    // InternalMyDsl.g:4776:1: rule__ServicioRest__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ServicioRest__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4780:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4781:2: ( ruleEString )
            {
            // InternalMyDsl.g:4781:2: ( ruleEString )
            // InternalMyDsl.g:4782:3: ruleEString
            {
             before(grammarAccess.getServicioRestAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServicioRestAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__NameAssignment_1"


    // $ANTLR start "rule__ServicioRest__UrlAssignment_6"
    // InternalMyDsl.g:4791:1: rule__ServicioRest__UrlAssignment_6 : ( ruleEString ) ;
    public final void rule__ServicioRest__UrlAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4795:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4796:2: ( ruleEString )
            {
            // InternalMyDsl.g:4796:2: ( ruleEString )
            // InternalMyDsl.g:4797:3: ruleEString
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
    // InternalMyDsl.g:4806:1: rule__ServicioRest__ParametrosAssignment_7_0 : ( ruleParametro ) ;
    public final void rule__ServicioRest__ParametrosAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4810:1: ( ( ruleParametro ) )
            // InternalMyDsl.g:4811:2: ( ruleParametro )
            {
            // InternalMyDsl.g:4811:2: ( ruleParametro )
            // InternalMyDsl.g:4812:3: ruleParametro
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
    // InternalMyDsl.g:4821:1: rule__ServicioRest__RequestAssignment_9 : ( ruleRequest ) ;
    public final void rule__ServicioRest__RequestAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4825:1: ( ( ruleRequest ) )
            // InternalMyDsl.g:4826:2: ( ruleRequest )
            {
            // InternalMyDsl.g:4826:2: ( ruleRequest )
            // InternalMyDsl.g:4827:3: ruleRequest
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
    // InternalMyDsl.g:4836:1: rule__ServicioRest__ResponseAssignment_10 : ( ruleResponse ) ;
    public final void rule__ServicioRest__ResponseAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4840:1: ( ( ruleResponse ) )
            // InternalMyDsl.g:4841:2: ( ruleResponse )
            {
            // InternalMyDsl.g:4841:2: ( ruleResponse )
            // InternalMyDsl.g:4842:3: ruleResponse
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


    // $ANTLR start "rule__QueryParam__NameAssignment_1"
    // InternalMyDsl.g:4851:1: rule__QueryParam__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__QueryParam__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4855:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4856:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4856:2: ( RULE_ID )
            // InternalMyDsl.g:4857:3: RULE_ID
            {
             before(grammarAccess.getQueryParamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryParamAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__NameAssignment_1"


    // $ANTLR start "rule__PathParam__NameAssignment_1"
    // InternalMyDsl.g:4866:1: rule__PathParam__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PathParam__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4870:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4871:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4871:2: ( RULE_ID )
            // InternalMyDsl.g:4872:3: RULE_ID
            {
             before(grammarAccess.getPathParamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPathParamAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathParam__NameAssignment_1"


    // $ANTLR start "rule__Response__TipoEntidadAssignment_4_0"
    // InternalMyDsl.g:4881:1: rule__Response__TipoEntidadAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__Response__TipoEntidadAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4885:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4886:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4886:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4887:3: ( RULE_ID )
            {
             before(grammarAccess.getResponseAccess().getTipoEntidadEntidadCrossReference_4_0_0()); 
            // InternalMyDsl.g:4888:3: ( RULE_ID )
            // InternalMyDsl.g:4889:4: RULE_ID
            {
             before(grammarAccess.getResponseAccess().getTipoEntidadEntidadIDTerminalRuleCall_4_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getTipoEntidadEntidadIDTerminalRuleCall_4_0_0_1()); 

            }

             after(grammarAccess.getResponseAccess().getTipoEntidadEntidadCrossReference_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__TipoEntidadAssignment_4_0"


    // $ANTLR start "rule__Response__TipoPrimitivoAssignment_4_1"
    // InternalMyDsl.g:4900:1: rule__Response__TipoPrimitivoAssignment_4_1 : ( ruleTipoAtributo ) ;
    public final void rule__Response__TipoPrimitivoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4904:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:4905:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:4905:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:4906:3: ruleTipoAtributo
            {
             before(grammarAccess.getResponseAccess().getTipoPrimitivoTipoAtributoEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getResponseAccess().getTipoPrimitivoTipoAtributoEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__TipoPrimitivoAssignment_4_1"


    // $ANTLR start "rule__Request__TipoEntidadAssignment_4_0"
    // InternalMyDsl.g:4915:1: rule__Request__TipoEntidadAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__Request__TipoEntidadAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4919:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4920:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4920:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4921:3: ( RULE_ID )
            {
             before(grammarAccess.getRequestAccess().getTipoEntidadEntidadCrossReference_4_0_0()); 
            // InternalMyDsl.g:4922:3: ( RULE_ID )
            // InternalMyDsl.g:4923:4: RULE_ID
            {
             before(grammarAccess.getRequestAccess().getTipoEntidadEntidadIDTerminalRuleCall_4_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getTipoEntidadEntidadIDTerminalRuleCall_4_0_0_1()); 

            }

             after(grammarAccess.getRequestAccess().getTipoEntidadEntidadCrossReference_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__TipoEntidadAssignment_4_0"


    // $ANTLR start "rule__Request__TipoPrimitivoAssignment_4_1"
    // InternalMyDsl.g:4934:1: rule__Request__TipoPrimitivoAssignment_4_1 : ( ruleTipoAtributo ) ;
    public final void rule__Request__TipoPrimitivoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4938:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:4939:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:4939:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:4940:3: ruleTipoAtributo
            {
             before(grammarAccess.getRequestAccess().getTipoPrimitivoTipoAtributoEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getRequestAccess().getTipoPrimitivoTipoAtributoEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__TipoPrimitivoAssignment_4_1"


    // $ANTLR start "rule__PrimitiveType__NameAssignment"
    // InternalMyDsl.g:4949:1: rule__PrimitiveType__NameAssignment : ( ruleTipoAtributo ) ;
    public final void rule__PrimitiveType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4953:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:4954:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:4954:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:4955:3: ruleTipoAtributo
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameTipoAtributoEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeAccess().getNameTipoAtributoEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__NameAssignment"


    // $ANTLR start "rule__Test__ServiceAssignment_6"
    // InternalMyDsl.g:4964:1: rule__Test__ServiceAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Test__ServiceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4968:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4969:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4969:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4970:3: ( RULE_ID )
            {
             before(grammarAccess.getTestAccess().getServiceServicioRestCrossReference_6_0()); 
            // InternalMyDsl.g:4971:3: ( RULE_ID )
            // InternalMyDsl.g:4972:4: RULE_ID
            {
             before(grammarAccess.getTestAccess().getServiceServicioRestIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getServiceServicioRestIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getTestAccess().getServiceServicioRestCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__ServiceAssignment_6"


    // $ANTLR start "rule__Test__DescripcionAssignment_10"
    // InternalMyDsl.g:4983:1: rule__Test__DescripcionAssignment_10 : ( ruleEString ) ;
    public final void rule__Test__DescripcionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4987:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4988:2: ( ruleEString )
            {
            // InternalMyDsl.g:4988:2: ( ruleEString )
            // InternalMyDsl.g:4989:3: ruleEString
            {
             before(grammarAccess.getTestAccess().getDescripcionEStringParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTestAccess().getDescripcionEStringParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__DescripcionAssignment_10"


    // $ANTLR start "rule__Test__MappingsAssignment_12_2"
    // InternalMyDsl.g:4998:1: rule__Test__MappingsAssignment_12_2 : ( ruleMapping ) ;
    public final void rule__Test__MappingsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5002:1: ( ( ruleMapping ) )
            // InternalMyDsl.g:5003:2: ( ruleMapping )
            {
            // InternalMyDsl.g:5003:2: ( ruleMapping )
            // InternalMyDsl.g:5004:3: ruleMapping
            {
             before(grammarAccess.getTestAccess().getMappingsMappingParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getTestAccess().getMappingsMappingParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__MappingsAssignment_12_2"


    // $ANTLR start "rule__Test__AsertionsAssignment_15"
    // InternalMyDsl.g:5013:1: rule__Test__AsertionsAssignment_15 : ( ruleAsercion ) ;
    public final void rule__Test__AsertionsAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5017:1: ( ( ruleAsercion ) )
            // InternalMyDsl.g:5018:2: ( ruleAsercion )
            {
            // InternalMyDsl.g:5018:2: ( ruleAsercion )
            // InternalMyDsl.g:5019:3: ruleAsercion
            {
             before(grammarAccess.getTestAccess().getAsertionsAsercionParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleAsercion();

            state._fsp--;

             after(grammarAccess.getTestAccess().getAsertionsAsercionParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__AsertionsAssignment_15"


    // $ANTLR start "rule__Mapping__ServicioAssignment_2"
    // InternalMyDsl.g:5028:1: rule__Mapping__ServicioAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Mapping__ServicioAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5032:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5033:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5033:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5034:3: ( RULE_ID )
            {
             before(grammarAccess.getMappingAccess().getServicioServicioRestCrossReference_2_0()); 
            // InternalMyDsl.g:5035:3: ( RULE_ID )
            // InternalMyDsl.g:5036:4: RULE_ID
            {
             before(grammarAccess.getMappingAccess().getServicioServicioRestIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getServicioServicioRestIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getServicioServicioRestCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__ServicioAssignment_2"


    // $ANTLR start "rule__Mapping__ParametroAssignment_4"
    // InternalMyDsl.g:5047:1: rule__Mapping__ParametroAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Mapping__ParametroAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5051:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5052:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5052:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5053:3: ( RULE_ID )
            {
             before(grammarAccess.getMappingAccess().getParametroParametroCrossReference_4_0()); 
            // InternalMyDsl.g:5054:3: ( RULE_ID )
            // InternalMyDsl.g:5055:4: RULE_ID
            {
             before(grammarAccess.getMappingAccess().getParametroParametroIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getParametroParametroIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getParametroParametroCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__ParametroAssignment_4"


    // $ANTLR start "rule__Mapping__ReferenciaEntidadAssignment_8_0_1"
    // InternalMyDsl.g:5066:1: rule__Mapping__ReferenciaEntidadAssignment_8_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Mapping__ReferenciaEntidadAssignment_8_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5070:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5071:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5071:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5072:3: ( RULE_ID )
            {
             before(grammarAccess.getMappingAccess().getReferenciaEntidadEntidadCrossReference_8_0_1_0()); 
            // InternalMyDsl.g:5073:3: ( RULE_ID )
            // InternalMyDsl.g:5074:4: RULE_ID
            {
             before(grammarAccess.getMappingAccess().getReferenciaEntidadEntidadIDTerminalRuleCall_8_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getReferenciaEntidadEntidadIDTerminalRuleCall_8_0_1_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getReferenciaEntidadEntidadCrossReference_8_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__ReferenciaEntidadAssignment_8_0_1"


    // $ANTLR start "rule__Mapping__ReferenciaAssignment_8_0_3"
    // InternalMyDsl.g:5085:1: rule__Mapping__ReferenciaAssignment_8_0_3 : ( ( RULE_ID ) ) ;
    public final void rule__Mapping__ReferenciaAssignment_8_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5089:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5090:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5090:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5091:3: ( RULE_ID )
            {
             before(grammarAccess.getMappingAccess().getReferenciaAtributoCrossReference_8_0_3_0()); 
            // InternalMyDsl.g:5092:3: ( RULE_ID )
            // InternalMyDsl.g:5093:4: RULE_ID
            {
             before(grammarAccess.getMappingAccess().getReferenciaAtributoIDTerminalRuleCall_8_0_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getReferenciaAtributoIDTerminalRuleCall_8_0_3_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getReferenciaAtributoCrossReference_8_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__ReferenciaAssignment_8_0_3"


    // $ANTLR start "rule__Mapping__DatoprimitivoAssignment_8_1"
    // InternalMyDsl.g:5104:1: rule__Mapping__DatoprimitivoAssignment_8_1 : ( ruleDatoPrimitivo ) ;
    public final void rule__Mapping__DatoprimitivoAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5108:1: ( ( ruleDatoPrimitivo ) )
            // InternalMyDsl.g:5109:2: ( ruleDatoPrimitivo )
            {
            // InternalMyDsl.g:5109:2: ( ruleDatoPrimitivo )
            // InternalMyDsl.g:5110:3: ruleDatoPrimitivo
            {
             before(grammarAccess.getMappingAccess().getDatoprimitivoDatoPrimitivoParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDatoPrimitivo();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getDatoprimitivoDatoPrimitivoParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__DatoprimitivoAssignment_8_1"


    // $ANTLR start "rule__Asercion__Elemento1Assignment_3"
    // InternalMyDsl.g:5119:1: rule__Asercion__Elemento1Assignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Asercion__Elemento1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5123:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5124:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5124:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5125:3: ( ruleEString )
            {
             before(grammarAccess.getAsercionAccess().getElemento1ElementoCrossReference_3_0()); 
            // InternalMyDsl.g:5126:3: ( ruleEString )
            // InternalMyDsl.g:5127:4: ruleEString
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
    // InternalMyDsl.g:5138:1: rule__Asercion__Elemento2Assignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Asercion__Elemento2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5142:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5143:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5143:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5144:3: ( ruleEString )
            {
             before(grammarAccess.getAsercionAccess().getElemento2ElementoCrossReference_5_0()); 
            // InternalMyDsl.g:5145:3: ( ruleEString )
            // InternalMyDsl.g:5146:4: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0020202F00038000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000202000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000038000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000FFFC0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0003800000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0003800000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000038040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000100L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x8000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x4000000000006070L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});

}