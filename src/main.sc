require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Hello
        intent!: /hello
        a: Привет! Чем могу помочь?

    state: Weather
        intent!: /weather
        a: Bye bye

    state: NoMatch
        event!: noMatch
        a: I do not understand. You said: {{$request.query}}

    state: Currency
        event!: /currency 
        a: Курс доллара: 90,30 руб.
        
    
    state: Match
        event!: match
        a: {{$context.intent.answer}}