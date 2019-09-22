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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'response.status'", "'response'", "'true'", "'false'", "'string'", "'int'", "'boolean'", "'=='", "'>'", "'<'", "'>='", "'<='", "'FirstNameType'", "'LastNameType'", "'FamilyNameType'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CityType'", "'CountryCodeType'", "'LatitudeType'", "'LongitudType'", "'RowNumberType'", "'BooleanType'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'apiURL'", "'SimpleEntity'", "'{'", "'}'", "'('", "')'", "'mockType'", "'['", "']'", "'Entity'", "'URL'", "'/'", "'?${'", "'/:{'", "'Response'", "'Type'", "'Request'", "'Test'", "'service'", "'description'", "'Assertions'", "'Mapping'", "'{parameter'", "','", "'value'", "'request->'", "'response->'", "'parameter.'", "'.'", "'PK,mockType'"
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
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int RULE_SEMICOLON=8;
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMyDsl.g:678:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleQualifiedName EOF )
            // InternalMyDsl.g:680:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMyDsl.g:687:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMyDsl.g:693:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalMyDsl.g:694:3: ( rule__QualifiedName__Group__0 )
            // InternalMyDsl.g:694:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleTipoAtributo"
    // InternalMyDsl.g:703:1: ruleTipoAtributo : ( ( rule__TipoAtributo__Alternatives ) ) ;
    public final void ruleTipoAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:707:1: ( ( ( rule__TipoAtributo__Alternatives ) ) )
            // InternalMyDsl.g:708:2: ( ( rule__TipoAtributo__Alternatives ) )
            {
            // InternalMyDsl.g:708:2: ( ( rule__TipoAtributo__Alternatives ) )
            // InternalMyDsl.g:709:3: ( rule__TipoAtributo__Alternatives )
            {
             before(grammarAccess.getTipoAtributoAccess().getAlternatives()); 
            // InternalMyDsl.g:710:3: ( rule__TipoAtributo__Alternatives )
            // InternalMyDsl.g:710:4: rule__TipoAtributo__Alternatives
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


    // $ANTLR start "ruleOperador"
    // InternalMyDsl.g:719:1: ruleOperador : ( ( rule__Operador__Alternatives ) ) ;
    public final void ruleOperador() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:723:1: ( ( ( rule__Operador__Alternatives ) ) )
            // InternalMyDsl.g:724:2: ( ( rule__Operador__Alternatives ) )
            {
            // InternalMyDsl.g:724:2: ( ( rule__Operador__Alternatives ) )
            // InternalMyDsl.g:725:3: ( rule__Operador__Alternatives )
            {
             before(grammarAccess.getOperadorAccess().getAlternatives()); 
            // InternalMyDsl.g:726:3: ( rule__Operador__Alternatives )
            // InternalMyDsl.g:726:4: rule__Operador__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operador__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperadorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperador"


    // $ANTLR start "ruleMockaroo"
    // InternalMyDsl.g:735:1: ruleMockaroo : ( ( rule__Mockaroo__Alternatives ) ) ;
    public final void ruleMockaroo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:739:1: ( ( ( rule__Mockaroo__Alternatives ) ) )
            // InternalMyDsl.g:740:2: ( ( rule__Mockaroo__Alternatives ) )
            {
            // InternalMyDsl.g:740:2: ( ( rule__Mockaroo__Alternatives ) )
            // InternalMyDsl.g:741:3: ( rule__Mockaroo__Alternatives )
            {
             before(grammarAccess.getMockarooAccess().getAlternatives()); 
            // InternalMyDsl.g:742:3: ( rule__Mockaroo__Alternatives )
            // InternalMyDsl.g:742:4: rule__Mockaroo__Alternatives
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
    // InternalMyDsl.g:751:1: ruleTipoMetodoRest : ( ( rule__TipoMetodoRest__Alternatives ) ) ;
    public final void ruleTipoMetodoRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:755:1: ( ( ( rule__TipoMetodoRest__Alternatives ) ) )
            // InternalMyDsl.g:756:2: ( ( rule__TipoMetodoRest__Alternatives ) )
            {
            // InternalMyDsl.g:756:2: ( ( rule__TipoMetodoRest__Alternatives ) )
            // InternalMyDsl.g:757:3: ( rule__TipoMetodoRest__Alternatives )
            {
             before(grammarAccess.getTipoMetodoRestAccess().getAlternatives()); 
            // InternalMyDsl.g:758:3: ( rule__TipoMetodoRest__Alternatives )
            // InternalMyDsl.g:758:4: rule__TipoMetodoRest__Alternatives
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
    // InternalMyDsl.g:766:1: rule__Entidad__Alternatives : ( ( ruleSimpleEntity ) | ( ruleMockarooEntity ) );
    public final void rule__Entidad__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:770:1: ( ( ruleSimpleEntity ) | ( ruleMockarooEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==44) ) {
                alt1=1;
            }
            else if ( (LA1_0==52) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:771:2: ( ruleSimpleEntity )
                    {
                    // InternalMyDsl.g:771:2: ( ruleSimpleEntity )
                    // InternalMyDsl.g:772:3: ruleSimpleEntity
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
                    // InternalMyDsl.g:777:2: ( ruleMockarooEntity )
                    {
                    // InternalMyDsl.g:777:2: ( ruleMockarooEntity )
                    // InternalMyDsl.g:778:3: ruleMockarooEntity
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
    // InternalMyDsl.g:787:1: rule__Atributo__Alternatives : ( ( ruleAtributoMocka ) | ( ruleAtributoArreglo ) | ( ruleAtributoSimple ) );
    public final void rule__Atributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:1: ( ( ruleAtributoMocka ) | ( ruleAtributoArreglo ) | ( ruleAtributoSimple ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==47) ) {
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
                else if ( (LA2_1==50) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_ID) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==47) ) {
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
                else if ( (LA2_2==50) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==RULE_ID) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==47) ) {
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
                else if ( (LA2_3==50) ) {
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
                    // InternalMyDsl.g:792:2: ( ruleAtributoMocka )
                    {
                    // InternalMyDsl.g:792:2: ( ruleAtributoMocka )
                    // InternalMyDsl.g:793:3: ruleAtributoMocka
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
                    // InternalMyDsl.g:798:2: ( ruleAtributoArreglo )
                    {
                    // InternalMyDsl.g:798:2: ( ruleAtributoArreglo )
                    // InternalMyDsl.g:799:3: ruleAtributoArreglo
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
                    // InternalMyDsl.g:804:2: ( ruleAtributoSimple )
                    {
                    // InternalMyDsl.g:804:2: ( ruleAtributoSimple )
                    // InternalMyDsl.g:805:3: ruleAtributoSimple
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
    // InternalMyDsl.g:814:1: rule__AtributoMocka__Alternatives_2_1 : ( ( ( rule__AtributoMocka__Group_2_1_0__0 ) ) | ( ( rule__AtributoMocka__Group_2_1_1__0 ) ) );
    public final void rule__AtributoMocka__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:818:1: ( ( ( rule__AtributoMocka__Group_2_1_0__0 ) ) | ( ( rule__AtributoMocka__Group_2_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==72) ) {
                alt3=1;
            }
            else if ( (LA3_0==49) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:819:2: ( ( rule__AtributoMocka__Group_2_1_0__0 ) )
                    {
                    // InternalMyDsl.g:819:2: ( ( rule__AtributoMocka__Group_2_1_0__0 ) )
                    // InternalMyDsl.g:820:3: ( rule__AtributoMocka__Group_2_1_0__0 )
                    {
                     before(grammarAccess.getAtributoMockaAccess().getGroup_2_1_0()); 
                    // InternalMyDsl.g:821:3: ( rule__AtributoMocka__Group_2_1_0__0 )
                    // InternalMyDsl.g:821:4: rule__AtributoMocka__Group_2_1_0__0
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
                    // InternalMyDsl.g:825:2: ( ( rule__AtributoMocka__Group_2_1_1__0 ) )
                    {
                    // InternalMyDsl.g:825:2: ( ( rule__AtributoMocka__Group_2_1_1__0 ) )
                    // InternalMyDsl.g:826:3: ( rule__AtributoMocka__Group_2_1_1__0 )
                    {
                     before(grammarAccess.getAtributoMockaAccess().getGroup_2_1_1()); 
                    // InternalMyDsl.g:827:3: ( rule__AtributoMocka__Group_2_1_1__0 )
                    // InternalMyDsl.g:827:4: rule__AtributoMocka__Group_2_1_1__0
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
    // InternalMyDsl.g:835:1: rule__ServicioRest__Alternatives_7 : ( ( ( rule__ServicioRest__ParametrosAssignment_7_0 ) ) | ( ( rule__ServicioRest__Group_7_1__0 ) ) );
    public final void rule__ServicioRest__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( ( ( rule__ServicioRest__ParametrosAssignment_7_0 ) ) | ( ( rule__ServicioRest__Group_7_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=55 && LA4_0<=56)) ) {
                alt4=1;
            }
            else if ( (LA4_0==54) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:840:2: ( ( rule__ServicioRest__ParametrosAssignment_7_0 ) )
                    {
                    // InternalMyDsl.g:840:2: ( ( rule__ServicioRest__ParametrosAssignment_7_0 ) )
                    // InternalMyDsl.g:841:3: ( rule__ServicioRest__ParametrosAssignment_7_0 )
                    {
                     before(grammarAccess.getServicioRestAccess().getParametrosAssignment_7_0()); 
                    // InternalMyDsl.g:842:3: ( rule__ServicioRest__ParametrosAssignment_7_0 )
                    // InternalMyDsl.g:842:4: rule__ServicioRest__ParametrosAssignment_7_0
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
                    // InternalMyDsl.g:846:2: ( ( rule__ServicioRest__Group_7_1__0 ) )
                    {
                    // InternalMyDsl.g:846:2: ( ( rule__ServicioRest__Group_7_1__0 ) )
                    // InternalMyDsl.g:847:3: ( rule__ServicioRest__Group_7_1__0 )
                    {
                     before(grammarAccess.getServicioRestAccess().getGroup_7_1()); 
                    // InternalMyDsl.g:848:3: ( rule__ServicioRest__Group_7_1__0 )
                    // InternalMyDsl.g:848:4: rule__ServicioRest__Group_7_1__0
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
    // InternalMyDsl.g:856:1: rule__Parametro__Alternatives : ( ( ruleQueryParam ) | ( rulePathParam ) );
    public final void rule__Parametro__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:860:1: ( ( ruleQueryParam ) | ( rulePathParam ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==55) ) {
                alt5=1;
            }
            else if ( (LA5_0==56) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:861:2: ( ruleQueryParam )
                    {
                    // InternalMyDsl.g:861:2: ( ruleQueryParam )
                    // InternalMyDsl.g:862:3: ruleQueryParam
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
                    // InternalMyDsl.g:867:2: ( rulePathParam )
                    {
                    // InternalMyDsl.g:867:2: ( rulePathParam )
                    // InternalMyDsl.g:868:3: rulePathParam
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
    // InternalMyDsl.g:877:1: rule__Response__Alternatives_4 : ( ( ( rule__Response__TipoEntidadAssignment_4_0 ) ) | ( ( rule__Response__TipoPrimitivoAssignment_4_1 ) ) );
    public final void rule__Response__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:881:1: ( ( ( rule__Response__TipoEntidadAssignment_4_0 ) ) | ( ( rule__Response__TipoPrimitivoAssignment_4_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=17 && LA6_0<=19)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:882:2: ( ( rule__Response__TipoEntidadAssignment_4_0 ) )
                    {
                    // InternalMyDsl.g:882:2: ( ( rule__Response__TipoEntidadAssignment_4_0 ) )
                    // InternalMyDsl.g:883:3: ( rule__Response__TipoEntidadAssignment_4_0 )
                    {
                     before(grammarAccess.getResponseAccess().getTipoEntidadAssignment_4_0()); 
                    // InternalMyDsl.g:884:3: ( rule__Response__TipoEntidadAssignment_4_0 )
                    // InternalMyDsl.g:884:4: rule__Response__TipoEntidadAssignment_4_0
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
                    // InternalMyDsl.g:888:2: ( ( rule__Response__TipoPrimitivoAssignment_4_1 ) )
                    {
                    // InternalMyDsl.g:888:2: ( ( rule__Response__TipoPrimitivoAssignment_4_1 ) )
                    // InternalMyDsl.g:889:3: ( rule__Response__TipoPrimitivoAssignment_4_1 )
                    {
                     before(grammarAccess.getResponseAccess().getTipoPrimitivoAssignment_4_1()); 
                    // InternalMyDsl.g:890:3: ( rule__Response__TipoPrimitivoAssignment_4_1 )
                    // InternalMyDsl.g:890:4: rule__Response__TipoPrimitivoAssignment_4_1
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
    // InternalMyDsl.g:898:1: rule__Request__Alternatives_4 : ( ( ( rule__Request__TipoEntidadAssignment_4_0 ) ) | ( ( rule__Request__TipoPrimitivoAssignment_4_1 ) ) );
    public final void rule__Request__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:902:1: ( ( ( rule__Request__TipoEntidadAssignment_4_0 ) ) | ( ( rule__Request__TipoPrimitivoAssignment_4_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=17 && LA7_0<=19)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:903:2: ( ( rule__Request__TipoEntidadAssignment_4_0 ) )
                    {
                    // InternalMyDsl.g:903:2: ( ( rule__Request__TipoEntidadAssignment_4_0 ) )
                    // InternalMyDsl.g:904:3: ( rule__Request__TipoEntidadAssignment_4_0 )
                    {
                     before(grammarAccess.getRequestAccess().getTipoEntidadAssignment_4_0()); 
                    // InternalMyDsl.g:905:3: ( rule__Request__TipoEntidadAssignment_4_0 )
                    // InternalMyDsl.g:905:4: rule__Request__TipoEntidadAssignment_4_0
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
                    // InternalMyDsl.g:909:2: ( ( rule__Request__TipoPrimitivoAssignment_4_1 ) )
                    {
                    // InternalMyDsl.g:909:2: ( ( rule__Request__TipoPrimitivoAssignment_4_1 ) )
                    // InternalMyDsl.g:910:3: ( rule__Request__TipoPrimitivoAssignment_4_1 )
                    {
                     before(grammarAccess.getRequestAccess().getTipoPrimitivoAssignment_4_1()); 
                    // InternalMyDsl.g:911:3: ( rule__Request__TipoPrimitivoAssignment_4_1 )
                    // InternalMyDsl.g:911:4: rule__Request__TipoPrimitivoAssignment_4_1
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
    // InternalMyDsl.g:919:1: rule__DatoPrimitivo__Alternatives : ( ( ruleMyNumeric ) | ( ruleMyString ) | ( ruleMyBoolean ) );
    public final void rule__DatoPrimitivo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:923:1: ( ( ruleMyNumeric ) | ( ruleMyString ) | ( ruleMyBoolean ) )
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
            case 15:
            case 16:
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
                    // InternalMyDsl.g:924:2: ( ruleMyNumeric )
                    {
                    // InternalMyDsl.g:924:2: ( ruleMyNumeric )
                    // InternalMyDsl.g:925:3: ruleMyNumeric
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
                    // InternalMyDsl.g:930:2: ( ruleMyString )
                    {
                    // InternalMyDsl.g:930:2: ( ruleMyString )
                    // InternalMyDsl.g:931:3: ruleMyString
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
                    // InternalMyDsl.g:936:2: ( ruleMyBoolean )
                    {
                    // InternalMyDsl.g:936:2: ( ruleMyBoolean )
                    // InternalMyDsl.g:937:3: ruleMyBoolean
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


    // $ANTLR start "rule__Mapping__Alternatives_6"
    // InternalMyDsl.g:946:1: rule__Mapping__Alternatives_6 : ( ( ( rule__Mapping__Group_6_0__0 ) ) | ( ( rule__Mapping__DatoprimitivoAssignment_6_1 ) ) );
    public final void rule__Mapping__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:950:1: ( ( ( rule__Mapping__Group_6_0__0 ) ) | ( ( rule__Mapping__DatoprimitivoAssignment_6_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==68) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_ID)||(LA9_0>=15 && LA9_0<=16)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:951:2: ( ( rule__Mapping__Group_6_0__0 ) )
                    {
                    // InternalMyDsl.g:951:2: ( ( rule__Mapping__Group_6_0__0 ) )
                    // InternalMyDsl.g:952:3: ( rule__Mapping__Group_6_0__0 )
                    {
                     before(grammarAccess.getMappingAccess().getGroup_6_0()); 
                    // InternalMyDsl.g:953:3: ( rule__Mapping__Group_6_0__0 )
                    // InternalMyDsl.g:953:4: rule__Mapping__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mapping__Group_6_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMappingAccess().getGroup_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:957:2: ( ( rule__Mapping__DatoprimitivoAssignment_6_1 ) )
                    {
                    // InternalMyDsl.g:957:2: ( ( rule__Mapping__DatoprimitivoAssignment_6_1 ) )
                    // InternalMyDsl.g:958:3: ( rule__Mapping__DatoprimitivoAssignment_6_1 )
                    {
                     before(grammarAccess.getMappingAccess().getDatoprimitivoAssignment_6_1()); 
                    // InternalMyDsl.g:959:3: ( rule__Mapping__DatoprimitivoAssignment_6_1 )
                    // InternalMyDsl.g:959:4: rule__Mapping__DatoprimitivoAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mapping__DatoprimitivoAssignment_6_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMappingAccess().getDatoprimitivoAssignment_6_1()); 

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
    // $ANTLR end "rule__Mapping__Alternatives_6"


    // $ANTLR start "rule__Asercion__Alternatives_0"
    // InternalMyDsl.g:967:1: rule__Asercion__Alternatives_0 : ( ( 'response.status' ) | ( 'response' ) | ( ( rule__Asercion__Group_0_2__0 ) ) );
    public final void rule__Asercion__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:971:1: ( ( 'response.status' ) | ( 'response' ) | ( ( rule__Asercion__Group_0_2__0 ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt10=1;
                }
                break;
            case 14:
                {
                alt10=2;
                }
                break;
            case 69:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:972:2: ( 'response.status' )
                    {
                    // InternalMyDsl.g:972:2: ( 'response.status' )
                    // InternalMyDsl.g:973:3: 'response.status'
                    {
                     before(grammarAccess.getAsercionAccess().getResponseStatusKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAsercionAccess().getResponseStatusKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:978:2: ( 'response' )
                    {
                    // InternalMyDsl.g:978:2: ( 'response' )
                    // InternalMyDsl.g:979:3: 'response'
                    {
                     before(grammarAccess.getAsercionAccess().getResponseKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAsercionAccess().getResponseKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:984:2: ( ( rule__Asercion__Group_0_2__0 ) )
                    {
                    // InternalMyDsl.g:984:2: ( ( rule__Asercion__Group_0_2__0 ) )
                    // InternalMyDsl.g:985:3: ( rule__Asercion__Group_0_2__0 )
                    {
                     before(grammarAccess.getAsercionAccess().getGroup_0_2()); 
                    // InternalMyDsl.g:986:3: ( rule__Asercion__Group_0_2__0 )
                    // InternalMyDsl.g:986:4: rule__Asercion__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Asercion__Group_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAsercionAccess().getGroup_0_2()); 

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
    // $ANTLR end "rule__Asercion__Alternatives_0"


    // $ANTLR start "rule__Asercion__Alternatives_2"
    // InternalMyDsl.g:994:1: rule__Asercion__Alternatives_2 : ( ( ( rule__Asercion__ElementoPrimitivo2Assignment_2_0 ) ) | ( ( rule__Asercion__Group_2_1__0 ) ) );
    public final void rule__Asercion__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:998:1: ( ( ( rule__Asercion__ElementoPrimitivo2Assignment_2_0 ) ) | ( ( rule__Asercion__Group_2_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_ID)||(LA11_0>=15 && LA11_0<=16)) ) {
                alt11=1;
            }
            else if ( (LA11_0==70) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:999:2: ( ( rule__Asercion__ElementoPrimitivo2Assignment_2_0 ) )
                    {
                    // InternalMyDsl.g:999:2: ( ( rule__Asercion__ElementoPrimitivo2Assignment_2_0 ) )
                    // InternalMyDsl.g:1000:3: ( rule__Asercion__ElementoPrimitivo2Assignment_2_0 )
                    {
                     before(grammarAccess.getAsercionAccess().getElementoPrimitivo2Assignment_2_0()); 
                    // InternalMyDsl.g:1001:3: ( rule__Asercion__ElementoPrimitivo2Assignment_2_0 )
                    // InternalMyDsl.g:1001:4: rule__Asercion__ElementoPrimitivo2Assignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Asercion__ElementoPrimitivo2Assignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAsercionAccess().getElementoPrimitivo2Assignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1005:2: ( ( rule__Asercion__Group_2_1__0 ) )
                    {
                    // InternalMyDsl.g:1005:2: ( ( rule__Asercion__Group_2_1__0 ) )
                    // InternalMyDsl.g:1006:3: ( rule__Asercion__Group_2_1__0 )
                    {
                     before(grammarAccess.getAsercionAccess().getGroup_2_1()); 
                    // InternalMyDsl.g:1007:3: ( rule__Asercion__Group_2_1__0 )
                    // InternalMyDsl.g:1007:4: rule__Asercion__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Asercion__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAsercionAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Asercion__Alternatives_2"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalMyDsl.g:1015:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1019:1: ( ( 'true' ) | ( 'false' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            else if ( (LA12_0==16) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1020:2: ( 'true' )
                    {
                    // InternalMyDsl.g:1020:2: ( 'true' )
                    // InternalMyDsl.g:1021:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1026:2: ( 'false' )
                    {
                    // InternalMyDsl.g:1026:2: ( 'false' )
                    // InternalMyDsl.g:1027:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:1036:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1040:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1041:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:1041:2: ( RULE_STRING )
                    // InternalMyDsl.g:1042:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1047:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:1047:2: ( RULE_ID )
                    // InternalMyDsl.g:1048:3: RULE_ID
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
    // InternalMyDsl.g:1057:1: rule__TipoAtributo__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) );
    public final void rule__TipoAtributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1061:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt14=1;
                }
                break;
            case 18:
                {
                alt14=2;
                }
                break;
            case 19:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1062:2: ( ( 'string' ) )
                    {
                    // InternalMyDsl.g:1062:2: ( ( 'string' ) )
                    // InternalMyDsl.g:1063:3: ( 'string' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1064:3: ( 'string' )
                    // InternalMyDsl.g:1064:4: 'string'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1068:2: ( ( 'int' ) )
                    {
                    // InternalMyDsl.g:1068:2: ( ( 'int' ) )
                    // InternalMyDsl.g:1069:3: ( 'int' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1070:3: ( 'int' )
                    // InternalMyDsl.g:1070:4: 'int'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1074:2: ( ( 'boolean' ) )
                    {
                    // InternalMyDsl.g:1074:2: ( ( 'boolean' ) )
                    // InternalMyDsl.g:1075:3: ( 'boolean' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1076:3: ( 'boolean' )
                    // InternalMyDsl.g:1076:4: 'boolean'
                    {
                    match(input,19,FOLLOW_2); 

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


    // $ANTLR start "rule__Operador__Alternatives"
    // InternalMyDsl.g:1084:1: rule__Operador__Alternatives : ( ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__Operador__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1088:1: ( ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt15=1;
                }
                break;
            case 21:
                {
                alt15=2;
                }
                break;
            case 22:
                {
                alt15=3;
                }
                break;
            case 23:
                {
                alt15=4;
                }
                break;
            case 24:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1089:2: ( ( '==' ) )
                    {
                    // InternalMyDsl.g:1089:2: ( ( '==' ) )
                    // InternalMyDsl.g:1090:3: ( '==' )
                    {
                     before(grammarAccess.getOperadorAccess().getIgualEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1091:3: ( '==' )
                    // InternalMyDsl.g:1091:4: '=='
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getIgualEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1095:2: ( ( '>' ) )
                    {
                    // InternalMyDsl.g:1095:2: ( ( '>' ) )
                    // InternalMyDsl.g:1096:3: ( '>' )
                    {
                     before(grammarAccess.getOperadorAccess().getMayorEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1097:3: ( '>' )
                    // InternalMyDsl.g:1097:4: '>'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMayorEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1101:2: ( ( '<' ) )
                    {
                    // InternalMyDsl.g:1101:2: ( ( '<' ) )
                    // InternalMyDsl.g:1102:3: ( '<' )
                    {
                     before(grammarAccess.getOperadorAccess().getMenorEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1103:3: ( '<' )
                    // InternalMyDsl.g:1103:4: '<'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMenorEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1107:2: ( ( '>=' ) )
                    {
                    // InternalMyDsl.g:1107:2: ( ( '>=' ) )
                    // InternalMyDsl.g:1108:3: ( '>=' )
                    {
                     before(grammarAccess.getOperadorAccess().getMayorIgualEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1109:3: ( '>=' )
                    // InternalMyDsl.g:1109:4: '>='
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMayorIgualEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1113:2: ( ( '<=' ) )
                    {
                    // InternalMyDsl.g:1113:2: ( ( '<=' ) )
                    // InternalMyDsl.g:1114:3: ( '<=' )
                    {
                     before(grammarAccess.getOperadorAccess().getMenorIgualEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:1115:3: ( '<=' )
                    // InternalMyDsl.g:1115:4: '<='
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMenorIgualEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__Operador__Alternatives"


    // $ANTLR start "rule__Mockaroo__Alternatives"
    // InternalMyDsl.g:1123:1: rule__Mockaroo__Alternatives : ( ( ( 'FirstNameType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CityType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'LatitudeType' ) ) | ( ( 'LongitudType' ) ) | ( ( 'RowNumberType' ) ) | ( ( 'BooleanType' ) ) );
    public final void rule__Mockaroo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1127:1: ( ( ( 'FirstNameType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CityType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'LatitudeType' ) ) | ( ( 'LongitudType' ) ) | ( ( 'RowNumberType' ) ) | ( ( 'BooleanType' ) ) )
            int alt16=14;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt16=1;
                }
                break;
            case 26:
                {
                alt16=2;
                }
                break;
            case 27:
                {
                alt16=3;
                }
                break;
            case 28:
                {
                alt16=4;
                }
                break;
            case 29:
                {
                alt16=5;
                }
                break;
            case 30:
                {
                alt16=6;
                }
                break;
            case 31:
                {
                alt16=7;
                }
                break;
            case 32:
                {
                alt16=8;
                }
                break;
            case 33:
                {
                alt16=9;
                }
                break;
            case 34:
                {
                alt16=10;
                }
                break;
            case 35:
                {
                alt16=11;
                }
                break;
            case 36:
                {
                alt16=12;
                }
                break;
            case 37:
                {
                alt16=13;
                }
                break;
            case 38:
                {
                alt16=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1128:2: ( ( 'FirstNameType' ) )
                    {
                    // InternalMyDsl.g:1128:2: ( ( 'FirstNameType' ) )
                    // InternalMyDsl.g:1129:3: ( 'FirstNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1130:3: ( 'FirstNameType' )
                    // InternalMyDsl.g:1130:4: 'FirstNameType'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1134:2: ( ( 'LastNameType' ) )
                    {
                    // InternalMyDsl.g:1134:2: ( ( 'LastNameType' ) )
                    // InternalMyDsl.g:1135:3: ( 'LastNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1136:3: ( 'LastNameType' )
                    // InternalMyDsl.g:1136:4: 'LastNameType'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1140:2: ( ( 'FamilyNameType' ) )
                    {
                    // InternalMyDsl.g:1140:2: ( ( 'FamilyNameType' ) )
                    // InternalMyDsl.g:1141:3: ( 'FamilyNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1142:3: ( 'FamilyNameType' )
                    // InternalMyDsl.g:1142:4: 'FamilyNameType'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1146:2: ( ( 'FullNameType' ) )
                    {
                    // InternalMyDsl.g:1146:2: ( ( 'FullNameType' ) )
                    // InternalMyDsl.g:1147:3: ( 'FullNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1148:3: ( 'FullNameType' )
                    // InternalMyDsl.g:1148:4: 'FullNameType'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1152:2: ( ( 'GenderType' ) )
                    {
                    // InternalMyDsl.g:1152:2: ( ( 'GenderType' ) )
                    // InternalMyDsl.g:1153:3: ( 'GenderType' )
                    {
                     before(grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:1154:3: ( 'GenderType' )
                    // InternalMyDsl.g:1154:4: 'GenderType'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1158:2: ( ( 'EmailAddressType' ) )
                    {
                    // InternalMyDsl.g:1158:2: ( ( 'EmailAddressType' ) )
                    // InternalMyDsl.g:1159:3: ( 'EmailAddressType' )
                    {
                     before(grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:1160:3: ( 'EmailAddressType' )
                    // InternalMyDsl.g:1160:4: 'EmailAddressType'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1164:2: ( ( 'PhoneType' ) )
                    {
                    // InternalMyDsl.g:1164:2: ( ( 'PhoneType' ) )
                    // InternalMyDsl.g:1165:3: ( 'PhoneType' )
                    {
                     before(grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:1166:3: ( 'PhoneType' )
                    // InternalMyDsl.g:1166:4: 'PhoneType'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1170:2: ( ( 'CountryType' ) )
                    {
                    // InternalMyDsl.g:1170:2: ( ( 'CountryType' ) )
                    // InternalMyDsl.g:1171:3: ( 'CountryType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7()); 
                    // InternalMyDsl.g:1172:3: ( 'CountryType' )
                    // InternalMyDsl.g:1172:4: 'CountryType'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1176:2: ( ( 'CityType' ) )
                    {
                    // InternalMyDsl.g:1176:2: ( ( 'CityType' ) )
                    // InternalMyDsl.g:1177:3: ( 'CityType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8()); 
                    // InternalMyDsl.g:1178:3: ( 'CityType' )
                    // InternalMyDsl.g:1178:4: 'CityType'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:1182:2: ( ( 'CountryCodeType' ) )
                    {
                    // InternalMyDsl.g:1182:2: ( ( 'CountryCodeType' ) )
                    // InternalMyDsl.g:1183:3: ( 'CountryCodeType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9()); 
                    // InternalMyDsl.g:1184:3: ( 'CountryCodeType' )
                    // InternalMyDsl.g:1184:4: 'CountryCodeType'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:1188:2: ( ( 'LatitudeType' ) )
                    {
                    // InternalMyDsl.g:1188:2: ( ( 'LatitudeType' ) )
                    // InternalMyDsl.g:1189:3: ( 'LatitudeType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10()); 
                    // InternalMyDsl.g:1190:3: ( 'LatitudeType' )
                    // InternalMyDsl.g:1190:4: 'LatitudeType'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:1194:2: ( ( 'LongitudType' ) )
                    {
                    // InternalMyDsl.g:1194:2: ( ( 'LongitudType' ) )
                    // InternalMyDsl.g:1195:3: ( 'LongitudType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11()); 
                    // InternalMyDsl.g:1196:3: ( 'LongitudType' )
                    // InternalMyDsl.g:1196:4: 'LongitudType'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:1200:2: ( ( 'RowNumberType' ) )
                    {
                    // InternalMyDsl.g:1200:2: ( ( 'RowNumberType' ) )
                    // InternalMyDsl.g:1201:3: ( 'RowNumberType' )
                    {
                     before(grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 
                    // InternalMyDsl.g:1202:3: ( 'RowNumberType' )
                    // InternalMyDsl.g:1202:4: 'RowNumberType'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:1206:2: ( ( 'BooleanType' ) )
                    {
                    // InternalMyDsl.g:1206:2: ( ( 'BooleanType' ) )
                    // InternalMyDsl.g:1207:3: ( 'BooleanType' )
                    {
                     before(grammarAccess.getMockarooAccess().getBooleanTypeEnumLiteralDeclaration_13()); 
                    // InternalMyDsl.g:1208:3: ( 'BooleanType' )
                    // InternalMyDsl.g:1208:4: 'BooleanType'
                    {
                    match(input,38,FOLLOW_2); 

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
    // InternalMyDsl.g:1216:1: rule__TipoMetodoRest__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__TipoMetodoRest__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1220:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt17=1;
                }
                break;
            case 40:
                {
                alt17=2;
                }
                break;
            case 41:
                {
                alt17=3;
                }
                break;
            case 42:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1221:2: ( ( 'GET' ) )
                    {
                    // InternalMyDsl.g:1221:2: ( ( 'GET' ) )
                    // InternalMyDsl.g:1222:3: ( 'GET' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1223:3: ( 'GET' )
                    // InternalMyDsl.g:1223:4: 'GET'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1227:2: ( ( 'POST' ) )
                    {
                    // InternalMyDsl.g:1227:2: ( ( 'POST' ) )
                    // InternalMyDsl.g:1228:3: ( 'POST' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1229:3: ( 'POST' )
                    // InternalMyDsl.g:1229:4: 'POST'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1233:2: ( ( 'PUT' ) )
                    {
                    // InternalMyDsl.g:1233:2: ( ( 'PUT' ) )
                    // InternalMyDsl.g:1234:3: ( 'PUT' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1235:3: ( 'PUT' )
                    // InternalMyDsl.g:1235:4: 'PUT'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1239:2: ( ( 'DELETE' ) )
                    {
                    // InternalMyDsl.g:1239:2: ( ( 'DELETE' ) )
                    // InternalMyDsl.g:1240:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1241:3: ( 'DELETE' )
                    // InternalMyDsl.g:1241:4: 'DELETE'
                    {
                    match(input,42,FOLLOW_2); 

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
    // InternalMyDsl.g:1249:1: rule__Api__Group__0 : rule__Api__Group__0__Impl rule__Api__Group__1 ;
    public final void rule__Api__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1253:1: ( rule__Api__Group__0__Impl rule__Api__Group__1 )
            // InternalMyDsl.g:1254:2: rule__Api__Group__0__Impl rule__Api__Group__1
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
    // InternalMyDsl.g:1261:1: rule__Api__Group__0__Impl : ( () ) ;
    public final void rule__Api__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1265:1: ( ( () ) )
            // InternalMyDsl.g:1266:1: ( () )
            {
            // InternalMyDsl.g:1266:1: ( () )
            // InternalMyDsl.g:1267:2: ()
            {
             before(grammarAccess.getApiAccess().getApiAction_0()); 
            // InternalMyDsl.g:1268:2: ()
            // InternalMyDsl.g:1268:3: 
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
    // InternalMyDsl.g:1276:1: rule__Api__Group__1 : rule__Api__Group__1__Impl rule__Api__Group__2 ;
    public final void rule__Api__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1280:1: ( rule__Api__Group__1__Impl rule__Api__Group__2 )
            // InternalMyDsl.g:1281:2: rule__Api__Group__1__Impl rule__Api__Group__2
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
    // InternalMyDsl.g:1288:1: rule__Api__Group__1__Impl : ( 'apiURL' ) ;
    public final void rule__Api__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1292:1: ( ( 'apiURL' ) )
            // InternalMyDsl.g:1293:1: ( 'apiURL' )
            {
            // InternalMyDsl.g:1293:1: ( 'apiURL' )
            // InternalMyDsl.g:1294:2: 'apiURL'
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
    // InternalMyDsl.g:1303:1: rule__Api__Group__2 : rule__Api__Group__2__Impl rule__Api__Group__3 ;
    public final void rule__Api__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1307:1: ( rule__Api__Group__2__Impl rule__Api__Group__3 )
            // InternalMyDsl.g:1308:2: rule__Api__Group__2__Impl rule__Api__Group__3
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
    // InternalMyDsl.g:1315:1: rule__Api__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__Api__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1319:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1320:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1320:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1321:2: RULE_EQUAL
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
    // InternalMyDsl.g:1330:1: rule__Api__Group__3 : rule__Api__Group__3__Impl rule__Api__Group__4 ;
    public final void rule__Api__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1334:1: ( rule__Api__Group__3__Impl rule__Api__Group__4 )
            // InternalMyDsl.g:1335:2: rule__Api__Group__3__Impl rule__Api__Group__4
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
    // InternalMyDsl.g:1342:1: rule__Api__Group__3__Impl : ( ( rule__Api__UrlAssignment_3 ) ) ;
    public final void rule__Api__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1346:1: ( ( ( rule__Api__UrlAssignment_3 ) ) )
            // InternalMyDsl.g:1347:1: ( ( rule__Api__UrlAssignment_3 ) )
            {
            // InternalMyDsl.g:1347:1: ( ( rule__Api__UrlAssignment_3 ) )
            // InternalMyDsl.g:1348:2: ( rule__Api__UrlAssignment_3 )
            {
             before(grammarAccess.getApiAccess().getUrlAssignment_3()); 
            // InternalMyDsl.g:1349:2: ( rule__Api__UrlAssignment_3 )
            // InternalMyDsl.g:1349:3: rule__Api__UrlAssignment_3
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
    // InternalMyDsl.g:1357:1: rule__Api__Group__4 : rule__Api__Group__4__Impl rule__Api__Group__5 ;
    public final void rule__Api__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1361:1: ( rule__Api__Group__4__Impl rule__Api__Group__5 )
            // InternalMyDsl.g:1362:2: rule__Api__Group__4__Impl rule__Api__Group__5
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
    // InternalMyDsl.g:1369:1: rule__Api__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Api__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1373:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1374:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1374:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1375:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:1384:1: rule__Api__Group__5 : rule__Api__Group__5__Impl rule__Api__Group__6 ;
    public final void rule__Api__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1388:1: ( rule__Api__Group__5__Impl rule__Api__Group__6 )
            // InternalMyDsl.g:1389:2: rule__Api__Group__5__Impl rule__Api__Group__6
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
    // InternalMyDsl.g:1396:1: rule__Api__Group__5__Impl : ( ( rule__Api__EntidadesAssignment_5 )* ) ;
    public final void rule__Api__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1400:1: ( ( ( rule__Api__EntidadesAssignment_5 )* ) )
            // InternalMyDsl.g:1401:1: ( ( rule__Api__EntidadesAssignment_5 )* )
            {
            // InternalMyDsl.g:1401:1: ( ( rule__Api__EntidadesAssignment_5 )* )
            // InternalMyDsl.g:1402:2: ( rule__Api__EntidadesAssignment_5 )*
            {
             before(grammarAccess.getApiAccess().getEntidadesAssignment_5()); 
            // InternalMyDsl.g:1403:2: ( rule__Api__EntidadesAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==44||LA18_0==52) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1403:3: rule__Api__EntidadesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Api__EntidadesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMyDsl.g:1411:1: rule__Api__Group__6 : rule__Api__Group__6__Impl rule__Api__Group__7 ;
    public final void rule__Api__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1415:1: ( rule__Api__Group__6__Impl rule__Api__Group__7 )
            // InternalMyDsl.g:1416:2: rule__Api__Group__6__Impl rule__Api__Group__7
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
    // InternalMyDsl.g:1423:1: rule__Api__Group__6__Impl : ( ( rule__Api__PrimitivetypesAssignment_6 )* ) ;
    public final void rule__Api__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1427:1: ( ( ( rule__Api__PrimitivetypesAssignment_6 )* ) )
            // InternalMyDsl.g:1428:1: ( ( rule__Api__PrimitivetypesAssignment_6 )* )
            {
            // InternalMyDsl.g:1428:1: ( ( rule__Api__PrimitivetypesAssignment_6 )* )
            // InternalMyDsl.g:1429:2: ( rule__Api__PrimitivetypesAssignment_6 )*
            {
             before(grammarAccess.getApiAccess().getPrimitivetypesAssignment_6()); 
            // InternalMyDsl.g:1430:2: ( rule__Api__PrimitivetypesAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=17 && LA19_0<=19)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1430:3: rule__Api__PrimitivetypesAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Api__PrimitivetypesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMyDsl.g:1438:1: rule__Api__Group__7 : rule__Api__Group__7__Impl rule__Api__Group__8 ;
    public final void rule__Api__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1442:1: ( rule__Api__Group__7__Impl rule__Api__Group__8 )
            // InternalMyDsl.g:1443:2: rule__Api__Group__7__Impl rule__Api__Group__8
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
    // InternalMyDsl.g:1450:1: rule__Api__Group__7__Impl : ( ( rule__Api__ServiciosRestAssignment_7 )* ) ;
    public final void rule__Api__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1454:1: ( ( ( rule__Api__ServiciosRestAssignment_7 )* ) )
            // InternalMyDsl.g:1455:1: ( ( rule__Api__ServiciosRestAssignment_7 )* )
            {
            // InternalMyDsl.g:1455:1: ( ( rule__Api__ServiciosRestAssignment_7 )* )
            // InternalMyDsl.g:1456:2: ( rule__Api__ServiciosRestAssignment_7 )*
            {
             before(grammarAccess.getApiAccess().getServiciosRestAssignment_7()); 
            // InternalMyDsl.g:1457:2: ( rule__Api__ServiciosRestAssignment_7 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=39 && LA20_0<=42)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1457:3: rule__Api__ServiciosRestAssignment_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Api__ServiciosRestAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMyDsl.g:1465:1: rule__Api__Group__8 : rule__Api__Group__8__Impl ;
    public final void rule__Api__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1469:1: ( rule__Api__Group__8__Impl )
            // InternalMyDsl.g:1470:2: rule__Api__Group__8__Impl
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
    // InternalMyDsl.g:1476:1: rule__Api__Group__8__Impl : ( ( rule__Api__TestsAssignment_8 )* ) ;
    public final void rule__Api__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1480:1: ( ( ( rule__Api__TestsAssignment_8 )* ) )
            // InternalMyDsl.g:1481:1: ( ( rule__Api__TestsAssignment_8 )* )
            {
            // InternalMyDsl.g:1481:1: ( ( rule__Api__TestsAssignment_8 )* )
            // InternalMyDsl.g:1482:2: ( rule__Api__TestsAssignment_8 )*
            {
             before(grammarAccess.getApiAccess().getTestsAssignment_8()); 
            // InternalMyDsl.g:1483:2: ( rule__Api__TestsAssignment_8 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==60) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:1483:3: rule__Api__TestsAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Api__TestsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMyDsl.g:1492:1: rule__SimpleEntity__Group__0 : rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 ;
    public final void rule__SimpleEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1496:1: ( rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 )
            // InternalMyDsl.g:1497:2: rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1
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
    // InternalMyDsl.g:1504:1: rule__SimpleEntity__Group__0__Impl : ( 'SimpleEntity' ) ;
    public final void rule__SimpleEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1508:1: ( ( 'SimpleEntity' ) )
            // InternalMyDsl.g:1509:1: ( 'SimpleEntity' )
            {
            // InternalMyDsl.g:1509:1: ( 'SimpleEntity' )
            // InternalMyDsl.g:1510:2: 'SimpleEntity'
            {
             before(grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyDsl.g:1519:1: rule__SimpleEntity__Group__1 : rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 ;
    public final void rule__SimpleEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1523:1: ( rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 )
            // InternalMyDsl.g:1524:2: rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2
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
    // InternalMyDsl.g:1531:1: rule__SimpleEntity__Group__1__Impl : ( ( rule__SimpleEntity__NameAssignment_1 ) ) ;
    public final void rule__SimpleEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1535:1: ( ( ( rule__SimpleEntity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1536:1: ( ( rule__SimpleEntity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1536:1: ( ( rule__SimpleEntity__NameAssignment_1 ) )
            // InternalMyDsl.g:1537:2: ( rule__SimpleEntity__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1538:2: ( rule__SimpleEntity__NameAssignment_1 )
            // InternalMyDsl.g:1538:3: rule__SimpleEntity__NameAssignment_1
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
    // InternalMyDsl.g:1546:1: rule__SimpleEntity__Group__2 : rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 ;
    public final void rule__SimpleEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1550:1: ( rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 )
            // InternalMyDsl.g:1551:2: rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3
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
    // InternalMyDsl.g:1558:1: rule__SimpleEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__SimpleEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1562:1: ( ( '{' ) )
            // InternalMyDsl.g:1563:1: ( '{' )
            {
            // InternalMyDsl.g:1563:1: ( '{' )
            // InternalMyDsl.g:1564:2: '{'
            {
             before(grammarAccess.getSimpleEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:1573:1: rule__SimpleEntity__Group__3 : rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 ;
    public final void rule__SimpleEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1577:1: ( rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 )
            // InternalMyDsl.g:1578:2: rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4
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
    // InternalMyDsl.g:1585:1: rule__SimpleEntity__Group__3__Impl : ( ( rule__SimpleEntity__AtributosAssignment_3 )* ) ;
    public final void rule__SimpleEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1589:1: ( ( ( rule__SimpleEntity__AtributosAssignment_3 )* ) )
            // InternalMyDsl.g:1590:1: ( ( rule__SimpleEntity__AtributosAssignment_3 )* )
            {
            // InternalMyDsl.g:1590:1: ( ( rule__SimpleEntity__AtributosAssignment_3 )* )
            // InternalMyDsl.g:1591:2: ( rule__SimpleEntity__AtributosAssignment_3 )*
            {
             before(grammarAccess.getSimpleEntityAccess().getAtributosAssignment_3()); 
            // InternalMyDsl.g:1592:2: ( rule__SimpleEntity__AtributosAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=17 && LA22_0<=19)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1592:3: rule__SimpleEntity__AtributosAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SimpleEntity__AtributosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalMyDsl.g:1600:1: rule__SimpleEntity__Group__4 : rule__SimpleEntity__Group__4__Impl ;
    public final void rule__SimpleEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1604:1: ( rule__SimpleEntity__Group__4__Impl )
            // InternalMyDsl.g:1605:2: rule__SimpleEntity__Group__4__Impl
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
    // InternalMyDsl.g:1611:1: rule__SimpleEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__SimpleEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1615:1: ( ( '}' ) )
            // InternalMyDsl.g:1616:1: ( '}' )
            {
            // InternalMyDsl.g:1616:1: ( '}' )
            // InternalMyDsl.g:1617:2: '}'
            {
             before(grammarAccess.getSimpleEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:1627:1: rule__AtributoMocka__Group__0 : rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1 ;
    public final void rule__AtributoMocka__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1631:1: ( rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1 )
            // InternalMyDsl.g:1632:2: rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1
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
    // InternalMyDsl.g:1639:1: rule__AtributoMocka__Group__0__Impl : ( ( rule__AtributoMocka__TipoAssignment_0 ) ) ;
    public final void rule__AtributoMocka__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1643:1: ( ( ( rule__AtributoMocka__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:1644:1: ( ( rule__AtributoMocka__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:1644:1: ( ( rule__AtributoMocka__TipoAssignment_0 ) )
            // InternalMyDsl.g:1645:2: ( rule__AtributoMocka__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:1646:2: ( rule__AtributoMocka__TipoAssignment_0 )
            // InternalMyDsl.g:1646:3: rule__AtributoMocka__TipoAssignment_0
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
    // InternalMyDsl.g:1654:1: rule__AtributoMocka__Group__1 : rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2 ;
    public final void rule__AtributoMocka__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1658:1: ( rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2 )
            // InternalMyDsl.g:1659:2: rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2
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
    // InternalMyDsl.g:1666:1: rule__AtributoMocka__Group__1__Impl : ( ( rule__AtributoMocka__NameAssignment_1 ) ) ;
    public final void rule__AtributoMocka__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1670:1: ( ( ( rule__AtributoMocka__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1671:1: ( ( rule__AtributoMocka__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1671:1: ( ( rule__AtributoMocka__NameAssignment_1 ) )
            // InternalMyDsl.g:1672:2: ( rule__AtributoMocka__NameAssignment_1 )
            {
             before(grammarAccess.getAtributoMockaAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1673:2: ( rule__AtributoMocka__NameAssignment_1 )
            // InternalMyDsl.g:1673:3: rule__AtributoMocka__NameAssignment_1
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
    // InternalMyDsl.g:1681:1: rule__AtributoMocka__Group__2 : rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3 ;
    public final void rule__AtributoMocka__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1685:1: ( rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3 )
            // InternalMyDsl.g:1686:2: rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3
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
    // InternalMyDsl.g:1693:1: rule__AtributoMocka__Group__2__Impl : ( ( rule__AtributoMocka__Group_2__0 ) ) ;
    public final void rule__AtributoMocka__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1697:1: ( ( ( rule__AtributoMocka__Group_2__0 ) ) )
            // InternalMyDsl.g:1698:1: ( ( rule__AtributoMocka__Group_2__0 ) )
            {
            // InternalMyDsl.g:1698:1: ( ( rule__AtributoMocka__Group_2__0 ) )
            // InternalMyDsl.g:1699:2: ( rule__AtributoMocka__Group_2__0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getGroup_2()); 
            // InternalMyDsl.g:1700:2: ( rule__AtributoMocka__Group_2__0 )
            // InternalMyDsl.g:1700:3: rule__AtributoMocka__Group_2__0
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
    // InternalMyDsl.g:1708:1: rule__AtributoMocka__Group__3 : rule__AtributoMocka__Group__3__Impl ;
    public final void rule__AtributoMocka__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1712:1: ( rule__AtributoMocka__Group__3__Impl )
            // InternalMyDsl.g:1713:2: rule__AtributoMocka__Group__3__Impl
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
    // InternalMyDsl.g:1719:1: rule__AtributoMocka__Group__3__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoMocka__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1723:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1724:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1724:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1725:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:1735:1: rule__AtributoMocka__Group_2__0 : rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1 ;
    public final void rule__AtributoMocka__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1739:1: ( rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1 )
            // InternalMyDsl.g:1740:2: rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1
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
    // InternalMyDsl.g:1747:1: rule__AtributoMocka__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtributoMocka__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1751:1: ( ( '(' ) )
            // InternalMyDsl.g:1752:1: ( '(' )
            {
            // InternalMyDsl.g:1752:1: ( '(' )
            // InternalMyDsl.g:1753:2: '('
            {
             before(grammarAccess.getAtributoMockaAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:1762:1: rule__AtributoMocka__Group_2__1 : rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2 ;
    public final void rule__AtributoMocka__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1766:1: ( rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2 )
            // InternalMyDsl.g:1767:2: rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2
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
    // InternalMyDsl.g:1774:1: rule__AtributoMocka__Group_2__1__Impl : ( ( rule__AtributoMocka__Alternatives_2_1 ) ) ;
    public final void rule__AtributoMocka__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1778:1: ( ( ( rule__AtributoMocka__Alternatives_2_1 ) ) )
            // InternalMyDsl.g:1779:1: ( ( rule__AtributoMocka__Alternatives_2_1 ) )
            {
            // InternalMyDsl.g:1779:1: ( ( rule__AtributoMocka__Alternatives_2_1 ) )
            // InternalMyDsl.g:1780:2: ( rule__AtributoMocka__Alternatives_2_1 )
            {
             before(grammarAccess.getAtributoMockaAccess().getAlternatives_2_1()); 
            // InternalMyDsl.g:1781:2: ( rule__AtributoMocka__Alternatives_2_1 )
            // InternalMyDsl.g:1781:3: rule__AtributoMocka__Alternatives_2_1
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
    // InternalMyDsl.g:1789:1: rule__AtributoMocka__Group_2__2 : rule__AtributoMocka__Group_2__2__Impl ;
    public final void rule__AtributoMocka__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1793:1: ( rule__AtributoMocka__Group_2__2__Impl )
            // InternalMyDsl.g:1794:2: rule__AtributoMocka__Group_2__2__Impl
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
    // InternalMyDsl.g:1800:1: rule__AtributoMocka__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtributoMocka__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1804:1: ( ( ')' ) )
            // InternalMyDsl.g:1805:1: ( ')' )
            {
            // InternalMyDsl.g:1805:1: ( ')' )
            // InternalMyDsl.g:1806:2: ')'
            {
             before(grammarAccess.getAtributoMockaAccess().getRightParenthesisKeyword_2_2()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:1816:1: rule__AtributoMocka__Group_2_1_0__0 : rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1 ;
    public final void rule__AtributoMocka__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1820:1: ( rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1 )
            // InternalMyDsl.g:1821:2: rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1
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
    // InternalMyDsl.g:1828:1: rule__AtributoMocka__Group_2_1_0__0__Impl : ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1832:1: ( ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) ) )
            // InternalMyDsl.g:1833:1: ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) )
            {
            // InternalMyDsl.g:1833:1: ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) )
            // InternalMyDsl.g:1834:2: ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyAssignment_2_1_0_0()); 
            // InternalMyDsl.g:1835:2: ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 )
            // InternalMyDsl.g:1835:3: rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0
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
    // InternalMyDsl.g:1843:1: rule__AtributoMocka__Group_2_1_0__1 : rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2 ;
    public final void rule__AtributoMocka__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1847:1: ( rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2 )
            // InternalMyDsl.g:1848:2: rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2
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
    // InternalMyDsl.g:1855:1: rule__AtributoMocka__Group_2_1_0__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__AtributoMocka__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1859:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1860:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1860:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1861:2: RULE_EQUAL
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
    // InternalMyDsl.g:1870:1: rule__AtributoMocka__Group_2_1_0__2 : rule__AtributoMocka__Group_2_1_0__2__Impl ;
    public final void rule__AtributoMocka__Group_2_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1874:1: ( rule__AtributoMocka__Group_2_1_0__2__Impl )
            // InternalMyDsl.g:1875:2: rule__AtributoMocka__Group_2_1_0__2__Impl
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
    // InternalMyDsl.g:1881:1: rule__AtributoMocka__Group_2_1_0__2__Impl : ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1885:1: ( ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) ) )
            // InternalMyDsl.g:1886:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) )
            {
            // InternalMyDsl.g:1886:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) )
            // InternalMyDsl.g:1887:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 )
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_0_2()); 
            // InternalMyDsl.g:1888:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 )
            // InternalMyDsl.g:1888:3: rule__AtributoMocka__MockTypeAssignment_2_1_0_2
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
    // InternalMyDsl.g:1897:1: rule__AtributoMocka__Group_2_1_1__0 : rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1 ;
    public final void rule__AtributoMocka__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1901:1: ( rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1 )
            // InternalMyDsl.g:1902:2: rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1
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
    // InternalMyDsl.g:1909:1: rule__AtributoMocka__Group_2_1_1__0__Impl : ( 'mockType' ) ;
    public final void rule__AtributoMocka__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1913:1: ( ( 'mockType' ) )
            // InternalMyDsl.g:1914:1: ( 'mockType' )
            {
            // InternalMyDsl.g:1914:1: ( 'mockType' )
            // InternalMyDsl.g:1915:2: 'mockType'
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeKeyword_2_1_1_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:1924:1: rule__AtributoMocka__Group_2_1_1__1 : rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2 ;
    public final void rule__AtributoMocka__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1928:1: ( rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2 )
            // InternalMyDsl.g:1929:2: rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2
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
    // InternalMyDsl.g:1936:1: rule__AtributoMocka__Group_2_1_1__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__AtributoMocka__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1940:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1941:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1941:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1942:2: RULE_EQUAL
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
    // InternalMyDsl.g:1951:1: rule__AtributoMocka__Group_2_1_1__2 : rule__AtributoMocka__Group_2_1_1__2__Impl ;
    public final void rule__AtributoMocka__Group_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1955:1: ( rule__AtributoMocka__Group_2_1_1__2__Impl )
            // InternalMyDsl.g:1956:2: rule__AtributoMocka__Group_2_1_1__2__Impl
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
    // InternalMyDsl.g:1962:1: rule__AtributoMocka__Group_2_1_1__2__Impl : ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1966:1: ( ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) ) )
            // InternalMyDsl.g:1967:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) )
            {
            // InternalMyDsl.g:1967:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) )
            // InternalMyDsl.g:1968:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 )
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_1_2()); 
            // InternalMyDsl.g:1969:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 )
            // InternalMyDsl.g:1969:3: rule__AtributoMocka__MockTypeAssignment_2_1_1_2
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
    // InternalMyDsl.g:1978:1: rule__AtributoArreglo__Group__0 : rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1 ;
    public final void rule__AtributoArreglo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1982:1: ( rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1 )
            // InternalMyDsl.g:1983:2: rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1
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
    // InternalMyDsl.g:1990:1: rule__AtributoArreglo__Group__0__Impl : ( ( rule__AtributoArreglo__TipoAssignment_0 ) ) ;
    public final void rule__AtributoArreglo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1994:1: ( ( ( rule__AtributoArreglo__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:1995:1: ( ( rule__AtributoArreglo__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:1995:1: ( ( rule__AtributoArreglo__TipoAssignment_0 ) )
            // InternalMyDsl.g:1996:2: ( rule__AtributoArreglo__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoArregloAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:1997:2: ( rule__AtributoArreglo__TipoAssignment_0 )
            // InternalMyDsl.g:1997:3: rule__AtributoArreglo__TipoAssignment_0
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
    // InternalMyDsl.g:2005:1: rule__AtributoArreglo__Group__1 : rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2 ;
    public final void rule__AtributoArreglo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2009:1: ( rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2 )
            // InternalMyDsl.g:2010:2: rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2
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
    // InternalMyDsl.g:2017:1: rule__AtributoArreglo__Group__1__Impl : ( '[' ) ;
    public final void rule__AtributoArreglo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2021:1: ( ( '[' ) )
            // InternalMyDsl.g:2022:1: ( '[' )
            {
            // InternalMyDsl.g:2022:1: ( '[' )
            // InternalMyDsl.g:2023:2: '['
            {
             before(grammarAccess.getAtributoArregloAccess().getLeftSquareBracketKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:2032:1: rule__AtributoArreglo__Group__2 : rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3 ;
    public final void rule__AtributoArreglo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2036:1: ( rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3 )
            // InternalMyDsl.g:2037:2: rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3
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
    // InternalMyDsl.g:2044:1: rule__AtributoArreglo__Group__2__Impl : ( ']' ) ;
    public final void rule__AtributoArreglo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2048:1: ( ( ']' ) )
            // InternalMyDsl.g:2049:1: ( ']' )
            {
            // InternalMyDsl.g:2049:1: ( ']' )
            // InternalMyDsl.g:2050:2: ']'
            {
             before(grammarAccess.getAtributoArregloAccess().getRightSquareBracketKeyword_2()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:2059:1: rule__AtributoArreglo__Group__3 : rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4 ;
    public final void rule__AtributoArreglo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2063:1: ( rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4 )
            // InternalMyDsl.g:2064:2: rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4
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
    // InternalMyDsl.g:2071:1: rule__AtributoArreglo__Group__3__Impl : ( ( rule__AtributoArreglo__NameAssignment_3 ) ) ;
    public final void rule__AtributoArreglo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2075:1: ( ( ( rule__AtributoArreglo__NameAssignment_3 ) ) )
            // InternalMyDsl.g:2076:1: ( ( rule__AtributoArreglo__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:2076:1: ( ( rule__AtributoArreglo__NameAssignment_3 ) )
            // InternalMyDsl.g:2077:2: ( rule__AtributoArreglo__NameAssignment_3 )
            {
             before(grammarAccess.getAtributoArregloAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:2078:2: ( rule__AtributoArreglo__NameAssignment_3 )
            // InternalMyDsl.g:2078:3: rule__AtributoArreglo__NameAssignment_3
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
    // InternalMyDsl.g:2086:1: rule__AtributoArreglo__Group__4 : rule__AtributoArreglo__Group__4__Impl ;
    public final void rule__AtributoArreglo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2090:1: ( rule__AtributoArreglo__Group__4__Impl )
            // InternalMyDsl.g:2091:2: rule__AtributoArreglo__Group__4__Impl
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
    // InternalMyDsl.g:2097:1: rule__AtributoArreglo__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoArreglo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2101:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2102:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2102:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2103:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:2113:1: rule__AtributoSimple__Group__0 : rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 ;
    public final void rule__AtributoSimple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2117:1: ( rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 )
            // InternalMyDsl.g:2118:2: rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1
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
    // InternalMyDsl.g:2125:1: rule__AtributoSimple__Group__0__Impl : ( ( rule__AtributoSimple__TipoAssignment_0 ) ) ;
    public final void rule__AtributoSimple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2129:1: ( ( ( rule__AtributoSimple__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:2130:1: ( ( rule__AtributoSimple__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:2130:1: ( ( rule__AtributoSimple__TipoAssignment_0 ) )
            // InternalMyDsl.g:2131:2: ( rule__AtributoSimple__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:2132:2: ( rule__AtributoSimple__TipoAssignment_0 )
            // InternalMyDsl.g:2132:3: rule__AtributoSimple__TipoAssignment_0
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
    // InternalMyDsl.g:2140:1: rule__AtributoSimple__Group__1 : rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 ;
    public final void rule__AtributoSimple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2144:1: ( rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 )
            // InternalMyDsl.g:2145:2: rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2
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
    // InternalMyDsl.g:2152:1: rule__AtributoSimple__Group__1__Impl : ( ( rule__AtributoSimple__NameAssignment_1 ) ) ;
    public final void rule__AtributoSimple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2156:1: ( ( ( rule__AtributoSimple__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2157:1: ( ( rule__AtributoSimple__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2157:1: ( ( rule__AtributoSimple__NameAssignment_1 ) )
            // InternalMyDsl.g:2158:2: ( rule__AtributoSimple__NameAssignment_1 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2159:2: ( rule__AtributoSimple__NameAssignment_1 )
            // InternalMyDsl.g:2159:3: rule__AtributoSimple__NameAssignment_1
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
    // InternalMyDsl.g:2167:1: rule__AtributoSimple__Group__2 : rule__AtributoSimple__Group__2__Impl ;
    public final void rule__AtributoSimple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2171:1: ( rule__AtributoSimple__Group__2__Impl )
            // InternalMyDsl.g:2172:2: rule__AtributoSimple__Group__2__Impl
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
    // InternalMyDsl.g:2178:1: rule__AtributoSimple__Group__2__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoSimple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2182:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2183:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2183:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2184:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:2194:1: rule__MockarooEntity__Group__0 : rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1 ;
    public final void rule__MockarooEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2198:1: ( rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1 )
            // InternalMyDsl.g:2199:2: rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1
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
    // InternalMyDsl.g:2206:1: rule__MockarooEntity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__MockarooEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2210:1: ( ( 'Entity' ) )
            // InternalMyDsl.g:2211:1: ( 'Entity' )
            {
            // InternalMyDsl.g:2211:1: ( 'Entity' )
            // InternalMyDsl.g:2212:2: 'Entity'
            {
             before(grammarAccess.getMockarooEntityAccess().getEntityKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:2221:1: rule__MockarooEntity__Group__1 : rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2 ;
    public final void rule__MockarooEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2225:1: ( rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2 )
            // InternalMyDsl.g:2226:2: rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2
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
    // InternalMyDsl.g:2233:1: rule__MockarooEntity__Group__1__Impl : ( ( rule__MockarooEntity__NameAssignment_1 ) ) ;
    public final void rule__MockarooEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2237:1: ( ( ( rule__MockarooEntity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2238:1: ( ( rule__MockarooEntity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2238:1: ( ( rule__MockarooEntity__NameAssignment_1 ) )
            // InternalMyDsl.g:2239:2: ( rule__MockarooEntity__NameAssignment_1 )
            {
             before(grammarAccess.getMockarooEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2240:2: ( rule__MockarooEntity__NameAssignment_1 )
            // InternalMyDsl.g:2240:3: rule__MockarooEntity__NameAssignment_1
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
    // InternalMyDsl.g:2248:1: rule__MockarooEntity__Group__2 : rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3 ;
    public final void rule__MockarooEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2252:1: ( rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3 )
            // InternalMyDsl.g:2253:2: rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3
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
    // InternalMyDsl.g:2260:1: rule__MockarooEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__MockarooEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2264:1: ( ( '{' ) )
            // InternalMyDsl.g:2265:1: ( '{' )
            {
            // InternalMyDsl.g:2265:1: ( '{' )
            // InternalMyDsl.g:2266:2: '{'
            {
             before(grammarAccess.getMockarooEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:2275:1: rule__MockarooEntity__Group__3 : rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4 ;
    public final void rule__MockarooEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2279:1: ( rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4 )
            // InternalMyDsl.g:2280:2: rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4
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
    // InternalMyDsl.g:2287:1: rule__MockarooEntity__Group__3__Impl : ( ( rule__MockarooEntity__AtributosAssignment_3 )* ) ;
    public final void rule__MockarooEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2291:1: ( ( ( rule__MockarooEntity__AtributosAssignment_3 )* ) )
            // InternalMyDsl.g:2292:1: ( ( rule__MockarooEntity__AtributosAssignment_3 )* )
            {
            // InternalMyDsl.g:2292:1: ( ( rule__MockarooEntity__AtributosAssignment_3 )* )
            // InternalMyDsl.g:2293:2: ( rule__MockarooEntity__AtributosAssignment_3 )*
            {
             before(grammarAccess.getMockarooEntityAccess().getAtributosAssignment_3()); 
            // InternalMyDsl.g:2294:2: ( rule__MockarooEntity__AtributosAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=17 && LA23_0<=19)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:2294:3: rule__MockarooEntity__AtributosAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__MockarooEntity__AtributosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalMyDsl.g:2302:1: rule__MockarooEntity__Group__4 : rule__MockarooEntity__Group__4__Impl ;
    public final void rule__MockarooEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2306:1: ( rule__MockarooEntity__Group__4__Impl )
            // InternalMyDsl.g:2307:2: rule__MockarooEntity__Group__4__Impl
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
    // InternalMyDsl.g:2313:1: rule__MockarooEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__MockarooEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2317:1: ( ( '}' ) )
            // InternalMyDsl.g:2318:1: ( '}' )
            {
            // InternalMyDsl.g:2318:1: ( '}' )
            // InternalMyDsl.g:2319:2: '}'
            {
             before(grammarAccess.getMockarooEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:2329:1: rule__ServicioRest__Group__0 : rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1 ;
    public final void rule__ServicioRest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2333:1: ( rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1 )
            // InternalMyDsl.g:2334:2: rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1
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
    // InternalMyDsl.g:2341:1: rule__ServicioRest__Group__0__Impl : ( ( rule__ServicioRest__MetodoAssignment_0 ) ) ;
    public final void rule__ServicioRest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2345:1: ( ( ( rule__ServicioRest__MetodoAssignment_0 ) ) )
            // InternalMyDsl.g:2346:1: ( ( rule__ServicioRest__MetodoAssignment_0 ) )
            {
            // InternalMyDsl.g:2346:1: ( ( rule__ServicioRest__MetodoAssignment_0 ) )
            // InternalMyDsl.g:2347:2: ( rule__ServicioRest__MetodoAssignment_0 )
            {
             before(grammarAccess.getServicioRestAccess().getMetodoAssignment_0()); 
            // InternalMyDsl.g:2348:2: ( rule__ServicioRest__MetodoAssignment_0 )
            // InternalMyDsl.g:2348:3: rule__ServicioRest__MetodoAssignment_0
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
    // InternalMyDsl.g:2356:1: rule__ServicioRest__Group__1 : rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2 ;
    public final void rule__ServicioRest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2360:1: ( rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2 )
            // InternalMyDsl.g:2361:2: rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2
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
    // InternalMyDsl.g:2368:1: rule__ServicioRest__Group__1__Impl : ( ( rule__ServicioRest__NameAssignment_1 ) ) ;
    public final void rule__ServicioRest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2372:1: ( ( ( rule__ServicioRest__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2373:1: ( ( rule__ServicioRest__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2373:1: ( ( rule__ServicioRest__NameAssignment_1 ) )
            // InternalMyDsl.g:2374:2: ( rule__ServicioRest__NameAssignment_1 )
            {
             before(grammarAccess.getServicioRestAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2375:2: ( rule__ServicioRest__NameAssignment_1 )
            // InternalMyDsl.g:2375:3: rule__ServicioRest__NameAssignment_1
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
    // InternalMyDsl.g:2383:1: rule__ServicioRest__Group__2 : rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3 ;
    public final void rule__ServicioRest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2387:1: ( rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3 )
            // InternalMyDsl.g:2388:2: rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3
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
    // InternalMyDsl.g:2395:1: rule__ServicioRest__Group__2__Impl : ( '{' ) ;
    public final void rule__ServicioRest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2399:1: ( ( '{' ) )
            // InternalMyDsl.g:2400:1: ( '{' )
            {
            // InternalMyDsl.g:2400:1: ( '{' )
            // InternalMyDsl.g:2401:2: '{'
            {
             before(grammarAccess.getServicioRestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:2410:1: rule__ServicioRest__Group__3 : rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4 ;
    public final void rule__ServicioRest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2414:1: ( rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4 )
            // InternalMyDsl.g:2415:2: rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4
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
    // InternalMyDsl.g:2422:1: rule__ServicioRest__Group__3__Impl : ( 'URL' ) ;
    public final void rule__ServicioRest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2426:1: ( ( 'URL' ) )
            // InternalMyDsl.g:2427:1: ( 'URL' )
            {
            // InternalMyDsl.g:2427:1: ( 'URL' )
            // InternalMyDsl.g:2428:2: 'URL'
            {
             before(grammarAccess.getServicioRestAccess().getURLKeyword_3()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:2437:1: rule__ServicioRest__Group__4 : rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5 ;
    public final void rule__ServicioRest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2441:1: ( rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5 )
            // InternalMyDsl.g:2442:2: rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5
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
    // InternalMyDsl.g:2449:1: rule__ServicioRest__Group__4__Impl : ( RULE_EQUAL ) ;
    public final void rule__ServicioRest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2453:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:2454:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:2454:1: ( RULE_EQUAL )
            // InternalMyDsl.g:2455:2: RULE_EQUAL
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
    // InternalMyDsl.g:2464:1: rule__ServicioRest__Group__5 : rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6 ;
    public final void rule__ServicioRest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2468:1: ( rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6 )
            // InternalMyDsl.g:2469:2: rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6
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
    // InternalMyDsl.g:2476:1: rule__ServicioRest__Group__5__Impl : ( '/' ) ;
    public final void rule__ServicioRest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2480:1: ( ( '/' ) )
            // InternalMyDsl.g:2481:1: ( '/' )
            {
            // InternalMyDsl.g:2481:1: ( '/' )
            // InternalMyDsl.g:2482:2: '/'
            {
             before(grammarAccess.getServicioRestAccess().getSolidusKeyword_5()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMyDsl.g:2491:1: rule__ServicioRest__Group__6 : rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7 ;
    public final void rule__ServicioRest__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2495:1: ( rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7 )
            // InternalMyDsl.g:2496:2: rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7
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
    // InternalMyDsl.g:2503:1: rule__ServicioRest__Group__6__Impl : ( ( rule__ServicioRest__UrlAssignment_6 ) ) ;
    public final void rule__ServicioRest__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2507:1: ( ( ( rule__ServicioRest__UrlAssignment_6 ) ) )
            // InternalMyDsl.g:2508:1: ( ( rule__ServicioRest__UrlAssignment_6 ) )
            {
            // InternalMyDsl.g:2508:1: ( ( rule__ServicioRest__UrlAssignment_6 ) )
            // InternalMyDsl.g:2509:2: ( rule__ServicioRest__UrlAssignment_6 )
            {
             before(grammarAccess.getServicioRestAccess().getUrlAssignment_6()); 
            // InternalMyDsl.g:2510:2: ( rule__ServicioRest__UrlAssignment_6 )
            // InternalMyDsl.g:2510:3: rule__ServicioRest__UrlAssignment_6
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
    // InternalMyDsl.g:2518:1: rule__ServicioRest__Group__7 : rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8 ;
    public final void rule__ServicioRest__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2522:1: ( rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8 )
            // InternalMyDsl.g:2523:2: rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8
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
    // InternalMyDsl.g:2530:1: rule__ServicioRest__Group__7__Impl : ( ( rule__ServicioRest__Alternatives_7 )* ) ;
    public final void rule__ServicioRest__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2534:1: ( ( ( rule__ServicioRest__Alternatives_7 )* ) )
            // InternalMyDsl.g:2535:1: ( ( rule__ServicioRest__Alternatives_7 )* )
            {
            // InternalMyDsl.g:2535:1: ( ( rule__ServicioRest__Alternatives_7 )* )
            // InternalMyDsl.g:2536:2: ( rule__ServicioRest__Alternatives_7 )*
            {
             before(grammarAccess.getServicioRestAccess().getAlternatives_7()); 
            // InternalMyDsl.g:2537:2: ( rule__ServicioRest__Alternatives_7 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=54 && LA24_0<=56)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:2537:3: rule__ServicioRest__Alternatives_7
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ServicioRest__Alternatives_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalMyDsl.g:2545:1: rule__ServicioRest__Group__8 : rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9 ;
    public final void rule__ServicioRest__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2549:1: ( rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9 )
            // InternalMyDsl.g:2550:2: rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9
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
    // InternalMyDsl.g:2557:1: rule__ServicioRest__Group__8__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__ServicioRest__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2561:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2562:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2562:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2563:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:2572:1: rule__ServicioRest__Group__9 : rule__ServicioRest__Group__9__Impl rule__ServicioRest__Group__10 ;
    public final void rule__ServicioRest__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2576:1: ( rule__ServicioRest__Group__9__Impl rule__ServicioRest__Group__10 )
            // InternalMyDsl.g:2577:2: rule__ServicioRest__Group__9__Impl rule__ServicioRest__Group__10
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
    // InternalMyDsl.g:2584:1: rule__ServicioRest__Group__9__Impl : ( ( rule__ServicioRest__RequestAssignment_9 )? ) ;
    public final void rule__ServicioRest__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2588:1: ( ( ( rule__ServicioRest__RequestAssignment_9 )? ) )
            // InternalMyDsl.g:2589:1: ( ( rule__ServicioRest__RequestAssignment_9 )? )
            {
            // InternalMyDsl.g:2589:1: ( ( rule__ServicioRest__RequestAssignment_9 )? )
            // InternalMyDsl.g:2590:2: ( rule__ServicioRest__RequestAssignment_9 )?
            {
             before(grammarAccess.getServicioRestAccess().getRequestAssignment_9()); 
            // InternalMyDsl.g:2591:2: ( rule__ServicioRest__RequestAssignment_9 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==59) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:2591:3: rule__ServicioRest__RequestAssignment_9
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
    // InternalMyDsl.g:2599:1: rule__ServicioRest__Group__10 : rule__ServicioRest__Group__10__Impl rule__ServicioRest__Group__11 ;
    public final void rule__ServicioRest__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2603:1: ( rule__ServicioRest__Group__10__Impl rule__ServicioRest__Group__11 )
            // InternalMyDsl.g:2604:2: rule__ServicioRest__Group__10__Impl rule__ServicioRest__Group__11
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
    // InternalMyDsl.g:2611:1: rule__ServicioRest__Group__10__Impl : ( ( rule__ServicioRest__ResponseAssignment_10 ) ) ;
    public final void rule__ServicioRest__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2615:1: ( ( ( rule__ServicioRest__ResponseAssignment_10 ) ) )
            // InternalMyDsl.g:2616:1: ( ( rule__ServicioRest__ResponseAssignment_10 ) )
            {
            // InternalMyDsl.g:2616:1: ( ( rule__ServicioRest__ResponseAssignment_10 ) )
            // InternalMyDsl.g:2617:2: ( rule__ServicioRest__ResponseAssignment_10 )
            {
             before(grammarAccess.getServicioRestAccess().getResponseAssignment_10()); 
            // InternalMyDsl.g:2618:2: ( rule__ServicioRest__ResponseAssignment_10 )
            // InternalMyDsl.g:2618:3: rule__ServicioRest__ResponseAssignment_10
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
    // InternalMyDsl.g:2626:1: rule__ServicioRest__Group__11 : rule__ServicioRest__Group__11__Impl ;
    public final void rule__ServicioRest__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2630:1: ( rule__ServicioRest__Group__11__Impl )
            // InternalMyDsl.g:2631:2: rule__ServicioRest__Group__11__Impl
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
    // InternalMyDsl.g:2637:1: rule__ServicioRest__Group__11__Impl : ( '}' ) ;
    public final void rule__ServicioRest__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2641:1: ( ( '}' ) )
            // InternalMyDsl.g:2642:1: ( '}' )
            {
            // InternalMyDsl.g:2642:1: ( '}' )
            // InternalMyDsl.g:2643:2: '}'
            {
             before(grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_11()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:2653:1: rule__ServicioRest__Group_7_1__0 : rule__ServicioRest__Group_7_1__0__Impl rule__ServicioRest__Group_7_1__1 ;
    public final void rule__ServicioRest__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2657:1: ( rule__ServicioRest__Group_7_1__0__Impl rule__ServicioRest__Group_7_1__1 )
            // InternalMyDsl.g:2658:2: rule__ServicioRest__Group_7_1__0__Impl rule__ServicioRest__Group_7_1__1
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
    // InternalMyDsl.g:2665:1: rule__ServicioRest__Group_7_1__0__Impl : ( '/' ) ;
    public final void rule__ServicioRest__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2669:1: ( ( '/' ) )
            // InternalMyDsl.g:2670:1: ( '/' )
            {
            // InternalMyDsl.g:2670:1: ( '/' )
            // InternalMyDsl.g:2671:2: '/'
            {
             before(grammarAccess.getServicioRestAccess().getSolidusKeyword_7_1_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMyDsl.g:2680:1: rule__ServicioRest__Group_7_1__1 : rule__ServicioRest__Group_7_1__1__Impl ;
    public final void rule__ServicioRest__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2684:1: ( rule__ServicioRest__Group_7_1__1__Impl )
            // InternalMyDsl.g:2685:2: rule__ServicioRest__Group_7_1__1__Impl
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
    // InternalMyDsl.g:2691:1: rule__ServicioRest__Group_7_1__1__Impl : ( ruleEString ) ;
    public final void rule__ServicioRest__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2695:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2696:1: ( ruleEString )
            {
            // InternalMyDsl.g:2696:1: ( ruleEString )
            // InternalMyDsl.g:2697:2: ruleEString
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
    // InternalMyDsl.g:2707:1: rule__QueryParam__Group__0 : rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1 ;
    public final void rule__QueryParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2711:1: ( rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1 )
            // InternalMyDsl.g:2712:2: rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1
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
    // InternalMyDsl.g:2719:1: rule__QueryParam__Group__0__Impl : ( '?${' ) ;
    public final void rule__QueryParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2723:1: ( ( '?${' ) )
            // InternalMyDsl.g:2724:1: ( '?${' )
            {
            // InternalMyDsl.g:2724:1: ( '?${' )
            // InternalMyDsl.g:2725:2: '?${'
            {
             before(grammarAccess.getQueryParamAccess().getQuestionMarkDollarSignLeftCurlyBracketKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMyDsl.g:2734:1: rule__QueryParam__Group__1 : rule__QueryParam__Group__1__Impl rule__QueryParam__Group__2 ;
    public final void rule__QueryParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2738:1: ( rule__QueryParam__Group__1__Impl rule__QueryParam__Group__2 )
            // InternalMyDsl.g:2739:2: rule__QueryParam__Group__1__Impl rule__QueryParam__Group__2
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
    // InternalMyDsl.g:2746:1: rule__QueryParam__Group__1__Impl : ( ( rule__QueryParam__NameAssignment_1 ) ) ;
    public final void rule__QueryParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2750:1: ( ( ( rule__QueryParam__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2751:1: ( ( rule__QueryParam__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2751:1: ( ( rule__QueryParam__NameAssignment_1 ) )
            // InternalMyDsl.g:2752:2: ( rule__QueryParam__NameAssignment_1 )
            {
             before(grammarAccess.getQueryParamAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2753:2: ( rule__QueryParam__NameAssignment_1 )
            // InternalMyDsl.g:2753:3: rule__QueryParam__NameAssignment_1
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
    // InternalMyDsl.g:2761:1: rule__QueryParam__Group__2 : rule__QueryParam__Group__2__Impl ;
    public final void rule__QueryParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2765:1: ( rule__QueryParam__Group__2__Impl )
            // InternalMyDsl.g:2766:2: rule__QueryParam__Group__2__Impl
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
    // InternalMyDsl.g:2772:1: rule__QueryParam__Group__2__Impl : ( '}' ) ;
    public final void rule__QueryParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2776:1: ( ( '}' ) )
            // InternalMyDsl.g:2777:1: ( '}' )
            {
            // InternalMyDsl.g:2777:1: ( '}' )
            // InternalMyDsl.g:2778:2: '}'
            {
             before(grammarAccess.getQueryParamAccess().getRightCurlyBracketKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:2788:1: rule__PathParam__Group__0 : rule__PathParam__Group__0__Impl rule__PathParam__Group__1 ;
    public final void rule__PathParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2792:1: ( rule__PathParam__Group__0__Impl rule__PathParam__Group__1 )
            // InternalMyDsl.g:2793:2: rule__PathParam__Group__0__Impl rule__PathParam__Group__1
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
    // InternalMyDsl.g:2800:1: rule__PathParam__Group__0__Impl : ( '/:{' ) ;
    public final void rule__PathParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2804:1: ( ( '/:{' ) )
            // InternalMyDsl.g:2805:1: ( '/:{' )
            {
            // InternalMyDsl.g:2805:1: ( '/:{' )
            // InternalMyDsl.g:2806:2: '/:{'
            {
             before(grammarAccess.getPathParamAccess().getSolidusColonLeftCurlyBracketKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMyDsl.g:2815:1: rule__PathParam__Group__1 : rule__PathParam__Group__1__Impl rule__PathParam__Group__2 ;
    public final void rule__PathParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2819:1: ( rule__PathParam__Group__1__Impl rule__PathParam__Group__2 )
            // InternalMyDsl.g:2820:2: rule__PathParam__Group__1__Impl rule__PathParam__Group__2
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
    // InternalMyDsl.g:2827:1: rule__PathParam__Group__1__Impl : ( ( rule__PathParam__NameAssignment_1 ) ) ;
    public final void rule__PathParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2831:1: ( ( ( rule__PathParam__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2832:1: ( ( rule__PathParam__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2832:1: ( ( rule__PathParam__NameAssignment_1 ) )
            // InternalMyDsl.g:2833:2: ( rule__PathParam__NameAssignment_1 )
            {
             before(grammarAccess.getPathParamAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2834:2: ( rule__PathParam__NameAssignment_1 )
            // InternalMyDsl.g:2834:3: rule__PathParam__NameAssignment_1
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
    // InternalMyDsl.g:2842:1: rule__PathParam__Group__2 : rule__PathParam__Group__2__Impl ;
    public final void rule__PathParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2846:1: ( rule__PathParam__Group__2__Impl )
            // InternalMyDsl.g:2847:2: rule__PathParam__Group__2__Impl
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
    // InternalMyDsl.g:2853:1: rule__PathParam__Group__2__Impl : ( '}' ) ;
    public final void rule__PathParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2857:1: ( ( '}' ) )
            // InternalMyDsl.g:2858:1: ( '}' )
            {
            // InternalMyDsl.g:2858:1: ( '}' )
            // InternalMyDsl.g:2859:2: '}'
            {
             before(grammarAccess.getPathParamAccess().getRightCurlyBracketKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:2869:1: rule__Response__Group__0 : rule__Response__Group__0__Impl rule__Response__Group__1 ;
    public final void rule__Response__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2873:1: ( rule__Response__Group__0__Impl rule__Response__Group__1 )
            // InternalMyDsl.g:2874:2: rule__Response__Group__0__Impl rule__Response__Group__1
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
    // InternalMyDsl.g:2881:1: rule__Response__Group__0__Impl : ( 'Response' ) ;
    public final void rule__Response__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2885:1: ( ( 'Response' ) )
            // InternalMyDsl.g:2886:1: ( 'Response' )
            {
            // InternalMyDsl.g:2886:1: ( 'Response' )
            // InternalMyDsl.g:2887:2: 'Response'
            {
             before(grammarAccess.getResponseAccess().getResponseKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyDsl.g:2896:1: rule__Response__Group__1 : rule__Response__Group__1__Impl rule__Response__Group__2 ;
    public final void rule__Response__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2900:1: ( rule__Response__Group__1__Impl rule__Response__Group__2 )
            // InternalMyDsl.g:2901:2: rule__Response__Group__1__Impl rule__Response__Group__2
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
    // InternalMyDsl.g:2908:1: rule__Response__Group__1__Impl : ( '{' ) ;
    public final void rule__Response__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2912:1: ( ( '{' ) )
            // InternalMyDsl.g:2913:1: ( '{' )
            {
            // InternalMyDsl.g:2913:1: ( '{' )
            // InternalMyDsl.g:2914:2: '{'
            {
             before(grammarAccess.getResponseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:2923:1: rule__Response__Group__2 : rule__Response__Group__2__Impl rule__Response__Group__3 ;
    public final void rule__Response__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2927:1: ( rule__Response__Group__2__Impl rule__Response__Group__3 )
            // InternalMyDsl.g:2928:2: rule__Response__Group__2__Impl rule__Response__Group__3
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
    // InternalMyDsl.g:2935:1: rule__Response__Group__2__Impl : ( 'Type' ) ;
    public final void rule__Response__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2939:1: ( ( 'Type' ) )
            // InternalMyDsl.g:2940:1: ( 'Type' )
            {
            // InternalMyDsl.g:2940:1: ( 'Type' )
            // InternalMyDsl.g:2941:2: 'Type'
            {
             before(grammarAccess.getResponseAccess().getTypeKeyword_2()); 
            match(input,58,FOLLOW_2); 
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
    // InternalMyDsl.g:2950:1: rule__Response__Group__3 : rule__Response__Group__3__Impl rule__Response__Group__4 ;
    public final void rule__Response__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2954:1: ( rule__Response__Group__3__Impl rule__Response__Group__4 )
            // InternalMyDsl.g:2955:2: rule__Response__Group__3__Impl rule__Response__Group__4
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
    // InternalMyDsl.g:2962:1: rule__Response__Group__3__Impl : ( RULE_EQUAL ) ;
    public final void rule__Response__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2966:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:2967:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:2967:1: ( RULE_EQUAL )
            // InternalMyDsl.g:2968:2: RULE_EQUAL
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
    // InternalMyDsl.g:2977:1: rule__Response__Group__4 : rule__Response__Group__4__Impl rule__Response__Group__5 ;
    public final void rule__Response__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2981:1: ( rule__Response__Group__4__Impl rule__Response__Group__5 )
            // InternalMyDsl.g:2982:2: rule__Response__Group__4__Impl rule__Response__Group__5
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
    // InternalMyDsl.g:2989:1: rule__Response__Group__4__Impl : ( ( rule__Response__Alternatives_4 ) ) ;
    public final void rule__Response__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2993:1: ( ( ( rule__Response__Alternatives_4 ) ) )
            // InternalMyDsl.g:2994:1: ( ( rule__Response__Alternatives_4 ) )
            {
            // InternalMyDsl.g:2994:1: ( ( rule__Response__Alternatives_4 ) )
            // InternalMyDsl.g:2995:2: ( rule__Response__Alternatives_4 )
            {
             before(grammarAccess.getResponseAccess().getAlternatives_4()); 
            // InternalMyDsl.g:2996:2: ( rule__Response__Alternatives_4 )
            // InternalMyDsl.g:2996:3: rule__Response__Alternatives_4
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
    // InternalMyDsl.g:3004:1: rule__Response__Group__5 : rule__Response__Group__5__Impl rule__Response__Group__6 ;
    public final void rule__Response__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3008:1: ( rule__Response__Group__5__Impl rule__Response__Group__6 )
            // InternalMyDsl.g:3009:2: rule__Response__Group__5__Impl rule__Response__Group__6
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
    // InternalMyDsl.g:3016:1: rule__Response__Group__5__Impl : ( ( rule__Response__Group_5__0 )? ) ;
    public final void rule__Response__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3020:1: ( ( ( rule__Response__Group_5__0 )? ) )
            // InternalMyDsl.g:3021:1: ( ( rule__Response__Group_5__0 )? )
            {
            // InternalMyDsl.g:3021:1: ( ( rule__Response__Group_5__0 )? )
            // InternalMyDsl.g:3022:2: ( rule__Response__Group_5__0 )?
            {
             before(grammarAccess.getResponseAccess().getGroup_5()); 
            // InternalMyDsl.g:3023:2: ( rule__Response__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==50) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:3023:3: rule__Response__Group_5__0
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
    // InternalMyDsl.g:3031:1: rule__Response__Group__6 : rule__Response__Group__6__Impl rule__Response__Group__7 ;
    public final void rule__Response__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3035:1: ( rule__Response__Group__6__Impl rule__Response__Group__7 )
            // InternalMyDsl.g:3036:2: rule__Response__Group__6__Impl rule__Response__Group__7
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
    // InternalMyDsl.g:3043:1: rule__Response__Group__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Response__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3047:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:3048:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:3048:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:3049:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:3058:1: rule__Response__Group__7 : rule__Response__Group__7__Impl ;
    public final void rule__Response__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3062:1: ( rule__Response__Group__7__Impl )
            // InternalMyDsl.g:3063:2: rule__Response__Group__7__Impl
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
    // InternalMyDsl.g:3069:1: rule__Response__Group__7__Impl : ( '}' ) ;
    public final void rule__Response__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3073:1: ( ( '}' ) )
            // InternalMyDsl.g:3074:1: ( '}' )
            {
            // InternalMyDsl.g:3074:1: ( '}' )
            // InternalMyDsl.g:3075:2: '}'
            {
             before(grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_7()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:3085:1: rule__Response__Group_5__0 : rule__Response__Group_5__0__Impl rule__Response__Group_5__1 ;
    public final void rule__Response__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3089:1: ( rule__Response__Group_5__0__Impl rule__Response__Group_5__1 )
            // InternalMyDsl.g:3090:2: rule__Response__Group_5__0__Impl rule__Response__Group_5__1
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
    // InternalMyDsl.g:3097:1: rule__Response__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Response__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3101:1: ( ( '[' ) )
            // InternalMyDsl.g:3102:1: ( '[' )
            {
            // InternalMyDsl.g:3102:1: ( '[' )
            // InternalMyDsl.g:3103:2: '['
            {
             before(grammarAccess.getResponseAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:3112:1: rule__Response__Group_5__1 : rule__Response__Group_5__1__Impl ;
    public final void rule__Response__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3116:1: ( rule__Response__Group_5__1__Impl )
            // InternalMyDsl.g:3117:2: rule__Response__Group_5__1__Impl
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
    // InternalMyDsl.g:3123:1: rule__Response__Group_5__1__Impl : ( ']' ) ;
    public final void rule__Response__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3127:1: ( ( ']' ) )
            // InternalMyDsl.g:3128:1: ( ']' )
            {
            // InternalMyDsl.g:3128:1: ( ']' )
            // InternalMyDsl.g:3129:2: ']'
            {
             before(grammarAccess.getResponseAccess().getRightSquareBracketKeyword_5_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:3139:1: rule__Request__Group__0 : rule__Request__Group__0__Impl rule__Request__Group__1 ;
    public final void rule__Request__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3143:1: ( rule__Request__Group__0__Impl rule__Request__Group__1 )
            // InternalMyDsl.g:3144:2: rule__Request__Group__0__Impl rule__Request__Group__1
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
    // InternalMyDsl.g:3151:1: rule__Request__Group__0__Impl : ( 'Request' ) ;
    public final void rule__Request__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3155:1: ( ( 'Request' ) )
            // InternalMyDsl.g:3156:1: ( 'Request' )
            {
            // InternalMyDsl.g:3156:1: ( 'Request' )
            // InternalMyDsl.g:3157:2: 'Request'
            {
             before(grammarAccess.getRequestAccess().getRequestKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMyDsl.g:3166:1: rule__Request__Group__1 : rule__Request__Group__1__Impl rule__Request__Group__2 ;
    public final void rule__Request__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3170:1: ( rule__Request__Group__1__Impl rule__Request__Group__2 )
            // InternalMyDsl.g:3171:2: rule__Request__Group__1__Impl rule__Request__Group__2
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
    // InternalMyDsl.g:3178:1: rule__Request__Group__1__Impl : ( '{' ) ;
    public final void rule__Request__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3182:1: ( ( '{' ) )
            // InternalMyDsl.g:3183:1: ( '{' )
            {
            // InternalMyDsl.g:3183:1: ( '{' )
            // InternalMyDsl.g:3184:2: '{'
            {
             before(grammarAccess.getRequestAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:3193:1: rule__Request__Group__2 : rule__Request__Group__2__Impl rule__Request__Group__3 ;
    public final void rule__Request__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3197:1: ( rule__Request__Group__2__Impl rule__Request__Group__3 )
            // InternalMyDsl.g:3198:2: rule__Request__Group__2__Impl rule__Request__Group__3
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
    // InternalMyDsl.g:3205:1: rule__Request__Group__2__Impl : ( 'Type' ) ;
    public final void rule__Request__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3209:1: ( ( 'Type' ) )
            // InternalMyDsl.g:3210:1: ( 'Type' )
            {
            // InternalMyDsl.g:3210:1: ( 'Type' )
            // InternalMyDsl.g:3211:2: 'Type'
            {
             before(grammarAccess.getRequestAccess().getTypeKeyword_2()); 
            match(input,58,FOLLOW_2); 
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
    // InternalMyDsl.g:3220:1: rule__Request__Group__3 : rule__Request__Group__3__Impl rule__Request__Group__4 ;
    public final void rule__Request__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3224:1: ( rule__Request__Group__3__Impl rule__Request__Group__4 )
            // InternalMyDsl.g:3225:2: rule__Request__Group__3__Impl rule__Request__Group__4
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
    // InternalMyDsl.g:3232:1: rule__Request__Group__3__Impl : ( RULE_EQUAL ) ;
    public final void rule__Request__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3236:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:3237:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:3237:1: ( RULE_EQUAL )
            // InternalMyDsl.g:3238:2: RULE_EQUAL
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
    // InternalMyDsl.g:3247:1: rule__Request__Group__4 : rule__Request__Group__4__Impl rule__Request__Group__5 ;
    public final void rule__Request__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3251:1: ( rule__Request__Group__4__Impl rule__Request__Group__5 )
            // InternalMyDsl.g:3252:2: rule__Request__Group__4__Impl rule__Request__Group__5
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
    // InternalMyDsl.g:3259:1: rule__Request__Group__4__Impl : ( ( rule__Request__Alternatives_4 ) ) ;
    public final void rule__Request__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3263:1: ( ( ( rule__Request__Alternatives_4 ) ) )
            // InternalMyDsl.g:3264:1: ( ( rule__Request__Alternatives_4 ) )
            {
            // InternalMyDsl.g:3264:1: ( ( rule__Request__Alternatives_4 ) )
            // InternalMyDsl.g:3265:2: ( rule__Request__Alternatives_4 )
            {
             before(grammarAccess.getRequestAccess().getAlternatives_4()); 
            // InternalMyDsl.g:3266:2: ( rule__Request__Alternatives_4 )
            // InternalMyDsl.g:3266:3: rule__Request__Alternatives_4
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
    // InternalMyDsl.g:3274:1: rule__Request__Group__5 : rule__Request__Group__5__Impl rule__Request__Group__6 ;
    public final void rule__Request__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3278:1: ( rule__Request__Group__5__Impl rule__Request__Group__6 )
            // InternalMyDsl.g:3279:2: rule__Request__Group__5__Impl rule__Request__Group__6
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
    // InternalMyDsl.g:3286:1: rule__Request__Group__5__Impl : ( ( rule__Request__Group_5__0 )? ) ;
    public final void rule__Request__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3290:1: ( ( ( rule__Request__Group_5__0 )? ) )
            // InternalMyDsl.g:3291:1: ( ( rule__Request__Group_5__0 )? )
            {
            // InternalMyDsl.g:3291:1: ( ( rule__Request__Group_5__0 )? )
            // InternalMyDsl.g:3292:2: ( rule__Request__Group_5__0 )?
            {
             before(grammarAccess.getRequestAccess().getGroup_5()); 
            // InternalMyDsl.g:3293:2: ( rule__Request__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:3293:3: rule__Request__Group_5__0
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
    // InternalMyDsl.g:3301:1: rule__Request__Group__6 : rule__Request__Group__6__Impl rule__Request__Group__7 ;
    public final void rule__Request__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3305:1: ( rule__Request__Group__6__Impl rule__Request__Group__7 )
            // InternalMyDsl.g:3306:2: rule__Request__Group__6__Impl rule__Request__Group__7
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
    // InternalMyDsl.g:3313:1: rule__Request__Group__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Request__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3317:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:3318:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:3318:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:3319:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:3328:1: rule__Request__Group__7 : rule__Request__Group__7__Impl ;
    public final void rule__Request__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3332:1: ( rule__Request__Group__7__Impl )
            // InternalMyDsl.g:3333:2: rule__Request__Group__7__Impl
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
    // InternalMyDsl.g:3339:1: rule__Request__Group__7__Impl : ( '}' ) ;
    public final void rule__Request__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3343:1: ( ( '}' ) )
            // InternalMyDsl.g:3344:1: ( '}' )
            {
            // InternalMyDsl.g:3344:1: ( '}' )
            // InternalMyDsl.g:3345:2: '}'
            {
             before(grammarAccess.getRequestAccess().getRightCurlyBracketKeyword_7()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:3355:1: rule__Request__Group_5__0 : rule__Request__Group_5__0__Impl rule__Request__Group_5__1 ;
    public final void rule__Request__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3359:1: ( rule__Request__Group_5__0__Impl rule__Request__Group_5__1 )
            // InternalMyDsl.g:3360:2: rule__Request__Group_5__0__Impl rule__Request__Group_5__1
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
    // InternalMyDsl.g:3367:1: rule__Request__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Request__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3371:1: ( ( '[' ) )
            // InternalMyDsl.g:3372:1: ( '[' )
            {
            // InternalMyDsl.g:3372:1: ( '[' )
            // InternalMyDsl.g:3373:2: '['
            {
             before(grammarAccess.getRequestAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:3382:1: rule__Request__Group_5__1 : rule__Request__Group_5__1__Impl ;
    public final void rule__Request__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3386:1: ( rule__Request__Group_5__1__Impl )
            // InternalMyDsl.g:3387:2: rule__Request__Group_5__1__Impl
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
    // InternalMyDsl.g:3393:1: rule__Request__Group_5__1__Impl : ( ']' ) ;
    public final void rule__Request__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3397:1: ( ( ']' ) )
            // InternalMyDsl.g:3398:1: ( ']' )
            {
            // InternalMyDsl.g:3398:1: ( ']' )
            // InternalMyDsl.g:3399:2: ']'
            {
             before(grammarAccess.getRequestAccess().getRightSquareBracketKeyword_5_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:3409:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3413:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalMyDsl.g:3414:2: rule__Test__Group__0__Impl rule__Test__Group__1
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
    // InternalMyDsl.g:3421:1: rule__Test__Group__0__Impl : ( () ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3425:1: ( ( () ) )
            // InternalMyDsl.g:3426:1: ( () )
            {
            // InternalMyDsl.g:3426:1: ( () )
            // InternalMyDsl.g:3427:2: ()
            {
             before(grammarAccess.getTestAccess().getTestAction_0()); 
            // InternalMyDsl.g:3428:2: ()
            // InternalMyDsl.g:3428:3: 
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
    // InternalMyDsl.g:3436:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3440:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalMyDsl.g:3441:2: rule__Test__Group__1__Impl rule__Test__Group__2
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
    // InternalMyDsl.g:3448:1: rule__Test__Group__1__Impl : ( 'Test' ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3452:1: ( ( 'Test' ) )
            // InternalMyDsl.g:3453:1: ( 'Test' )
            {
            // InternalMyDsl.g:3453:1: ( 'Test' )
            // InternalMyDsl.g:3454:2: 'Test'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_1()); 
            match(input,60,FOLLOW_2); 
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
    // InternalMyDsl.g:3463:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3467:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalMyDsl.g:3468:2: rule__Test__Group__2__Impl rule__Test__Group__3
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
    // InternalMyDsl.g:3475:1: rule__Test__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3479:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3480:1: ( RULE_ID )
            {
            // InternalMyDsl.g:3480:1: ( RULE_ID )
            // InternalMyDsl.g:3481:2: RULE_ID
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
    // InternalMyDsl.g:3490:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3494:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // InternalMyDsl.g:3495:2: rule__Test__Group__3__Impl rule__Test__Group__4
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
    // InternalMyDsl.g:3502:1: rule__Test__Group__3__Impl : ( '{' ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3506:1: ( ( '{' ) )
            // InternalMyDsl.g:3507:1: ( '{' )
            {
            // InternalMyDsl.g:3507:1: ( '{' )
            // InternalMyDsl.g:3508:2: '{'
            {
             before(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:3517:1: rule__Test__Group__4 : rule__Test__Group__4__Impl rule__Test__Group__5 ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3521:1: ( rule__Test__Group__4__Impl rule__Test__Group__5 )
            // InternalMyDsl.g:3522:2: rule__Test__Group__4__Impl rule__Test__Group__5
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
    // InternalMyDsl.g:3529:1: rule__Test__Group__4__Impl : ( 'service' ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3533:1: ( ( 'service' ) )
            // InternalMyDsl.g:3534:1: ( 'service' )
            {
            // InternalMyDsl.g:3534:1: ( 'service' )
            // InternalMyDsl.g:3535:2: 'service'
            {
             before(grammarAccess.getTestAccess().getServiceKeyword_4()); 
            match(input,61,FOLLOW_2); 
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
    // InternalMyDsl.g:3544:1: rule__Test__Group__5 : rule__Test__Group__5__Impl rule__Test__Group__6 ;
    public final void rule__Test__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3548:1: ( rule__Test__Group__5__Impl rule__Test__Group__6 )
            // InternalMyDsl.g:3549:2: rule__Test__Group__5__Impl rule__Test__Group__6
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
    // InternalMyDsl.g:3556:1: rule__Test__Group__5__Impl : ( RULE_EQUAL ) ;
    public final void rule__Test__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3560:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:3561:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:3561:1: ( RULE_EQUAL )
            // InternalMyDsl.g:3562:2: RULE_EQUAL
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
    // InternalMyDsl.g:3571:1: rule__Test__Group__6 : rule__Test__Group__6__Impl rule__Test__Group__7 ;
    public final void rule__Test__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3575:1: ( rule__Test__Group__6__Impl rule__Test__Group__7 )
            // InternalMyDsl.g:3576:2: rule__Test__Group__6__Impl rule__Test__Group__7
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
    // InternalMyDsl.g:3583:1: rule__Test__Group__6__Impl : ( ( rule__Test__ServiceAssignment_6 ) ) ;
    public final void rule__Test__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3587:1: ( ( ( rule__Test__ServiceAssignment_6 ) ) )
            // InternalMyDsl.g:3588:1: ( ( rule__Test__ServiceAssignment_6 ) )
            {
            // InternalMyDsl.g:3588:1: ( ( rule__Test__ServiceAssignment_6 ) )
            // InternalMyDsl.g:3589:2: ( rule__Test__ServiceAssignment_6 )
            {
             before(grammarAccess.getTestAccess().getServiceAssignment_6()); 
            // InternalMyDsl.g:3590:2: ( rule__Test__ServiceAssignment_6 )
            // InternalMyDsl.g:3590:3: rule__Test__ServiceAssignment_6
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
    // InternalMyDsl.g:3598:1: rule__Test__Group__7 : rule__Test__Group__7__Impl rule__Test__Group__8 ;
    public final void rule__Test__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3602:1: ( rule__Test__Group__7__Impl rule__Test__Group__8 )
            // InternalMyDsl.g:3603:2: rule__Test__Group__7__Impl rule__Test__Group__8
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
    // InternalMyDsl.g:3610:1: rule__Test__Group__7__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3614:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:3615:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:3615:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:3616:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:3625:1: rule__Test__Group__8 : rule__Test__Group__8__Impl rule__Test__Group__9 ;
    public final void rule__Test__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3629:1: ( rule__Test__Group__8__Impl rule__Test__Group__9 )
            // InternalMyDsl.g:3630:2: rule__Test__Group__8__Impl rule__Test__Group__9
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
    // InternalMyDsl.g:3637:1: rule__Test__Group__8__Impl : ( 'description' ) ;
    public final void rule__Test__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3641:1: ( ( 'description' ) )
            // InternalMyDsl.g:3642:1: ( 'description' )
            {
            // InternalMyDsl.g:3642:1: ( 'description' )
            // InternalMyDsl.g:3643:2: 'description'
            {
             before(grammarAccess.getTestAccess().getDescriptionKeyword_8()); 
            match(input,62,FOLLOW_2); 
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
    // InternalMyDsl.g:3652:1: rule__Test__Group__9 : rule__Test__Group__9__Impl rule__Test__Group__10 ;
    public final void rule__Test__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3656:1: ( rule__Test__Group__9__Impl rule__Test__Group__10 )
            // InternalMyDsl.g:3657:2: rule__Test__Group__9__Impl rule__Test__Group__10
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
    // InternalMyDsl.g:3664:1: rule__Test__Group__9__Impl : ( RULE_EQUAL ) ;
    public final void rule__Test__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3668:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:3669:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:3669:1: ( RULE_EQUAL )
            // InternalMyDsl.g:3670:2: RULE_EQUAL
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
    // InternalMyDsl.g:3679:1: rule__Test__Group__10 : rule__Test__Group__10__Impl rule__Test__Group__11 ;
    public final void rule__Test__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3683:1: ( rule__Test__Group__10__Impl rule__Test__Group__11 )
            // InternalMyDsl.g:3684:2: rule__Test__Group__10__Impl rule__Test__Group__11
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
    // InternalMyDsl.g:3691:1: rule__Test__Group__10__Impl : ( ( rule__Test__DescripcionAssignment_10 ) ) ;
    public final void rule__Test__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3695:1: ( ( ( rule__Test__DescripcionAssignment_10 ) ) )
            // InternalMyDsl.g:3696:1: ( ( rule__Test__DescripcionAssignment_10 ) )
            {
            // InternalMyDsl.g:3696:1: ( ( rule__Test__DescripcionAssignment_10 ) )
            // InternalMyDsl.g:3697:2: ( rule__Test__DescripcionAssignment_10 )
            {
             before(grammarAccess.getTestAccess().getDescripcionAssignment_10()); 
            // InternalMyDsl.g:3698:2: ( rule__Test__DescripcionAssignment_10 )
            // InternalMyDsl.g:3698:3: rule__Test__DescripcionAssignment_10
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
    // InternalMyDsl.g:3706:1: rule__Test__Group__11 : rule__Test__Group__11__Impl rule__Test__Group__12 ;
    public final void rule__Test__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3710:1: ( rule__Test__Group__11__Impl rule__Test__Group__12 )
            // InternalMyDsl.g:3711:2: rule__Test__Group__11__Impl rule__Test__Group__12
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
    // InternalMyDsl.g:3718:1: rule__Test__Group__11__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3722:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:3723:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:3723:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:3724:2: RULE_SEMICOLON
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
    // InternalMyDsl.g:3733:1: rule__Test__Group__12 : rule__Test__Group__12__Impl rule__Test__Group__13 ;
    public final void rule__Test__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3737:1: ( rule__Test__Group__12__Impl rule__Test__Group__13 )
            // InternalMyDsl.g:3738:2: rule__Test__Group__12__Impl rule__Test__Group__13
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
    // InternalMyDsl.g:3745:1: rule__Test__Group__12__Impl : ( ( rule__Test__Group_12__0 )? ) ;
    public final void rule__Test__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3749:1: ( ( ( rule__Test__Group_12__0 )? ) )
            // InternalMyDsl.g:3750:1: ( ( rule__Test__Group_12__0 )? )
            {
            // InternalMyDsl.g:3750:1: ( ( rule__Test__Group_12__0 )? )
            // InternalMyDsl.g:3751:2: ( rule__Test__Group_12__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_12()); 
            // InternalMyDsl.g:3752:2: ( rule__Test__Group_12__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==64) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:3752:3: rule__Test__Group_12__0
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
    // InternalMyDsl.g:3760:1: rule__Test__Group__13 : rule__Test__Group__13__Impl rule__Test__Group__14 ;
    public final void rule__Test__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3764:1: ( rule__Test__Group__13__Impl rule__Test__Group__14 )
            // InternalMyDsl.g:3765:2: rule__Test__Group__13__Impl rule__Test__Group__14
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
    // InternalMyDsl.g:3772:1: rule__Test__Group__13__Impl : ( 'Assertions' ) ;
    public final void rule__Test__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3776:1: ( ( 'Assertions' ) )
            // InternalMyDsl.g:3777:1: ( 'Assertions' )
            {
            // InternalMyDsl.g:3777:1: ( 'Assertions' )
            // InternalMyDsl.g:3778:2: 'Assertions'
            {
             before(grammarAccess.getTestAccess().getAssertionsKeyword_13()); 
            match(input,63,FOLLOW_2); 
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
    // InternalMyDsl.g:3787:1: rule__Test__Group__14 : rule__Test__Group__14__Impl rule__Test__Group__15 ;
    public final void rule__Test__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3791:1: ( rule__Test__Group__14__Impl rule__Test__Group__15 )
            // InternalMyDsl.g:3792:2: rule__Test__Group__14__Impl rule__Test__Group__15
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
    // InternalMyDsl.g:3799:1: rule__Test__Group__14__Impl : ( '{' ) ;
    public final void rule__Test__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3803:1: ( ( '{' ) )
            // InternalMyDsl.g:3804:1: ( '{' )
            {
            // InternalMyDsl.g:3804:1: ( '{' )
            // InternalMyDsl.g:3805:2: '{'
            {
             before(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_14()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:3814:1: rule__Test__Group__15 : rule__Test__Group__15__Impl rule__Test__Group__16 ;
    public final void rule__Test__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3818:1: ( rule__Test__Group__15__Impl rule__Test__Group__16 )
            // InternalMyDsl.g:3819:2: rule__Test__Group__15__Impl rule__Test__Group__16
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
    // InternalMyDsl.g:3826:1: rule__Test__Group__15__Impl : ( ( rule__Test__AsertionsAssignment_15 )* ) ;
    public final void rule__Test__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3830:1: ( ( ( rule__Test__AsertionsAssignment_15 )* ) )
            // InternalMyDsl.g:3831:1: ( ( rule__Test__AsertionsAssignment_15 )* )
            {
            // InternalMyDsl.g:3831:1: ( ( rule__Test__AsertionsAssignment_15 )* )
            // InternalMyDsl.g:3832:2: ( rule__Test__AsertionsAssignment_15 )*
            {
             before(grammarAccess.getTestAccess().getAsertionsAssignment_15()); 
            // InternalMyDsl.g:3833:2: ( rule__Test__AsertionsAssignment_15 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=13 && LA29_0<=14)||LA29_0==69) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:3833:3: rule__Test__AsertionsAssignment_15
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Test__AsertionsAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalMyDsl.g:3841:1: rule__Test__Group__16 : rule__Test__Group__16__Impl rule__Test__Group__17 ;
    public final void rule__Test__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3845:1: ( rule__Test__Group__16__Impl rule__Test__Group__17 )
            // InternalMyDsl.g:3846:2: rule__Test__Group__16__Impl rule__Test__Group__17
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
    // InternalMyDsl.g:3853:1: rule__Test__Group__16__Impl : ( '}' ) ;
    public final void rule__Test__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3857:1: ( ( '}' ) )
            // InternalMyDsl.g:3858:1: ( '}' )
            {
            // InternalMyDsl.g:3858:1: ( '}' )
            // InternalMyDsl.g:3859:2: '}'
            {
             before(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_16()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:3868:1: rule__Test__Group__17 : rule__Test__Group__17__Impl ;
    public final void rule__Test__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3872:1: ( rule__Test__Group__17__Impl )
            // InternalMyDsl.g:3873:2: rule__Test__Group__17__Impl
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
    // InternalMyDsl.g:3879:1: rule__Test__Group__17__Impl : ( '}' ) ;
    public final void rule__Test__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3883:1: ( ( '}' ) )
            // InternalMyDsl.g:3884:1: ( '}' )
            {
            // InternalMyDsl.g:3884:1: ( '}' )
            // InternalMyDsl.g:3885:2: '}'
            {
             before(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_17()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:3895:1: rule__Test__Group_12__0 : rule__Test__Group_12__0__Impl rule__Test__Group_12__1 ;
    public final void rule__Test__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3899:1: ( rule__Test__Group_12__0__Impl rule__Test__Group_12__1 )
            // InternalMyDsl.g:3900:2: rule__Test__Group_12__0__Impl rule__Test__Group_12__1
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
    // InternalMyDsl.g:3907:1: rule__Test__Group_12__0__Impl : ( 'Mapping' ) ;
    public final void rule__Test__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3911:1: ( ( 'Mapping' ) )
            // InternalMyDsl.g:3912:1: ( 'Mapping' )
            {
            // InternalMyDsl.g:3912:1: ( 'Mapping' )
            // InternalMyDsl.g:3913:2: 'Mapping'
            {
             before(grammarAccess.getTestAccess().getMappingKeyword_12_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalMyDsl.g:3922:1: rule__Test__Group_12__1 : rule__Test__Group_12__1__Impl rule__Test__Group_12__2 ;
    public final void rule__Test__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3926:1: ( rule__Test__Group_12__1__Impl rule__Test__Group_12__2 )
            // InternalMyDsl.g:3927:2: rule__Test__Group_12__1__Impl rule__Test__Group_12__2
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
    // InternalMyDsl.g:3934:1: rule__Test__Group_12__1__Impl : ( '[' ) ;
    public final void rule__Test__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3938:1: ( ( '[' ) )
            // InternalMyDsl.g:3939:1: ( '[' )
            {
            // InternalMyDsl.g:3939:1: ( '[' )
            // InternalMyDsl.g:3940:2: '['
            {
             before(grammarAccess.getTestAccess().getLeftSquareBracketKeyword_12_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:3949:1: rule__Test__Group_12__2 : rule__Test__Group_12__2__Impl rule__Test__Group_12__3 ;
    public final void rule__Test__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3953:1: ( rule__Test__Group_12__2__Impl rule__Test__Group_12__3 )
            // InternalMyDsl.g:3954:2: rule__Test__Group_12__2__Impl rule__Test__Group_12__3
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
    // InternalMyDsl.g:3961:1: rule__Test__Group_12__2__Impl : ( ( rule__Test__MappingsAssignment_12_2 )* ) ;
    public final void rule__Test__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3965:1: ( ( ( rule__Test__MappingsAssignment_12_2 )* ) )
            // InternalMyDsl.g:3966:1: ( ( rule__Test__MappingsAssignment_12_2 )* )
            {
            // InternalMyDsl.g:3966:1: ( ( rule__Test__MappingsAssignment_12_2 )* )
            // InternalMyDsl.g:3967:2: ( rule__Test__MappingsAssignment_12_2 )*
            {
             before(grammarAccess.getTestAccess().getMappingsAssignment_12_2()); 
            // InternalMyDsl.g:3968:2: ( rule__Test__MappingsAssignment_12_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==65) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:3968:3: rule__Test__MappingsAssignment_12_2
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Test__MappingsAssignment_12_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalMyDsl.g:3976:1: rule__Test__Group_12__3 : rule__Test__Group_12__3__Impl ;
    public final void rule__Test__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3980:1: ( rule__Test__Group_12__3__Impl )
            // InternalMyDsl.g:3981:2: rule__Test__Group_12__3__Impl
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
    // InternalMyDsl.g:3987:1: rule__Test__Group_12__3__Impl : ( ']' ) ;
    public final void rule__Test__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3991:1: ( ( ']' ) )
            // InternalMyDsl.g:3992:1: ( ']' )
            {
            // InternalMyDsl.g:3992:1: ( ']' )
            // InternalMyDsl.g:3993:2: ']'
            {
             before(grammarAccess.getTestAccess().getRightSquareBracketKeyword_12_3()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:4003:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4007:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalMyDsl.g:4008:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
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
    // InternalMyDsl.g:4015:1: rule__Mapping__Group__0__Impl : ( '{parameter' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4019:1: ( ( '{parameter' ) )
            // InternalMyDsl.g:4020:1: ( '{parameter' )
            {
            // InternalMyDsl.g:4020:1: ( '{parameter' )
            // InternalMyDsl.g:4021:2: '{parameter'
            {
             before(grammarAccess.getMappingAccess().getParameterKeyword_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalMyDsl.g:4030:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4034:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalMyDsl.g:4035:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
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
    // InternalMyDsl.g:4042:1: rule__Mapping__Group__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4046:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:4047:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:4047:1: ( RULE_EQUAL )
            // InternalMyDsl.g:4048:2: RULE_EQUAL
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
    // InternalMyDsl.g:4057:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4061:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // InternalMyDsl.g:4062:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
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
    // InternalMyDsl.g:4069:1: rule__Mapping__Group__2__Impl : ( ( rule__Mapping__ParametroAssignment_2 ) ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4073:1: ( ( ( rule__Mapping__ParametroAssignment_2 ) ) )
            // InternalMyDsl.g:4074:1: ( ( rule__Mapping__ParametroAssignment_2 ) )
            {
            // InternalMyDsl.g:4074:1: ( ( rule__Mapping__ParametroAssignment_2 ) )
            // InternalMyDsl.g:4075:2: ( rule__Mapping__ParametroAssignment_2 )
            {
             before(grammarAccess.getMappingAccess().getParametroAssignment_2()); 
            // InternalMyDsl.g:4076:2: ( rule__Mapping__ParametroAssignment_2 )
            // InternalMyDsl.g:4076:3: rule__Mapping__ParametroAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__ParametroAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getParametroAssignment_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:4084:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4088:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // InternalMyDsl.g:4089:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
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
    // InternalMyDsl.g:4096:1: rule__Mapping__Group__3__Impl : ( ',' ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4100:1: ( ( ',' ) )
            // InternalMyDsl.g:4101:1: ( ',' )
            {
            // InternalMyDsl.g:4101:1: ( ',' )
            // InternalMyDsl.g:4102:2: ','
            {
             before(grammarAccess.getMappingAccess().getCommaKeyword_3()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getCommaKeyword_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:4111:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl rule__Mapping__Group__5 ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4115:1: ( rule__Mapping__Group__4__Impl rule__Mapping__Group__5 )
            // InternalMyDsl.g:4116:2: rule__Mapping__Group__4__Impl rule__Mapping__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:4123:1: rule__Mapping__Group__4__Impl : ( 'value' ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4127:1: ( ( 'value' ) )
            // InternalMyDsl.g:4128:1: ( 'value' )
            {
            // InternalMyDsl.g:4128:1: ( 'value' )
            // InternalMyDsl.g:4129:2: 'value'
            {
             before(grammarAccess.getMappingAccess().getValueKeyword_4()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getValueKeyword_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:4138:1: rule__Mapping__Group__5 : rule__Mapping__Group__5__Impl rule__Mapping__Group__6 ;
    public final void rule__Mapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4142:1: ( rule__Mapping__Group__5__Impl rule__Mapping__Group__6 )
            // InternalMyDsl.g:4143:2: rule__Mapping__Group__5__Impl rule__Mapping__Group__6
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
    // InternalMyDsl.g:4150:1: rule__Mapping__Group__5__Impl : ( RULE_EQUAL ) ;
    public final void rule__Mapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4154:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:4155:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:4155:1: ( RULE_EQUAL )
            // InternalMyDsl.g:4156:2: RULE_EQUAL
            {
             before(grammarAccess.getMappingAccess().getEQUALTerminalRuleCall_5()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getEQUALTerminalRuleCall_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:4165:1: rule__Mapping__Group__6 : rule__Mapping__Group__6__Impl rule__Mapping__Group__7 ;
    public final void rule__Mapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4169:1: ( rule__Mapping__Group__6__Impl rule__Mapping__Group__7 )
            // InternalMyDsl.g:4170:2: rule__Mapping__Group__6__Impl rule__Mapping__Group__7
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:4177:1: rule__Mapping__Group__6__Impl : ( ( rule__Mapping__Alternatives_6 ) ) ;
    public final void rule__Mapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4181:1: ( ( ( rule__Mapping__Alternatives_6 ) ) )
            // InternalMyDsl.g:4182:1: ( ( rule__Mapping__Alternatives_6 ) )
            {
            // InternalMyDsl.g:4182:1: ( ( rule__Mapping__Alternatives_6 ) )
            // InternalMyDsl.g:4183:2: ( rule__Mapping__Alternatives_6 )
            {
             before(grammarAccess.getMappingAccess().getAlternatives_6()); 
            // InternalMyDsl.g:4184:2: ( rule__Mapping__Alternatives_6 )
            // InternalMyDsl.g:4184:3: rule__Mapping__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Alternatives_6();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getAlternatives_6()); 

            }


            }

        }
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
    // InternalMyDsl.g:4192:1: rule__Mapping__Group__7 : rule__Mapping__Group__7__Impl ;
    public final void rule__Mapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4196:1: ( rule__Mapping__Group__7__Impl )
            // InternalMyDsl.g:4197:2: rule__Mapping__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:4203:1: rule__Mapping__Group__7__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4207:1: ( ( '}' ) )
            // InternalMyDsl.g:4208:1: ( '}' )
            {
            // InternalMyDsl.g:4208:1: ( '}' )
            // InternalMyDsl.g:4209:2: '}'
            {
             before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_7()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Mapping__Group_6_0__0"
    // InternalMyDsl.g:4219:1: rule__Mapping__Group_6_0__0 : rule__Mapping__Group_6_0__0__Impl rule__Mapping__Group_6_0__1 ;
    public final void rule__Mapping__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4223:1: ( rule__Mapping__Group_6_0__0__Impl rule__Mapping__Group_6_0__1 )
            // InternalMyDsl.g:4224:2: rule__Mapping__Group_6_0__0__Impl rule__Mapping__Group_6_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Mapping__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_6_0__0"


    // $ANTLR start "rule__Mapping__Group_6_0__0__Impl"
    // InternalMyDsl.g:4231:1: rule__Mapping__Group_6_0__0__Impl : ( 'request->' ) ;
    public final void rule__Mapping__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4235:1: ( ( 'request->' ) )
            // InternalMyDsl.g:4236:1: ( 'request->' )
            {
            // InternalMyDsl.g:4236:1: ( 'request->' )
            // InternalMyDsl.g:4237:2: 'request->'
            {
             before(grammarAccess.getMappingAccess().getRequestKeyword_6_0_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getRequestKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_6_0__0__Impl"


    // $ANTLR start "rule__Mapping__Group_6_0__1"
    // InternalMyDsl.g:4246:1: rule__Mapping__Group_6_0__1 : rule__Mapping__Group_6_0__1__Impl ;
    public final void rule__Mapping__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4250:1: ( rule__Mapping__Group_6_0__1__Impl )
            // InternalMyDsl.g:4251:2: rule__Mapping__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group_6_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_6_0__1"


    // $ANTLR start "rule__Mapping__Group_6_0__1__Impl"
    // InternalMyDsl.g:4257:1: rule__Mapping__Group_6_0__1__Impl : ( ( rule__Mapping__AtributoAssignment_6_0_1 ) ) ;
    public final void rule__Mapping__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4261:1: ( ( ( rule__Mapping__AtributoAssignment_6_0_1 ) ) )
            // InternalMyDsl.g:4262:1: ( ( rule__Mapping__AtributoAssignment_6_0_1 ) )
            {
            // InternalMyDsl.g:4262:1: ( ( rule__Mapping__AtributoAssignment_6_0_1 ) )
            // InternalMyDsl.g:4263:2: ( rule__Mapping__AtributoAssignment_6_0_1 )
            {
             before(grammarAccess.getMappingAccess().getAtributoAssignment_6_0_1()); 
            // InternalMyDsl.g:4264:2: ( rule__Mapping__AtributoAssignment_6_0_1 )
            // InternalMyDsl.g:4264:3: rule__Mapping__AtributoAssignment_6_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__AtributoAssignment_6_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getAtributoAssignment_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_6_0__1__Impl"


    // $ANTLR start "rule__Asercion__Group__0"
    // InternalMyDsl.g:4273:1: rule__Asercion__Group__0 : rule__Asercion__Group__0__Impl rule__Asercion__Group__1 ;
    public final void rule__Asercion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4277:1: ( rule__Asercion__Group__0__Impl rule__Asercion__Group__1 )
            // InternalMyDsl.g:4278:2: rule__Asercion__Group__0__Impl rule__Asercion__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:4285:1: rule__Asercion__Group__0__Impl : ( ( rule__Asercion__Alternatives_0 ) ) ;
    public final void rule__Asercion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4289:1: ( ( ( rule__Asercion__Alternatives_0 ) ) )
            // InternalMyDsl.g:4290:1: ( ( rule__Asercion__Alternatives_0 ) )
            {
            // InternalMyDsl.g:4290:1: ( ( rule__Asercion__Alternatives_0 ) )
            // InternalMyDsl.g:4291:2: ( rule__Asercion__Alternatives_0 )
            {
             before(grammarAccess.getAsercionAccess().getAlternatives_0()); 
            // InternalMyDsl.g:4292:2: ( rule__Asercion__Alternatives_0 )
            // InternalMyDsl.g:4292:3: rule__Asercion__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:4300:1: rule__Asercion__Group__1 : rule__Asercion__Group__1__Impl rule__Asercion__Group__2 ;
    public final void rule__Asercion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4304:1: ( rule__Asercion__Group__1__Impl rule__Asercion__Group__2 )
            // InternalMyDsl.g:4305:2: rule__Asercion__Group__1__Impl rule__Asercion__Group__2
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
    // InternalMyDsl.g:4312:1: rule__Asercion__Group__1__Impl : ( ( rule__Asercion__OperadorAssignment_1 ) ) ;
    public final void rule__Asercion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4316:1: ( ( ( rule__Asercion__OperadorAssignment_1 ) ) )
            // InternalMyDsl.g:4317:1: ( ( rule__Asercion__OperadorAssignment_1 ) )
            {
            // InternalMyDsl.g:4317:1: ( ( rule__Asercion__OperadorAssignment_1 ) )
            // InternalMyDsl.g:4318:2: ( rule__Asercion__OperadorAssignment_1 )
            {
             before(grammarAccess.getAsercionAccess().getOperadorAssignment_1()); 
            // InternalMyDsl.g:4319:2: ( rule__Asercion__OperadorAssignment_1 )
            // InternalMyDsl.g:4319:3: rule__Asercion__OperadorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__OperadorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getOperadorAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:4327:1: rule__Asercion__Group__2 : rule__Asercion__Group__2__Impl rule__Asercion__Group__3 ;
    public final void rule__Asercion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4331:1: ( rule__Asercion__Group__2__Impl rule__Asercion__Group__3 )
            // InternalMyDsl.g:4332:2: rule__Asercion__Group__2__Impl rule__Asercion__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:4339:1: rule__Asercion__Group__2__Impl : ( ( rule__Asercion__Alternatives_2 ) ) ;
    public final void rule__Asercion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4343:1: ( ( ( rule__Asercion__Alternatives_2 ) ) )
            // InternalMyDsl.g:4344:1: ( ( rule__Asercion__Alternatives_2 ) )
            {
            // InternalMyDsl.g:4344:1: ( ( rule__Asercion__Alternatives_2 ) )
            // InternalMyDsl.g:4345:2: ( rule__Asercion__Alternatives_2 )
            {
             before(grammarAccess.getAsercionAccess().getAlternatives_2()); 
            // InternalMyDsl.g:4346:2: ( rule__Asercion__Alternatives_2 )
            // InternalMyDsl.g:4346:3: rule__Asercion__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:4354:1: rule__Asercion__Group__3 : rule__Asercion__Group__3__Impl ;
    public final void rule__Asercion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4358:1: ( rule__Asercion__Group__3__Impl )
            // InternalMyDsl.g:4359:2: rule__Asercion__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:4365:1: rule__Asercion__Group__3__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Asercion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4369:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:4370:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:4370:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:4371:2: RULE_SEMICOLON
            {
             before(grammarAccess.getAsercionAccess().getSEMICOLONTerminalRuleCall_3()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getAsercionAccess().getSEMICOLONTerminalRuleCall_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Asercion__Group_0_2__0"
    // InternalMyDsl.g:4381:1: rule__Asercion__Group_0_2__0 : rule__Asercion__Group_0_2__0__Impl rule__Asercion__Group_0_2__1 ;
    public final void rule__Asercion__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4385:1: ( rule__Asercion__Group_0_2__0__Impl rule__Asercion__Group_0_2__1 )
            // InternalMyDsl.g:4386:2: rule__Asercion__Group_0_2__0__Impl rule__Asercion__Group_0_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Asercion__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asercion__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_0_2__0"


    // $ANTLR start "rule__Asercion__Group_0_2__0__Impl"
    // InternalMyDsl.g:4393:1: rule__Asercion__Group_0_2__0__Impl : ( 'response->' ) ;
    public final void rule__Asercion__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4397:1: ( ( 'response->' ) )
            // InternalMyDsl.g:4398:1: ( 'response->' )
            {
            // InternalMyDsl.g:4398:1: ( 'response->' )
            // InternalMyDsl.g:4399:2: 'response->'
            {
             before(grammarAccess.getAsercionAccess().getResponseKeyword_0_2_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getAsercionAccess().getResponseKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_0_2__0__Impl"


    // $ANTLR start "rule__Asercion__Group_0_2__1"
    // InternalMyDsl.g:4408:1: rule__Asercion__Group_0_2__1 : rule__Asercion__Group_0_2__1__Impl ;
    public final void rule__Asercion__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4412:1: ( rule__Asercion__Group_0_2__1__Impl )
            // InternalMyDsl.g:4413:2: rule__Asercion__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Group_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_0_2__1"


    // $ANTLR start "rule__Asercion__Group_0_2__1__Impl"
    // InternalMyDsl.g:4419:1: rule__Asercion__Group_0_2__1__Impl : ( ( rule__Asercion__Elemento1Assignment_0_2_1 ) ) ;
    public final void rule__Asercion__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4423:1: ( ( ( rule__Asercion__Elemento1Assignment_0_2_1 ) ) )
            // InternalMyDsl.g:4424:1: ( ( rule__Asercion__Elemento1Assignment_0_2_1 ) )
            {
            // InternalMyDsl.g:4424:1: ( ( rule__Asercion__Elemento1Assignment_0_2_1 ) )
            // InternalMyDsl.g:4425:2: ( rule__Asercion__Elemento1Assignment_0_2_1 )
            {
             before(grammarAccess.getAsercionAccess().getElemento1Assignment_0_2_1()); 
            // InternalMyDsl.g:4426:2: ( rule__Asercion__Elemento1Assignment_0_2_1 )
            // InternalMyDsl.g:4426:3: rule__Asercion__Elemento1Assignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Elemento1Assignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getElemento1Assignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_0_2__1__Impl"


    // $ANTLR start "rule__Asercion__Group_2_1__0"
    // InternalMyDsl.g:4435:1: rule__Asercion__Group_2_1__0 : rule__Asercion__Group_2_1__0__Impl rule__Asercion__Group_2_1__1 ;
    public final void rule__Asercion__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4439:1: ( rule__Asercion__Group_2_1__0__Impl rule__Asercion__Group_2_1__1 )
            // InternalMyDsl.g:4440:2: rule__Asercion__Group_2_1__0__Impl rule__Asercion__Group_2_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Asercion__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asercion__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_2_1__0"


    // $ANTLR start "rule__Asercion__Group_2_1__0__Impl"
    // InternalMyDsl.g:4447:1: rule__Asercion__Group_2_1__0__Impl : ( 'parameter.' ) ;
    public final void rule__Asercion__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4451:1: ( ( 'parameter.' ) )
            // InternalMyDsl.g:4452:1: ( 'parameter.' )
            {
            // InternalMyDsl.g:4452:1: ( 'parameter.' )
            // InternalMyDsl.g:4453:2: 'parameter.'
            {
             before(grammarAccess.getAsercionAccess().getParameterKeyword_2_1_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getAsercionAccess().getParameterKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_2_1__0__Impl"


    // $ANTLR start "rule__Asercion__Group_2_1__1"
    // InternalMyDsl.g:4462:1: rule__Asercion__Group_2_1__1 : rule__Asercion__Group_2_1__1__Impl ;
    public final void rule__Asercion__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4466:1: ( rule__Asercion__Group_2_1__1__Impl )
            // InternalMyDsl.g:4467:2: rule__Asercion__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_2_1__1"


    // $ANTLR start "rule__Asercion__Group_2_1__1__Impl"
    // InternalMyDsl.g:4473:1: rule__Asercion__Group_2_1__1__Impl : ( ( rule__Asercion__Elemento2Assignment_2_1_1 ) ) ;
    public final void rule__Asercion__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4477:1: ( ( ( rule__Asercion__Elemento2Assignment_2_1_1 ) ) )
            // InternalMyDsl.g:4478:1: ( ( rule__Asercion__Elemento2Assignment_2_1_1 ) )
            {
            // InternalMyDsl.g:4478:1: ( ( rule__Asercion__Elemento2Assignment_2_1_1 ) )
            // InternalMyDsl.g:4479:2: ( rule__Asercion__Elemento2Assignment_2_1_1 )
            {
             before(grammarAccess.getAsercionAccess().getElemento2Assignment_2_1_1()); 
            // InternalMyDsl.g:4480:2: ( rule__Asercion__Elemento2Assignment_2_1_1 )
            // InternalMyDsl.g:4480:3: rule__Asercion__Elemento2Assignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Elemento2Assignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getElemento2Assignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_2_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalMyDsl.g:4489:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4493:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMyDsl.g:4494:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalMyDsl.g:4501:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4505:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4506:1: ( RULE_ID )
            {
            // InternalMyDsl.g:4506:1: ( RULE_ID )
            // InternalMyDsl.g:4507:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalMyDsl.g:4516:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4520:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMyDsl.g:4521:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalMyDsl.g:4527:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4531:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMyDsl.g:4532:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMyDsl.g:4532:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMyDsl.g:4533:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalMyDsl.g:4534:2: ( rule__QualifiedName__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==71) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:4534:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalMyDsl.g:4543:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4547:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMyDsl.g:4548:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalMyDsl.g:4555:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4559:1: ( ( '.' ) )
            // InternalMyDsl.g:4560:1: ( '.' )
            {
            // InternalMyDsl.g:4560:1: ( '.' )
            // InternalMyDsl.g:4561:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalMyDsl.g:4570:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4574:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMyDsl.g:4575:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalMyDsl.g:4581:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4585:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4586:1: ( RULE_ID )
            {
            // InternalMyDsl.g:4586:1: ( RULE_ID )
            // InternalMyDsl.g:4587:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Api__UrlAssignment_3"
    // InternalMyDsl.g:4597:1: rule__Api__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Api__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4601:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4602:2: ( ruleEString )
            {
            // InternalMyDsl.g:4602:2: ( ruleEString )
            // InternalMyDsl.g:4603:3: ruleEString
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
    // InternalMyDsl.g:4612:1: rule__Api__EntidadesAssignment_5 : ( ruleEntidad ) ;
    public final void rule__Api__EntidadesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4616:1: ( ( ruleEntidad ) )
            // InternalMyDsl.g:4617:2: ( ruleEntidad )
            {
            // InternalMyDsl.g:4617:2: ( ruleEntidad )
            // InternalMyDsl.g:4618:3: ruleEntidad
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
    // InternalMyDsl.g:4627:1: rule__Api__PrimitivetypesAssignment_6 : ( rulePrimitiveType ) ;
    public final void rule__Api__PrimitivetypesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4631:1: ( ( rulePrimitiveType ) )
            // InternalMyDsl.g:4632:2: ( rulePrimitiveType )
            {
            // InternalMyDsl.g:4632:2: ( rulePrimitiveType )
            // InternalMyDsl.g:4633:3: rulePrimitiveType
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
    // InternalMyDsl.g:4642:1: rule__Api__ServiciosRestAssignment_7 : ( ruleServicioRest ) ;
    public final void rule__Api__ServiciosRestAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4646:1: ( ( ruleServicioRest ) )
            // InternalMyDsl.g:4647:2: ( ruleServicioRest )
            {
            // InternalMyDsl.g:4647:2: ( ruleServicioRest )
            // InternalMyDsl.g:4648:3: ruleServicioRest
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
    // InternalMyDsl.g:4657:1: rule__Api__TestsAssignment_8 : ( ruleTest ) ;
    public final void rule__Api__TestsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4661:1: ( ( ruleTest ) )
            // InternalMyDsl.g:4662:2: ( ruleTest )
            {
            // InternalMyDsl.g:4662:2: ( ruleTest )
            // InternalMyDsl.g:4663:3: ruleTest
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
    // InternalMyDsl.g:4672:1: rule__SimpleEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4676:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4677:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4677:2: ( RULE_ID )
            // InternalMyDsl.g:4678:3: RULE_ID
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
    // InternalMyDsl.g:4687:1: rule__SimpleEntity__AtributosAssignment_3 : ( ruleAtributoSimple ) ;
    public final void rule__SimpleEntity__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4691:1: ( ( ruleAtributoSimple ) )
            // InternalMyDsl.g:4692:2: ( ruleAtributoSimple )
            {
            // InternalMyDsl.g:4692:2: ( ruleAtributoSimple )
            // InternalMyDsl.g:4693:3: ruleAtributoSimple
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
    // InternalMyDsl.g:4702:1: rule__AtributoMocka__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoMocka__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4706:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:4707:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:4707:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:4708:3: ruleTipoAtributo
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
    // InternalMyDsl.g:4717:1: rule__AtributoMocka__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AtributoMocka__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4721:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4722:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4722:2: ( RULE_ID )
            // InternalMyDsl.g:4723:3: RULE_ID
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
    // InternalMyDsl.g:4732:1: rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 : ( ( 'PK,mockType' ) ) ;
    public final void rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4736:1: ( ( ( 'PK,mockType' ) ) )
            // InternalMyDsl.g:4737:2: ( ( 'PK,mockType' ) )
            {
            // InternalMyDsl.g:4737:2: ( ( 'PK,mockType' ) )
            // InternalMyDsl.g:4738:3: ( 'PK,mockType' )
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 
            // InternalMyDsl.g:4739:3: ( 'PK,mockType' )
            // InternalMyDsl.g:4740:4: 'PK,mockType'
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
    // InternalMyDsl.g:4751:1: rule__AtributoMocka__MockTypeAssignment_2_1_0_2 : ( ruleMockaroo ) ;
    public final void rule__AtributoMocka__MockTypeAssignment_2_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4755:1: ( ( ruleMockaroo ) )
            // InternalMyDsl.g:4756:2: ( ruleMockaroo )
            {
            // InternalMyDsl.g:4756:2: ( ruleMockaroo )
            // InternalMyDsl.g:4757:3: ruleMockaroo
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
    // InternalMyDsl.g:4766:1: rule__AtributoMocka__MockTypeAssignment_2_1_1_2 : ( ruleMockaroo ) ;
    public final void rule__AtributoMocka__MockTypeAssignment_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4770:1: ( ( ruleMockaroo ) )
            // InternalMyDsl.g:4771:2: ( ruleMockaroo )
            {
            // InternalMyDsl.g:4771:2: ( ruleMockaroo )
            // InternalMyDsl.g:4772:3: ruleMockaroo
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
    // InternalMyDsl.g:4781:1: rule__AtributoArreglo__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoArreglo__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4785:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:4786:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:4786:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:4787:3: ruleTipoAtributo
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
    // InternalMyDsl.g:4796:1: rule__AtributoArreglo__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__AtributoArreglo__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4800:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4801:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4801:2: ( RULE_ID )
            // InternalMyDsl.g:4802:3: RULE_ID
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
    // InternalMyDsl.g:4811:1: rule__AtributoSimple__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoSimple__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4815:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:4816:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:4816:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:4817:3: ruleTipoAtributo
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
    // InternalMyDsl.g:4826:1: rule__AtributoSimple__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AtributoSimple__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4830:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4831:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4831:2: ( RULE_ID )
            // InternalMyDsl.g:4832:3: RULE_ID
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
    // InternalMyDsl.g:4841:1: rule__MyString__NameAssignment : ( ruleEString ) ;
    public final void rule__MyString__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4845:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4846:2: ( ruleEString )
            {
            // InternalMyDsl.g:4846:2: ( ruleEString )
            // InternalMyDsl.g:4847:3: ruleEString
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
    // InternalMyDsl.g:4856:1: rule__MyNumeric__NameAssignment : ( ruleEInt ) ;
    public final void rule__MyNumeric__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4860:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:4861:2: ( ruleEInt )
            {
            // InternalMyDsl.g:4861:2: ( ruleEInt )
            // InternalMyDsl.g:4862:3: ruleEInt
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
    // InternalMyDsl.g:4871:1: rule__MyBoolean__NameAssignment : ( ruleEBoolean ) ;
    public final void rule__MyBoolean__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4875:1: ( ( ruleEBoolean ) )
            // InternalMyDsl.g:4876:2: ( ruleEBoolean )
            {
            // InternalMyDsl.g:4876:2: ( ruleEBoolean )
            // InternalMyDsl.g:4877:3: ruleEBoolean
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
    // InternalMyDsl.g:4886:1: rule__MockarooEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MockarooEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4890:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4891:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4891:2: ( RULE_ID )
            // InternalMyDsl.g:4892:3: RULE_ID
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
    // InternalMyDsl.g:4901:1: rule__MockarooEntity__AtributosAssignment_3 : ( ruleAtributo ) ;
    public final void rule__MockarooEntity__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4905:1: ( ( ruleAtributo ) )
            // InternalMyDsl.g:4906:2: ( ruleAtributo )
            {
            // InternalMyDsl.g:4906:2: ( ruleAtributo )
            // InternalMyDsl.g:4907:3: ruleAtributo
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
    // InternalMyDsl.g:4916:1: rule__ServicioRest__MetodoAssignment_0 : ( ruleTipoMetodoRest ) ;
    public final void rule__ServicioRest__MetodoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4920:1: ( ( ruleTipoMetodoRest ) )
            // InternalMyDsl.g:4921:2: ( ruleTipoMetodoRest )
            {
            // InternalMyDsl.g:4921:2: ( ruleTipoMetodoRest )
            // InternalMyDsl.g:4922:3: ruleTipoMetodoRest
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
    // InternalMyDsl.g:4931:1: rule__ServicioRest__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ServicioRest__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4935:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4936:2: ( ruleEString )
            {
            // InternalMyDsl.g:4936:2: ( ruleEString )
            // InternalMyDsl.g:4937:3: ruleEString
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
    // InternalMyDsl.g:4946:1: rule__ServicioRest__UrlAssignment_6 : ( ruleEString ) ;
    public final void rule__ServicioRest__UrlAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4950:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4951:2: ( ruleEString )
            {
            // InternalMyDsl.g:4951:2: ( ruleEString )
            // InternalMyDsl.g:4952:3: ruleEString
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
    // InternalMyDsl.g:4961:1: rule__ServicioRest__ParametrosAssignment_7_0 : ( ruleParametro ) ;
    public final void rule__ServicioRest__ParametrosAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4965:1: ( ( ruleParametro ) )
            // InternalMyDsl.g:4966:2: ( ruleParametro )
            {
            // InternalMyDsl.g:4966:2: ( ruleParametro )
            // InternalMyDsl.g:4967:3: ruleParametro
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
    // InternalMyDsl.g:4976:1: rule__ServicioRest__RequestAssignment_9 : ( ruleRequest ) ;
    public final void rule__ServicioRest__RequestAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4980:1: ( ( ruleRequest ) )
            // InternalMyDsl.g:4981:2: ( ruleRequest )
            {
            // InternalMyDsl.g:4981:2: ( ruleRequest )
            // InternalMyDsl.g:4982:3: ruleRequest
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
    // InternalMyDsl.g:4991:1: rule__ServicioRest__ResponseAssignment_10 : ( ruleResponse ) ;
    public final void rule__ServicioRest__ResponseAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4995:1: ( ( ruleResponse ) )
            // InternalMyDsl.g:4996:2: ( ruleResponse )
            {
            // InternalMyDsl.g:4996:2: ( ruleResponse )
            // InternalMyDsl.g:4997:3: ruleResponse
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
    // InternalMyDsl.g:5006:1: rule__QueryParam__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__QueryParam__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5010:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5011:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5011:2: ( RULE_ID )
            // InternalMyDsl.g:5012:3: RULE_ID
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
    // InternalMyDsl.g:5021:1: rule__PathParam__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PathParam__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5025:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5026:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5026:2: ( RULE_ID )
            // InternalMyDsl.g:5027:3: RULE_ID
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
    // InternalMyDsl.g:5036:1: rule__Response__TipoEntidadAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__Response__TipoEntidadAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5040:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5041:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5041:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5042:3: ( RULE_ID )
            {
             before(grammarAccess.getResponseAccess().getTipoEntidadEntidadCrossReference_4_0_0()); 
            // InternalMyDsl.g:5043:3: ( RULE_ID )
            // InternalMyDsl.g:5044:4: RULE_ID
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
    // InternalMyDsl.g:5055:1: rule__Response__TipoPrimitivoAssignment_4_1 : ( ruleTipoAtributo ) ;
    public final void rule__Response__TipoPrimitivoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5059:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:5060:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:5060:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:5061:3: ruleTipoAtributo
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
    // InternalMyDsl.g:5070:1: rule__Request__TipoEntidadAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__Request__TipoEntidadAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5074:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5075:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5075:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5076:3: ( RULE_ID )
            {
             before(grammarAccess.getRequestAccess().getTipoEntidadEntidadCrossReference_4_0_0()); 
            // InternalMyDsl.g:5077:3: ( RULE_ID )
            // InternalMyDsl.g:5078:4: RULE_ID
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
    // InternalMyDsl.g:5089:1: rule__Request__TipoPrimitivoAssignment_4_1 : ( ruleTipoAtributo ) ;
    public final void rule__Request__TipoPrimitivoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5093:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:5094:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:5094:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:5095:3: ruleTipoAtributo
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
    // InternalMyDsl.g:5104:1: rule__PrimitiveType__NameAssignment : ( ruleTipoAtributo ) ;
    public final void rule__PrimitiveType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5108:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:5109:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:5109:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:5110:3: ruleTipoAtributo
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
    // InternalMyDsl.g:5119:1: rule__Test__ServiceAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Test__ServiceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5123:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5124:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5124:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5125:3: ( RULE_ID )
            {
             before(grammarAccess.getTestAccess().getServiceServicioRestCrossReference_6_0()); 
            // InternalMyDsl.g:5126:3: ( RULE_ID )
            // InternalMyDsl.g:5127:4: RULE_ID
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
    // InternalMyDsl.g:5138:1: rule__Test__DescripcionAssignment_10 : ( ruleEString ) ;
    public final void rule__Test__DescripcionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5142:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5143:2: ( ruleEString )
            {
            // InternalMyDsl.g:5143:2: ( ruleEString )
            // InternalMyDsl.g:5144:3: ruleEString
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
    // InternalMyDsl.g:5153:1: rule__Test__MappingsAssignment_12_2 : ( ruleMapping ) ;
    public final void rule__Test__MappingsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5157:1: ( ( ruleMapping ) )
            // InternalMyDsl.g:5158:2: ( ruleMapping )
            {
            // InternalMyDsl.g:5158:2: ( ruleMapping )
            // InternalMyDsl.g:5159:3: ruleMapping
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
    // InternalMyDsl.g:5168:1: rule__Test__AsertionsAssignment_15 : ( ruleAsercion ) ;
    public final void rule__Test__AsertionsAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5172:1: ( ( ruleAsercion ) )
            // InternalMyDsl.g:5173:2: ( ruleAsercion )
            {
            // InternalMyDsl.g:5173:2: ( ruleAsercion )
            // InternalMyDsl.g:5174:3: ruleAsercion
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


    // $ANTLR start "rule__Mapping__ParametroAssignment_2"
    // InternalMyDsl.g:5183:1: rule__Mapping__ParametroAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__ParametroAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5187:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMyDsl.g:5188:2: ( ( ruleQualifiedName ) )
            {
            // InternalMyDsl.g:5188:2: ( ( ruleQualifiedName ) )
            // InternalMyDsl.g:5189:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingAccess().getParametroParametroCrossReference_2_0()); 
            // InternalMyDsl.g:5190:3: ( ruleQualifiedName )
            // InternalMyDsl.g:5191:4: ruleQualifiedName
            {
             before(grammarAccess.getMappingAccess().getParametroParametroQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getParametroParametroQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getParametroParametroCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__ParametroAssignment_2"


    // $ANTLR start "rule__Mapping__AtributoAssignment_6_0_1"
    // InternalMyDsl.g:5202:1: rule__Mapping__AtributoAssignment_6_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__AtributoAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5206:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMyDsl.g:5207:2: ( ( ruleQualifiedName ) )
            {
            // InternalMyDsl.g:5207:2: ( ( ruleQualifiedName ) )
            // InternalMyDsl.g:5208:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingAccess().getAtributoAtributoCrossReference_6_0_1_0()); 
            // InternalMyDsl.g:5209:3: ( ruleQualifiedName )
            // InternalMyDsl.g:5210:4: ruleQualifiedName
            {
             before(grammarAccess.getMappingAccess().getAtributoAtributoQualifiedNameParserRuleCall_6_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getAtributoAtributoQualifiedNameParserRuleCall_6_0_1_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getAtributoAtributoCrossReference_6_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__AtributoAssignment_6_0_1"


    // $ANTLR start "rule__Mapping__DatoprimitivoAssignment_6_1"
    // InternalMyDsl.g:5221:1: rule__Mapping__DatoprimitivoAssignment_6_1 : ( ruleDatoPrimitivo ) ;
    public final void rule__Mapping__DatoprimitivoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5225:1: ( ( ruleDatoPrimitivo ) )
            // InternalMyDsl.g:5226:2: ( ruleDatoPrimitivo )
            {
            // InternalMyDsl.g:5226:2: ( ruleDatoPrimitivo )
            // InternalMyDsl.g:5227:3: ruleDatoPrimitivo
            {
             before(grammarAccess.getMappingAccess().getDatoprimitivoDatoPrimitivoParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDatoPrimitivo();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getDatoprimitivoDatoPrimitivoParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__DatoprimitivoAssignment_6_1"


    // $ANTLR start "rule__Asercion__Elemento1Assignment_0_2_1"
    // InternalMyDsl.g:5236:1: rule__Asercion__Elemento1Assignment_0_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Asercion__Elemento1Assignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5240:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMyDsl.g:5241:2: ( ( ruleQualifiedName ) )
            {
            // InternalMyDsl.g:5241:2: ( ( ruleQualifiedName ) )
            // InternalMyDsl.g:5242:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAsercionAccess().getElemento1AtributoCrossReference_0_2_1_0()); 
            // InternalMyDsl.g:5243:3: ( ruleQualifiedName )
            // InternalMyDsl.g:5244:4: ruleQualifiedName
            {
             before(grammarAccess.getAsercionAccess().getElemento1AtributoQualifiedNameParserRuleCall_0_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAsercionAccess().getElemento1AtributoQualifiedNameParserRuleCall_0_2_1_0_1()); 

            }

             after(grammarAccess.getAsercionAccess().getElemento1AtributoCrossReference_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Elemento1Assignment_0_2_1"


    // $ANTLR start "rule__Asercion__OperadorAssignment_1"
    // InternalMyDsl.g:5255:1: rule__Asercion__OperadorAssignment_1 : ( ruleOperador ) ;
    public final void rule__Asercion__OperadorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5259:1: ( ( ruleOperador ) )
            // InternalMyDsl.g:5260:2: ( ruleOperador )
            {
            // InternalMyDsl.g:5260:2: ( ruleOperador )
            // InternalMyDsl.g:5261:3: ruleOperador
            {
             before(grammarAccess.getAsercionAccess().getOperadorOperadorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperador();

            state._fsp--;

             after(grammarAccess.getAsercionAccess().getOperadorOperadorEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__OperadorAssignment_1"


    // $ANTLR start "rule__Asercion__ElementoPrimitivo2Assignment_2_0"
    // InternalMyDsl.g:5270:1: rule__Asercion__ElementoPrimitivo2Assignment_2_0 : ( ruleDatoPrimitivo ) ;
    public final void rule__Asercion__ElementoPrimitivo2Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5274:1: ( ( ruleDatoPrimitivo ) )
            // InternalMyDsl.g:5275:2: ( ruleDatoPrimitivo )
            {
            // InternalMyDsl.g:5275:2: ( ruleDatoPrimitivo )
            // InternalMyDsl.g:5276:3: ruleDatoPrimitivo
            {
             before(grammarAccess.getAsercionAccess().getElementoPrimitivo2DatoPrimitivoParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDatoPrimitivo();

            state._fsp--;

             after(grammarAccess.getAsercionAccess().getElementoPrimitivo2DatoPrimitivoParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__ElementoPrimitivo2Assignment_2_0"


    // $ANTLR start "rule__Asercion__Elemento2Assignment_2_1_1"
    // InternalMyDsl.g:5285:1: rule__Asercion__Elemento2Assignment_2_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Asercion__Elemento2Assignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5289:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMyDsl.g:5290:2: ( ( ruleQualifiedName ) )
            {
            // InternalMyDsl.g:5290:2: ( ( ruleQualifiedName ) )
            // InternalMyDsl.g:5291:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAsercionAccess().getElemento2ParametroCrossReference_2_1_1_0()); 
            // InternalMyDsl.g:5292:3: ( ruleQualifiedName )
            // InternalMyDsl.g:5293:4: ruleQualifiedName
            {
             before(grammarAccess.getAsercionAccess().getElemento2ParametroQualifiedNameParserRuleCall_2_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAsercionAccess().getElemento2ParametroQualifiedNameParserRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getAsercionAccess().getElemento2ParametroCrossReference_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Elemento2Assignment_2_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x10101780000E0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0010100000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00004000000E0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000007FFE000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x01C0000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x01C0000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000000E0040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000000000100L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000006000L,0x0000000000000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000006002L,0x0000000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000018070L,0x0000000000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000018070L,0x0000000000000050L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});

}